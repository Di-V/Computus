package app.di_v.computus.adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import app.di_v.computus.data.entity.MathFormula

@BindingAdapter("adapter")
fun bindAppAdapter(view: RecyclerView, adapter: HistoryCalcAdapter) {
    view.adapter = adapter
}

@BindingAdapter("dataList")
fun bindAdapterDataList(view: RecyclerView, list: List<MathFormula>?) {
    val adapter = view.adapter as? HistoryCalcAdapter
    adapter?.setData(list)
}