package pilha.estatica

interface Empilhavel {
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}