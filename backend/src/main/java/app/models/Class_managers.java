package app.models;

public class Class_managers {
    private String Class_id;
    private String Sem_id;
    private String Advisor_id;
    private String LT_id;
    private String LP_id;

    public String getClass_id() {
        return Class_id;
    }

    public void setClass_id(String class_id) {
        Class_id = class_id;
    }

    public String getSem_id() {
        return Sem_id;
    }

    public void setSem_id(String sem_id) {
        Sem_id = sem_id;
    }

    public String getAdvisor_id() {
        return Advisor_id;
    }

    public void setAdvisor_id(String advisor_id) {
        Advisor_id = advisor_id;
    }

    public String getLT_id() {
        return LT_id;
    }

    public void setLT_id(String LT_id) {
        this.LT_id = LT_id;
    }

    public String getLP_id() {
        return LP_id;
    }

    public void setLP_id(String LP_id) {
        this.LP_id = LP_id;
    }
}
