package fundamentos

fun main() {

//    val x = 26
//
//    //O when serve igual um "QUANDO" entao QUANDO o x for 5 ou 8 ele ira retornar o que esta printado, QUANDO o numero
//    //nao for nenhum dos dois ele retornara o else
//    when (x) {
//        //eu posso agrupar varios valores, mas todos eles vao retornar o que esta depois da seta
//        5, -5 -> println("x == 5")
//        8 -> println("x == 8")
//        //eu consigo abrir um bloco na condicao e pedir mais de uma acao caso o x for 10
//        10 -> {
//            println("x == 10")
//            println("x eh uma dezena")
//        }
//        //consigo criar um IN dentro do when para ter um range
//        in 11 .. 18 -> println("x esta entre 11 e 18")
//        //!in faz outra verificacao de true e false, assim como o in pegando um range
//        !in 19 .. 25 -> println("numero nao esta no range de 19 a 25")
//        //essa linha serve pra mostrar que a condicao when para quando achar o primeiro resultado, ent ele usa so o 5 la de cima
//        //5 -> println("x tambem e 5")
//        else -> println("Numero nao mapeado")
//    }

//    println(comecaComOi("tudo bem?"))
    when {
        comecaComOi(x = 5) -> println("5") //aqui ele n retorna porque da FALSE
        comecaComOi(x = "oi, tudo bem?") -> println("oi, tudo bem?") //aqui ele retorna porque da TRUE
        comecaComOi(x = "oi, estou bem") -> println("oi, estou bem!!") //aqui n retorna porque ele sempre para no primeiro que achar
    }
}
//Aqui eu fiz com q o X pudesse ser qualquer valor (ANY) e coloquei a condicao q caso fosse uma STRING q startasse com "oi" era TRUE caso fosse qualquer
//outra coisa resultaria em FALSE
fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}