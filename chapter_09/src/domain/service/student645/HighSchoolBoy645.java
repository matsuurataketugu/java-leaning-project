package domain.service.student645;

import java.util.Scanner;

public class HighSchoolBoy645 extends  Boy645{
    private String equipment = "ひのきの棒";

    public String getEquipment(){return equipment;}

    public void setEquipment(String equipment){
        this.equipment = equipment;
    }

    public  void rememberMyDream(){
       //親クラスのprologue
        super.prologue();
    }

    public  void run(){
        System.out.println("選択肢を選択してください");
        System.out.println("逃げて助けを求める：１");
        System.out.println("武器で戦う　　　　：２");
        int sentakusi = new Scanner(System.in).nextInt();

        if(sentakusi == 1){
            super.helpMe();
        }else if(sentakusi == 2){
            //戦うを選択した時のメソッド
            attack();
            boast();
        }else{
            System.out.println("選択肢エラー");
        }


    }

    private void boast(){
        System.out.println("僕「すごい！このひのきの棒は扱いやすい！」");

    }

    private void attack(){
        System.out.println("僕（逃げてる暇はない！落ちている棒でこっそり反撃だ！）");
        System.out.println("猫と犬が戦いに集中しているスキに、後ろから一匹づつ後頭部を殴っていったのであった。");
    }


}

