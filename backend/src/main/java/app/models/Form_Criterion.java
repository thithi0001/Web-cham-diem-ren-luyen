package app.models;

public class Form_Criterion {
    private int Form_crit_id;
    private String Sample_id;
    private String Crit_id;
    private int Order;

    public int getForm_crit_id() {
        return Form_crit_id;
    }

    public void setForm_crit_id(int form_crit_id) {
        Form_crit_id = form_crit_id;
    }

    public String getSample_id() {
        return Sample_id;
    }

    public void setSample_id(String sample_id) {
        Sample_id = sample_id;
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
}
