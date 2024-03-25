package estudosProva.pilha.dupla

class PilhaDupla(tamanho: Int = 10) : Empilhavel {
    private var ponteiroTopo1 = -1
    private var ponteiroTopo2 = tamanho
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    override fun empilhar1(dado: Any?) {
        if (!estaCheia1()) {
            ponteiroTopo1++
            dados[ponteiroTopo1] = dado
        } else {
            println("Pilha1 cheia!")
        }
    }

    override fun desempilhar1(): Any? {
        var dadoDesempilhado: Any? = null
        if (!estaVazia1()) {
            dadoDesempilhado = dados[ponteiroTopo1]
            ponteiroTopo1--
        } else {
            println("Pilha1 Vazia!")
        }
        return dadoDesempilhado
    }

    override fun atualizar1(dado: Any?) {
        if (!estaVazia1()) {
            dados[ponteiroTopo1] = dado
        } else {
            println("Pilha1 Vazia!")
        }
    }

    override fun espiar1(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia1()) {
            dadoEspiado = dados[ponteiroTopo1]
        } else {
            println("Pilha1 Vazia!")
        }
        return dadoEspiado
    }
    override fun imprimir1(): String {
        var resultado = "["
        for (i in ponteiroTopo1 downTo 0) {
            resultado += if (i == 0) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }

    override fun empilhar2(dado: Any?) {
        if (!estaCheia2()) {
            ponteiroTopo2--
            dados[ponteiroTopo2] = dado
        } else {
            println("Pilha2 Cheia!")
        }
    }

    override fun desempilhar2(): Any? {
        var dadoDesempilhado: Any? = null
        if (!estaVazia2()) {
            dadoDesempilhado = dados[ponteiroTopo2]
            ponteiroTopo2++
        } else {
            println("Pilha2 Vazia!")
        }
        return dadoDesempilhado
    }

    override fun atualizar2(dado: Any?) {
        if (!estaVazia2()) {
            dados[ponteiroTopo2] = dado
        } else {
            println("Pilha2 Vazia!")
        }
    }

    override fun espiar2(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia2()) {
            dadoEspiado = dados[ponteiroTopo2]
        } else {
            println("Pilha2 Vazia!")
        }
        return dadoEspiado
    }

    override fun estaCheia1(): Boolean {
        return ponteiroTopo1 + 1 == ponteiroTopo2
    }

    override fun estaVazia1(): Boolean {
        return ponteiroTopo1 == -1
    }


    override fun estaCheia2(): Boolean {
        return ponteiroTopo1 + 1 == ponteiroTopo2
    }


    override fun estaVazia2(): Boolean {
        return ponteiroTopo2 == dados.size
    }

    override fun imprimir2(): String {
        var resultado: String = "["
        for (i in ponteiroTopo2..<dados.size) {
            resultado += if (i == dados.size - 1) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }
}