package estudosProva.pilha.normal

class PilhaNormal(tamanho: Int = 10) : Empilhavel {

    private var ponteiroTopo: Int = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo++
            dados[ponteiroTopo] = dado
        } else {
            println("Pilha cheia!!")
        }
    }

    override fun desempilhar(): Any? {
        var dadoDesempilhado: Any? = null
        if (!estaVazia()) {
            dadoDesempilhado = dados[ponteiroTopo]
            ponteiroTopo--
        } else {
            println("Pilha vazia!")
        }
        return dadoDesempilhado
    }

    override fun atualizar(dado: Any?) {
        if (!estaCheia()) {
            dados[ponteiroTopo] = dado
        } else {
            println("Pìlha cheia!")
        }
    }

    override fun espiar(): Any? {
        var dadoEspiado: Any? = null
        if (!estaCheia()) {
            dadoEspiado = dados[ponteiroTopo]
        } else {
            println("Pilha cheia!")
        }
        return dadoEspiado
    }

    override fun estaCheia(): Boolean {
        return (ponteiroTopo == dados.size - 1)
    }

    override fun estaVazia(): Boolean {
        return ponteiroTopo == -1
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in ponteiroTopo downTo 0) {
            resultado += if (i == 0)
                "${dados[i]}"
             else
                "${dados[i]}, "

        }
        return "$resultado]"

    }
}