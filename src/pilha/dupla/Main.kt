package pilha.dupla

fun main(args: Array<String>) {
    var pilha: Empilhavel = PilhaDupla()
    pilha.empilhar1(1)
    pilha.empilhar1(2)
    pilha.empilhar1(3)
    pilha.empilhar1(4)
    pilha.empilhar1(5)
    println("Pilha1: " + pilha.imprimir1())
    pilha.empilhar2(6)
    pilha.empilhar2(7)
    pilha.empilhar2(8)
    pilha.empilhar2(9)
    pilha.empilhar2(10)
    println("Pilha2: " + pilha.imprimir2())
    println("Array: " + pilha.imprimirArray())
    println(pilha.desempilhar1())
    println(pilha.desempilhar2())
    println(pilha.topo1())
    println(pilha.topo2())
}