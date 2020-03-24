@groovy.transform.ToString
class Account {
    BigDecimal balance = 0
    String type

    def deposit( BigDecimal amount ) {
        this.balance += amount
    }

    def withdraw( BigDecimal amount ) {
        this.balance -= amount
    }

    BigDecimal plus( Account other ) {
        this.balance + other.balance
    }
}

Account checking = new Account( type:"Checking" )
checking.deposit( 100.00 )
println checking

Account savings = new Account( type:"Savings" )
savings.deposit( 50.00 )
println savings

BigDecimal total = checking + savings
println total