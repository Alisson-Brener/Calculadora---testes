class Calculadora {
    fun soma(a:Double, b:Double): Double{
        return a+b;
    }

    fun subtracao(a:Double, b:Double): Double{
        return a-b;
    }

    fun multiplicacao(a:Double, b:Double): Double{
        return a*b;
    }

    fun divisao(a:Double, b:Double): Double{
        if (b==0.0){
            throw IllegalArgumentException("Divisão por zero não é permitida!")
        }
        return a/b;
    }
}