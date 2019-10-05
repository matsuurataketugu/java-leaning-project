package domain.service.student506;

import domain.service.ITask;

import java.io.File;
import java.io.FileReader;

public class Task506 implements ITask {
    @Override
    public void task1() {

        String s = null;
        System.out.println(s.length());

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

        String s = "3";
        int number = 0;

        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void task4() {

        File inputFile = new File( "あいうえお" );

    }
}
