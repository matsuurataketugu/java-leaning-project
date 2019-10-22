package domain.service.student617;

public abstract class AJob implements IJob{

    public void story() {

        System.out.println("私は小さい頃からハワイが大好きだった。");
        System.out.println("これまでハワイに行った回数もかなりのものとなる。");
        System.out.println("今ではハワイだけでなく、色々な国々をまわっている。");
        System.out.println("そんな私の今の仕事はツアーコンダクターだ。");
        System.out.println("今日も３社とツアーに関する打ち合わせを控えている。");
        System.out.println("そろそろ打ち合わせの準備をしないと！");

        return;

    }
    public void meeting(int id) {

        System.out.println("13:30になりました。");
        System.out.println("HIS様、JTB様、Expedia様お揃いですね。");
        System.out.println("それでは、3社合同打ち合わせを始めます。");

        return;

    }
    public void confirm(int id) {

        System.out.println("HIS社は思い切りハワイの自然を楽しむツアー内容ですね。");
        System.out.println("早朝のハイキングからダイビング、バナナボート、ナイトサファリまで自然満喫ですね！");
        System.out.println("JTB社は思い切り買い物を楽しむツアー内容ですね。");
        System.out.println("免税店、アウトレットと日本では高いものを海外で安くゲットしようというものですね！");
        System.out.println("Expedia社はインスタ映えスポット巡りの内容ですね。");
        System.out.println("ウォールアート、ハワイの美味しい可愛い食べ物屋さんを巡るというものですね！");

        return;

    }

}


