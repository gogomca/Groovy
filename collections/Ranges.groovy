Range intRange = 1..10
println intRange
println intRange.class // groovy.lang.IntRange
println intRange.size() // 10
intRange.size().times(){
    index -> print "${intRange[index]} "
}
println ""
println intRange.collect() // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

intRange = 1..<10 // Podemos indicar que no se incluya el límite superior.
println intRange.size() // 9
println intRange.collect() // [1, 2, 3, 4, 5, 6, 7, 8, 9]

def reverseRange = 10..1
println reverseRange.size() // 10
println reverseRange.collect() // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

Range numRange = 0.1..5.0
println numRange
println numRange.class // groovy.lang.NumberRange
println numRange.size() // 4
println numRange.collect() // [0.1, 1.1, 2.1, 3.1, 4.1]; Los incrementos, por defecto, se realizan por unida (1).

numRange = new NumberRange( 0.1, 1.0, 0.1 ) // Instanciando un tipo Range podemos indicar el step que creamos conveniente.
println numRange
println numRange.class // groovy.lang.NumberRange
println numRange.size() // 10
println numRange.collect() // [0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0]

Range range = new IntRange( 1, 10, true) // IntRange(from, to, reverse)
println range
println range.size()
println range.collect()

range = new NumberRange( 0, 10, 2, false) // IntRange(from, to, step, inclusive)
println range
println range.size() // 5
println range.collect() // [0, 2, 4, 6, 8]
range = new NumberRange( 0, 10, 2, true) // IntRange(from, to, step, inclusive)
println range
println range.size() // 6
println range.collect() // [0, 2, 4, 6, 8, 10]

Date today = new Date()
Date threeDayAway = today + 3
Range week = today..threeDayAway
println week.collect()