package com.roshani.cartdetail.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roshani.cartdetail.model.CartItem
import com.roshani.cartdetail.repository.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DataViewModel @Inject constructor(private val authRepository: ApiRepository) :
    ViewModel() {
    //object declaration
    private val _cCartItem = MutableLiveData<Result<CartItem?>>()
    val cartItem: LiveData<Result<CartItem?>> get() = _cCartItem


    fun getApiData() {
        viewModelScope.launch {
            _cCartItem.value = authRepository.getData()
        }
    }

}