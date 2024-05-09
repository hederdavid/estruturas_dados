package prova1aUnidadeComListaDinamica.N02

data class NoDuplo(var dados: Any? = null) {
    var anterior: NoDuplo? = null
    var proximo: NoDuplo? = null
}