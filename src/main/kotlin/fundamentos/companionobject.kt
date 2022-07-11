package fundamentos

//ENTENDENDO A FUNCIONALIDADE DO COMPANION OBJECT, DECLAREI NA CLASSE "MINHACLASSE" O COMPANION OBJECT

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Vinicius", "Teste", 21)
        }
    //criei um builder ja declarando o que eu quero que retorne a partir da segunda classe
        fun criarApartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Vinicius", "Teste", 21)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 21).criarComValoresPadrao()

    //nao precisamos instaciar a classe para chamar ele. Para isso serve o compannion object
    var minhaClasse = MinhaClasse.criarComValoresPadrao()

}