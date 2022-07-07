package fundamentos

fun main() {
    //parOuImpar(2)
    //parOuImpar(3)
    resultadoDaNOta(6.0)
    resultadoDaNOta(3.9)
    resultadoDaNOta(5.5)

}

fun parOuImpar(numero: Int) {
    if(numero % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}

//se a nota >= 6 --> passou
//se a nota for > 4 --> recuperacao
//se a nota for < 4 --> reprovou
fun resultadoDaNOta(nota: Double){
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperacao")
    } else {
        println("reprovado")
    }


}