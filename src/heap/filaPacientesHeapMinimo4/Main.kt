package heap.filaPacientesHeapMinimo4


private fun novaPrioridade(prioridade: Long): Long {
    var tempo = System.nanoTime()
    var prioridadeString = prioridade.toString()
    return (prioridadeString + tempo).toLong()
}

fun main () {
    val heapPacientes: HeapingPaciente = HeapingMinimoPaciente(10)
    heapPacientes.enfileirar(Paciente("João", 30, novaPrioridade(0)))
    heapPacientes.enfileirar(Paciente("Maria", 25, novaPrioridade(1)))
    heapPacientes.enfileirar(Paciente("Pedro", 40, novaPrioridade(2)))
    heapPacientes.enfileirar(Paciente("Ana", 35, novaPrioridade(1)))
    println("Todos os Pacientes: ${heapPacientes.imprimir()}")

    var pacienteAtendido = heapPacientes.desenfileirar()
    println("Paciente atendido: $pacienteAtendido")  //Saída: João
    pacienteAtendido = heapPacientes.desenfileirar()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Maria
    pacienteAtendido = heapPacientes.desenfileirar()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Ana
    pacienteAtendido = heapPacientes.desenfileirar()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Pedro

}