package lista

class ListaCircular(tamanho: Int = 10) : Listavel {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0
    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("Lista Cheia!")
        }
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim + 1
                for (i in posicao ..< quantidade) {
                    var anterior = ponteiroAux - 1
                    if (ponteiroAux == dados.size) {
                        ponteiroAux = 0
                    }
                    var atual = ponteiroAux
                    dados[atual] = dados[anterior]
                    ponteiroAux--
                }
                dados[posicaoFisica] = dado
                ponteiroFim++
                if (ponteiroFim == dados.size) {
                    ponteiroFim = 0
                }
                quantidade++
            } else {
                println("Posição invalida!")
            }

        } else {
            println("Lista Cheia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoSelecionado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dadoSelecionado = dados[posicaoFisica]
            } else {
                println("Posição invalida!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoSelecionado
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosSelecionados: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            for (i in 0 ..< quantidade) {
                dadosSelecionados[i] = dados[(ponteiroInicio + i) % dados.size]
            }
        } else {
            println("Fila Vazia!")
        }
        return dadosSelecionados
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dados[posicaoFisica] = dado
            } else {
                println("Posição Inválida!")
            }

        } else {
            println("Lista Cheia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoApagado: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = posicaoFisica
                dadoApagado = dados[posicaoFisica]
                for (i in posicao..<(quantidade - 1)) {
                    var atual = ponteiroAux
                    var proximo = (ponteiroAux + 1) % dados.size
                    dados[atual] = dados[proximo]
                    ponteiroAux++
                }
                ponteiroFim--
                if (ponteiroFim == -1) {
                    ponteiroFim = dados.size - 1
                }
                quantidade--
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoApagado
    }

    override fun estaCheia(): Boolean {
        return quantidade == dados.size
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "["
        var ponteiroAux = ponteiroInicio
        for (i in 0 ..< quantidade) {
            resultado += if (i == quantidade - 1) {
                "${dados[(ponteiroAux + i) % dados.size]}"
            } else {
                "${dados[(ponteiroAux + i) % dados.size]}, "
            }
        }
        return "$resultado]"
    }

}