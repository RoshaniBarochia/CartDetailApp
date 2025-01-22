package com.roshani.cartdetail.adapters


import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.roshani.cartdetail.databinding.ItemClothesBinding
import com.roshani.cartdetail.model.Product


class ClothesChildAdapter(
    var productList: ArrayList<Product>
) : RecyclerView.Adapter<ClothesChildAdapter.MyViewHolder>() {
    var onItemClick: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemClothesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mBinding?.model=productList.get(position)
        holder.mBinding?.position = position
        holder.mBinding?.btnAdd?.setOnClickListener {
            Log.d("TAG", "onBindViewHolder: ${productList[position].product_id} :: pos :: $position")
            onItemClick?.invoke(productList[position].product_id)
        }

    }
    fun setList(productListNew : ArrayList<Product>){
        productList=productListNew
        notifyItemRangeChanged(0, productList.size)
    }

    override fun getItemCount(): Int {
        return productList.size
    }


    class MyViewHolder(binding: ItemClothesBinding) : RecyclerView.ViewHolder(binding.root) {
        val mBinding: ItemClothesBinding? = DataBindingUtil.bind(itemView)

    }
}
