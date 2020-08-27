package guru.springframework;

class Dollar extends Money{

    Dollar(int amount,String currency){
        super(amount,currency);
    }

    Money times (int times){
        return Money.dollar(amount * times);
    }
}
