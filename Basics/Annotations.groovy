import groovy.transform.*

//@MapConstructor // Generará un constructor que acepte un Map con los argumentos para la instanciación. No es compatible con el uso de un constructor con @NamedVariant
@TupleConstructor // Generará constructores en base al orden de los atributos de clase declarados. Si explicitamos un constructor, no tendrá efecto.
@ToString // Genera una implementación del método toString()
@NullCheck // En los métodos explícitos, chequeará que los argumentos proporcionados no son nulos.
class Customer {
    String first, last
    int age
    Date since
    Collection favItems

        @NamedVariant // Permite hacer uso de Named Parameters sin necesidad de usar un Map como tipo de argumento.
        Customer( @NamedParam first, @NamedParam last ){ // Permite inicar qué parámetros se marcan como Named Parameter.
            this.first = first
            this.last = last 
        }

        void setName( String name ){
        this.first = name
    }
}

//def customer1 = new Customer( "John", null ) //Caught: java.lang.IllegalArgumentException: last cannot be null
def customer1 = new Customer( "John", "Doe")
println customer1
//customer1.setName(null) //java.lang.IllegalArgumentException: name cannot be null
// def customer2 = new Customer( "Thomas", "Anderson", 34, new Date() )  // Si el uso de @TupleConstructor tuviera efecto, sería una instanciación válida.
// println customer2
// def customer3 = new Customer( first:"Tony", last:"Stark", since:new Date() ) // Si se hiciera uso de @MapConstructor sería una instanciación válida.
// println customer3
def customer4 = new Customer(last:"Stark", first:"Tony")
println customer4