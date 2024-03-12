package fila.dupla

fun main(args: Array<String>) {
    val filaCircularDupla: DuplamenteEnfileirado = FilaCircularDupla()
    filaCircularDupla.enfileirarFim(1)
    filaCircularDupla.enfileirarFim(2)
    filaCircularDupla.enfileirarFim(3)
    filaCircularDupla.enfileirarFim(4)
    filaCircularDupla.enfileirarFim(5)
    filaCircularDupla.enfileirarFim(6)
    filaCircularDupla.enfileirarFim(7)
    filaCircularDupla.enfileirarFim(8)
    filaCircularDupla.enfileirarFim(9)
    filaCircularDupla.enfileirarFim(10)
    println(filaCircularDupla.imprimir())
    filaCircularDupla.desenfileirarInicio()
    filaCircularDupla.desenfileirarInicio()
    filaCircularDupla.desenfileirarInicio()
    filaCircularDupla.enfileirarInicio(11)
    filaCircularDupla.enfileirarInicio(12)
    filaCircularDupla.enfileirarInicio(13)
    println(filaCircularDupla.imprimir())


}