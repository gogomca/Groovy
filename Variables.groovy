class Variables {
	static void main(args){
		def name = "John"
		def surname = "Doe"
		println(name + " " + surname)
		//print($name + " " + $surname) ---> References outside quotes does not work.
		//print($name + " " + ${surname}) ---> ${X] outside quotes does not work.
		println("$name ${surname}") //---> We can refer variables in an string with the pattern $X or ${X}
		//print('$name ${surname}') ---> All inside single quotes is literally interpreted. It is considered only text.
		name // It doesn't fail, but neither prints any to console.
		//$name
		//${surname}
		/*
		def 1_var = 12345 ---> Variable names must start with an undescore or a letter.
		println(1_var)
		*/
		def var_1 = 12345
		println(var_1)
		/*
		var_2 = 54321 ---> In this static scope, this definition way is not allowed.
		println(var_2)
		*/ 
	}
}