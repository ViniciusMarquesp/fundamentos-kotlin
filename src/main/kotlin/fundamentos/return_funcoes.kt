package fundamentos

//esse exemplo serve para entender que da pra colocar varios returns dentro de uma mesma funcao, quando ele encontrar o primeiro return que ele busca
//ele da o resultado
fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 5){
        return "Cinco"
    } else if (numero == 6){
        return "Seis"
    }
    return "Numero nao mapeado"
}

fun main() {
    print(retornaNumeroPorExtenso(5))
}