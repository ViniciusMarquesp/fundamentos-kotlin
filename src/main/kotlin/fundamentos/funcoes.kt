package fundamentos

fun main() {
    //aqui puxei o nome pela fun retornaNome e a idade pela fun dizOi
    dizOi(retornaNome(), 21)
    //mostrando que nao tem problema sair da ordem pois o que vai ser printado esta la na funcao de baixo
    dizOi(idade = 23, nome = "Jovirone")
    //mostrando que caso eu nao preencha a idade manualmente, ele vai puxar a que eu declarei na fun dizOi
    dizOi(nome = "Daniel")
    //println(retornaNome())
}
//declarei uma funcao e prrenchi com o que eu quero que ela retorne
fun retornaNome(): String {
    return "Vinicius"
}
//declarei uma fun e preenchi ela com o que eu queria que fosse printado (o "nome" esta inativo porque usei o retornaNome
fun dizOi(nome: String, idade: Int = 20) {
    println("Oiiie ${nome}, jaja voce faz ${idade} anos")
}