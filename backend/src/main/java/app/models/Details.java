package app.models;

public class Details {
    private String Detail_id;
    private String Crit_id;
    private int Order;
    private String Description;
    private int Max_point;
    private boolean Is_proof_needed;

    public String getDetail_id() {
        return Detail_id;
    }

    public void setDetail_id(String detail_id) {
        Detail_id = detail_id;
    }

    public String getCrit_id() {
        return Crit_id;
    }

    public void setCrit_id(String crit_id) {
        Crit_id = crit_id;
    }

    public int getOrder() {
        return Order;
    }

    public void setOrder(int order) {
        Order = order;
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

    public boolean isIs_proof_needed() {
        return Is_proof_needed;
    }

    public void setIs_proof_needed(boolean is_proof_needed) {
        Is_proof_needed = is_proof_needed;
    }
}
