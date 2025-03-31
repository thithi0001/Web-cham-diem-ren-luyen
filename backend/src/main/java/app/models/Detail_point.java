package app.models;

public class Detail_point {
    private int Detail_point_id;
    private String Detail_id;
    private int Crit_point_id;
    private int Student_point;
    private int BCS_point;
    private int Advisor_point;

    public int getDetail_point_id() {
        return Detail_point_id;
    }

    public void setDetail_point_id(int detail_point_id) {
        Detail_point_id = detail_point_id;
    }

    public String getDetail_id() {
        return Detail_id;
    }

    public void setDetail_id(String detail_id) {
        Detail_id = detail_id;
    }

    public int getCrit_point_id() {
        return Crit_point_id;
    }

    public void setCrit_point_id(int crit_point_id) {
        Crit_point_id = crit_point_id;
    }

    public int getStudent_point() {
        return Student_point;
    }

    public void setStudent_point(int student_point) {
        Student_point = student_point;
    }

    public int getBCS_point() {
        return BCS_point;
    }

    public void setBCS_point(int BCS_point) {
        this.BCS_point = BCS_point;
    }

    public int getAdvisor_point() {
        return Advisor_point;
    }

    public void setAdvisor_point(int advisor_point) {
        Advisor_point = advisor_point;
    }
}
