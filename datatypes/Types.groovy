def map = [:]
//println map.class.name // java.lang.NullPointerException: Cannot get property 'name' on null object
println map.class // null
println map.getClass().name // java.util.LinkedHashMap
println ("---")

def list = []
println list.class.name // java.util.ArrayList
println list.class // java.util.ArrayList
println list.getClass().name // java.util.ArrayList
println ("---")

println String.getClass() // java.lang.Class; La clase de un tipo siempre es java.lang.Class.
println String.class // java.lang.String; internamente realiza un .get("class")
println "John".getClass() // java.lang.String
println "John".class // java.lang.String
println ("---")