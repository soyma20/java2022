package lesson3.task2;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Drum implements Tool{
    private String size;
    @Override
    public void play() {
        System.out.println("Drum is playing");
    }
}
