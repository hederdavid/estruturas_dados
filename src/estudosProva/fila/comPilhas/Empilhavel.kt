package estudosProva.fila.comPilhas

interface Empilhavel {
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun espiar(): Any?
    fun atualizar(dado: Any?)
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}