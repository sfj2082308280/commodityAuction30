package Dao;

import bean.Commodity;
import bean.User;
import utils.DBUtils;

import java.util.LinkedList;
import java.util.List;

public class UserDao {
    //根据email和密码查询用户
    public User getUserByEmailAndPassword(String account, String password) {
        String sql="select user_id,user_account,user_password,user_idCard,user_phone,user_address from tb_user where user_account=? and user_password=?";
        return DBUtils.getSingleObj(User.class,sql,account,password);
    }

    public Integer getUserAccountNum(String account) {
        String sql="select count(*) from tb_user where user_account = ?";
        Integer count=DBUtils.getCount(sql,account);
        return count;
    }
    public boolean saveUser(User user) {
        String sql="insert into tb_user(user_account,user_password,user_idCard,user_phone,user_address) values(?,?,?,?,?)";
        return DBUtils.save(sql,user.getUser_account(),user.getUser_password(),user.getUser_idCard(),user.getUser_phone(),user.getUser_address());
    }
    public List<Commodity> getCommodity(User user){
        String sql="select commodity_id,buyer_id,seller_id,commodity_name,commodity_introduce,commodity_deposit,commodity_price,commodity_startTime,commodity_endTime,commodity_photo,commodity_ident from tb_commodity where seller_id=?";
        return DBUtils.getList(Commodity.class,sql,user.getUser_id());
    }
    public boolean updateUser(User user) {
        String sql="update tb_user set user_account=?,user_password=?,user_idCard=?,user_phone=?,user_address=? where user_id=?";
        return DBUtils.update(sql,user.getUser_account(),user.getUser_password(),user.getUser_idCard(),user.getUser_phone(),user.getUser_address(),user.getUser_id());
    }
    public List<User> getAllUser(){
        String sql="select user_id,user_account,user_password,user_idCard,user_phone,user_address from tb_user";
        return DBUtils.getList(User.class,sql);
    }
    public User getSingleUser(Integer user_id) {
        String sql="select user_id,user_account,user_password,user_idCard,user_phone,user_address from tb_user where user_id=?";
        return DBUtils.getSingleObj(User.class,sql,user_id);
    }
    public boolean delUser(Integer user_id){
        String sql="delete from tb_user where user_id=?;";
        return DBUtils.delObj(sql,user_id);
    }
}
