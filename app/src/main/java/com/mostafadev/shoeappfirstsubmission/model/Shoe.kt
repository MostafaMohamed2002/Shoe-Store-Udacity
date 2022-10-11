package com.mostafadev.shoeappfirstsubmission.model

data class Shoe(
    var name: String="",
    var size: String="",
    var company: String="",
    var description: String="",
    val images: List<String> = mutableListOf()
)
