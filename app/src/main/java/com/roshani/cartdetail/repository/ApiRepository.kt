package com.roshani.cartdetail.repository

import com.roshani.cartdetail.model.CartItem
import com.roshani.cartdetail.network.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getData(): Result<CartItem?> {
        try {
            val response = apiService.getCartData()
            return if (response.isSuccessful) {
                Result.success(response.body())
            } else {
                Result.failure(Exception(response.message()))
            }
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }


}