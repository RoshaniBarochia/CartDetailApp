package com.roshani.cartdetail.adapters


import android.content.Context
import android.icu.util.ULocale.Category
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roshani.cartdetail.databinding.ItemCartParentBinding
import com.roshani.cartdetail.model.Product
import com.roshani.cartdetail.model.Service
import com.roshani.cartdetail.model.SubCategory


class CartSummeryParentAdapter(
    private var serviceList: ArrayList<Service>,
    private var productList: ArrayList<Product>,
    private var catList: ArrayList<SubCategory>,
    val context: Context
) : RecyclerView.Adapter<CartSummeryParentAdapter.MyViewHolder>() {
    var onItemClick: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemCartParentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mBinding?.model= productList[position]
        holder.mBinding?.recyclerViewChild?.setLayoutManager(LinearLayoutManager(context))
        val listData= ArrayList<String>()
        val listPrice= ArrayList<Int>()
        for(i in catList.indices){
            for(j in productList.indices){
                if(productList[j].sub_category_id == catList[i].sub_category_id){
                    listData.addAll(catList[i].service_ids.split(","))
                    listPrice.addAll(catList[i].regular_prices.split(",").map { it.toInt() })
                    break
                }
            }
        }
        val childAdapter = CartSumChildAdapter(serviceList.filter { it-> it.isSelected == true }.toCollection(ArrayList()),
            listData,listPrice
            )
        holder.mBinding?.recyclerViewChild?.setAdapter(childAdapter)

        holder.mBinding?.btnAdd?.setOnClickListener{
            onItemClick?.invoke(position)
        }



    }
    fun setList(subList : ArrayList<Service>,productListNew : ArrayList<Product>){
        productList=productListNew
        serviceList=subList
        notifyItemRangeChanged(0, productList.size)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    


    class MyViewHolder(binding: ItemCartParentBinding) : RecyclerView.ViewHolder(binding.root) {
        val mBinding: ItemCartParentBinding? = DataBindingUtil.bind(itemView)



    }
}
