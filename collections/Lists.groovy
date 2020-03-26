def list = [1, 2, 3]

println list.class.name // java.util.ArrayList como implementación del java.util.List mejorado de Groovy.
list = list as java.util.LinkedList
println list.class.name // java.util.LinkedList
list = list as java.util.ArrayList

list.add(4) // Anexa el elemento al final de la lista. 
println list // [1, 2, 3, 4]
list << 5 // También lo anexa.
println list // [1, 2, 3, 4, 5]

list = list as LinkedList
list.addLast(6) // [1, 2, 3, 4, 5]
println list // [1, 2, 3, 4, 5, 6] 
println list.removeLast() // Extrae el último elemento de la lista (6).
println list // [1, 2, 3, 4, 5]

list = list as ArrayList
list.push(6) // Se comporta como una pila (stack), por lo que añade al comienzo de la lista.
println list // [6, 1, 2, 3, 4, 5]
list.putAt(0, 9) // Sobrescribe el elemento de la posición indicada por el proporcionado. No devuelve el valor sobrescrito.
println list // [9, 1, 2, 3, 4, 5] 
println list.set(0,0) // Devuelve el valor reeplazado (9).
println list // [0, 1, 2, 3, 4, 5]
println list.pop() // Se comporta como una pila (stack), por lo que extrae el primer elemento de la lista.
println list // [1, 2, 3, 4, 5]

list.clear()
println list // []

list = [1, 2, 3] + [4, 5]
println list // 

list << ['a', 'b']
list << ['c', 'd', 'e']
println list // [1, 2, 3, 4, 5, [a, b], [c, d, e]]

println list.flatten() // [1, 2, 3, 4, 5, a, b, c, d, e] Todos los elementos al mismo nivel dentro de la lista.
println list // La lista original no se ha visto modificada.

println list - [2, 'd'] // [1, 3, 4, 5, [a, b], [c, d, e]] Ha eliminado los elementos al nivel raíz de la lista.
println list // La lista original no se ha visto modificada.
println list.flatten() - [2, 'd'] // Ahora sí ha eliminado los que se esperaban inicialmente.

list = [1, 3, 7, 3, 6, 1, 2, 9, 4, 6]
list.unique() // Elimina los duplicados existentes dejando la primera ocurrencia de los mismos.
println list

println "---"
list = [1, 3, 7, 3, 6, 1, 2, 9, 4, 6]
list = list as Set 
println list.class.name // java.util.LinkedHashSet
println "Set: $list" // Set: [1, 3, 7, 6, 2, 9, 4]
list = list as SortedSet
println list.class.name // java.util.TreeSet
println "SortedSet: $list" // SortedSet: [1, 2, 3, 4, 6, 7, 9]

