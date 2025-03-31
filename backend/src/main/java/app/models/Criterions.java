package app.models;

public class Criterions {
    private String Crit_id;
    private String Description;
    private int Max_point;

    public String getCrit_id() {
        return Crit_id;
    }

    public void setCrit_id(String crit_id) {
        Crit_id = crit_id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getMax_point() {
        return Max_point;
    }

    public void setMax_point(int max_point) {
        Max_point = max_point;
    }
}
