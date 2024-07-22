package v1Hash2

import lista2.ListaDinamica
import lista2.Listavel

class MapaEspalhamento(private val tamanhoTabela: Int = 10): Espalhavel {

    private val tabelaEspalhamento: Array<Listavel> = Array(tamanhoTabela){ListaDinamica()}
    private var quantidade = 0
    override fun adicionar(mapa: Mapa) {
        val indice = funcaoEspalhamento(mapa.chave)
        val listaTemp = tabelaEspalhamento[indice]

        if (contemChave(mapa.chave)) {
            for (i in 0 ..< listaTemp.tamanho()) {
                val elementoLista = listaTemp.selecionar(i) as Mapa
                val chaveElemento = elementoLista.chave

                if (chaveElemento == mapa.chave) {
                    listaTemp.atualizar(mapa, i)
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
                var indice = funcaoEspalhamento(chave)
                var listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    val elementoLista = listaTemp.selecionar(i) as Mapa
                    val chaveElemento = elementoLista.chave

                    if (chave == chaveElemento) {
                        dadoRemovido = elementoLista.dado
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
        return dadoRemovido
    }

    override fun contemChave(chave: Any): Boolean {
        var chaveEncontrada: Boolean = false
        if (!estaVazia()) {
            var indice = funcaoEspalhamento(chave)
            val listaTemp = tabelaEspalhamento[indice]
            for (i in 0 ..< listaTemp.tamanho()) {
                val elementoLista = listaTemp.selecionar(i) as Mapa
                val chaveElemento = elementoLista.chave

                if (chave == chaveElemento) {
                    chaveEncontrada = true
                    break
                }
            }

        } else {
            println("Estrutura Vazia!")
        }
        return chaveEncontrada
    }

    override fun buscar(chave: Any): Any? {
        var dadoBuscado: Any? = null
        if (!estaVazia()) {
            if (contemChave(chave)) {
                val indice = funcaoEspalhamento(chave)
                val listaTemp = tabelaEspalhamento[indice]

                for (i in 0 ..< listaTemp.tamanho()) {
                    val elementoLista = listaTemp.selecionar(i) as Mapa
                    val elementoChave = elementoLista.chave

                    if (chave == elementoChave) {
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

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var resultado = "]"
        for (i in 0 ..< tabelaEspalhamento.size) {
            val listaTemp = tabelaEspalhamento[i]
            resultado += listaTemp.imprimir()
        }
        return "$resultado]"
    }

    override fun tamanho(): Int {
        return quantidade
    }

    private fun funcaoEspalhamento(chave: Any): Int {
        val chaveString = chave.toString()
        val caractere = chaveString.lowercase()[0]
        return caractere.code % tamanhoTabela
    }

    private fun funcaoEspalhamento2(chave: Any): Int {
        val chaveString = chave.toString()
        var total = 0
        for (i in 0 ..< chaveString.length) {
            val letra = chaveString.lowercase()[i]
            total += letra.code
        }
        return total % tamanhoTabela
    }
}