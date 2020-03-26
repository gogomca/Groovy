def weekdaysSize = 7

println "--- Enums exercises ---"
enum weekdaysEnum { SUN, MON, TUE, WED, THU, FRI, SAT }
println weekdaysEnum//.getClass().getName()
def weekdaysRange = weekdaysEnum.SUN..weekdaysEnum.SAT
println weekdaysRange.getClass().getName() // groovy.lang.ObjectRange
def weekdaysList = weekdaysRange.collect()
//assert [ SUN, MON, TUE, WED, THU, FRI, SAT ] == weekdaysList
println weekdaysList
println weekdaysRange.contains(weekdaysEnum.WED)
println weekdaysRange.from
println weekdaysRange.to

println "--- Lists exercises ---"
def weekdays = [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" ]
println weekdays
assert weekdaysSize == weekdays.size()
def saturday = "Sat"
weekdays -= saturday
//weekdays.removeLast()
assert [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"] == weekdays
weekdays << saturday
assert [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"] == weekdays
def wednesday = weekdays[3]
assert "Wed" == wednesday
println wednesday

println "--- Maps exercises ---"
def weekdaysMap = [ 1: "Sun", 2: "Mon", 3: "Tue", 4: "Wed", 5: "Thu", 6: "Fri", 7: "Sat" ]
println weekdaysMap
assert "java.util.LinkedHashMap" == weekdaysMap.getClass().getName()
println weekdaysMap.getClass().getName()
assert weekdaysSize == weekdaysMap.size()
println weekdaysMap.size()
weekdaysMap.each( { key, value -> print "$value " } )
println ""
def weekdaysValues = weekdaysMap.values()
//assert [ 'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat' ] == weekdaysValues
assert [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" ] == weekdaysValues.toArray()
println weekdaysValues