# ９章課題
## 継承
下記の設問を読んでプログラムを完成させよ  
（pumlファイルにあるクラスを作成せよ）  
### 問１
課題７、課題８をもとにスーパークラスとなるBoyXXまたはGirlXXを完成させよ  
### 問２
問１で作成したスーパークラスを継承して高校生になったクラス、HighSchoolBoyXXまたはHighSchoolGirlXXを完成させよ  
<仕様>  
girlfriends: 交際人数プロパティ  
rememberMyDream(): 少年/少女 時代を思い出す（スーパークラスのprologueメソッドを実行する）  
getAlongWellWithGirls(): 少年時代のナンパメソッド（スーパークラス）または高校時代のナンパメソッド（追加）を選択して実行する  
boast(): 交際人数を自慢する  
### 問３
作成した高校生クラスをMainController.makeCharacterのCaseに実装してインスタンス化する  
高校生クラスのメソッドを実行して結果を表示せよ  
実行順：rememberMyDream → getAlongWellWithGirls → boast  
