package pt.ulusofona.cm.kotlin.challenge

class Motor(val cavalos: Int, val cilindrada : Int) : Ligavel {

    private var ligado: Boolean = false
    
    override fun ligar(){
        try {
            ligado = true
        } catch (e: VeiculoLigadoException) {
            throw VeiculoLigadoException("O veiculo em questâo já se encontra ligado")
        }

    }

    override fun desligar() {
        try {
            ligado = true
        } catch (e: VeiculoDesligadoException) {
            throw VeiculoDesligadoException("O veiculo em questâo já se encontra desligado")
        }
    }
    
    override fun estaLigado(): Boolean {
        return ligado
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}