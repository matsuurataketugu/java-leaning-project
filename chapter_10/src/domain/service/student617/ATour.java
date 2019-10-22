package domain.service.student617;

import java.util.Scanner;

public abstract class ATour {

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public enum id {
     //HIS
     0,
     //JTB
     1,
     //Expedia
     2
    }

    String area = "";
    String country = "";
    String mainSpot = "";
    String scheduleFrom = "";
    String scheduleTo = "";
    int userCount = 0;
    String remark = "";

    ATour(){
        this.id = 0;
        this.area = "hawaii";
        this.country = "アメリカ";
        this.mainSpot = "ブラックフライデー";
        this.scheduleFrom = "2019年11月20日";
        this.scheduleTo = "2019年11月24日";
        this.userCount = 5;
    }

    public class hearing {
        private void hraringFrom() {
            System.out.print("その他事項ありますか？");
            String remark = new Scanner(System.in).next();
        }
    }

    public void toString{

        System.out.println("JTB");
        System.out.println("提案する国はhawaii。");
        System.out.println("アメリカの一部である");
        System.out.println("このツアーの目玉はブラックフライデー");
        System.out.println("ツアー開始日は2019年11月20日");
        System.out.println("ツアー終了日は2019年11月24日");
        System.out.println("人数は5人");
        System.out.println("年に一度のビッグセールなので混雑する可能性あり");
    }
}

