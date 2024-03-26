package fila.dupla

class FilaCircularDupla(tamanho: Int = 10) : DuplamenteEnfileirado {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    override fun enfileirarInicio(dado: Any?) {
        if (!estaCheia()) {
            if(estaVazia()) {
                enfileirarFim(dado)
            } else {
                ponteiroInicio--
                if (ponteiroInicio == -1) {
                    ponteiroInicio = dados.size - 1
                }
                dados[ponteiroInicio] = dado
                quantidade++
                println("O dado: '${dado}' foi enfileirado na posição $ponteiroInicio com sucesso.")
            }

        } else {
            println("A fila se encontra cheia! Impossível enfileirar")
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
            println("O dado: '${dado}' foi enfileirado na posição $ponteiroFim com sucesso.")
        } else {
            println("A fila se encontra cheia! Impossível enfileirar")
        }
    }

    override fun desenfileirarInicio(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
            println("O dado: '${dado}' foi desenfileirado na posição $ponteiroInicio com sucesso.")
            ponteiroInicio++
            if (ponteiroInicio == dados.size) {
                ponteiroInicio = 0
            }
            quantidade--
        } else {
            println("Fila Vazia! Impossível desenfileirar.")
        }
        return dado
    }

    override fun desenfileirarFim(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroFim]
            println("O dado: '${dado}' foi desenfileirado na posição $ponteiroFim com sucesso.")
            ponteiroFim--
            if (ponteiroFim == -1) {
                ponteiroFim = dados.size - 1
            }
            quantidade--
        }
        return dado

    }

    override fun espiarInicio(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroInicio]
        } else {
            println("Fila Vazia! Impossível desenfileirar.")
        }
        return dado
    }

    override fun espiarFim(): Any? {
        var dado: Any? = null
        if (!estaVazia()) {
            dado = dados[ponteiroFim]
        } else {
            println("Fila Vazia! Impossível desenfileirar.")
        }
        return dado

    }

    override fun atualizarInicio(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("Fila Vazia! Impossível desenfileirar.")
        }
    }

    override fun atualizarFim(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado
        } else {
            println("Fila Vazia! Impossível desenfileirar.")
        }
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
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1)
                "${dados[ponteiroAuxiliar % dados.size]}"
             else
                "${dados[ponteiroAuxiliar % dados.size]}, "

            ponteiroAuxiliar++

        }
        return "$resultado]"
    }
}