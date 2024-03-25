package estudosProva.pilha.dupla

interface Empilhavel {
    fun empilhar1(dado: Any?)
    fun desempilhar1(): Any?
    fun atualizar1(dado: Any?)
    fun espiar1(): Any?
    fun estaCheia1(): Boolean
    fun estaVazia1(): Boolean
    fun imprimir1(): String

    fun empilhar2(dado: Any?)
    fun desempilhar2(): Any?
    fun atualizar2(dado: Any?)
    fun espiar2(): Any?

    fun estaCheia2(): Boolean
    fun estaVazia2(): Boolean
    fun imprimir2(): String
}