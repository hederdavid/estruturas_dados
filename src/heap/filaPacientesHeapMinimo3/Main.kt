package heap.filaPacientesHeapMinimo3

private fun novaPrioridade(prioridade: Long): Long {
    var tempo = System.nanoTime()
    var prioridadeString = prioridade.toString()
    return (prioridadeString + tempo).toLong()
}

fun main () {

}