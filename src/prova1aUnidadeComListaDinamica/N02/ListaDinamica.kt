package prova1aUnidadeComListaDinamica.N02

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun inserir(dado: Any?, posicao: Int) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                var noTemp: NoDuplo? = null
                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for (i in 0 ..< posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = noTemp
                } else {
                    ponteiroAnterior = noTemp
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = noTemp
                } else {
                    ponteiroProximo = noTemp
                }

                noTemp?.anterior = ponteiroAnterior
                noTemp?.proximo = ponteiroProximo
                quantidade++

            } else {
                println("Posição invalida!!")
            }

        } else {
            println("Lista Cheia!")
        }
    }




    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}