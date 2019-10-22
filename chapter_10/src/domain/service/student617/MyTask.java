package domain.service.student617;

public class MyTask implements ITask{

    @Override
    public void run() {

        IJob myJob = new MyJob();
        myJob.story();

        //HIS
        myJob.meeting(TravelAgency.HIS.ordinal());
        myJob.confirm(TravelAgency.HIS.ordinal());

        //JTB
        myJob.meeting(TravelAgency.JTB.ordinal());
        myJob.confirm(TravelAgency.JTB.ordinal());

        //Expedia
        myJob.meeting(TravelAgency.Expedia.ordinal());
        myJob.confirm(TravelAgency.Expedia.ordinal());

    }
}

