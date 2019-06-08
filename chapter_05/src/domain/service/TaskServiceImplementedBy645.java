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
        //エラーフラグが真でエラー

        boolean errorflg = false;
        System.out.print("お名前は？＞");
        String name = new Scanner(System.in).next();

        System.out.print("年齢は？＞");
        int old = new Scanner(System.in).nextInt();
        if (old == 0) {
            errorflg = true;
        }

        System.out.print("伸長は何センチ？＞");
        double sintyou = new Scanner(System.in).nextInt();
        if (sintyou == 0) {
            errorflg = true;
        }

        System.out.print("性別は？男or女＞");
        String sex = new Scanner(System.in).next();
        if (sex.equals("男")||sex.equals("女")) {
        }else{
            errorflg = true;
        }

        if (errorflg) {
            System.out.println("エラー!どこか間違った入力あり!");
        } else {
            System.out.println(old + "歳の" + name + "さんは、伸長が" + sintyou + "の" + sex + "なんですね！");
        }

    }

    @Override
    public void learnMethod2() {
        System.out.print("九九を行います！数字を入力してください＞");
        int kuku = new Scanner(System.in).nextInt();
        if (kuku > 10) {
            System.out.println("九九は１から９しかできません！！");
        }else {
            multiplication(kuku);
        }
        }

    private void multiplication(int kakezan){
        int  kukuList[] = new int[10];
        for(int i = 0; i<=9; i++){
            kukuList[i] = kakezan * i;
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
            int seireki = new Scanner(System.in).nextInt();

            System.out.print("価格は？＞");
            int price = new Scanner(System.in).nextInt();

            taxCalculation(seireki, price);
        }

    private void taxCalculation(int nen,int pri) {
        boolean errorflg1 = false;
        boolean errorflg2 = false;
        int taxprice;
        double tax = 0;

        //入力値チェック
        if (nen <= 2020 && nen >= 1900){
            errorflg1 = true;
        }
        if (pri != 0 ){
            errorflg2 = true;
        }

        //西暦の判定
        if(errorflg1) {
            if(nen <= 2020) {
                if(nen <= 1997) {
                    if(nen <= 1989) {
                        if(nen <=1988) {
                        }
                    tax = 0.03;
                    }
                tax = 0.05;
                }
            tax = 0.1;
            }
        }else {
            System.out.println("西暦が不正！！");
        }

        taxprice = pri + (int)(tax * pri);
        if (errorflg2) {
            System.out.print(nen + "年の場合、消費税は"+ ( tax * 100) +"％！税込み価格は"+ taxprice);
        }else{
            System.out.println("価格が不正！！");
        }
     }

        @Override
        public void learnMethod5 () {
            System.out.print("君の名は何回見た？＞");
            int kaisu = new Scanner(System.in).nextInt();
            yourName(kaisu);

            System.out.print("君の名は？＞");
            String name = new Scanner(System.in).next();
            yourName(name);

        }

        private void yourName(int kaisuu){
        System.out.println("映画「君の名は」"+ kaisuu + "見ました" );
            }

        private void yourName(String name){
            System.out.println("私の名は"+ name + "です。" );
            }

        }




