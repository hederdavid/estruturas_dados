package heap.heapMaximo

interface Amontoavel {
    fun inserir(dado: Int)
    fun extrair(): Int?
    fun atualizar(dado: Int)
    fun obter(): Int?
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}