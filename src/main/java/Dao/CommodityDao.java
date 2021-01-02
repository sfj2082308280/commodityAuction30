package Dao;

import bean.Commodity;
import bean.User;
import utils.DBUtils;

import java.util.List;

public class CommodityDao {
    public CommodityDao() {
    }

    public boolean saveCommodity(Commodity commodity) {
        String sql="insert into tb_commodity(seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident) values(?,?,?,?,?,?,?,?,?)";
        return DBUtils.save(sql,commodity.getSeller_id()
                ,commodity.getCommodity_name()
                ,commodity.getCommodity_introduce()
                ,commodity.getCommodity_deposit()
                ,commodity.getCommodity_price()
                ,commodity.getCommodity_startTime()
                ,commodity.getCommodity_endTime()
                ,commodity.getCommodity_photo()
                ,commodity.getCommodity_ident());
    }
    public List<Commodity> getAllCommodity(){
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where commodity_ident=?";
        return DBUtils.getList(Commodity.class,sql,1);
    }
    public List<Commodity> getBidCommodity(User user){
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where buyer_id=?";
        return DBUtils.getList(Commodity.class,sql,user.getUser_id());
    }
    public List<Commodity> getIdentCommodity(int ident){
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where commodity_ident=?";
        return DBUtils.getList(Commodity.class,sql,ident);
    }
    public List<Commodity> getMyCommodity(User user){
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where seller_id=?";
        return DBUtils.getList(Commodity.class,sql,user.getUser_id());
    }
    public boolean updateAddPrice(Integer commodity_id,Integer user_id,Double price) {
        String sql="update tb_commodity set commodity_price=commodity_price+"+price+",buyer_id="+user_id+" where commodity_id=?";
        return DBUtils.update(sql,commodity_id);
    }
    public Commodity getSingleCommodity(Integer commodity_id) {
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where commodity_id=?";
        return DBUtils.getSingleObj(Commodity.class,sql,commodity_id);
    }
    public boolean delCommodity(Integer commodity_id) {
        String sql="delete from tb_commodity where commodity_id=?;";
        return DBUtils.delObj(sql,commodity_id);
    }
    public boolean updateCommodity(Commodity commodity) {
        String sql="update tb_commodity set commodity_name=?,commodity_introduce=?,commodity_deposit=?,commodity_price=?,commodity_startTime=?,commodity_endTime=?,commodity_photo=?,commodity_ident=? where commodity_id=?";
        return DBUtils.update(sql,commodity.getCommodity_name(),commodity.getCommodity_introduce(),commodity.getCommodity_deposit(),commodity.getCommodity_price(),commodity.getCommodity_startTime(),commodity.getCommodity_endTime(),commodity.getCommodity_photo(),commodity.getCommodity_ident(),commodity.getCommodity_id());
    }
    public boolean updateIdentCommodity(Integer commodity_id) {
        String sql="update tb_commodity set commodity_ident=? where commodity_id=?";
        return DBUtils.update(sql,1,commodity_id);
    }
}
