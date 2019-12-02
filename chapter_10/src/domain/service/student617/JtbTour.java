package domain.service.student617;

import java.util.Date;

public class JtbTour extends ATour{
              public JtbTour(int id,
                          String area,
                          String country,
                          String mainSpot,
                          Date scheduleFrom,
                          Date scheduleTo,
                          int userCount){
                          super(id, area, country, mainSpot, scheduleFrom, scheduleTo, userCount);
    }
}
