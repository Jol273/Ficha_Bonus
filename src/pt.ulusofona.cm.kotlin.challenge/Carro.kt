package pt.ulusofona.cm.kotlin.challenge

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador) {

    override fun requerCarta(): Boolean = true

    override fun toString(): String {
        return "Carro | $identificador | " +
                "$dataDeAquisicao |" +
                " $posicao"
    }


}