package com.roshani.cartdetail.adapters


import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.roshani.cartdetail.databinding.ItemCartBinding
import com.roshani.cartdetail.model.Service
import com.roshani.cartdetail.model.SubCategory


class CartSumChildAdapter(
    var productList: ArrayList<Service>,
    var data: ArrayList<String>,
    var price: ArrayList<Int>
) : RecyclerView.Adapter<CartSumChildAdapter.MyViewHolder>() {
    var onItemClick: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       // holder.mBinding?.model=productList.get(position)\
        /*val names = productList
            ?.filter { it.service_id == data[position] }
            ?.map { it.service_name } // Extract the name property*/
        //val list= productList?.filter { it-> it.service_id == data[position]}
       // Log.d("TAG", "onBindViewHolder: ${names?.size}")
        val i=data.indexOf(data.filter { it == productList[position].service_id}[0])
        holder.mBinding?.tvClothesName?.text = productList[position].service_name
        holder.mBinding?.tvEnd?.text = "₹ "+ price[i]

    }
    fun setList(productListNew : ArrayList<Service>){
        productList=productListNew
        notifyItemRangeChanged(0, productList.size)
    }

    override fun getItemCount(): Int {
        return productList.size
    }


    class MyViewHolder(binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root) {
        val mBinding: ItemCartBinding? = DataBindingUtil.bind(itemView)

    }
}
