package controller;

import java.util.Arrays;
import java.util.List;

import domain.service.Boy092;
import domain.service.Boy506;
import domain.service.Boy645;
import domain.service.Girl617;

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
                    System.out.println("社員番号 " + employeeId + "さんは課題実施対象者ではありません。");
                } else {
                    System.out.println(employeeId + "さんの課題を確認します。");
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
        System.out.println(employeeId + "さんのクラス");
        System.out.println("-------------------");

        switch (employeeId) {
            case 92:
                Boy092 boy092 = new Boy092();

                System.out.println("---------------------------------------");
                System.out.println("値がnullのとき");
                System.out.println("---------------------------------------");
                boy092.setName(null);
                boy092.setAge(null);
                System.out.println();

                System.out.println("---------------------------------------");
                System.out.println("値が空文字のとき");
                System.out.println("---------------------------------------");
                boy092.setName("");
                boy092.setAge("");
                System.out.println();

                System.out.println("---------------------------------------");
                System.out.println("年齢が整数でないとき");
                System.out.println("test pattern 1: 3.14");
                System.out.println("test pattern 2: xyz");
                System.out.println("---------------------------------------");
                boy092.setAge("3.14");
                boy092.setAge("xyz");
                System.out.println();

                System.out.println("---------------------------------------");
                System.out.println("年齢が範囲内[0-100]でないとき");
                System.out.println("test pattern 1: -1");
                System.out.println("test pattern 2: 101");
                System.out.println("---------------------------------------");
                boy092.setAge("-1");
                boy092.setAge("101");
                System.out.println();

                System.out.println("---------------------------------------");
                System.out.println("名前、年齢ともに正しいとき");
                System.out.println("---------------------------------------");
                boy092.setName("名無しの権兵衛");
                boy092.setAge("24");
                System.out.println("name: " + boy092.getName());
                System.out.println("age : " + boy092.getAge());
                System.out.println();

                break;
            case 506:

                Boy506 boy = new Boy506();

                boy.setName("");
                boy.setAge("1");

                System.out.println("私の名前は" + boy.getName() + "です。");
                System.out.println("年齢は" + boy.getAge() + "歳です。");

                break;
            case 617:

                Girl617 girl = new Girl617();

                girl.setName("わたなべ");
                girl.setAge("26");
                System.out.println("私の名前は" + girl.getName() + "です。");
                System.out.println("年齢は" + girl.getAge() + "歳です。");

                break;
            case 645:
                Boy645 nameage = new Boy645();

                nameage.setName("まつ");
                nameage.setAge(26);

                System.out.println("私の名前は" + nameage.getName() + "です。");
                System.out.println("年齢は" + nameage.getAge() + "です。");

                break;
            case 660:
                break;
            default:
                throw new NullPointerException(employeeId + "さんのクラスは存在しません。");
        }
    }
}
