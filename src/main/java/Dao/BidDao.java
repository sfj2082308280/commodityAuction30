package Dao;

import bean.Bid;
import bean.Commodity;
import bean.User;
import utils.DBUtils;

import java.util.List;

public class BidDao {
    public boolean saveBid(Bid bid) {
        String sql="insert into tb_bid(commodity_id,buyer_id,bid_price,commodity_name) values(?,?,?,?)";
        return DBUtils.save(sql,bid.getCommodity_id(),bid.getBuyer_id(),bid.getBid_price(),bid.getCommodity_name());
    }
    public List<Bid> getMyBid(User user){
        String sql="select bid_id,commodity_id,buyer_id,bid_price,commodity_name from tb_bid where buyer_id=?";
        return DBUtils.getList(Bid.class,sql,user.getUser_id());
    }
}
