package bean;

public class Deal {
    Integer deal_id;
    Integer commodity_id;
    Integer buyer_id;
    Integer seller_id;
    Double deal_price;

    public Deal() {
    }

    @Override
    public String toString() {
        return "Deal{" +
                "deal_id=" + deal_id +
                ", commodity_id=" + commodity_id +
                ", buyer_id=" + buyer_id +
                ", seller_id=" + seller_id +
                ", deal_price=" + deal_price +
                '}';
    }

    public Deal(Integer deal_id, Integer commodity_id, Integer buyer_id, Integer seller_id, Double deal_price) {
        this.deal_id = deal_id;
        this.commodity_id = commodity_id;
        this.buyer_id = buyer_id;
        this.seller_id = seller_id;
        this.deal_price = deal_price;
    }

    public Integer getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(Integer deal_id) {
        this.deal_id = deal_id;
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

    public Double getDeal_price() {
        return deal_price;
    }

    public void setDeal_price(Double deal_price) {
        this.deal_price = deal_price;
    }
}
