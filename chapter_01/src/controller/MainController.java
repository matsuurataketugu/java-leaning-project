package controller;

import domain.service.*;

import java.util.Arrays;
import java.util.List;

public class MainController {
    private static final int EXIT_PROCESS = 999;

    public static void run() {
        try {
            while (true) {
                int employeeId = getEmployeeId();
                if (employeeId == EXIT_PROCESS) {
                    break;
                } else if (!isValidEmployeeId(employeeId)) {
                    System.out.println("社員番号 " + employeeId + " さんは課題実施対象者ではありません。");
                } else {
                    while (true) {
                        System.out.println(employeeId + " さんの課題を確認します。");
                        int taskNumber = getTaskNumber();
                        if (taskNumber == EXIT_PROCESS) {
                            break;
                        } else if(!isValidTaskNumber(taskNumber)) {
                            System.out.println("問 " + taskNumber + " は存在しません。");
                        } else {
                            doOperationCheck(employeeId, taskNumber);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } finally {
            System.out.println("プログラムを終了します。");
        }
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

    private static int getTaskNumber() {
        System.out.print("何番の問を確認しますか？(999で終了): ");
        return new java.util.Scanner(System.in).nextInt();
    }

    private static boolean isValidTaskNumber(int taskNumber) {
        List<Integer> taskList = Arrays.asList( 1, 2, 3, 4 );
        return  taskList.stream().anyMatch(x -> x.equals(taskNumber));
    }

    private static void doOperationCheck(int employeeId, int taskNumber) {
        System.out.println("問 " + taskNumber + " を確認します。");
        System.out.println("処理を開始しました。");
        System.out.println("-------------------");
        ITask task = getTaskService(employeeId);
        switch (taskNumber) {
            case 1:
                task.learnJavaMechanism();
                break;
            case 2:
                task.learnVariable();
                break;
            case 3:
                task.learnConstant();
                break;
            case 4:
                task.learnDataType();
                break;
            default:
                throw new IllegalArgumentException("問 " + taskNumber + " は存在しません。");
        }
        System.out.println("-------------------");
        System.out.println("処理を終了しました。");
    }

    private static ITask getTaskService(int employeeId) {
        switch (employeeId) {
            case 92:
                return  new TaskServiceImplementedBy092();
            case 506:
                return  new TaskServiceImplementedBy506();
            case 617:
                return  new TaskServiceImplementedBy617();
            case 645:
                return  new TaskServiceImplementedBy645();
            case 660:
                return new TaskServiceImplementedBy660();
            default:
                throw new NullPointerException(employeeId + " さんの課題実装は存在しません。");
        }
    }
}
