package domain.service.student506;

import domain.service.ITask;

import java.util.regex.Pattern;

public class Task506 implements ITask {
    @Override
    public boolean task1(String s) {

        return s.matches(".*");

        //return false;
    }

    @Override
    public boolean task2(String s) {

        String pattern = "^A[0-9]{2}";
        Pattern p = Pattern.compile(pattern);

        String pattern2 = "^A[0-9]";
        Pattern p2 = Pattern.compile(pattern);

        if(p.matcher(s).find()){
            return true;
        }

        if(p2.matcher(s).find()){
            return true;
        }

        return false;
    }

    @Override
    public boolean task3(String s) {

        String pattern = "^U[A-Z]{3}";
        Pattern p = Pattern.compile(pattern);

        if(p.matcher(s).find()){
            return true;
        }

        return false;
    }
}
