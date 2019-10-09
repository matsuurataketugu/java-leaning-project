package domain.service.student645;


public class MyTask implements ITask {

    //IJobインターフェースを持つクラスを呼び出し、story → trainingの順で実行する。
    @Override
    public void run(){
        IAdventure test = new IAdventure() {

            @Override
            public void story() {

            }

            @Override
            public void training() {

            }
        };

    }
}
