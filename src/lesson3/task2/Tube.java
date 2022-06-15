package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Tube implements Tool{

    private int diameter;
    @Override
    public void play() {
        System.out.println("Tube is playing");
    }
}
