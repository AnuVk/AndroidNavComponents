package com.vijayarunkumar.anupama.data.remote

interface InfoApiContract {
    data class MealInfo(
        val meals: List<Meal>
    )

    data class Meal(
        val idMeal: String,
        val strMeal: String,
        val strMealThumb: String
    )
}