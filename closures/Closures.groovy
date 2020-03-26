def closure = {}
println closure

groovy.lang.Closure greeting = {
    println "Hello!"
}
greeting()

Closure greetTo = {
    name -> println "Hello, $name!"
}
greetTo("John")

List nums = [1, 2, 3]
nums.each({print "$it "}) // it es el nombre que recibe el par�metro impl�cito sobre el que se va a trabajar.
println()

Closure greetToIt = {
    println "Hello, $it!" // El ejemplo de saludar pero usando el par�metro impl�cito.
}
greetToIt("John")

def timesToGreetTo(int times, Closure greeting) {
    times.times(greeting)
}
timesToGreetTo(10,{println "Hi!"}) // Proporcionamos el Closure como argumento de la invocaci�n del m�todo.
timesToGreetTo(10) { 
    println "Hello!" // En Groovy, si el �ltimo par�metro es un Closure, podemos indicarlo como parte del cuerpo del propio m�todo. 
}
nums.each {print "$it "} // Como el �nico par�mtro del m�todo es el Closure, podemos omitir los par�ntesis.
println()

Closure withoutParams = { println("Hi!") } // Este Closure no hace uso de par�mtros...
withoutParams("John") // ...pero se le puden pasar argumentos sin que llegue a fallar.
Closure nonAcceptingParams = { -> println("Hi!") } // En este caso tampoco se declaran par�metros...
//nonAcceptingParams("John") // ...ni acepta argumentos, lanzando una excepci�n en caso de proporcionarlos. groovy.lang.MissingMethodException: No signature of method: ConsoleScript239$_run_closure10.call() is applicable for argument types: (String) values: [John]

def flexibleGreeting = {
    name = "World" -> println "Hello, $name!"; "Hello, $name!"
}
assert "Hello, World!" == flexibleGreeting()
assert "Hello, Thomas!" == flexibleGreeting("Thomas")

def varArgsClosure = {
    String... args -> println args.getClass().getName()
}
varArgsClosure() // Los argumentos variables se almacenan como un array del tipo definido; [Ljava.lang.String;

def closureInspector(Closure closure){
    println closure.maximumNumberOfParameters
    println closure.parameterTypes
}
closureInspector({x, y -> x+y}) //2; [class java.lang.Object, class java.lang.Object]
