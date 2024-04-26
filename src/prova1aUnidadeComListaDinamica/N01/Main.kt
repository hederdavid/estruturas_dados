package prova1aUnidadeComListaDinamica.N01

fun main() {
    var teste: ListaDinamica = ListaDinamica();
    teste.inserirFim(4)
    teste.inserirFim(3)
    teste.inserirFim(2)
    teste.inserirFim(1)
    teste.inserirFim(0)
    println(teste.imprimir())
}