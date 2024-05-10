package prova1aUnidadeComListaDinamica.N12

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun atualizarTodos(dado: Any?) {
        if (!estaVazia()) {
            var ponteiroAuxiliar = ponteiroInicio
            for (i in 0 ..< quantidade) {
                ponteiroAuxiliar?.dado = dado
                ponteiroAuxiliar = ponteiroAuxiliar?.proximo
            }
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