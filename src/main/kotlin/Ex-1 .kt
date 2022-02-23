fun main() {
    print("Digite a sua idade: ")
    val idade= (readLine()!!.toInt())

    val ano = 2022 - idade
    println("O ano em que você nasceu é: $ano")
}

//1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.