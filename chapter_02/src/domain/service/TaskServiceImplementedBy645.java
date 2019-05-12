package domain.service;

public class TaskServiceImplementedBy645 implements ITask {
    @Override
    public void learnOperatorPriority() {
        int x = 2;
        int y = 3;
        String answer = "x + y = " + x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(answer);
    }

    @Override
    public void learnTypeConversion() {

    }

    @Override
    public void fortuneGame() {

    }
}
