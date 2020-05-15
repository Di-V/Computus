package app.di_v.computus.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import app.di_v.computus.data.entity.MathFormula

@Database(
    entities = [MathFormula::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun dao(): MathFormulaDao
}