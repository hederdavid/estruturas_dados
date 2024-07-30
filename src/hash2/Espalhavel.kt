package hash2

interface Espalhavel {

    fun adicionar(mapa: Mapa)
    fun remover(chave: Any): Any?
    fun buscar(chave: Any): Any?
    fun contemChave(chave: Any): Boolean
    fun estaVazia(): Boolean
    fun tamanho(): Int
    fun imprimir(): String
}