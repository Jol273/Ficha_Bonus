package pt.ulusofona.cm.kotlin.challenge

class Bicicleta(override val identificador: String) : Veiculo(identificador) {

    override fun requerCarta(): Boolean = false
    override fun toString(): String {

        return "Bicicleta | $identificador | " +
                "$dataDeAquisicao |" +
                " $posicao"
    }
}