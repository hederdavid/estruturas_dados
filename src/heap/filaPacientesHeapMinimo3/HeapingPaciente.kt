package heap.filaPacientesHeapMinimo3

interface HeapingPaciente {

    fun enfileirar(dado: Paciente)
    fun desenfileirar(dado: Paciente): Paciente?
    fun atualizar(dado: Paciente)
    fun espiar(dado: Paciente?): Paciente?
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}