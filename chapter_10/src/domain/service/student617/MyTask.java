package domain.service.student617;

public class MyTask implements ITask{

    @Override
    public void run() {

        IJob myJob = new MyJob();
        myJob.story();
        myJob.meeting();
        myJob.confirm();

    }
}

