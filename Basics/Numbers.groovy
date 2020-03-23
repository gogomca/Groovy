byte b = 1
print "$b " ; println b.class
char c = 99
print "$c " ; println c.class
short s = 3
print "$s " ; println s.class
int i = 4
print "$i " ; println i.class
long l = 5
print "$l " ; println l.class
BigInteger bi = 6
print "$bi " ; println bi.class

//Default types
println "Default types:"
def x = 1.class
println x
def y = 1111111111111111.class
println y
def z = 11111111111111111111111111111111.class
println z
def h = 1.1.class
println h

//Suffixes
println "Suffixes:"
def _bi = 1g
println _bi.class
def _l = 1l
println _l.class
def _i = 1i
println _i.class
def _bd = 1.0
println _bd.class
def _d = 1d
println _d.class
def _f = 1f
println _f.class

