package domain.service.student645;

import domain.service.ITask;

public class Task645 implements ITask {
    @Override
    public void task1() {
        StrongBox<Integer> box = new StrongBox<>();
        box.put(100);
        System.out.print(box.get());

    }

    @Override
    public void task2() {
        // 問2
        // 以下の仕様に従ったクラスたちを定義せよ
        // ・面積を計算するクラスをAreaCalculationクラスとして定義せよ
        // ・面積計算クラスに円の面積を求めるメソッドとしてCalcCircleAreaを用意せよ
        // ・円の面積を求めるメソッドは引数に半径、円周率を持つ
        // ・円周率は３．１４と３のどちらも扱えるようにしておき、最適な型を割り当てることが出来るものとする
        // ・面積を計算するクラスを利用するものとしてゆとりくんクラス（YutoriKun）と脱ゆとりさんクラス（ExitYutoriSan）を定義せよ
        // ・ゆとりくんクラス（YutoriKun）と脱ゆとりさんクラス（ExitYutoriSan）に勉強メソッドとしてStudyを用意せよ
        // ・勉強メソッドを実行するとAreaCalculationクラスから円の面積を求めるものとする。
        // ・ゆとりくんクラス（YutoriKun）が勉強メソッドを実行すると半径は任意の値、円周率は３で計算される。
        // ・脱ゆとりさんクラス（ExitYutoriSan）が勉強メソッドを実行すると半径は任意の値、円周率は３。１４で計算される。


    }
}
