package controller;
import domain.service.ITask;
import domain.service.student092.Task092;
import domain.service.student506.Task506;
import domain.service.student617.Task617;
import domain.service.student645.Task645;

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
                    System.out.println("社員番号" + employeeId + "さんは課題実施対象者ではありません。");
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
        switch (employeeId) {
            case 92:
                runTask(new Task092());
                break;
            case 506:
                runTask(new Task506());
                break;
            case 617:
                runTask(new Task617());
                break;
            case 645:
                runTask(new Task645());
                break;
            default:
                throw new NullPointerException(employeeId + "さんのクラスは存在しません。");
        }
    }

    private static void runTask(ITask task) {
        information("１");
        String s1 = "すべての文字列";
        System.out.println("判定文字列：" + s1);
        System.out.println("結果　　　：" + task.task1(s1));

        information("２");
        String s2 = "A10";
        System.out.println("判定文字列：" + s2);
        System.out.println("結果　　　：" + task.task2(s2));

        information("３");
        String s3 = "USA!";
        System.out.println("判定文字列：" + s3);
        System.out.println("結果　　　：" + task.task3(s3));
    }

    private static void information(String taskNumber) {
        System.out.println("-------------------");
        System.out.println("課題" + taskNumber + "の確認");
        System.out.println("-------------------");
        System.out.println("次に進む（任意の値を入力してリターンキーを押してください。）");
        new java.util.Scanner(System.in).next();
    }
}
