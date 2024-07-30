package Quicksort

import Listdynamic

fun main() {
    val lista = Listdynamic(20)
    val dados = arrayOf(5, 7, 2, 6, 1, 4, 3, 0, 9, 8)
    for (dado in dados)
        lista.anexar(dado)

    var q = Quicksort4(lista)
    q.imprimir()
    q.ordenar()
    q.imprimir()
}