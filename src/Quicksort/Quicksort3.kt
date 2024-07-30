package Quicksort

import Listdynamic
import NoDuplo

class Quicksort3(private var lista: Listdynamic) {

    fun imprimir() {
        println(lista.imprimir())
    }

    fun ordenar() {
        quicksort(lista.ponteiroInicio, lista.ponteiroFim)
    }

    private fun quicksort(inicio: NoDuplo?, fim: NoDuplo?) {
        if (inicio != null && fim != null) {
            if (inicio != fim && inicio != fim.proximo) {
                var pivo = particionar(inicio, fim)
                quicksort(inicio, pivo.anterior)
                quicksort(pivo.proximo, fim)
            }
        }
    }

    private fun particionar(inicio: NoDuplo, fim: NoDuplo): NoDuplo {
        var valorPivo = inicio.dado
        var i = inicio
        var j = inicio.proximo

        while (j != null && j != fim.proximo) {
            if ((j.dado as Int) < (valorPivo as Int)) {
                i = i.proximo ?: i
                trocar(i, j)
            }
            j = j.proximo
        }
        trocar(inicio, i)
        return i

    }


    private fun trocar(no1: NoDuplo, no2: NoDuplo) {
        var temp = no1.dado
        no1.dado = no2.dado
        no2.dado = temp
    }
}