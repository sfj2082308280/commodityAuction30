package bean;

public class User {
    Integer user_id;
    String user_account;
    String user_password;
    String user_idCard;
    String user_phone;
    String user_address;

    public User() {
    }

    public User(Integer user_id, String user_account, String user_password, String user_idCard, String user_phone, String user_address) {
        this.user_id = user_id;
        this.user_account = user_account;
        this.user_password = user_password;
        this.user_idCard = user_idCard;
        this.user_phone = user_phone;
        this.user_address = user_address;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_account='" + user_account + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_idCard='" + user_idCard + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_address='" + user_address + '\'' +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_idCard() {
        return user_idCard;
    }

    public void setUser_idCard(String user_idCard) {
        this.user_idCard = user_idCard;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
}
