package pilha.inversa

fun main(args: Array<String>) {
    var pilha: Empilhavel = PilhaEstaticaInversa()
    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("e")
    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("Bahia")
    pilha.empilhar(pilha.desempilhar())
    println("Pilha=${pilha.imprimir()}")
}