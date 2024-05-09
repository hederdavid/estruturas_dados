package prova1aUnidadeComListaDinamica.N05

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun selecionar(posicao: Int): Any? {
        var dadoSelecionado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio
                for (i in 0 ..< posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }

                dadoSelecionado = ponteiroAuxiliar?.dado

            } else {
                println("Posição inválida!")
            }
        } else {
            println("Fila Vazia!")
        }
        return dadoSelecionado
    }



    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}