int x = 10
println x.class // java.lang.Integer
x = 1.25
println "x = $x " + x.class // Groovy trunca la parte decimal para quedarse solo con la parte entera, ya que sigue siendo un Integer.

def y = 10
println y.class // java.lang.Integer
y = 1.25 // java.math.BigDecimal 
println "y = $y " + y.class // Ahora es un tipo java.math.BigDecimal, y contiene el número con su parte decimal intacta.

def var = "10"
println var.class // java.lang.String
var = 10
println var.class // java.lang.Integer
var += "10"
println "var = $var " + var.class // 1010 java.lang.String
