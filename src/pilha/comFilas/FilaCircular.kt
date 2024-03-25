package pilha.comFilas

import fila.comPilhas.Enfileiravel

class FilaCircular(tamanho: Int = 10) : Enfileiravel, pilha.comFilas.Enfileiravel {
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
            println("Fila Cheia!")
        }
    }

    override fun desenfileirar(): Any? {
        var dadoDesenfileirado: Any? = null
        if (!estaVazia()) {
            dadoDesenfileirado = dados[ponteiroInicio]
            ponteiroInicio++
            if (ponteiroInicio == dados.size) {
                ponteiroInicio = 0
            }
            quantidade--
        } else {
            println("Fila Vazia!")
        }
        return dadoDesenfileirado
    }

    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("Fila Vazia!")
        }
    }

    override fun espiar(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia()) {
            dadoEspiado = dados[ponteiroInicio]
        } else {
            println("Fila Vazia!")
        }
        return dadoEspiado
    }

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1)
                "${dados[ponteiroAux % dados.size]}"
            else
                "${dados[ponteiroAux % dados.size]}, "

            ponteiroAux++
        }
        return "$resultado]"
    }
}