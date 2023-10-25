package com.mahmoud.domain.repo

import com.mahmoud.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryResponse
}