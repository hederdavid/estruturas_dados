package fila.circular

class FilaCircular(tamanho: Int = 10) : Enfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    override fun enfileirar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("A fila está cheia! Impossível enfileirar!")
        }
    }

    override fun desenfileirar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
            ponteiroInicio++
            if (ponteiroInicio == dados.size) {
                ponteiroInicio = 0
            }
            quantidade--
        } else {
            println("A fila está vazia! Impossível desenfileirar.")
        }
        return dado
    }

    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("A fila está vazia! Impossível atualizar.")
        }
    }

    override fun espiar(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
        } else {
            println("A fila está vazia! Impossível espiar.")
        }
        return dado
    }

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAuxiliar = ponteiroInicio
        for (i in 0..<quantidade) {
            resultado += if (i == quantidade - 1) {
                "${dados[ponteiroAuxiliar % dados.size]}"
            } else {
                "${dados[ponteiroAuxiliar % dados.size]}, "
            }
            ponteiroAuxiliar++
        }
        return "$resultado]"
    }
}