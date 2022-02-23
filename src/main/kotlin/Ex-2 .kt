fun main() {
    print("Digite o diâmetro do círculo em metros: ")
    val diam= readLine()!!.toDouble()

    val raio= diam * 0.5
    val area= 3.14159 * (raio*raio)
    val peri= (3.14159 * 2) * raio
    print("A área do círculo é: %.2fm".format(area))
    print(",e o perímetro é: %.2fm".format(peri))
}
//2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele