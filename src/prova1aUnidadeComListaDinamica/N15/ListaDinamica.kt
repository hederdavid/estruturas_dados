package prova1aUnidadeComListaDinamica.N15

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun apagar(posicao: Int): Any? {
        var dadoApagado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade ) {
                var ponteiroAuxiliar: NoDuplo? = ponteiroInicio

                for (i in 0 ..< posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }

                dadoApagado = ponteiroAuxiliar?.dado

                val ponteiroAnterior = ponteiroAuxiliar?.anterior
                val ponteiroProximo = ponteiroAuxiliar?.proximo

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = ponteiroProximo
                } else {
                    ponteiroInicio = ponteiroInicio?.proximo
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = ponteiroAnterior
                } else {
                    ponteiroFim = ponteiroFim?.anterior
                }

                quantidade--
            } else {
                println("Posição inválida!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoApagado
    }

    fun inserirFim(dado: Any?) {
        if (!estaCheia()) {
            var noTemp: NoDuplo? = NoDuplo(dado)
            noTemp?.anterior = ponteiroFim
            if (!estaVazia()) {
                ponteiroFim?.proximo = noTemp
            } else {
                ponteiroInicio = noTemp
            }
            ponteiroFim = noTemp
            quantidade++
        } else {
            println("Lista Cheia!")
        }
    }

    fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1) {
                "${ponteiroAux?.dado}"
            } else {
                "${ponteiroAux?.dado}, "
            }
            ponteiroAux = ponteiroAux?.proximo
        }
        return "$resultado]"

    }

    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}