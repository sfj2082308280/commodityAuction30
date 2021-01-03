package service;

import Dao.DepositDao;
import bean.Deposit;

import java.util.List;

public class DepositService {
    DepositDao depositDao=new DepositDao();
    public boolean saveDeposit(Deposit deposit) {
        return depositDao.saveDeposit(deposit);
    }
    public List<Deposit> getAllDeposit(){
        return depositDao.getAllDeposit();
    }
    public boolean delDeposit(Integer deposit_id){
        return depositDao.delDeposit(deposit_id);
    }
    public Deposit getSingleDeposit(Integer commodity_id) {
        return depositDao.getSingleDeposit(commodity_id);
    }
}
