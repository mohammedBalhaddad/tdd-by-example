package guru.springframework;

class Franc extends Money {

    Franc(int amount , String currency){
        super(amount,currency);
    }

    Money times(int times){
        return Money.franc(times * amount);
    }
}
