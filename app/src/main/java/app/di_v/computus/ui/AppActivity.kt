package app.di_v.computus.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import app.di_v.computus.R
import app.di_v.computus.adapters.HistoryCalcAdapter
import app.di_v.computus.databinding.ActivityAppBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AppActivity : AppCompatActivity() {
    private val viewModel by viewModel<AppViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_TIME)
        val binding = DataBindingUtil.setContentView<ActivityAppBinding>(this, R.layout.activity_app)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.adapter = HistoryCalcAdapter()
    }
}
