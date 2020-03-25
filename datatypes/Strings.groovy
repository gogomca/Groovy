//def folder = "C:\Technical\Courses\Groovy" // Unexpected input: '"'
def folder = "C:\\Technical\\Courses\\Groovy" // Haciendo uso de escapado del back slash (\).
println folder
folder = /C:\Technical\Courses\Groovy/ // Haciendo uso de slashy string (/<string>/).
println folder
folder = $/C:\Technical\Courses\Groovy/$ // Haciendo uso de dollar slashy ($/<string>/$).
println folder

