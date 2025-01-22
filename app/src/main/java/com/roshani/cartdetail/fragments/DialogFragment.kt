package com.roshani.cartdetail.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.roshani.cartdetail.databinding.DialogLayoutBinding

class DialogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DialogLayoutBinding.inflate(inflater, container, false)

        // Example: Show dialog on a button click


        return binding.root
    }


}