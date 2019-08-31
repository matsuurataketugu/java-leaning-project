package controller;

import domain.service.student092.HighSchoolBoy092;
import domain.service.student506.HighSchoolBoy506;
import domain.service.student645.HighSchoolBoy645;
import domain.service.student617.HighSchoolGirl617;

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
        System.out.println(employeeId + "さんのクラス");
        System.out.println("-------------------");

        switch (employeeId) {
            case 92:
                HighSchoolBoy092 highSchoolBoy092 = new HighSchoolBoy092();
                break;
            case 506:

                HighSchoolBoy506 HighSchoolBoy506 = new HighSchoolBoy506();

                HighSchoolBoy506.rememberMyDream();
                HighSchoolBoy506.specialTraining();
                HighSchoolBoy506.boast();

                break;
            case 617:
                HighSchoolGirl617 HighSchoolGirl617 = new HighSchoolGirl617();

                HighSchoolGirl617.rememberMyDream();
                HighSchoolGirl617.research();
                HighSchoolGirl617.recommended();
                break;

            case 645:
                HighSchoolBoy645 HighSchoolBoy645 = new HighSchoolBoy645();
                HighSchoolBoy645.rememberMyDream();
                HighSchoolBoy645.run();

                break;
            case 660:
                break;
            default:
                throw new NullPointerException(employeeId + "さんのクラスは存在しません。");
        }
    }
}
