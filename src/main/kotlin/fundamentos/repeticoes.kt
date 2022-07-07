package fundamentos

fun main() {
//    printa1a10()
//    printa10a1()
//    printaPar1a10()
    //aqui eu declarei os valores da variavel Int da "printaRange"
//    printaRange(10, 20)
//    whileMenorQue10()
    doWhileMenorQue10()
}
// aqui eh uma estrutura usando while, entao significa que ENQUANTO o x (que eh a variavel que esta declarada ali)
//for menor do que 10, vou printar o x. E o x++ serve para ele ir conferindo o resultado, se continuar < 10 ele roda mais uma vez
//ate chegar no limite que seria o 9
fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

//o DoWhile retorna o x = 10 e o while nao, porque no While quando vai rodar ele ja ve que n eh < 10 entao ele nem retorna nada
//ja no DO WHILE ele roda uma vez e printa primeiro e depois verifica se eh menor q 10, entao ele printou 10 no console e depois mais nada
//ja q ele verificou que nao eh < 10
fun doWhileMenorQue10() {
    var x = 10
    do{
        println(x)
        x++
    }while (x < 10)
}

fun printa1a10() {
    //o For serve para criar a repeticao, dentro dele preenche com a variavel numero e 1 .. 10 eh o range que quero printar
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun printa10a1() {
    //aqui nesse for estou pedindo para o range ser printado de 10 ate o 1, diferente da fun de cima
    for (numero in 10 downTo 1)
        println(numero)
}

fun printaPar1a10() {
    //nesse for estou colocando o range de 2 ate o 10 e no step estou pedindo para contar de 2 em 2
    for (numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    //nesse for eu criei as variaveis inicio e fim declarando que a repeticao seria entre elas
    //mas so preenchi as variaveis com valores la na fun main
    for (numero in inicio .. fim)
        println(numero)
}