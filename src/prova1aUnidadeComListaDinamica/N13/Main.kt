package prova1aUnidadeComListaDinamica.N08

fun main() {
    var teste: ListaDinamica = ListaDinamica();
    teste.inserirFim("teste")
    teste.inserirFim(0)
    teste.inserirFim(2)
    teste.inserirFim("teste")
    teste.inserirFim(0)
    println(teste.verificarPosicaoPrimeiraOcorrencia("teste"))
    println(teste.verificarPosicaoPrimeiraOcorrencia(0))
}