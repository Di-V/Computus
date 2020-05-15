package app.di_v.computus.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.random.Random

@Entity(tableName = "table_formula")
data class MathFormula(
    @PrimaryKey(autoGenerate = true)
    val id: Int = Random.nextInt(1000000),
    var formula: String,
    var date: String
)