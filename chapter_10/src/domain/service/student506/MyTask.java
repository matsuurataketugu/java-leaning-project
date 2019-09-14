package domain.service.student506;

public class MyTask implements ITask{

    @Override
    public void run() {
        LuckOfTime destiny = LuckOfTime.Fateful_Mischief;

        AnEvent evt = new AnEvent();

        switch(destiny){
            case Goddess_of_Victory: evt.GoddessOfVictory(); break;
            case Fateful_Mischief: evt.FatefulMischief(); break;
        }

    }
}
