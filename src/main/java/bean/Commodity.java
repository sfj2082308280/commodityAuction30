package bean;

import java.util.Date;

public class Commodity {
    Integer commodity_id;
    Integer buyer_id;
    Integer seller_id;
    String commodity_name;
    String commodity_introduce;
    Double commodity_deposit;
    Double commodity_price;
    Date commodity_startTime;
    Date commodity_endTime;
    String commodity_photo;
    Integer commodity_ident;

    public Commodity() {
    }

    public Commodity(Integer commodity_id, Integer buyer_id, Integer seller_id, String commodity_name, String commodity_introduce, Double commodity_deposit, Double commodity_price, Date commodity_startTime, Date commodity_endTime, String commodity_photo, Integer commodity_ident) {
        this.commodity_id = commodity_id;
        this.buyer_id = buyer_id;
        this.seller_id = seller_id;
        this.commodity_name = commodity_name;
        this.commodity_introduce = commodity_introduce;
        this.commodity_deposit = commodity_deposit;
        this.commodity_price = commodity_price;
        this.commodity_startTime = commodity_startTime;
        this.commodity_endTime = commodity_endTime;
        this.commodity_photo = commodity_photo;
        this.commodity_ident = commodity_ident;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodity_id=" + commodity_id +
                ", buyer_id=" + buyer_id +
                ", seller_id=" + seller_id +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_introduce='" + commodity_introduce + '\'' +
                ", commodity_deposit=" + commodity_deposit +
                ", commodity_price=" + commodity_price +
                ", commodity_startTime=" + commodity_startTime +
                ", commodity_endTime=" + commodity_endTime +
                ", commodity_photo='" + commodity_photo + '\'' +
                ", commodity_ident=" + commodity_ident +
                '}';
    }

    public Date getCommodity_startTime() {
        return commodity_startTime;
    }

    public void setCommodity_startTime(Date commodity_startTime) {
        this.commodity_startTime = commodity_startTime;
    }

    public Date getCommodity_endTime() {
        return commodity_endTime;
    }

    public void setCommodity_endTime(Date commodity_endTime) {
        this.commodity_endTime = commodity_endTime;
    }

    public String getCommodity_photo() {
        return commodity_photo;
    }

    public void setCommodity_photo(String commodity_photo) {
        this.commodity_photo = commodity_photo;
    }

    public Integer getCommodity_ident() {
        return commodity_ident;
    }

    public void setCommodity_ident(Integer commodity_ident) {
        this.commodity_ident = commodity_ident;
    }
    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Integer getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(Integer buyer_id) {
        this.buyer_id = buyer_id;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getCommodity_introduce() {
        return commodity_introduce;
    }

    public void setCommodity_introduce(String commodity_introduce) {
        this.commodity_introduce = commodity_introduce;
    }

    public Double getCommodity_deposit() {
        return commodity_deposit;
    }

    public void setCommodity_deposit(Double commodity_deposit) {
        this.commodity_deposit = commodity_deposit;
    }

    public Double getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(Double commodity_price) {
        this.commodity_price = commodity_price;
    }
}
