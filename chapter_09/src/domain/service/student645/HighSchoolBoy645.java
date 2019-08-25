package domain.service.student645;

public class HighSchoolBoy645 extends  Boy645{
    private String equipment = "ひのきの棒";

    public String getEquipment(){return equipment;}

    public void setEquipment(String equipment){
        //equipmentがnullか判定
        if(equipment == null){
            System.out.println(equipment + "に文字列の設定が行われていません");
            return ;
        }
        this.equipment = equipment;
    }

    public  void rememberMyDream(){
       //親クラスのprologue
        super.prologue();
    }

    public  void run(){

    }

    public void boast(){

    }


}

