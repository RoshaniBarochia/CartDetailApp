package com.roshani.cartdetail.model

import java.io.Serializable

data class CartItem(
    val sub_categories: ArrayList<SubCategory>,
    val products: ArrayList<Product>,
    val services: ArrayList<Service>
): Serializable
data class SubCategory(
    val sub_category_id: String,
    val service_ids: String,
    val regular_prices: String,
    val parent_category_id: String,
    val sub_category_name: String,
    val sub_category_photo: String,
    val sub_category_active_status: String,
    var isExpanded: Boolean
): Serializable

data class Product(
    val order_in_out: String,
    val user_id: String,
    val user_full_name: String,
    val user_relation: String,
    val product_id: String,
    val sub_category_id: String,
    val product_name: String,
    val tag_code: String,
    val group_name: String,
    val city_name: String,
    val state_id: String,
    val city_id: String,
    val state_name: String,
    val product_photo: String,
    val product_active_status: String,
    val in_out: String
): Serializable
data class Service(
    val service_id: String,
    val service_name: String,
    val service_desc: String,
    val indexing: String,
    val included_service: String,
    val included_service_name: String,
    val service_base_price: String,
    val service_icon: String,
    val service_active_status: String,
    var isSelected: Boolean

): Serializable
