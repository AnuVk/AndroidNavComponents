package com.vijayarunkumar.anupama.androidnavcomponents

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.rmove.rmpropertylist.di.module.ApplicationModule
import com.vijayarunkumar.anupama.androidnavcomponents.dagger.component.ApplicationComponent

class NavApp : MultiDexApplication() {
    lateinit var appModule: ApplicationModule

    companion object {
        lateinit var instance: NavApp private set
        lateinit var appComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        setUp()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    private fun setUp() {
        appModule = ApplicationModule(this)
        appComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(appModule)
            .build()
        appComponent.inject(this)
    }
}