package fila.comPilhas

fun main() {
    val fila: Enfileiravel = FilaComPilhas()
    fila.enfileirar(1)
    fila.enfileirar(2)
    fila.enfileirar(3)
    fila.enfileirar(4)
    fila.enfileirar(5)
    println(fila.espiar())
    println(fila.imprimir())
}