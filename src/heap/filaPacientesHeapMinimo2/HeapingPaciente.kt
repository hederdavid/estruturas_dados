package heap.filaPacientesHeapMinimo2

interface HeapingPaciente {
    fun inserir(paciente: Paciente?)
    fun extrair(): Paciente?
    fun atualizar(paciente: Paciente?)
    fun espiar(): Paciente?

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}