import pt.ulusofona.cm.kotlin.challenge.*

fun main(){
    val joao = Pessoa("João", DataCalendario("1997-03-27"))
    //val pedro = Pessoa("Pedro",DataCalendario())
    println(joao)

    val bm = Carro("BMW Serie 5", Motor(400,7000))
    println(bm)

    val bike = Bicicleta("BMX")
    println(bike)


}
