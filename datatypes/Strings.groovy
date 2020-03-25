//def folder = "C:\Technical\Courses\Groovy" // Unexpected input: '"'
def folder = "C:\\Technical\\Courses\\Groovy" // Haciendo uso de escapado del back slash (\).
println folder
folder = /C:\Technical\Courses\Groovy/ // Haciendo uso de slashy string (/<string>/).
println folder
folder = $/C:\Technical\Courses\Groovy/$ // Haciendo uso de dollar slashy ($/<string>/$).
println folder

// Tanto slashy string como dollar string se consideran GString, por lo que pueden evaluar expresiones en tiempo de ejecución.
def name = "John"
def str = /Hi, $name/ 
println str
str = $/Hi, $name/$
println str
