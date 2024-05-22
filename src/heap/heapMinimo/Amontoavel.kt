package heap.heapMinimo

interface Amontoavel {
    fun inserir(dado: Int)
    fun extrair(): Int?
    fun obter(): Int?
    fun atualizar(dado: Int)

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
    //private fun indicePai(filho: Int): Int
    //private fun trocar(i: Int, j: Int)	//swap
    //private fun ajustarAbaixo(pai: Int) 	//heapifyDown
    //private fun ajustarAcima(indice: Int) //heapifyUp
}