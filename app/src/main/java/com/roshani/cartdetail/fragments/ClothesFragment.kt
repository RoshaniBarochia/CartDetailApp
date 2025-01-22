package com.roshani.cartdetail.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.roshani.cartdetail.R
import com.roshani.cartdetail.adapters.ClothesChildAdapter
import com.roshani.cartdetail.adapters.ClothesParentAdapter
import com.roshani.cartdetail.adapters.ServiceAdapter
import com.roshani.cartdetail.databinding.FragmentClothesBinding
import com.roshani.cartdetail.model.Product
import com.roshani.cartdetail.model.Service
import com.roshani.cartdetail.model.SubCategory
import com.roshani.cartdetail.viewmodel.DataViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlin.collections.ArrayList

@AndroidEntryPoint
class ClothesFragment : Fragment() {

    private var _binding: FragmentClothesBinding? = null
    private val dataViewModel: DataViewModel by viewModels()
    private var categoryList: ArrayList<SubCategory> = ArrayList()
    private var productList: ArrayList<Product> = ArrayList()
    private var serviceList: ArrayList<Service> = ArrayList()
    var adapterCloth : ClothesParentAdapter?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentClothesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataViewModel.getApiData()
        binding.recyclerViewClothes.setLayoutManager(LinearLayoutManager(activity))
        adapterCloth = ClothesParentAdapter(ArrayList(),ArrayList(),requireContext())
        binding.recyclerViewClothes.setAdapter(adapterCloth)
        dataViewModel.cartItem.observe(viewLifecycleOwner) { result ->
            result.onSuccess { response ->
                if (response != null) {
                    categoryList.clear()
                    productList.clear()
                    serviceList.clear()
                    adapterCloth?.setList(response.sub_categories,response.products)
                    categoryList.addAll(response.sub_categories)
                    productList.addAll(response.products)
                    serviceList.addAll(response.services)
                }

            }.onFailure {
                // Handle error
                Toast.makeText(activity,"Something went wrong.",Toast.LENGTH_LONG).show()
            }
        }

        adapterCloth?.onItemClick = { pos,parent ->
            Log.d("Dialog","Opened${categoryList[pos].service_ids}")
            //Log.d("Dialog","Opened${productList[parent].product_id}")

            showCustomDialog(categoryList[pos].service_ids,parent)
        }


    }
    private fun showCustomDialog(id : String,idService: String) {

        val serviceIdsList = id.split(",").map { it.toInt() }

        // Inflate the custom dialog layout
        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_layout, null)

        // Find views from the dialog layout
        val recyclerView = dialogView.findViewById<RecyclerView>(R.id.recycler_view_child)
        val submitButton = dialogView.findViewById<Button>(R.id.btnSubmit)

        val list = serviceList
        val filteredServices = list.filter { it.service_id.toInt() in serviceIdsList }.toCollection(ArrayList())


        val adapter = ServiceAdapter(filteredServices,requireContext())
        recyclerView.setAdapter(adapter)

        adapter?.onItemClick = { pos ->

        }
        // Create the dialog
        val dialog = AlertDialog.Builder(requireContext())
            .setView(dialogView) // Set the custom view
            .create()

        // Set button click listener
        submitButton.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            Log.d("TAG", "showCustomDialog: ${productList.filter { it-> it.product_id == idService }}")
            val bundle = Bundle().apply {
                putSerializable("productList", productList.filter { it-> it.product_id == idService }.toCollection(ArrayList()))
                putSerializable("catList", adapterCloth?.categoryList)
                putSerializable("serviceList",adapter.productList)
            }
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, bundle)
            /*findNavController().navigate(
            ClothesFragmentDirections.actionFirstFragmentToSecondFragment(bundle))*/

            dialog.dismiss() // Close dialog on submit
        }

        // Show the dialog
        dialog.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}