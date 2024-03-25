package estudosProva.fila.dupla

interface DuplamenteEnfileiravel {
    fun enfileirarInicio(dado: Any?)
    fun desenfileirarInicio(): Any?
    fun atualizarInicio(dado: Any?)
    fun espiarInicio(): Any?

    fun enfileirarFim(dado: Any?)
    fun desenfileirarFim(): Any?
    fun atualizarFim(dado: Any?)
    fun espiarFim(): Any?

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimirFrentePraTras(): String
    fun imprimirTrasPraFrente(): String
}