package domain.service.student506;

public class MyTask implements ITask{

    @Override
    public void run() {

        ILife myLife = new MyLife();
        myLife.story();
        boolean result = myLife.scene();
        myLife.epilogue();

    }
}
