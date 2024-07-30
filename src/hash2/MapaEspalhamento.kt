package hash2

class MapaEspalhamento(val tamanhoTabela: Int = 10): Espalhavel {

    private var tabelaEspalhamento: Array<Listavel> = Array(tamanhoTabela) {ListaDinamica()}
    private var quantidade = 0
    override fun adicionar(mapa: Mapa) {
        var indice = funcaoEspalhamento(mapa.chave)
        var listaTemp = tabelaEspalhamento[indice]

        if (contemChave(mapa.chave)) {
            for (i in 0 ..< listaTemp.tamanho()) {
                var elementoLista = listaTemp.selecionar(i) as Mapa
                var chaveElemento = elementoLista.chave

                if (chaveElemento == mapa.chave) {
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
        var dadoApagado: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                var indice = funcaoEspalhamento(chave)
                var listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    var elementoLista = listaTemp.selecionar(i) as Mapa
                    var chaveElemento = elementoLista.chave

                    if (chave == chaveElemento) {
                        dadoApagado = elementoLista.dado
                        listaTemp.apagar(i)
                        quantidade--
                        break
                    }
                }
            } else
                println("Chave não encontrada!")
        } else {
            println("Estrutura Vazia!")
        }

        return dadoApagado
    }

    override fun buscar(chave: Any): Any? {
        var dadoSelecionado: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                var indice = funcaoEspalhamento(chave)
                var listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    var elementoLista = listaTemp.selecionar(i) as Mapa
                    var chaveElemento = elementoLista.chave

                    if (chave == chaveElemento) {
                        dadoSelecionado = elementoLista.dado
                        break
                    }
                }

            } else {
                println("Chave não encontrada!")
            }

        } else {
            println("Estrutura Vazia!")
        }

        return dadoSelecionado
    }

    override fun contemChave(chave: Any): Boolean {
        var isChaveEncontrada = false
        if (!estaVazia()) {
            var indice = funcaoEspalhamento(chave)
            var listaTemp = tabelaEspalhamento[indice]

            for (i in 0 ..< listaTemp.tamanho()) {
                var elementoLista = listaTemp.selecionar(i) as Mapa
                var chaveLista = elementoLista.chave

                if (chave == chaveLista) {
                    isChaveEncontrada = true
                    break
                }
            }

        } else {
            println("Estrutura Vazia!")
        }

        return isChaveEncontrada
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun tamanho(): Int {
        return quantidade
    }

    override fun imprimir(): String {
        var resultado = "["

        for (i in 0 ..< tamanhoTabela) {
            var listaTemp = tabelaEspalhamento[i]
            resultado += "${listaTemp.imprimir()} \n"
        }

        return "$resultado]"
    }

    private fun funcaoEspalhamento(chave: Any): Int {
        var chaveString = chave.toString()
        var caractere = chaveString.lowercase()[0]
        return caractere.code % tamanhoTabela
    }

    private fun funcaoEspalhamento2(chave: Any): Int {
        var chaveString = chave.toString()
        var total = 0
        for (i in 0 ..< chaveString.length) {
            var caractere = chaveString.lowercase()[i]
            total += caractere.code
        }

        return total % tamanhoTabela
    }
}