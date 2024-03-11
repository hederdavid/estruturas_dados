package fila.estatica

class FilaEstatica(tamanho: Int = 10) : Enfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    override fun enfileirar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim++
            dados[ponteiroFim] = dado
            println("O dado: '${dado}' foi enfileirado na posição $ponteiroFim com sucesso.")
        } else {
            println("Fila cheia! Impossível enfileirar.")
        }
    }

    override fun desenfileirar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
            println("O dado: '${dado}' foi desenfileirado na posição $ponteiroInicio com sucesso.")
            ponteiroInicio++
        } else {
            println("Fila vazia! Impossível desenfileirar.")
        }
        return dado
    }

    override fun espiar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
        } else {
            println("Fila vazia! Impossível desenfileirar.")
        }
        return dado
    }

    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("Fila vazia! Impossível desenfileirar.")
        }
    }

    override fun estaCheia(): Boolean {
        return ponteiroFim == dados.size - 1
    }

    override fun estaVazia(): Boolean {
        return ponteiroFim < ponteiroInicio
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in ponteiroInicio..ponteiroFim) {
            resultado += if (i == ponteiroFim) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }
}