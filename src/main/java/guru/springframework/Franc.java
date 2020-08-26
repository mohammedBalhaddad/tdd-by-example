package guru.springframework;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Franc {
    int amount;

    Franc times(int times){
        return new Franc(amount * times);
    }
}
