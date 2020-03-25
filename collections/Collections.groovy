for( int x = 1; x <= 10; x++ ){
    print "$x "
}

10.times() {
    num -> print "$num "
}

def strings = ["John", "Tony", "Thomas"]
strings.size.times() {
    index -> print "${strings[index]} "
}