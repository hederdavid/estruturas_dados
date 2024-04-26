package prova1aUnidadeComListaDinamica.N00

class ListaDinamica(var tamanho: Int = 10) {

    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade = 0

    fun inserirInicio(dado: Any?) {
        if (!estaCheia()) {
            var noTemp: NoDuplo? = NoDuplo(dado)
            noTemp?.proximo = ponteiroInicio
            if (!estaVazia()) {
                ponteiroInicio?.anterior = noTemp
            } else {
                ponteiroFim = noTemp
            }
            ponteiroInicio = noTemp
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


    fun estaCheia(): Boolean { return quantidade == tamanho}
    fun estaVazia(): Boolean { return quantidade == 0 }
}