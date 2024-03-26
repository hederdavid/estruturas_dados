package teste
interface Interface1 {
    fun metodoComum()
}

interface Interface2 {
    fun metodoComum()
}

class MinhaClasse : Interface1, Interface2 {
    override fun metodoComum() {
        println("Método comum implementado na classe concreta")
    }

    // Implementação adicional para o método de Interface2
    fun Interface2.metodoComum() {
        println("Método comum de Interface2 implementado na classe concreta")
    }
}

fun main() {
    val minhaClasse = MinhaClasse()
    minhaClasse.metodoComum() // Saída: Método comum implementado na classe concreta
    (minhaClasse as Interface2).metodoComum() // Saída: Método comum de Interface2 implementado na classe concreta
}
