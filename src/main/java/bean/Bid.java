package bean;

public class Bid {
    Integer bid_id;
    Integer commodity_id;
    Integer buyer_id;
    Double bid_price;
    String commodity_name;
    public Bid() {
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public Bid(Integer bid_id, Integer commodity_id, Integer buyer_id, Double bid_price, String commodity_name) {
        this.bid_id = bid_id;
        this.commodity_id = commodity_id;
        this.buyer_id = buyer_id;
        this.bid_price = bid_price;
        this.commodity_name = commodity_name;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bid_id=" + bid_id +
                ", commodity_id=" + commodity_id +
                ", buyer_id=" + buyer_id +
                ", bid_price=" + bid_price +
                ", commodity_name='" + commodity_name + '\'' +
                '}';
    }

    public Double getBid_price() {
        return bid_price;
    }

    public void setBid_price(Double bid_price) {
        this.bid_price = bid_price;
    }

    public Integer getBid_id() {
        return bid_id;
    }

    public void setBid_id(Integer bid_id) {
        this.bid_id = bid_id;
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
}
