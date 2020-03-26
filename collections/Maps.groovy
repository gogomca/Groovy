def map = [:]
println map.getClass().getName() // java.util.LinkedHashMap
println "---"

map = [name: "John", surname: "Doe", email: "johndoe@server.com"]
println map
println "---"

map.twitter = "@johndoe" // Añade un nuevo par clave/valor al mapa.
println map
println "---"

map << [age: 33]
println map
println "---"

def bookshopKey = "Bookshop Key"
def book = [isbn: "12345abc", title: "Necronomicón"]
book << [bookshopKey: 12345]
println book // [isbn:12345abc, title:Necronomicón, bookshopKey:12345]; Toma el nombre de la key literalmente, y no como variable, y por tanto, por su valor.
book << [(bookshopKey): 54321] // [isbn:12345abc, title:Necronomicón, bookshopKey:12345, Bookshop Key:12345]; Encerrando la variable entre paréntesis sí toma el valor de la misma como clave.
println book
println "book: ${book["Bookshop Key"]} - ${book[bookshopKey]}" // book: 54321 - 54321
println "---"
