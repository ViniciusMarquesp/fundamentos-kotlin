package fundamentos

fun main() {
    //criei uma lista e preenchi ela com os valores 1,2 e 3
//    var lista = mutableListOf(1, 2, 4, 2, 6, 3, 20, 15)
    //criei um filtro para pegar os numeros pares dessa minhan lista
//    val pares = lista.filter { it % 2 == 0} //o it vai verificar todos os valores, acessamos o registro pelo it

//    println(pares)

//       println(lista)
//    //aqui eu ordeno minha lista
//    lista.sort()
//
//    println(lista)
//    //aqui ele embaralha minha lista
//    lista.shuffle()
//
//    println(lista)

    //coloquei a lista para ser mutavel. Add o numero 8 a ela e depois removi o 3
//    lista.add(8)
//
//    lista.removeAt(0)
//    lista.remove(3)
//
//    //aqui eu alterei a primeira posicao, removendo o 1 e trocando para 20
//    lista[0] = 20
//    println(lista)

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(6))

    //EXEMPLO 2 USANDO NOMES

//    var listaNomes = mutableListOf("Vinicius", "Daniel", "Gustavo")
//
//    println(listaNomes)
//
//    listaNomes.sort()
//
//    println(listaNomes)
//
//    listaNomes.shuffle()
//
//    println(listaNomes)

    //EXEMPLO 3, O SET EH UMA LISTA, MAS A DIFERENCA EH QUE ELE NAO RECEBE VALORES DUPLICADOS

//    var setNumeros = setOf(1, 2, 3, 2)
//
//    println(setNumeros.contains(2))

    //EXEMPLO 4. MAP

    var mapNomeIdade = mutableMapOf("Vinicius" to 20, "Daniel" to 21)
    println(mapNomeIdade)

    mapNomeIdade["Rodolfo"] = 29

    println(mapNomeIdade)

    mapNomeIdade.remove("Rodolfo")
    println(mapNomeIdade)

}