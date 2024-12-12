class Aplicacao(private val flag: String) {
    private val calculadora = Calculadora()

    fun realizaCalculo(a: Double, b: Double): Double{
        return when (flag) {
            "soma" -> calculadora.soma(a, b)
            "subtração" -> calculadora.subtracao(a, b)
            "multiplicação" -> calculadora.multiplicacao(a, b)
            "divisão" -> calculadora.divisao(a, b)
            else -> throw IllegalArgumentException("Operação inválida: $flag")
        }
    }
}