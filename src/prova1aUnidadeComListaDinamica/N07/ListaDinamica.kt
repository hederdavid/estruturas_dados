package prova1aUnidadeComListaDinamica.N07

class ListaDinamica(var tamanho: Int = 10) {
    private var ponteiroFim: NoDuplo? = null
    private var ponteiroInicio: NoDuplo? = null
    private var quantidade = 0

    fun verificarPosicaoPrimeiraOcorrencia(dado: Any?): Any? {
        var posicao: Any? = "Elemento não encontrado na lista"
        var ponteiroAuxiliar = ponteiroInicio
        if (!estaVazia()) {
            for (i in 0 ..< quantidade) {
                if (ponteiroAuxiliar?.dado == dado) {
                    posicao = i
                    break
                }
                ponteiroAuxiliar = ponteiroAuxiliar?.proximo

            }
        } else {
            println("Lista Vazia!")
        }
        return posicao
    }

    //Apenas pra teste
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



    fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    fun estaVazia(): Boolean {
        return quantidade == 0
    }
}