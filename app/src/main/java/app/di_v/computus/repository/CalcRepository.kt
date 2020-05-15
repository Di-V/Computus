package app.di_v.computus.repository

import androidx.lifecycle.LiveData
import app.di_v.computus.data.database.MathFormulaDao
import app.di_v.computus.data.entity.MathFormula

class CalcRepository(private val dao: MathFormulaDao) {

    val list: LiveData<List<MathFormula>> = dao.getAllFormula()

    suspend fun insert(data: MathFormula) {
        dao.insert(data)
    }

    suspend fun update(data: MathFormula) {
        dao.update(data)
    }

    suspend fun delete(data: MathFormula) {
        dao.delete(data)
    }
}