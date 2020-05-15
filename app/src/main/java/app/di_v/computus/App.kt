package app.di_v.computus

import android.app.Application
import app.di_v.computus.di.databaseModule
import app.di_v.computus.di.repositoryModule
import app.di_v.computus.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(databaseModule)
            modules(viewModelModule)
            modules(repositoryModule)
        }
    }
}