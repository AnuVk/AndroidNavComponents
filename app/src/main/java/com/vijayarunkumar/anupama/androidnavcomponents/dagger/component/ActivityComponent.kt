package com.vijayarunkumar.anupama.androidnavcomponents.dagger.component

import com.example.rmove.rmpropertylist.di.module.ActivityModule
import com.vijayarunkumar.anupama.androidnavcomponents.ui.MainActivity
import com.vijayarunkumar.anupama.androidnavcomponents.dagger.ActivityScope
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(Activity: MainActivity)

}