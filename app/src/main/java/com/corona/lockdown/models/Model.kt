package com.corona.lockdown.models

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Swimming"),
        Hobby("Dancing"),
        Hobby("Singing"),
        Hobby("Programming"),
        Hobby("Reading")
    )
}