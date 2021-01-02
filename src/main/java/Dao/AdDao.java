package Dao;

import bean.Administrator;
import bean.User;
import utils.DBUtils;

public class AdDao {
    public Administrator getAdUserByEmailAndPassword(String account, String password) {
        String sql="select administrator_id,administrator_account,administrator_password from tb_administrator where administrator_account=? and administrator_password=?";
        return DBUtils.getSingleObj(Administrator.class,sql,account,password);
    }
}
