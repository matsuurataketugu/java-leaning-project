package domain.service.student617;

import domain.service.ITask;

public class Task617 implements ITask {
    @Override
    public void task1() {

        StrongBox<Integer> box = new StrongBox<Integer>();
        box.put(2);
        System.out.println(box.get());

    }

    @Override
    public void task2() {

    }
}
