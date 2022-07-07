package fundamentos

fun main() {

    var lista : List<Int?> = listOf(1, 2, null, 3) //aqui o interroga foi usado para informar que dentro da minha lista, podem conter campos null
    var listaNula : List<Int>? = null //caso eu queira que a lista seja nula eu coloco o interroga

//    var nome : String?= null
//
//    //quando o nome for string ele retornara o tamanho do nome normalmente, caso ele seja nulo o elvis faz com que retorne 0
//    //O interrogacao faz com que ele aceite valores nulos
//    var tamanho = nome?.length ?: 0 //aqui estou utilizando o elvis operator (?:)
//
//    println(tamanho)

    //o safety null declarado com a interrocacao ao lado da String, indica que eu declaro seguro receber null
 //   var nome : String? = null
//   var nome = "Vinicius"

    //ele printa o tamanho da minha variavel
//    println(nome.length)

//    val toShort : Short = nome!!.length.toShort() //o double exclamacao eh usado para informar q eu tenho certeza de que o valor n vai ser nulo
}