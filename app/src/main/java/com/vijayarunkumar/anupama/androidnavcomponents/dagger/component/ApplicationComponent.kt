package com.vijayarunkumar.anupama.androidnavcomponents.dagger.component

import com.example.rmove.rmpropertylist.di.module.ApplicationModule
import com.example.rmove.rmpropertylist.utils.SchedulerHelper
import com.vijayarunkumar.anupama.androidnavcomponents.NavApp
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(app: NavApp)

    fun getSchedulerHelper(): SchedulerHelper
}
