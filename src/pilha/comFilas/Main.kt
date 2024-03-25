package pilha.comFilas

import fila.comPilhas.Empilhavel

fun main() {
    val pilha: Empilhavel = PilhaComFilas();
    pilha.empilhar(1)
    pilha.empilhar(2)
    pilha.empilhar(3)
    pilha.empilhar(4)
    println(pilha.espiar())
    println(pilha.imprimir())
}