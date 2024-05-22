package prova1aUnidadeComListaDinamica.N16

fun main() {
    val teste: ListaDinamica = ListaDinamica();
    teste.inserirFim(0)
    teste.inserirFim(1)
    teste.inserirFim(2)
    teste.inserirFim(3)
    teste.inserirFim(4)
    println(teste.apagarTodos().contentToString())
    teste.inserirFim(1)
    println(teste.imprimir())
}