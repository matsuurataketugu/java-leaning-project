package domain.service.student506;

import domain.service.ITask;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Task506 implements ITask {
    @Override
    public void task1() {

        String s = null;
        //System.out.println(s.length());

    }

    @Override
    public void task2() {

        String s = null;

        try {
            System.out.println(s.length());
        } catch(Exception e) {
            System.out.println("－－スタックトレース（ここから）－－");
            e.printStackTrace();
            System.out.println("－－スタックトレース（ここまで）－－");
        }
    }

    @Override
    public void task3() {

        String s = "三";

        try {
            int number = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void task4() {
        try {

            FileReader in = new FileReader("data.txt");

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }
}
