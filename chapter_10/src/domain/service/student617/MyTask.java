package domain.service.student617;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask implements ITask{

    @Override
    public void run() {

        IJob myJob = new MyJob();
        myJob.story();

        ATour tour;

        //HIS

        System.out.println("受付:HISの担当者がいらっしゃいました。");
        System.out.println("H担:お世話になっております。");
        System.out.println("渡邉:お待ちしておりました。");
        System.out.println("H担:早速ですが、今回のツアー内容を見せて頂けますか。");
        tour = myJob.meeting(TravelAgency.HIS);
        myJob.confirm(tour);
        System.out.println("H担:なるほど。沖縄ですか・・石垣島になりませんか。");
        System.out.println("H担:あと目玉企画がほしいです。");
        System.out.println("渡邉:承知致しました。一面のサンゴ礁を売りとしたアクティビティはどうでしょうか。");
        System.out.println("H担:いいですね。");
        tour.setMainSpot("石垣島");
        tour.hearing();
        System.out.println("渡邉:変更後です。");
        myJob.confirm(tour);
        System.out.println();
        System.out.println("H担:これでＯＫです。本日はありがとうございました。");
        System.out.println("渡邉:ありがとうございました。");
        System.out.println();
        System.out.println("～Fin.～");

        lnterlude();

        //JTB

        System.out.println("受付:JTBの担当者がいらっしゃいました。");
        System.out.println("J担:おおきに～儲かってまっか？");
        System.out.println("渡邉:お待ちしておりました。");
        System.out.println("J担:早速見せて～な？");
        tour = myJob.meeting(TravelAgency.JTB);
        myJob.confirm(tour);
        System.out.println("J担:。ふーん、バルセロナか。");
        System.out.println("渡邉:前回、美味しいパエリアが食べたいとおっしゃっていたので。");
        System.out.println("J担:。でも、これだと高こうならへん？そや、日程を短くして格安ツアーを売りにしてーな。");
        System.out.println("渡邉:・・・招致しました。検討してみますので、少々お待ちください。");
        tour.setScheduleTo(StringToDate("2020/08/20"));
        tour.hearing();
        myJob.confirm(tour);
        System.out.println();
        System.out.println("J担:ええやん。これでいくわ。");
        System.out.println("渡邉:ありがとうございます！。");
        System.out.println();
        System.out.println("～Fin.～");

        lnterlude();

        //Expesia

        System.out.println("受付:Expediaの担当者がいらっしゃいました。");
        System.out.println("E担:お世話様です。");
        System.out.println("渡邉:お待ちしておりました。");
        System.out.println("E担:申し訳ない、事前検討案を本国にメールしたところ、企画の全面刷新を言い渡されました。");
        System.out.println("渡邉:えええ。。。");
        System.out.println("E担:追加費用はお支払いしますのでなんとかなりませんか。");
        System.out.println("渡邉:承知致しました。再度練り直しますので、日を改めて打ち合わせしましょう");
        System.out.println("E担:それが、本国より期限は延ばさばいということで、この場で決めていきたいのですが。");
        System.out.println("渡邉:。。。承知致しました。");
        System.out.println("渡邉:ご希望などはございますでしょうか。");
        System.out.println("E担:それが、先方の担当者に一切を任せろと言われてまして・・。");
        System.out.println("渡邉:。。。承知致しました。");
        tour = myJob.meeting(TravelAgency.Expedia);
        tour.setArea("北米");
        tour.setCountry("アメリカ");
        tour.setMainSpot("ニューヨーク");
        tour.setScheduleFrom(StringToDate("2020/12/24"));
        tour.setScheduleTo(StringToDate("2021/01/03"));
        tour.setUserCount(4);
        tour.hearing();
        System.out.println();
        System.out.println("E担:本国に確認しました。「Excellent」だそうです。ＯＫでました。やりましたね！ありがとうございました");
        System.out.println("渡邉:ありがとうございます！。");
        System.out.println();
        System.out.println("～Fin.～");
    }

        private Date StringToDate(String strDate){
            try{
                return new SimpleDateFormat("yyyy/MM/dd").parse(strDate);
            }
            catch(ParseException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

        private void lnterlude() {
            System.out.println("任意の値を入力してキーを押下してください。");
            new java.util.Scanner(System.in).next();
        }
    }
