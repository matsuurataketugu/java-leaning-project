# ６章課題
## インスタンスとクラス
domain.service配下に下記設問に沿ってクラスを作成せよ
### 問１
人間を表現するクラスHumanを作成せよ  
クラス名、ファイル名はHuman＋社員番号とする  
ex. Human092
### 問２
Humanクラスに下記のフィールドを定義せよ  
名前、年齢、性別（man/woman）  
各フィールドには適当な値を初期設定すること  
### 問３
Humanクラスに下記のメソッドを定義せよ  
selfIntroduction  
メソッドの仕様は以下の通り  
引数　：なし  
戻り値：なし  
概要　：呼び出すと名前、年齢、性別、将来の夢を語って自己紹介する  
### 問４
controller配下のMainController.makeCharacterメソッドの自分の社員番号のcase文にHumanクラスのインスタンスを生成し自己紹介を行う処理を追加せよ  
### ヒント
クラスをどのように定義するかわからない場合、クラス図(Human.puml)を確認すること  
PlantUMLというToolをIDEに組み込む必要があるので事前に下記サイトを参考に行っておく  
[IntelliJ IDEAでPlantUMLプラグインをインストールしてリアルタイムにUMLをプレビュー表示する](http://koboldtodragon.hatenablog.com/entry/2018/02/16/200000)  
クラス図の見方  
[PlantUML/クラス図](http://plantuml.com/ja/class-diagram)  
