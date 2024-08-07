package heap.filaPacientesHeapMinimo2

private fun novaPrioridade(prioridade: Long): Long {
    var tempo = System.nanoTime()
    var prioridadeString = prioridade.toString()
    var novaPrioridade = prioridadeString + tempo
    return novaPrioridade.toLong()
}

fun main() {
    var heapPacientes: HeapingPaciente = HeapingMinimoPaciente(10)
    heapPacientes.inserir(Paciente("João", 30, novaPrioridade(0)))
    heapPacientes.inserir(Paciente("Maria", 25, novaPrioridade(1)))
    heapPacientes.inserir(Paciente("Pedro", 40, novaPrioridade(2)))
    heapPacientes.inserir(Paciente("Ana", 35, novaPrioridade(1)))
    println("Todos os Pacientes: ${heapPacientes.imprimir()}")

    var pacienteAtendido = heapPacientes.extrair()
    println("Paciente atendido: $pacienteAtendido")  //Saída: João
    pacienteAtendido = heapPacientes.extrair()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Maria
    pacienteAtendido = heapPacientes.extrair()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Ana
    pacienteAtendido = heapPacientes.extrair()
    println("Paciente atendido: $pacienteAtendido")  //Saída: Pedro
}