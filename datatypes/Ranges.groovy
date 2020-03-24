def x = 1
def y = 10

println "times"
y.times {
    num -> println num // El primer número será el cero (0).
}

println "upto"
x.upto( y ) {
    num -> println num // Los extremos estarán incluido también (1 y 10).
}

println "downto"
y.downto( x ) {
    num -> println num // Los extremos estarán incluidos también (10 y 1).
} 

println "step"
x.step( y, 1) {
    num -> println num // No incluirá el extremos superior (<10).
}