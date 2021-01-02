package bean;

public class Deposit {
    Integer deposit_id;
    Integer commodity_id;
    Integer buyer_id;
    Double deposit_num;
    public Deposit() {
    }

    public Deposit(Integer deposit_id, Integer commodity_id, Integer buyer_id, Double deposit_num) {
        this.deposit_id = deposit_id;
        this.commodity_id = commodity_id;
        this.buyer_id = buyer_id;
        this.deposit_num = deposit_num;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "deposit_id=" + deposit_id +
                ", commodity_id=" + commodity_id +
                ", buyer_id=" + buyer_id +
                ", deposit_num=" + deposit_num +
                '}';
    }

    public Double getDeposit_num() {
        return deposit_num;
    }

    public void setDeposit_num(Double deposit_num) {
        this.deposit_num = deposit_num;
    }

    public Integer getDeposit_id() {
        return deposit_id;
    }

    public void setDeposit_id(Integer deposit_id) {
        this.deposit_id = deposit_id;
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
