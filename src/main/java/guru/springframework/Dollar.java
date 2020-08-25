package guru.springframework;

import lombok.*;


@AllArgsConstructor
@Data
class Dollar {
    int amount ;

    Dollar times (int times){
        return new Dollar(times * amount);
    }
}
