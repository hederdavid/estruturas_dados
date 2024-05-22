package heap.filaPacientesHeapMaximo
fun novaPrioridade(prioridade: Long) : Long {
    val tempo = System.nanoTime()
    val prioridadeString = prioridade.toString()
    var novaPrioridade = prioridadeString + (99999999999999L - tempo)
    return novaPrioridade.toLong()
}

fun main() {
    var heapPacientes: HeapMaximo = HeapingMaximoPaciente(10)
    heapPacientes.enfileirar(Paciente("João", 30, novaPrioridade(3)))
    heapPacientes.enfileirar(Paciente("Maria", 25, novaPrioridade(2)))
    heapPacientes.enfileirar(Paciente("Pedro", 40, novaPrioridade(1)))
    heapPacientes.enfileirar(Paciente("Ana", 35, novaPrioridade(2)))
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