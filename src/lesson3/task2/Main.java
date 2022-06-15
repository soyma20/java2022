package lesson3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tool> tools = new ArrayList<>();
        tools.add(new Drum("big"));
        tools.add(new Drum("small"));
        tools.add(new Guitar(6));
        tools.add(new Guitar(4));
        tools.add(new Tube(5));
        tools.add(new Tube(6));

        System.out.println(tools);

        for (Tool tool : tools) {
            tool.play();
        }


    }
}
