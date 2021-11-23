package com.vijayarunkumar.anupama.domain.repository

import com.vijayarunkumar.anupama.domain.models.MenuInfoDomain
import io.reactivex.Single

interface CallRetrofitRepository {
    fun getMenu(): Single<List<MenuInfoDomain>>
}