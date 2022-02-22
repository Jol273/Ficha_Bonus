package pt.ulusofona.cm.kotlin.challenge

class Pessoa(
    val nome: String
    ,val dataDeNascimento: DataCalendario
): Movimentavel {

    var posicao: Posicao? = Posicao(0,0)

    val veiculos: MutableList<Veiculo> = mutableListOf()
    var carta: Carta? = null

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo{
       try{


        } catch (e : VeiculoNaoEncontradoException){

        }
        return Bicicleta("as5d14a3d1")
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){}

    fun moverVeiculoPara(identificador: String, x: Int,y: Int){
        //veiculos.find {  }()
        try {
            if(temCarta()){
                Carro("as51d3a1d",Motor(190,5000)).moverPara(x,y)
            }
        }catch (e : PessoaSemCartaException){
            throw PessoaSemCartaException("A pessoa $nome não possui carta, logo não pode utilizar este veiculo")
        }

    }

    fun temCarta(): Boolean{
        return carta != null
    }

    fun tirarCarta(){
        //val idade = LocalDate.from(dataDeNascimento)
        try {
            /*if (idade >= 18){
                carta = Carta()
            }*/
        }catch (e : MenorDeIdadeException){
            throw MenorDeIdadeException(" A pessoa $nome tentou tirar a carta apesar de ser menor de idade")
        }
    }

    override fun moverPara(x: Int, y: Int) {
        posicao = Posicao(x, y)
    }


    override fun toString(): String = "Pessoa | $nome | $dataDeNascimento | $posicao "
}