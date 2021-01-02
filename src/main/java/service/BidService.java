package service;

import Dao.BidDao;
import bean.Bid;
import bean.User;

import java.util.List;

public class BidService {
    BidDao bidDao=new BidDao();
    public boolean saveBid(Bid bid) {
        return bidDao.saveBid(bid);
    }
    public List<Bid> getMyBid(User user){
        return bidDao.getMyBid(user);
    }
}
