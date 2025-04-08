package com.rozanaalfaiataria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rozanaalfaiataria.ui.EstoqueScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val estoqueViewModel: EstoqueViewModel = viewModel()
            EstoqueScreen(viewModel = estoqueViewModel)
        }
    }
}
