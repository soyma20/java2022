package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Guitar implements Tool{
    private int numberOfChords;
    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}
