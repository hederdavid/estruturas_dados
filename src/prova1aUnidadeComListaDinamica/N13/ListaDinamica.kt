package prova1aUnidadeComListaDinamica.N13

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun apagarInicio(): Any? {
        var dadoApagado: Any? = null
        if (!estaVazia()) {
            val ponteiroAuxiliar = ponteiroInicio?.proximo
            ponteiroAuxiliar?.anterior = null
            dadoApagado = ponteiroInicio?.dado
            ponteiroInicio = ponteiroAuxiliar
            if (quantidade == 1) {
                ponteiroFim = null
            }
            quantidade--
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