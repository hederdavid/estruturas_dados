interface DuplamenteEnfileirado {
    fun enfileirarInicio(dado: Any?)
    fun enfileirarFim(dado: Any?) // mesmo que o enfileirar normal da fila
    fun desenfileirarInicio(): Any? // mesmo que o desenfileirar normal da fila
    fun desenfileirarFim(): Any?
    fun espiarInicio(): Any? // ja pronto tbm
    fun espiarFim(): Any? // ja pronto tbm
    fun atualizarInicio(novoDado: Any?) // ja
    fun atualizarFim(novoDado: Any?)
    fun estaCheia(): Boolean //ja
    fun estaVazia(): Boolean //ja
    fun imprimir(): String //ja

}