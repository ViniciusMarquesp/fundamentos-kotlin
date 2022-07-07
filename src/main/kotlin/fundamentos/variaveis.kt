package fundamentos

fun main() {
    //e uma variavel do tipo mutavel
    var nome = "Vinicius"
    //val e uma nao mutavel
    val nomeVal = "Vinicius"

    nome = "Mike"
    //a nomeVal = Dustin da erro porque o val eh imutavel entao nao posso querer colocar outro nome nela
   // nomeVal = "Dustin"
}

class variaveis {
    //lateInit serve para dizer que vou colocar o valor dentro da variavel so depois, e so funciona com var porque eh mutavel
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"

    }
}