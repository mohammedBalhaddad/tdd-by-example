package guru.springframework;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount , String currency){
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency (){
        return currency ;
    }
    abstract Money times(int times);

    static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    static Money franc(int amount){
        return new Franc(amount,"CHF");
    }

    public boolean equals(Object object){
        Money franc = (Money) object;
        return (amount == franc.amount) && (this.getClass() == franc.getClass());
    }
}
