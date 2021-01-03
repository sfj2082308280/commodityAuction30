package Dao;

import bean.Commodity;
import bean.Deposit;
import utils.DBUtils;

import java.util.List;

public class DepositDao {
    public boolean saveDeposit(Deposit deposit) {
        String sql="insert into tb_deposit(commodity_id,buyer_id,deposit_num) values(?,?,?)";
        return DBUtils.save(sql,deposit.getCommodity_id()
                ,deposit.getBuyer_id()
                ,deposit.getDeposit_num()
                );
    }
    public List<Deposit> getAllDeposit(){
        String sql="select deposit_id,commodity_id,buyer_id,deposit_num from tb_deposit";
        return DBUtils.getList(Deposit.class,sql);
    }
    public boolean delDeposit(Integer deposit_id){
        String sql="delete from tb_deposit where deposit_id=?;";
        return DBUtils.delObj(sql,deposit_id);
    }
    public Deposit getSingleDeposit(Integer commodity_id) {
        String sql="select deposit_id,commodity_id,buyer_id,deposit_num from tb_deposit where commodity_id=?";
        return DBUtils.getSingleObj(Deposit.class,sql,commodity_id);
    }
}
