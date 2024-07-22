package lista4

class ListaDinamica(private val tamanho: Int = 10): Listavel {

    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0
    override fun anexar(dado: Any?) {
        if (!estaVazia()) {
            var noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim
            if (!estaVazia()) {
                ponteiroFim?.proximo = noTemp
            } else {
                ponteiroInicio = noTemp
            }
            ponteiroFim = noTemp
            quantidade++

        } else {
            println("Lista Vazia!")
        }

    }

    override fun inserir(dado: Any?, posicao: Int) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                var noTemp = NoDuplo(dado)

                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for (i in 0 ..< posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = noTemp
                } else {
                    ponteiroInicio = noTemp
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = noTemp
                } else {
                    ponteiroFim = noTemp
                }

                noTemp.anterior = ponteiroAnterior
                noTemp.proximo = ponteiroProximo
                quantidade++

            } else {
                println("Posição inválida!")
            }

        } else {
            println("Lista Vazia!")
        }
    }

    override fun apagar(dado: Any?, posicao: Int): Any? {
        TODO("Not yet implemented")
    }

    override fun apagarTodos(): Array<Any?> {
        var dadosApagados = selecionarTodos()
        limpar()
        return dadosApagados
    }

    override fun atualizar(dado: Any?, posicao: Int) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 ..< posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }

                ponteiroAux?.dado = dado
            } else {
                println("Posição inválida!")
            }

        } else {
            println("Lista Vazia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoSelecionado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 ..< posicao) {
                    ponteiroAux = ponteiroAux?.proximo
                }
                dadoSelecionado = ponteiroAux?.dado
            } else {
                println("Posição inválida!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoSelecionado
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosSelecionados: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 ..< quantidade) {
                dadosSelecionados[i] = ponteiroAux?.dado
                ponteiroAux = ponteiroAux?.proximo
            }
        } else {
            println("Lista Vazia!")
        }
        return dadosSelecionados
    }

    override fun limpar() {
        ponteiroInicio = null
        ponteiroFim = null
        quantidade = 0
    }

    override fun tamanho(): Int {
        return quantidade
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "]"
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
}