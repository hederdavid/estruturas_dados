package v1Hash3

class MapaEspalhamento(private val tamanhoTabela: Int = 10): Espalhavel {

    private var tabelaEspalhamento: Array<Listavel> = Array(tamanhoTabela) {ListaDinamica()}
    private var quantidade = 0
    override fun inserir(mapa: Mapa) {
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
            } else {
                println("Chave não encontrada!")
            }

        } else {
            println("Estrutura Vazia!")
        }
        return dadoApagado
    }

    override fun buscar(chave: Any): Any? {
        var dadoBuscado: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                var indice = funcaoEspalhamento(chave)
                var listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    var elementoLista = listaTemp.selecionar(i) as Mapa
                    var chaveElemento = elementoLista.chave

                    if (chaveElemento == chave) {
                        dadoBuscado = elementoLista.dado
                        break
                    }
                }

            } else {
                println("Chave não encontrada!")
            }

        } else {
            println("Estrutura Vazia!")
        }

        return dadoBuscado
    }

    override fun contemChave(chave: Any): Boolean {
        var isChaveEncontrada = false
        if (!estaVazia()) {
            var indice = funcaoEspalhamento(chave)
            var listaTemp = tabelaEspalhamento[indice]

            for (i in 0 ..< listaTemp.tamanho()) {
                var elementoLista = listaTemp.selecionar(i) as Mapa
                var chaveElemento = elementoLista.chave

                if (chave == chaveElemento) {
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

    override fun imprimir(): String {
        var resultado = "["

        for (i in 0 ..< tabelaEspalhamento.size) {
            var listaTemp = tabelaEspalhamento[i]
            resultado += "${listaTemp.imprimir()} \n"
        }

        return "$resultado]"
    }

    override fun tamanho(): Int {
        return quantidade
    }

    private fun funcaoEspalhamento(chave: Any): Int {
        var chaveString = chave.toString()
        var letraInicial = chaveString.lowercase()[0]
        return letraInicial.code % tamanhoTabela
    }

    private fun funcaoEspalhamento2(chave: Any): Int {
        var chaveString = chave.toString()
        var total = 0

        for (i in 0 ..< chaveString.length) {
            var letra = chaveString.lowercase()[i]
            total += letra.code
        }

        return total % tamanhoTabela
    }
}