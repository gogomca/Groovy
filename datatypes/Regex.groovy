def pattern = ~"tri"
def string = "Tres tristes tigres jugaban en un trigal."
def finder = string =~ pattern
println pattern 
println pattern.class // java.lang.regex.Pattern
println finder // java.lang.regex.Matcher
println finder.size() // finder.count; finder.getCount(); Mejora de Groovy para java.lang.regex.Matcher

def emailPattern = ~$/[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}/$
def email = "gogomca@server.com"
println email ==~ emailPattern // Espera un resultado de coincidencia extricto.

def imgTagPattern = ~/<img\b[^>]*>(.*?)<\/img>/
def imgTag = $/<img src="folder">image</img>/$
println imgTag ==~ imgTagPattern // Espera un resultado de coincidencia extricto.