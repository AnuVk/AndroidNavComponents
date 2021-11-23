package com.example.rmove.rmpropertylist.di.module

import android.app.Application
import com.example.rmove.rmpropertylist.utils.BASE_URL
import com.example.rmove.rmpropertylist.utils.SchedulerHelper
import com.vijayarunkumar.anupama.androidnavcomponents.NavApp
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApplicationModule(private val navApp: NavApp) {

    @Provides
    fun provideRMApplication(): Application {
        return navApp
    }

    @Provides
    internal fun provideRetrofit(okHttpClient: OkHttpClient.Builder): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
    }

    @Provides
    fun provideSchedulerHelper(): SchedulerHelper {
        return SchedulerHelper()
    }

    @Provides
    fun providesOkHttpClient(): OkHttpClient.Builder =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))


}