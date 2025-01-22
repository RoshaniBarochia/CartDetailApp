package com.roshani.cartdetail.adapters


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roshani.cartdetail.R
import com.roshani.cartdetail.databinding.ItemClothesParentBinding
import com.roshani.cartdetail.model.Product
import com.roshani.cartdetail.model.SubCategory


class ClothesParentAdapter(
    var categoryList: ArrayList<SubCategory>,
    var productList: ArrayList<Product>,
    val context: Context
) : RecyclerView.Adapter<ClothesParentAdapter.MyViewHolder>() {
    var onItemClick: ((Int,String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemClothesParentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mBinding?.model= categoryList[position]
        holder.mBinding?.recyclerViewChild?.setLayoutManager(LinearLayoutManager(context))
        val childAdapter = ClothesChildAdapter(productList.filter { it -> it.sub_category_id == categoryList[position].sub_category_id}.toCollection(ArrayList()))
        holder.mBinding?.recyclerViewChild?.setAdapter(childAdapter)

        childAdapter?.onItemClick = { pos ->
            Log.d("TAG", "onBindViewHolder: position :: $position :: pos :: $pos")
            onItemClick?.invoke(position,pos)
        }

        // Handle expand/collapse
        if (categoryList[position].isExpanded) {
            holder.mBinding?.recyclerViewChild?.visibility = View.GONE
            holder.mBinding?.expandCollapseIcon?.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.baseline_expand_less_24))
        } else {
            holder.mBinding?.recyclerViewChild?.visibility = View.VISIBLE
            holder.mBinding?.expandCollapseIcon?.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.baseline_expand_more_24))
        }

        holder.mBinding?.expandCollapseIcon?.setOnClickListener {
            categoryList[position].isExpanded = (!categoryList[position].isExpanded)
            notifyItemChanged(position)

        }
        holder.mBinding?.tvClothesName?.setOnClickListener(View.OnClickListener {
            categoryList[position].isExpanded=(!categoryList[position].isExpanded)
            notifyItemChanged(position)

        })

    }
    fun setList(subList : ArrayList<SubCategory>,productListNew : ArrayList<Product>){
        productList=productListNew
        categoryList=subList
        notifyItemRangeChanged(0, categoryList.size)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    


    class MyViewHolder(binding: ItemClothesParentBinding) : RecyclerView.ViewHolder(binding.root) {
        val mBinding: ItemClothesParentBinding? = DataBindingUtil.bind(itemView)



    }
}
