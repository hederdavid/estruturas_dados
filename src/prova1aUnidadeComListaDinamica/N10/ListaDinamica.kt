package prova1aUnidadeComListaDinamica.N10

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun atualizarFim(dado: Any?) {
        if (!estaVazia()) {
            ponteiroFim?.dado = dado
        } else {
            println("Lista Vazia!")
        }
    }

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}