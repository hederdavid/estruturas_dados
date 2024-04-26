package lista.dinamica

fun main() {
    var lista: Listavel = ListaDinamica()
    lista.anexar("A")
    lista.anexar("B")
    lista.inserir("C", 2)
    println(lista.imprimir()) //[A,B,C]
    lista.anexar("D")
    lista.apagar(2)
    lista.inserir("E", 0)
    lista.inserir("F", 2);
    println(lista.imprimir()) //[E,B,F,C,D]
    println("${lista.selecionar(1)}") //B
    lista.atualizar("G", 1)
    println(lista.imprimir()) //[E,G,F,C,D]
}