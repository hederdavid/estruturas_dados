package heap.filaPacientesHeapMinimo3

data class Paciente(var nome: String, var idade: Int, var prioridade: Long) {

    private fun prioridadeOriginal(): Int {
        var prioridadeString = prioridade.toString()
        var tamanho = prioridadeString.length
        var digitoInicial = prioridadeString.substring(0, tamanho - 14)
        return digitoInicial.toIntOrNull()?: 0
    }

    override fun toString(): String {
        return "Paciente(nome='$nome', idade=$idade, prioridade=$prioridade, prioridadeOriginal=${prioridadeOriginal()})"
    }

}
