package com.vijayarunkumar.anupama.data.info

import com.vijayarunkumar.anupama.data.remote.NavApi
import com.vijayarunkumar.anupama.domain.models.MenuInfoDomain
import com.vijayarunkumar.anupama.domain.repository.CallRetrofitRepository
import io.reactivex.Single
import okhttp3.internal.toImmutableList
import javax.inject.Inject

class CallRetrofitRepositoryImpl @Inject constructor(private val api: NavApi) : CallRetrofitRepository {
    override fun getMenu(): Single<List<MenuInfoDomain>> {
        return api.getMenuInfo("Starter").map { response ->
            response.meals.map { MenuInfoDomain(it.idMeal, it.strMeal, it.strMealThumb) }
        }
    }
}