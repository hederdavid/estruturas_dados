package pilha.dupla

interface Empilhavel {
    fun empilhar1(dado: Any?)
    fun desempilhar1(): Any?
    fun topo1(): Any?
    fun estaVazia1(): Boolean
    fun imprimir1(): String

    fun empilhar2(dado: Any?)
    fun desempilhar2(): Any?
    fun topo2(): Any?
    fun estaVazia2(): Boolean
    fun imprimir2(): String

    fun estaCheia(): Boolean
    fun imprimirArray(): String
}