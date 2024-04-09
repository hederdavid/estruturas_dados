package arvoreBinaria.heapMaximo

class ArvoreHeapMaximo(tamanho: Int = 10) : Amontoavel {
    private var ponteiroFim = -1
    private var dados = IntArray(tamanho){0}

    override fun inserir(dado: Int) {
        if (!estaCheia()) {
            ponteiroFim++
            dados[ponteiroFim] = dado
            ajustarAcima(ponteiroFim)
        } else {
            println("Heap Cheia!")
        }
    }

    override fun extrair(): Int? {
        var dadoRaiz: Int? = null
        if (!estaVazia()) {
            dadoRaiz = dados[0]
            dados[0] = dados[ponteiroFim]
            ponteiroFim--
            ajustarAbaixo(0)
        } else {
            println("Heap Vazia!")
        }
        return dadoRaiz
    }

    override fun atualizar(dado: Int) {
        if (!estaVazia()) {
            dados[0] = dado
            ajustarAbaixo(0)
        } else {
            println("Heap Vazia!")
        }
    }

    override fun obter(): Int? {
        var dadoRaiz: Int? = null
        if (!estaVazia()) {
            dadoRaiz = dados[0]
        } else {
            println("Heap Vazia!")
        }
        return dadoRaiz
    }

    override fun estaVazia(): Boolean {
        return ponteiroFim == -1
    }

    override fun estaCheia(): Boolean {
        return ponteiroFim == dados.size - 1
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in 0 .. ponteiroFim) {
            resultado += if (i == ponteiroFim)
                "${dados[i]}"
            else
                "${dados[i]}, "
        }
        return "$resultado]"
    }

    private fun ajustarAcima(indice: Int) {
        var indiceAtual = indice
        while (indiceAtual != 0) {
            val indicePai = indicePai(indiceAtual)
            if (dados[indicePai] < dados[indiceAtual]) {
                trocar(indiceAtual, indicePai)
                indiceAtual = indicePai
            } else {
                break
            }
        }

    }

    private fun ajustarAbaixo(pai: Int) {
        val filhoEsquerdo = indiceFilhoEsquerdo(pai)
        val filhoDireito = indiceFilhoDireito(pai)
        var maior = pai

        if (filhoEsquerdo <= ponteiroFim) {
            if (dados[maior] < dados[filhoEsquerdo]) {
                maior = filhoEsquerdo
            }
        }

        if (filhoDireito <= ponteiroFim) {
            if (dados[maior] < dados[filhoDireito]) {
                maior = filhoDireito
            }
        }

        if (maior != pai) {
            trocar(pai, maior)
            ajustarAbaixo(maior)
        }
    }

    private fun indicePai(indiceFilho: Int): Int {
        return (indiceFilho - 1) / 2
    }

    private fun indiceFilhoEsquerdo(indicePai: Int): Int {
        return indicePai * 2 + 1
    }
    private fun indiceFilhoDireito(indicePai: Int): Int {
        return indicePai * 2 + 2
    }

    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }
}