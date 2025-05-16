/* 5. Ler um número inteiro e exibir o seu sucessor. */

fun main(){
    var num = 0

    println("insira um numero para saber o seu sucessor: ")
    
    num = readln().toInt()
    num += 1

    println("o sucessor é $num")
}
