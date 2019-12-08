package domain.service.student617;

import domain.service.ITask;

import java.io.FileReader;
import java.io.IOException;

public class Task617 implements ITask {
    @Override
    public void task1() {

        String s = null;

    }

    @Override
    public void task2() {

        String s = null;

        try {
            System.out.println(s.length());
        } catch(Exception e) {
            System.out.println("NullPointerException例外をcatchしました。");
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

            throw new IOException();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
