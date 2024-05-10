package prova1aUnidadeComListaDinamica.N13

fun main() {
    val teste: ListaDinamica = ListaDinamica();
    teste.inserirFim(0)
    teste.inserirFim(1)
    teste.inserirFim(2)
    teste.inserirFim(3)
    teste.inserirFim(4)
    println(teste.apagarInicio())
    println(teste.imprimir())
}