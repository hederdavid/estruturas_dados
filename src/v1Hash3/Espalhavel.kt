package v1Hash3

interface Espalhavel {

    fun inserir(mapa: Mapa)
    fun remover(chave: Any): Any?
    fun buscar(chave: Any): Any?
    fun contemChave(chave: Any): Boolean

    fun estaVazia(): Boolean
    fun imprimir(): String
    fun tamanho(): Int
}