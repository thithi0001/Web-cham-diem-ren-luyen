package models;

public class Permissions {
    private int Permission_id;
    private String Permission_name;
    private String Description;

    public int getPermission_id() {
        return Permission_id;
    }

    public void setPermission_id(int permission_id) {
        Permission_id = permission_id;
    }

    public String getPermission_name() {
        return Permission_name;
    }

    public void setPermission_name(String permission_name) {
        Permission_name = permission_name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
