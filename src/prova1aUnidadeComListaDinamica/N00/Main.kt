package prova1aUnidadeComListaDinamica.N00

fun main() {
    var teste: ListaDinamica = ListaDinamica();
    teste.inserirInicio(4)
    teste.inserirInicio(3)
    teste.inserirInicio(2)
    teste.inserirInicio(1)
    teste.inserirInicio(0)
    println(teste.imprimir())
}