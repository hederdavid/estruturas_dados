package prova1aUnidadeComListaDinamica.N11

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun atualizar(dado: Any?, posicao: Int) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio
                for (i in 0 ..< posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }
                ponteiroAuxiliar?.dado = dado
            } else {
                println("Posição inválida!")
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