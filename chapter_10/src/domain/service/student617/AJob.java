package domain.service.student617;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public ATour meeting(TravelAgency id) {

        try {
            String scheduleFromStr;
            String scheduleToStr;
            SimpleDateFormat sdf = new
                    SimpleDateFormat("yyyy/MM/dd");

            switch (id) {
                case HIS:
                    scheduleFromStr = "2020/01/01";
                    scheduleToStr = "2020/01/05";
                    return new HisTour(
                            1,
                            "アジア",
                            "日本",
                            "沖縄",
                            sdf.parse(scheduleFromStr),
                            sdf.parse(scheduleToStr),
                            4
                    );

                case JTB:
                    scheduleFromStr = "2020/08/10";
                    scheduleToStr = "2020/08/30";
                    return new JtbTour(
                            2,
                            "ヨーロッパ",
                            "スペイン",
                            "バルセロナ",
                            sdf.parse(scheduleFromStr),
                            sdf.parse(scheduleToStr),
                            10
                    );

                case Expedia:
                    scheduleFromStr = "2020/12/20";
                    scheduleToStr = "2020/12/25";
                    return new ExpediaTour(
                            3,
                            "北米",
                            "アメリカ",
                            "ロサンゼルス",
                            sdf.parse(scheduleFromStr),
                            sdf.parse(scheduleToStr),
                            2
                    );

            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
       public void confirm(ATour tour){
         System.out.println(tour.toString());


           }
       }
