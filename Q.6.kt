/* 6. Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.  */

fun main(){
    var num = 0; var denom = 0
    var quociente = 0; var resto = 0
    println("insira o numerador ")
    num = readln().toInt()
    println("insira o denominador ")
    denom = readln().toInt()

    quociente = num/denom
    resto = num%denom

    println("o quociente é $quociente. e o resto é $resto")
}
