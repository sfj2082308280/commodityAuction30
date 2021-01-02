package bean;

public class Administrator {
    Integer administrator_id;
    String administrator_account;
    String administrator_password;

    public Administrator() {
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "administrator_id=" + administrator_id +
                ", administrator_account='" + administrator_account + '\'' +
                ", administrator_password='" + administrator_password + '\'' +
                '}';
    }

    public Integer getAdministrator_id() {
        return administrator_id;
    }

    public void setAdministrator_id(Integer administrator_id) {
        this.administrator_id = administrator_id;
    }

    public String getAdministrator_account() {
        return administrator_account;
    }

    public void setAdministrator_account(String administrator_account) {
        this.administrator_account = administrator_account;
    }

    public String getAdministrator_password() {
        return administrator_password;
    }

    public void setAdministrator_password(String administrator_password) {
        this.administrator_password = administrator_password;
    }

    public Administrator(Integer administrator_id, String administrator_account, String administrator_password) {
        this.administrator_id = administrator_id;
        this.administrator_account = administrator_account;
        this.administrator_password = administrator_password;
    }
}
