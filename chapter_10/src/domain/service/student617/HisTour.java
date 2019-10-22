package domain.service.student617;

import java.util.Date;

public class HisTour  extends ATour{
    protected HisTour(int id,
                      String area,
                      String country,
                      String mainSpot,
                      Date scheduleFrom,
                      Date scheduleTo,
                      int userCount,
                      String remark){
               super(id, area, country, mainSpot, scheduleFrom, scheduleTo, userCount, remark);
    }
}
