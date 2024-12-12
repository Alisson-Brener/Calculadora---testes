import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AplicacaoTest {

    @Test
    fun testSoma() {
        val aplicacao = Aplicacao("soma")
        val resultado = aplicacao.realizaCalculo(50000000.0, 53232244.0)
        assertEquals(103232244.0, resultado, "Erro na operação de soma")
    }

    @Test
    fun testSubtracao() {
        val aplicacao = Aplicacao("subtração")
        val resultado = aplicacao.realizaCalculo(10.0, 50.0)
        assertEquals(-40.0, resultado, "Erro na operação de subtração")
    }

    @Test
    fun testMultiplicacao() {
        val aplicacao = Aplicacao("multiplicação")
        val resultado = aplicacao.realizaCalculo(555550.0, 5.0)
        assertEquals(2777750.0, resultado, "Erro na operação de multiplicação")
    }

    @Test
    fun testDivisao() {
        val aplicacao = Aplicacao("divisão")
        val resultado = aplicacao.realizaCalculo(10.0, 5.0)
        assertEquals(2.0, resultado, "Erro na operação de divisão")
    }

    @Test
    fun testDivisaoPorZero() {
        val aplicacao = Aplicacao("divisão")
        val exception = assertThrows<IllegalArgumentException> {
            aplicacao.realizaCalculo(10.0, 0.0)
        }
        assertEquals("Divisão por zero não é permitida!", exception.message)
    }

    @Test
    fun testOperacaoInvalida() {
        val aplicacao = Aplicacao("potencia")
        val exception = assertThrows<IllegalArgumentException> {
            aplicacao.realizaCalculo(2.0, 3.0)
        }
        assertEquals("Operação inválida: potencia", exception.message)
    }
}
