package com.rozanaalfaiataria

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf

class EstoqueViewModel : ViewModel() {
    val produtos = mutableStateListOf<Produto>()

    fun adicionarProduto(nome: String, quantidade: Int) {
        produtos.add(Produto(nome, quantidade))
    }

    fun removerProduto(index: Int) {
        if (index in produtos.indices) produtos.removeAt(index)
    }
}
