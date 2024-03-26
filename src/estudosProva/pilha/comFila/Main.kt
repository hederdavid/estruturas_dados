package estudosProva.pilha.comFila

fun main() {
    val pilha : Empilhavel = PilhaComFilas()
    pilha.empilhar(1)
    pilha.empilhar(2)
    pilha.empilhar(3)
    pilha.empilhar(4)
    println(pilha.imprimir())
}