package com.roshani.cartdetail.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.roshani.cartdetail.R
import com.roshani.cartdetail.databinding.ItemClothesBinding
import com.roshani.cartdetail.databinding.ItemServicesBinding
import com.roshani.cartdetail.model.Product
import com.roshani.cartdetail.model.Service


class ServiceAdapter(
    var productList: ArrayList<Service>,
    val context: Context
) : RecyclerView.Adapter<ServiceAdapter.MyViewHolder>() {
    var onItemClick: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemServicesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mBinding?.model=productList.get(position)
        holder.mBinding?.position = position
        if (productList[position].isSelected) {
            holder.mBinding?.main?.setBackgroundColor(ContextCompat.getColor(context, R.color.black))
        } else {
            holder.mBinding?.main?.setBackgroundColor(ContextCompat.getColor(context, R.color.white))

        }
        holder.mBinding?.main?.setOnClickListener {
            productList[position].isSelected=(!productList[position].isSelected)
            notifyItemChanged(position)
        }

    }
    fun setList(productListNew : ArrayList<Service>){
        productList=productListNew
        notifyItemRangeChanged(0, productList.size)
    }

    override fun getItemCount(): Int {
        return productList.size
    }


    class MyViewHolder(binding: ItemServicesBinding) : RecyclerView.ViewHolder(binding.root) {
        val mBinding: ItemServicesBinding? = DataBindingUtil.bind(itemView)

    }
}
