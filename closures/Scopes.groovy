class Calculator {
    BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        println "Calculator.multiply"
        2*num1*num2
    }
}

//def multiplier = {
//    multiply(10.0, 10.0)
//}
//multiplier() // groovy.lang.MissingMethodException: No signature of method: ConsoleScript2.multiply() is applicable for argument types: (Integer, Integer) values: [10, 10]

// Definimos ahora un Closure que cumpla con la invocación que antes fallaba.
//def multiply = {
//    BigDecimal num1, BigDecimal num2 ->
//    println "Closure.multiply"
//    num1*num2
//}
// NOTA: con la definición en forma de Closure no funciona. Solo lo hace con la definción de un método.

// Definimos un método que cumpla con la invocación que antes fallaba, que es sobre lo que realmente queremos delegar.
def multiply(BigDecimal num1, BigDecimal num2) {
    println "Closure.multiply"
    num1*num2
}

def result = multiply(10, 10)
println result // 100

def multiplier = { // Right now we can define the 'multiplier' closure.
    multiply(10.0, 10.0)
}
result = multiplier()
assert result == 100.00
println result // 100.00

Calculator calculator = new Calculator()
result = calculator.multiply(10.0, 10.0)
assert result == 200.00
println result // 200.0

multiplier.delegate = calculator
println "$multiplier.delegate - $multiplier.resolveStrategy"
result = multiplier()
assert result == 100.00
println result // 100.00; (By default) Closure.OWNER_FIRST

multiplier.resolveStrategy = Closure.DELEGATE_FIRST
println "$multiplier.delegate - $multiplier.resolveStrategy"
result = multiplier()
assert result == 200.00
println result // 200.00; Closure.DELEGATE_FIRST
