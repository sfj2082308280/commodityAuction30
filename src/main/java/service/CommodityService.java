package service;

import Dao.CommodityDao;
import bean.Commodity;
import bean.User;

import java.util.List;

public class CommodityService {
    private  CommodityDao commodityDao=new CommodityDao();
    public boolean saveCommodity(Commodity commodity) {
        return commodityDao.saveCommodity(commodity);
    }
    public List<Commodity> getAllCommodity(){
        return commodityDao.getAllCommodity();
    }
    public boolean updateAddPrice(Integer commodity_id,Integer user_id,Double price) {
        return commodityDao.updateAddPrice(commodity_id,user_id,price);
    }
    public List<Commodity> getMyCommodity(User user){
        return commodityDao.getMyCommodity(user);
    }
    public Commodity getSingleCommodity(Integer commodity_id) {
        return commodityDao.getSingleCommodity(commodity_id);
    }
    public List<Commodity> getBidCommodity(User user){
        return commodityDao.getBidCommodity(user);
    }

    public boolean delCommodity(Integer commodity_id) {
        return commodityDao.delCommodity(commodity_id);
    }
    public boolean updateCommodity(Commodity commodity) {
        return commodityDao.updateCommodity(commodity);
    }
    public List<Commodity> getIdentCommodity(int ident){
        return commodityDao.getIdentCommodity(ident);
    }
    public boolean updateIdentCommodity(Integer commodity_id) {
        return commodityDao.updateIdentCommodity(commodity_id);
    }
}
