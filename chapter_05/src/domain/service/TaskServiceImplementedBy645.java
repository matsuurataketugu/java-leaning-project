package domain.service;

import java.util.Scanner;

public class TaskServiceImplementedBy645 implements ITask {

    @Override
    public void learnMethod1() {

        selfIntroduction();
    }

    private void selfIntroduction() {
        //引数なし　→　selfIntroduction()
        //返り値無し　→　void

        System.out.print("お名前は？＞");
        String name = new Scanner(System.in).next();

        System.out.print("年齢は？＞");
        Scanner scanold = new Scanner(System.in);
        //int old = 0;
        if(scanold.hasNextInt()){
        }else{
            System.out.println("エラー");
            return;
        }
        int old = scanold.nextInt();

        System.out.print("伸長は何センチ？＞");
        Scanner scansintyou = new Scanner(System.in);
        if(scansintyou.hasNextDouble()){
        }else{
            System.out.println("エラー");
            return;
        }
        double sintyou = scansintyou.nextDouble();

        System.out.print("性別は？男or女＞");
        String sex = new Scanner(System.in).next();
        if (sex.equals("男")||sex.equals("女")) {
        }else{
            System.out.println("エラー");
            return;
        }
            System.out.println( old + "歳の" + name + "さんは、伸長が" + sintyou + "の" + sex + "なんですね！");


    }

    @Override
    public void learnMethod2() {
        System.out.print("九九を行います！数字を入力してください＞");
        int kuku = new Scanner(System.in).nextInt();
        if ( kuku == 0 || kuku > 10) {
            System.out.println("九九は１から９しかできません！！");
        }else {
            multiplication(kuku);
        }
        }

    private void multiplication(int kakezan){
        int  kukuList[] = new int[9];
        for(int i = 0; i<9; i++){
            kukuList[i] = kakezan * (i+1);
        }
        System.out.println(kakezan + "の段は↓");
        for(int j : kukuList ){
            System.out.println(j);
        }
    }


    @Override
    public void learnMethod3() {

        System.out.print("西暦を元号に変換します。西暦を入力してください＞");
        int seireki = new Scanner(System.in).nextInt();
        yearToEra(seireki);
        System.out.print(seireki + "年の元号は" + yearToEra(seireki));
    }

    private String yearToEra(int nensuu) {
    if(nensuu <= 1911){
        return "明治";
    }else if(nensuu <= 1925){
        return "大正";
    }else if(nensuu <= 1988){
        return "昭和";
    }else if(nensuu <= 2018) {
        return "平成";
    }else{
        return "令和";
    }
    }

        @Override
        public void learnMethod4 () {

            System.out.print("西暦と価格を入力してください！その年の消費税を答えます！");
            System.out.print("西暦は？＞");
            Scanner scanseireki = new Scanner(System.in);
            if(scanseireki.hasNextInt()){
            }else{
                System.out.println("エラー");
                return;
            }
            int seireki = scanseireki.nextInt();

            System.out.print("価格は？＞");
            Scanner scanprice = new Scanner(System.in);
            //int old = 0;
            if(scanprice.hasNextInt()){
            }else{
                System.out.println("エラー");
                return;
            }
            int price = scanprice.nextInt();

            taxCalculation(seireki, price);
        }

    private void taxCalculation(int nen,int pri) {

        //税のパターン
        int taxpattterm;

        //消費税込み価格
        int taxprice;

        //消費税
        double tax = 0;

        //入力値チェック
        if (nen >= 2020 && nen <= 1900){
            System.out.println("エラー");
            return;
        }
        if (pri == 0 ){
            System.out.println("エラー");
            return;
        }

        //消費税パターンの判定
        if(nen < 1989){
            taxpattterm = 1;
        }else if(nen < 1997){
            taxpattterm = 2;
        }else if(nen < 2020){
            taxpattterm = 3;
        }else {
            taxpattterm = 4;
        }
        switch (taxpattterm){
            case 1:
                tax = 0;
                break;
            case 2:
                tax = 0.03;
                break;
            case 3:
                tax = 0.05;
                break;
            case 4:
                tax = 0.1;
                break;
        }
        taxprice = pri + (int)(tax * pri);
        System.out.print(nen + "年の場合、消費税は"+ ( tax * 100) +"％！税込み価格は"+ taxprice);
     }

        @Override
        public void learnMethod5 () {
            System.out.print("君の名は何回見た？＞");
            Scanner scankaisu = new Scanner(System.in);
            if(scankaisu.hasNextInt()){
            }else{
                System.out.println("エラー");
                return;
            }
            int kaisu = scankaisu.nextInt();
            yourName(kaisu);

            System.out.print("君の名は？＞");
           // String name = new Scanner(System.in).next();
            Scanner scanname = new Scanner(System.in);
            if(scanname.hasNext()){
            }else{
                System.out.println
                        ("エラー");
                return;
            }
            String name = scanname.next();
            yourName(name);

        }

        private void yourName(int kaisuu){
        System.out.println("映画「君の名は」"+ kaisuu + "見ました" );
            }

        private void yourName(String name){
            System.out.println("私の名は"+ name + "です。" );
            }

        }




