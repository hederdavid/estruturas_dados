package estudosProva.pilha.normal


fun main(args: Array<String>) {
    var pilha : Empilhavel = PilhaNormal()
    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")
    println("Topo: ${pilha.espiar()}")
    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    pilha.empilhar("e")
    println("Topo: ${pilha.espiar()}")
    val conteudo = pilha.desempilhar()
    println(conteudo)
    pilha.empilhar(conteudo)
    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("Bahia")
    println("Pilha = ${pilha.imprimir()}")
}