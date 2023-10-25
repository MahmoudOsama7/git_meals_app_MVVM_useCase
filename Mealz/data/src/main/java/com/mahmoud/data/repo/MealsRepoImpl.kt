package com.mahmoud.data.repo

import com.mahmoud.data.remote.ApiService
import com.mahmoud.domain.entity.CategoryResponse
import com.mahmoud.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}