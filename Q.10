/*10. Converter um inteiro informado menor que 32 para sua representação em binário   */

fun main() {
    print("Digite um inteiro menor que 32: ")
    var inteiro = readln().toInt()
    var modificador = 1
    var bin = 0

    while (inteiro > 0) {
        bin += inteiro % 2 * modificador
        modificador *= 10
        inteiro /= 2
    }
    println("representação binária do numero $inteiro é $bin ")
}
