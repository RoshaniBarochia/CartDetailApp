package com.roshani.cartdetail.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.roshani.cartdetail.adapters.CartSummeryParentAdapter
import com.roshani.cartdetail.adapters.ClothesParentAdapter
import com.roshani.cartdetail.databinding.CartSummeryBinding
import com.roshani.cartdetail.model.Product
import com.roshani.cartdetail.model.Service
import com.roshani.cartdetail.model.SubCategory
import java.util.ArrayList

class CartSummeryFragment : Fragment() {

    private var _binding: CartSummeryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = CartSummeryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val productList = arguments?.getSerializable("productList") as? ArrayList<Product>
        val serviceList = arguments?.getSerializable("serviceList") as? ArrayList<Service>
        val catList = arguments?.getSerializable("catList") as? ArrayList<SubCategory>
        arguments?.clear()

        binding.recyclerViewCart.setLayoutManager(LinearLayoutManager(activity))
        val adapter = CartSummeryParentAdapter(serviceList!!,productList!!,catList!!,requireContext())
        binding.recyclerViewCart.setAdapter(adapter)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}