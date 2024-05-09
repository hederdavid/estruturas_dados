package prova1aUnidadeComListaDinamica.N04

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun espiarInicio(): Any? {
        var dadoEspiado: Any? = null
        if (!estaVazia()) {
            dadoEspiado = ponteiroFim?.dado
        } else {
            println("Fila Vazia!")
        }
        return dadoEspiado
    }



    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}