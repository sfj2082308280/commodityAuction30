package bean;

import java.util.Date;

public class Ident {
    Integer ident_id;
    Integer seller_id;
    String ident_name;
    String ident_introduce;
    Double ident_deposit;
    Double ident_price;
    Date ident_startTime;
    Date ident_endTime;
    String ident_photo;
    Integer ident_whether;

    public Ident() {
    }

    @Override
    public String toString() {
        return "Ident{" +
                "ident_id=" + ident_id +
                ", seller_id=" + seller_id +
                ", ident_name='" + ident_name + '\'' +
                ", ident_introduce='" + ident_introduce + '\'' +
                ", ident_deposit=" + ident_deposit +
                ", ident_price=" + ident_price +
                ", ident_startTime=" + ident_startTime +
                ", ident_endTime=" + ident_endTime +
                ", ident_photo='" + ident_photo + '\'' +
                ", ident_whether=" + ident_whether +
                '}';
    }

    public Ident(Integer ident_id, Integer seller_id, String ident_name, String ident_introduce, Double ident_deposit, Double ident_price, Date ident_startTime, Date ident_endTime, String ident_photo, Integer ident_whether) {
        this.ident_id = ident_id;
        this.seller_id = seller_id;
        this.ident_name = ident_name;
        this.ident_introduce = ident_introduce;
        this.ident_deposit = ident_deposit;
        this.ident_price = ident_price;
        this.ident_startTime = ident_startTime;
        this.ident_endTime = ident_endTime;
        this.ident_photo = ident_photo;
        this.ident_whether = ident_whether;
    }

    public Integer getIdent_id() {
        return ident_id;
    }

    public void setIdent_id(Integer ident_id) {
        this.ident_id = ident_id;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getIdent_name() {
        return ident_name;
    }

    public void setIdent_name(String ident_name) {
        this.ident_name = ident_name;
    }

    public String getIdent_introduce() {
        return ident_introduce;
    }

    public void setIdent_introduce(String ident_introduce) {
        this.ident_introduce = ident_introduce;
    }

    public Double getIdent_deposit() {
        return ident_deposit;
    }

    public void setIdent_deposit(Double ident_deposit) {
        this.ident_deposit = ident_deposit;
    }

    public Double getIdent_price() {
        return ident_price;
    }

    public void setIdent_price(Double ident_price) {
        this.ident_price = ident_price;
    }

    public Date getIdent_startTime() {
        return ident_startTime;
    }

    public void setIdent_startTime(Date ident_startTime) {
        this.ident_startTime = ident_startTime;
    }

    public Date getIdent_endTime() {
        return ident_endTime;
    }

    public void setIdent_endTime(Date ident_endTime) {
        this.ident_endTime = ident_endTime;
    }

    public String getIdent_photo() {
        return ident_photo;
    }

    public void setIdent_photo(String ident_photo) {
        this.ident_photo = ident_photo;
    }

    public Integer getIdent_whether() {
        return ident_whether;
    }

    public void setIdent_whether(Integer ident_whether) {
        this.ident_whether = ident_whether;
    }
}
