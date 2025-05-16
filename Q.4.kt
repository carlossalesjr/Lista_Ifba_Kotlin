/* 4. Dado os três lados de um triângulo determinar o perímetro do mesmo.*/

fun main(){
    var lado1 = 0.0; var lado2 = 0.0; var lado3 = 0.0
    var per = 0.0

    println("insira um valor referente a cada lado do triangulo")
    lado1 = readln().toDouble()
    lado2= readln().toDouble()
    lado3 = readln().toDouble()

    per = lado1 + lado2 + lado3

    println("o perimetro é $per metros")
}
