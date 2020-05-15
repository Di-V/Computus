package app.di_v.computus.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.di_v.computus.data.entity.MathFormula
import app.di_v.computus.databinding.ItemHistoryCalcBinding

class HistoryCalcAdapter : RecyclerView.Adapter<HistoryCalcAdapter.HistoryCalcHolder>() {
    private var list: List<MathFormula>? = null

    fun setData(appList: List<MathFormula>?) {
        appList?.let { list = it }
    }

    override fun getItemCount(): Int = list?.size ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryCalcHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHistoryCalcBinding.inflate(inflater, parent, false)
        return HistoryCalcHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryCalcHolder, position: Int) {
        list?.get(position)?.let { holder.bind(it) }
    }

    inner class HistoryCalcHolder(private val binding: ItemHistoryCalcBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MathFormula) {
            binding.data = item
            binding.executePendingBindings()
        }
    }
}