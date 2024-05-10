package prova1aUnidadeComListaDinamica.N09

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun atualizarInicio(dado: Any?) {
        if (!estaVazia()) {
            ponteiroInicio?.dado = dado
        } else {
            println("Fila Vazia!")
        }
    }

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}