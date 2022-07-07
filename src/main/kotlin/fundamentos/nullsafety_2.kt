package fundamentos

fun main() {
    var pessoa: Pessoa? = null

    //aqui vai estourar uma exception porque eu usei a double exclamacoes afirmando que nao teria nulo, mas tem. Apenas uma demonstracao de cautela
    println(pessoa!!.nome)
}