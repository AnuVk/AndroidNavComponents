package com.vijayarunkumar.anupama.domain.usecase

import com.vijayarunkumar.anupama.domain.models.MenuInfoDomain
import com.vijayarunkumar.anupama.domain.repository.CallRetrofitRepository
import io.reactivex.Single
import javax.inject.Inject

class GetMenu @Inject constructor(private val repository: CallRetrofitRepository) {
    fun execute(): Single<List<MenuInfoDomain>>{
        return repository.getMenu()
    }
}