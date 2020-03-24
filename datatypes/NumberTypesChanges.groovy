def x = 10 
println "x: " + x.class // java.lang.Integer
x = 2.5.toInteger() // Conversión a java.lang.Integer y, por lo tanto, truncado de la parte decimal.
println "x: $x " + x.class
x = (float) 10 // Casting (explicit)
println "x: " + x.class // java.lang.Float
x = "10" // Coercion (implicit)
println "x: " + x.class // java.lang.String
x = x as Double
println "x: " + x.class // java.lang.Double

def num1 = (Float) 10 // java.lang.Float
Float num2 = 10 // java.lang.Float
def result1 = num1 + num2 // java.lang.Double
println "result1 = $result1 " + result1.class

def num3 = (Float) 10
Double num4 = 10
def result2 = num3 + num4
println "result2 = $result2 " + result2.class

def num5 = (Float) 10 // java.lang.Float
def num6 = 1.5 // java.math.BigDecimal
def result3 = num5 * num6 // java.lang.Double
println "result3 = $result3 " + result3.class

def num7 = (Double) 10 // java.lang.Double
def num8 = 1.5 // java.math.BigDecimal
def result4 = num7 * num8 // java.lang.Double
println "result4 = $result4 " + result4.class

def num9 = 1.5 // java.math.BigDecimal
def num10 = 10 // java.lang.Integer
def result5 = num9 + num10 // java.math.BigDecimal
println "result5 = $result5 " + result5.class

def num11 = 1.5 // java.math.BigDecimal
def num12 = (long) 10 // java.lang.Long
def result6 = num11 + num12 // java.math.BigDecimal
println "result6 = $result6 " + result6.class

def num13 = (java.math.BigInteger) 10  // java.math.BigInteger
def num14 = (long) 10 // java.lang.Long
def result7 = num13 + num14 // java.math.BigInteger
println "result7 = $result7 " + result7.class
