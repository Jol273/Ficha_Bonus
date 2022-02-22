package pt.ulusofona.cm.kotlin.challenge

import java.time.LocalDate

abstract class Veiculo(open val identificador: String): Movimentavel {

    val dataDeAquisicao = DataCalendario(LocalDate.now().toString())

    var posicao: Posicao? = Posicao(0,0)

    abstract fun requerCarta(): Boolean

    override fun moverPara(x: Int, y: Int)  {
        try {
            posicao = Posicao(x, y)
        } catch (e: AlterarPosicaoException){
            throw AlterarPosicaoException("A posição de origem e a posição de destino são identicas")
        }
    }

}