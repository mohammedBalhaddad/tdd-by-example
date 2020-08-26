package guru.springframework;

import lombok.*;


@AllArgsConstructor
@Data
class Dollar {
    private int amount ;

    Dollar times (int times){
        return new Dollar(times * amount);
    }
}
