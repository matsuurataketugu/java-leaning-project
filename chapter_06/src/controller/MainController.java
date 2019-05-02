package controller;

import domain.service.PaladinBy092;

import java.util.Arrays;
import java.util.List;

public class MainController {
    private static final int EXIT_PROCESS = 999;

    public static void run() {
        int exitCode = 0;
        try {
            while (true) {
                int employeeId = getEmployeeId();
                if (employeeId == EXIT_PROCESS) {
                    break;
                } else if (!isValidEmployeeId(employeeId)) {
                    System.out.println("社員番号 " + employeeId + " さんは課題実施対象者ではありません。");
                } else {
                    System.out.println(employeeId + " さんの課題を確認します。");
                    makeCharacter(employeeId);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            exitCode = 1;
        }
        System.out.println("プログラムを終了します。");
        System.exit(exitCode);
    }

    private static int getEmployeeId() {
        System.out.println("誰の課題を確認しますか？");
        System.out.print("社員番号(999で終了): ");
        return new java.util.Scanner(System.in).nextInt();
    }

    private static boolean isValidEmployeeId(int employeeId) {
        List<Integer> employeesList = Arrays.asList(92, 506, 617, 645, 660);
        return employeesList.stream().anyMatch(x -> x.equals(employeeId));
    }

    private static void makeCharacter(int employeeId) {
        System.out.println(employeeId + "さんの聖騎士");
        System.out.println("-------------------");

        switch (employeeId) {
            case 92:
                PaladinBy092 paladinBy092;
                paladinBy092 = new PaladinBy092();
                System.out.println("NAME: " + paladinBy092.name);
                System.out.println("LIFE: " + paladinBy092.life);
                System.out.println("MANA: " + paladinBy092.mana);
                System.out.println("攻撃！");
                paladinBy092.zeal();
                System.out.println("オフェンシブオーラに切り替え！");
                paladinBy092.fanaticism();
                System.out.println("ディフェンシブオーラに切り替え！");
                paladinBy092.meditation();
                break;
            case 506:
//                PaladinBy506 paladinBy506;
//                paladinBy506 = new PaladinBy506();
//                System.out.println("NAME: " + paladinBy506.name);
//                System.out.println("LIFE: " + paladinBy506.life);
//                System.out.println("MANA: " + paladinBy506.mana);
//                System.out.println("攻撃！");
//                paladinBy506.zeal();
//                System.out.println("オフェンシブオーラに切り替え！");
//                paladinBy506.fanaticism();
//                System.out.println("ディフェンシブオーラに切り替え！");
//                paladinBy506.meditation();
                break;
            case 617:
//                PaladinBy617 paladinBy617;
//                paladinBy617 = new PaladinBy617();
//                System.out.println("NAME: " + paladinBy617.name);
//                System.out.println("LIFE: " + paladinBy617.life);
//                System.out.println("MANA: " + paladinBy617.mana);
//                System.out.println("攻撃！");
//                paladinBy617.zeal();
//                System.out.println("オフェンシブオーラに切り替え！");
//                paladinBy617.fanaticism();
//                System.out.println("ディフェンシブオーラに切り替え！");
//                paladinBy617.meditation();
                break;
            case 645:
//                PaladinBy645 paladinBy645;
//                paladinBy645 = new PaladinBy645();
//                System.out.println("NAME: " + paladinBy645.name);
//                System.out.println("LIFE: " + paladinBy645.life);
//                System.out.println("MANA: " + paladinBy645.mana);
//                System.out.println("攻撃！");
//                paladinBy645.zeal();
//                System.out.println("オフェンシブオーラに切り替え！");
//                paladinBy645.fanaticism();
//                System.out.println("ディフェンシブオーラに切り替え！");
//                paladinBy645.meditation();
                break;
            case 660:
//                PaladinBy660 paladinBy660;
//                paladinBy660 = new PaladinBy660();
//                System.out.println("NAME: " + paladinBy660.name);
//                System.out.println("LIFE: " + paladinBy660.life);
//                System.out.println("MANA: " + paladinBy660.mana);
//                System.out.println("攻撃！");
//                paladinBy660.zeal();
//                System.out.println("オフェンシブオーラに切り替え！");
//                paladinBy660.fanaticism();
//                System.out.println("ディフェンシブオーラに切り替え！");
//                paladinBy660.meditation();
                break;
            default:
                throw new NullPointerException(employeeId + " さんのキャラクターは存在しません。");
        }
    }
}
