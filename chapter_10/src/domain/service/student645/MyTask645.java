package domain.service.student645;


public class MyTask645 implements ITask645 {

    //IJobインターフェースを持つクラスを呼び出し、story → trainingの順で実行する。
    @Override
    public void run(){
        IAdventure bouken = new MyAdventure();
        bouken.story();
        bouken.training();
        return;
    }
}
