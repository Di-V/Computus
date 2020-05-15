package app.di_v.computus.di

import androidx.room.Room
import app.di_v.computus.Const.DATABASE_NAME
import app.di_v.computus.data.database.AppDatabase
import app.di_v.computus.repository.CalcRepository
import app.di_v.computus.ui.AppViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    single { get<AppDatabase>().dao() }
}

val viewModelModule = module {
    viewModel { AppViewModel(get()) }
}

val repositoryModule = module {
    single { CalcRepository(get()) }
}