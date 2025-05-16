/* 3. Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.*/

const val pi = 3.1415

fun main(){
    var raio = 0.0; var per = 0.0; var area = 0.0

    println("insira um valor referente ao raio da circunferencia")
    raio = readln().toDouble()
    per = raio * 2 * pi
    area = (raio * raio) * pi

    println("o perimetro é $per metros")
    println("a area é $area metros")
}
