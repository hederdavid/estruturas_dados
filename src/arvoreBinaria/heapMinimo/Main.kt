package arvoreBinaria.heapMinimo

fun main() {
    val heap: Amontoavel = ArvoreHeapMinimo()
    heap.inserir(0)
    heap.inserir(1)
    heap.inserir(2)
    heap.inserir(3)
    heap.inserir(4)
    heap.inserir(5)
    heap.inserir(6)
    heap.inserir(7)
    heap.inserir(8)
    heap.extrair()
    heap.inserir(1)
    println(heap.imprimir())//[1,4,6,8,7]

}