package domain.service.student645;

public class MyTask implements ITask {
    @Override
    public void run() {
        IAdventure adventure = new MyAdventure();
        adventure.story();
        adventure.training();
        return;
    }
}
