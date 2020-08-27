package guru.springframework;

class Money {
    protected int amount;
    protected String currency;

    Money(int amount , String currency){
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency (){
        return currency ;
    }

    Money times(int times){
        return new Money(amount * times,this.currency);
    }

    static Money dollar(int amount){
        return new Money(amount,"USD");
    }

    static Money franc(int amount){
        return new Money(amount,"CHF");
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return (amount == money.amount) && (currency.equals(money.currency));
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
