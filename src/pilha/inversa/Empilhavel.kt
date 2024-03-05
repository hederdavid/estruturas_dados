package pilha.inversa

interface Empilhavel {
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}