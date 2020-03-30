println "--- Method using a Closure ---"
Closure adder = {
    BigDecimal num1, BigDecimal num2 -> num1 + num2
}
def sum = adder(1, 2)
assert sum == 3

def add(num1, num2, Closure adder){
    adder(num1, num2)
}
def num1 = 10
def num2 = 20
def result = add(num1, num2, adder)
println "$num1 + $num2 = $result"
assert result == 30

println "--- Printing a List ---"
List numbers = [1, 2, 3, 5, 8, 13, 21]
numbers.each {
    print "$it "
}

println "--- Printing a Map ---"
def weekdays = [1:"MON", 2:"TUE", 3:"WED", 4:"THU", 5:"FRI", 6:"SAT", 7:"SUN"]

def printMapElement = {
    key = 0, String value -> println "$key:$value"
}
printMapElement("THU")    

weekdays.each {
    key, value -> println "$key - $value"
}

weekdays.each(printMapElement)

println "--- Currying ---"
Closure person = {
    String name, String surname, Integer age -> println "$name $surname: $age"
}
person("John", "Doe", 33)

Closure tony = person.curry("Tony")
tony("Doe", 35)

Closure forty = person.rcurry(40)
forty("Thomas", "Anderson")

Closure stark = person.ncurry(1, "Stark")
stark("Tony", 50)

println "--- Collections ---"
println "[Collection] findAll, find"
def list = [0, 1, 3, (char)'a', null, "", "John"]
def findAllList = list.findAll()
assert findAllList == [1, 3, 'a', "John"]

def firstIdentityElem = list.find()
assert firstIdentityElem == 1

def numbersList = list.findAll {
    element -> element instanceof Number
}
assert numbersList == [0, 1, 3]

def firstCharacterElement = list.find {
    element -> element instanceof Character
}
assert firstCharacterElement == 'a'

println "[Iterable] any, every"
def numsList = [0, 1, 2, 3]
def containsTrueValues = numsList.any(Closure.IDENTITY)
assert containsTrueValues == true

def allTrueValues = numsList.every(Closure.IDENTITY)
assert allTrueValues == false

println "[Iterable] groupBy"
def mixList = [1, "a", null, null, 3, "John", "Doe", 2]
Closure isNull = {it == null}
Closure isNumber = {it instanceof Number}
Closure isString = {it instanceof String}
def closuresList = [isNull, isNumber, isString]
def groupedMixList = mixList.groupBy(closuresList)
assert groupedMixList.toString() == ([false:[true:[false:[1, 3, 2]], false:[true:['a', 'John', 'Doe']]], true:[false:[false:[null, null]]]]).toString()
println groupedMixList 
// Primero agrupa por isNull, por cada grupo, vuelve a agrupar por isNumber, y por cada grupo, hace lo propio con isString.
/*
[
    false:[ // Elementos que NO son null
        true:[ // Elementos que SÍ son Number
            false:[ // Elementos que NO son String
                1, 3, 2
            ]
        ], 
        false:[ // Elementos que NO son Number
            true:[ // Elementos que SÍ son String
                'a', 'John', 'Doe'
            ]
        ]
    ], 
    true:[ // Elementos que SÍ son null.
        false:[ // Elementos que NO son Number
            false:[ // Elementos que NO son String
                null, null
            ]
        ] 
    ]
]
*/