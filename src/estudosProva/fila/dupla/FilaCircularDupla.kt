package estudosProva.fila.dupla

class FilaCircularDupla(tamanho: Int = 10) : DuplamenteEnfileiravel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    override fun enfileirarInicio(dado: Any?) {
        if (!estaCheia()) {
            ponteiroInicio--
            if (ponteiroInicio == -1) {
                ponteiroInicio = dados.size - 1
                if (quantidade == 0) {
                    ponteiroFim = dados.size - 1
                }
            }
            dados[ponteiroInicio] = dado
            quantidade++
        } else {
            println("Fila Cheia!")
        }
    }

    override fun enfileirarFim(dado: Any?) {
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

    override fun desenfileirarInicio(): Any? {
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

    override fun desenfileirarFim(): Any? {
        var dadoDesenfileirado: Any? = null
        if (!estaVazia()) {
            dadoDesenfileirado = dados[ponteiroFim]
            ponteiroFim--
            if (ponteiroFim == -1) {
                ponteiroFim = dados.size - 1
            }
            quantidade--
        } else {
            println("Fila Vazia!")
        }
        return dadoDesenfileirado
    }

    override fun atualizarInicio(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("Fila Vazia!")
        }
    }

    override fun atualizarFim(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado
        } else {
            println("Fila Vazia!")
        }
    }

    override fun espiarInicio(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia()) {
            dadoEspiado = dados[ponteiroInicio]
        } else {
            println("Fila vazia!")
        }
        return dadoEspiado
    }

    override fun espiarFim(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia()) {
            dadoEspiado = dados[ponteiroFim]
        } else {
            println("Fila vazia!")
        }
        return dadoEspiado
    }

    override fun imprimirFrentePraTras(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1) {
                "${dados[ponteiroAux % dados.size]}"
            } else {
                "${dados[ponteiroAux % dados.size]}, "
            }
            ponteiroAux++
            if (ponteiroAux == dados.size)
                ponteiroAux = 0
        }
        return "$resultado]"
    }

    override fun imprimirTrasPraFrente(): String {
        var resultado = "["
        var ponteiroAux = ponteiroFim
        for (i in quantidade - 1 downTo 0 ) {
            resultado += if (i == 0) {
                "${dados[ponteiroAux % dados.size]}"
            } else {
                "${dados[ponteiroAux % dados.size]}, "
            }
            ponteiroAux--
            if (ponteiroAux == -1)
                ponteiroAux = dados.size - 1
        }
        return "$resultado]"
    }

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }
}