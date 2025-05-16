/* 2. Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo. */

fun main(){
    var lado = 0; var per = 0; var area = 0

    println("insira um valor referente ao lado do quadrado")
    lado = readln().toInt()
    per = lado * 4
    area = lado * lado

    println("o perimetro é $per metros")
    println("a area é $area metros")
}
