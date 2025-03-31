package models;

public class Criterion_point {
    private int Crit_point_id;
    private String Crit_id;
    private int Evaluate_id;
    private int Student_point;
    private int BCS_point;
    private int Advisor_point;

    public int getCrit_point_id() {
        return Crit_point_id;
    }

    public void setCrit_point_id(int crit_point_id) {
        Crit_point_id = crit_point_id;
    }

    public String getCrit_id() {
        return Crit_id;
    }

    public void setCrit_id(String crit_id) {
        Crit_id = crit_id;
    }

    public int getEvaluate_id() {
        return Evaluate_id;
    }

    public void setEvaluate_id(int evaluate_id) {
        Evaluate_id = evaluate_id;
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
