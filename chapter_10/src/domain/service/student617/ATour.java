package domain.service.student617;

import java.util.Date;

public abstract class ATour {
    private int id;
    private String area;
    private String country;
    private String mainSpot;
    private Date scheduleFrom;
    private Date scheduleTo;
    private int userCount;
    private String remark;

    public ATour(int id,
                 String area,
                 String country,
                 String mainSpot,
                 Date scheduleFrom,
                 Date scheduleTo,
                 int userCount) {
        this.id = id;
        this.area = area;
        this.country = country;
        this.scheduleFrom = scheduleFrom;
        this.scheduleTo = scheduleTo;
        this.userCount = userCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public String setCountry(String country) {
        this.country = country;
    }

    public String getMainSpot() {
        return mainSpot;
    }

    public void setMainSpot(String mainSpot) {
        this.mainSpot = mainSpot;
    }

    public Date getScheduleFrom() {
        return scheduleFrom;
    }

    public void setScheduleFrom(Date scheduleFrom) {
        this.scheduleFrom = scheduleFrom;
    }

    public Date getScheduleTo() {
        return scheduleTo;
    }

    public void setScheduleTo(Date scheduleTo) {
        this.scheduleTo = scheduleTo;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "こちらが企画したツアー内容となります。\n" +
                "id: " + id +
                "\n地域: " + area +
                "\n国: " + country +
                "\n観光地: " + mainSpot +
                "\n出発日: " + scheduleFrom +
                "\n帰国日: " + scheduleTo +
                "\n人数: " + userCount +
                "\n特記事項: " + remark
                ;
    }

    public void hearing() {
        System.out.println("特記事項を入力してください。");
        this.remark = new
                java.util.Scanner(System.in).next();
    }
}


