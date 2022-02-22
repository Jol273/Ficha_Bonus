package pt.ulusofona.cm.kotlin.challenge

class Posicao(var x: Int,var y: Int) {
    fun alterarPosicaoPara(x: Int,y: Int) {}

    override fun toString(): String {
        return "Posicao | x:$x | y:$y"
    }
}