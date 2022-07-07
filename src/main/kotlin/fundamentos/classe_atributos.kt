package fundamentos

class Carro(var cor: String, var anoFabricacao: Int, var modelo: String, val dono: Dono){

}

class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro( cor = "Preto", anoFabricacao = 2022, modelo = "Audi R8", Dono("Vinicius", 20))

    println("=======Carro=======")
    println(carro.modelo)
    println(carro.cor)
    println(carro.anoFabricacao)

    //caso eu queira declarar uma variavel direto na funcao, ela vai aparecer printada tambem
    //carro.cor = "Branco"

    println("=======Proprietario=======")

    println(carro.dono.nome)
    println(carro.dono.idade)
}