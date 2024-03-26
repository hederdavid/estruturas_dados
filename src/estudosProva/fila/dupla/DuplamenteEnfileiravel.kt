package estudosProva.fila.dupla

interface DuplamenteEnfileiravel {
    fun enfileirarInicio(dado: Any?)
    fun enfileirarFim(dado: Any?)
    fun desenfileirarInicio(): Any?
    fun desenfileirarFim(): Any?
    fun atualizarInicio(dado: Any?)
    fun atualizarFim(dado: Any?)
    fun espiarInicio(): Any?
    fun espiarFim(): Any?
    fun imprimirFrentePraTras(): String
    fun imprimirTrasPraFrente(): String
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean

}