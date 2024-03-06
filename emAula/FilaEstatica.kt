class FilaEstatica(tamanho: Int = 10) : Enfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun enfileirar(dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun desenfileirar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
            ponteiroInicio++
        } else {
            println("A pilha está vazia")
        }
        return dado
    }

    override fun espiar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
        } else {
            println("A pilha está vazia")
        }
        return dado

    }

    override fun atualizar(dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun estaCheia(): Boolean {
        return ponteiroFim == dados.size - 1
    }

    override fun estaVazia(): Boolean {
        return ponteiroFim < ponteiroInicio
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in ponteiroInicio .. ponteiroFim) {
            if (i == ponteiroFim) {
                resultado += "${dados[i]}"
            } else {
                resultado += "${dados[i]}, "
            }
        }
        return "$resultado]"
  }
}

