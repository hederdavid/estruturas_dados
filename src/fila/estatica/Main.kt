package fila.estatica

fun main(args: Array<String>) {
    val fila: Enfileiravel = FilaEstatica()
    fila.enfileirar(1)
    fila.enfileirar(2)
    fila.enfileirar(3)
    fila.enfileirar(4)
    fila.enfileirar(5)
    fila.enfileirar(6)
    fila.enfileirar(7)
    fila.enfileirar(8)
    fila.enfileirar(9)
    fila.enfileirar(10)
//    fila.enfileirar(11)
    fila.desenfileirar()
    fila.desenfileirar()
    fila.desenfileirar()
    fila.enfileirar(11)
    fila.enfileirar(12)
    fila.enfileirar(13)

    println(fila.espiar())
    println(fila.imprimir())

}