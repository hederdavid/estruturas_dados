package hash2

class ListaDinamica(var tamanho: Int = 10) : Listavel {
    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0
    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            val noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim
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

    override fun inserir(dado: Any?, posicao: Int) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                val noTemp = NoDuplo(dado)
                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo: NoDuplo? = ponteiroInicio

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

                noTemp.proximo = ponteiroProximo
                noTemp.anterior = ponteiroAnterior
                quantidade++

            } else {
                println("Posição invalida!")
            }

        } else {
            println("Lista Cheia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoApagado: Any? = null
        if (!estaVazia()) {
            var ponteiroAuxiliar = ponteiroInicio
            if (posicao >= 0 && posicao < quantidade) {
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

    override fun selecionar(posicao: Int): Any? {
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
            println("Lista Vazia!")
        }
        return dadoSelecionado
    }

    override fun selecionarTodos(): Array<Any?> {
        val dados: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            var ponteiroAuxiliar = ponteiroInicio
            for (i in 0 ..< quantidade) {
                dados[i] = ponteiroAuxiliar?.dado
                ponteiroAuxiliar = ponteiroAuxiliar?.proximo
            }
        } else {
            println("Lista Vazia!")
        }
        return dados

    }

    override fun atualizar(dado: Any?, posicao: Int) {
        if (!estaVazia()) {
            var ponteiroAuxiliar = ponteiroInicio
            if (posicao >= 0 && posicao < quantidade) {
                for (i in 0 ..< posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }

                ponteiroAuxiliar?.dado = dado

            } else {
                println("Lista Vazia!")
            }

        } else {
            println("Lista Vazia!")
        }
    }

    override fun apagarTodos(): Array<Any?> {
        val dados: Array<Any?> = selecionarTodos()
        limpar()
        return dados
    }

    override fun limpar() {
        ponteiroInicio = null
        ponteiroFim = null
        quantidade = 0
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAuxiliar = ponteiroInicio
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1) {
                "${ponteiroAuxiliar?.dado}"
            } else {
                "${ponteiroAuxiliar?.dado}, "
            }
            ponteiroAuxiliar = ponteiroAuxiliar?.proximo
        }
        return "$resultado]"
    }

    override fun tamanho(): Int {
        return quantidade
    }
}