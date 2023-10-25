package com.mahmoud.mealz.di

import com.mahmoud.data.remote.ApiService
import com.mahmoud.data.repo.MealsRepoImpl
import com.mahmoud.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}