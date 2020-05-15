package app.di_v.computus.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import app.di_v.computus.data.entity.MathFormula

@Dao
interface MathFormulaDao {

    @Insert
    suspend fun insert(formula: MathFormula)

    @Update
    suspend fun update(formula: MathFormula)

    @Delete
    suspend fun delete(formula: MathFormula)

    @Query("SELECT * FROM table_formula")
    fun getAllFormula(): LiveData<List<MathFormula>>
}