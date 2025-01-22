package com.roshani.cartdetail.network

import com.roshani.cartdetail.model.CartItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("cartResponse.json")
    suspend fun getCartData(): Response<CartItem>
}