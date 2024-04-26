package lista.dinamica

class ListaDinamica(private val tamanho: Int = 10): Listavel {

    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0
    override fun anexar(dado: Any?) {
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
        }

    }

    override fun inserir(dado: Any?, posicao: Int) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                var noTemp = NoDuplo(dado)

                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = noTemp
                //se o anterior é nulo é pq a insercao está sendo no inicio
                else
                    ponteiroInicio = noTemp


                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = noTemp
                //se o proximo é nulo é pq a insercao está sendo no fim (append)
                else
                    ponteiroFim = noTemp

                noTemp.anterior = ponteiroAnterior
                noTemp.proximo  = ponteiroProximo

                quantidade = quantidade.inc()
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Cheia!")
        }
    }

    override fun atualizar (dado: Any?, posicao: Int) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                ////////////////////////////////
                //Codigo de posicionamento do ponteiro auxiliar, no nodo
                //que será feita alguma operação. Esse codigo é o mesmo
                //para os metodos update, delete e select
                var ponteiroAuxiliar = ponteiroInicio
                for (i in 0 until posicao)
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                ///////////////////////////////
                ponteiroAuxiliar?.dado = dado
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAux = ponteiroInicio
                for (i in 0 ..< posicao) {
                    ponteiroAux = ponteiroInicio?.proximo
                }
                dadoAux = ponteiroAux?.dado
            } else {
                println("Posição inválida!!")
            }

        } else {
            println("Pilha Vazia!")
        }
        return dadoAux
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 ..< quantidade) {
                dadosAux[i] = ponteiroAux?.dado
                ponteiroAux = ponteiroAux?.proximo
            }

        } else {
            println("Lista Vazia!")
        }
        return dadosAux
    }

    override fun apagar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {

                var ponteiroAuxiliar = ponteiroInicio
                for (i in 0 until posicao)
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo

                dadoAux = ponteiroAuxiliar?.dado

                var ponteiroAnterior = ponteiroAuxiliar?.anterior
                var ponteiroProximo  = ponteiroAuxiliar?.proximo

                if (ponteiroAnterior != null)
                    ponteiroAnterior.proximo = ponteiroProximo

                else
                    ponteiroInicio = ponteiroInicio?.proximo

                if (ponteiroProximo != null)
                    ponteiroProximo.anterior = ponteiroAnterior

                else
                    ponteiroFim = ponteiroFim?.anterior

                quantidade = quantidade.dec()
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun imprimir(): String {
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
}