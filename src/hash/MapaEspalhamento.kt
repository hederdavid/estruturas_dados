package hash

class MapaEspalhamento(val tamanhoTabela: Int = 10): Espalhavel {
    private val tabelaEspalhamento: Array<Listavel> = Array(tamanhoTabela) {ListaDinamica()}
    private var quantidade = 0
    override fun adicionar(mapa: Mapa) {
        val indice = funcaoEspalhamento(mapa.chave)
        val listaTemp = tabelaEspalhamento[indice]

        if (contemChave(mapa.chave)) {
            for (i in 0 ..< listaTemp.tamanho()) {
                val elementoLista = listaTemp.selecionar(i) as Mapa
                val chaveLista = elementoLista.chave

                if (chaveLista == mapa.chave) {
                    listaTemp.atualizar(mapa, i)
                    break
                }
            }
        } else {
            listaTemp.anexar(mapa)
            quantidade++
        }
    }

    override fun remover(chave: Any): Any? {
        var dadoRemovido: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                val indice = funcaoEspalhamento(chave)
                val listaTemp = tabelaEspalhamento[indice]

                for (i in 0..<listaTemp.tamanho()) {
                    val elementoLista = listaTemp.selecionar(i) as Mapa
                    val chaveLista = elementoLista.chave

                    if (chaveLista == chave) {
                        dadoRemovido = listaTemp.apagar(i)
                        quantidade--
                        break
                    }
                }

            } else {
                println("Chave não encontrada.")
            }
        } else {
            println("Estrutura vazia!")
        }
        return dadoRemovido
    }

    override fun contemChave(chave: Any): Boolean {
        var isChaveEncontrada: Boolean = false
        if (!estaVazia()) {
            val indice = funcaoEspalhamento(chave)
            val listaTemp = tabelaEspalhamento[indice]

            for (i in 0 ..< listaTemp.tamanho()) {
                val elementoLista = listaTemp.selecionar(i) as Mapa
                val chaveLista = elementoLista.chave

                if (chaveLista == chave) {
                    isChaveEncontrada = true
                    break
                }
            }

        } else {
            println("Estrutura Vazia!")
        }
        return isChaveEncontrada
    }

    override fun buscar(chave: Any): Any? {
        var dadoBuscado: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                val indice = funcaoEspalhamento(chave)
                val listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    val elementoLista = listaTemp.selecionar(i) as Mapa
                    val chaveLista = elementoLista.chave

                    if (chaveLista == chave) {
                        dadoBuscado = elementoLista.dado
                        break
                    }
                }

            }

        } else {
            println("Estrutura Vazia!")
        }
        return dadoBuscado
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in 0 ..< tamanhoTabela) {
            var listaTemp = tabelaEspalhamento[i]
            resultado += "${listaTemp.imprimir()}\n "
        }
        return "$resultado]"
    }

    override fun tamanho(): Int {
        return quantidade
    }

    private fun funcaoEspalhamento(chave: Any?): Int {
        val chaveString = chave.toString()
        val letraInicial = chaveString.lowercase()[0]
        return letraInicial.code % tamanhoTabela
    }

    private fun funcaoEspalhamento2(chave: Any?): Int {
        val chaveString = chave.toString()
        var total = 0
        for (i in 0 ..< chaveString.length) {
            var primeiraLetra = chaveString.lowercase()[i]
            total += primeiraLetra.code
        }
        return total % tamanhoTabela
    }
}