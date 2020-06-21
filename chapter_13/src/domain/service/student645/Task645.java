package domain.service.student645;

import domain.service.ITask;

import java.util.regex.Pattern;

public class Task645 implements ITask {
    @Override
    public boolean task1(String s) {

        return s.matches( ".*");

    }

    @Override
    public boolean task2(String s) {

        String moziA = "^A[0-9]{1,2}$'";
        Pattern pat = Pattern.compile(moziA);
        if (pat.matcher(s).find()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean task3(String s) {

            String moziB = "^U[A-Z]{3}$'";
            Pattern patB = Pattern.compile(moziB);
            if (patB.matcher(s).find()) {
                return true;
            }
            return false;
        }

}
