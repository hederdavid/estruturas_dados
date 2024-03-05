package pilha.estatica

fun main(args: Array<String>) {
    var pilha: Empilhavel = PilhaEstatica()
    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    pilha.empilhar("e")
    println("Topo: ${pilha.topo()}")
    val conteudo = pilha.desempilhar()
    println(conteudo)
    pilha.empilhar(conteudo)
    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("Bahia")
    println("Pilha=${pilha.imprimir()}")
}