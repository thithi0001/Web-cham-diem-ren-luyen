public class _Class {
    private String class_id;
    private int dept_id;
    private String class_name;
    private int num_of_students;
    private int current_num_of_students;

    public String getClass_id() {
        return class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public int getCurrent_num_of_students() {
        return current_num_of_students;
    }

    public int getNum_of_students() {
        return num_of_students;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public void setCurrent_num_of_students(int current_num_of_students) {
        this.current_num_of_students = current_num_of_students;
    }

    public void setNum_of_students(int num_of_students) {
        this.num_of_students = num_of_students;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}