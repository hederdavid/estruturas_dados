package fila.circular

interface DuplamenteEnfileirado {
    fun enfileirarInicio(dado: Any?)
    fun enfileirarFim(dado: Any?)
    fun desenfileirarInicio(): Any?
    fun desenfileirarFim(): Any?
    fun espiarInicio(): Any?
    fun espiarFim(): Any?
    fun atualizarInicio(dado: Any?)
    fun atualizarFim(dado: Any?)
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String

}