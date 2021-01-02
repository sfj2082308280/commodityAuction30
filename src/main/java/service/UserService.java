package service;

import Dao.UserDao;
import bean.Commodity;
import bean.User;

import java.util.List;

public class UserService {
    private UserDao userDao=new UserDao();
    public User getUserByEmailAndPassword(String account, String password){
        return userDao.getUserByEmailAndPassword(account,password);
    }
    public Integer getUserAccountNum(String account) {
        return userDao.getUserAccountNum(account);
    }
    public boolean saveUser(User user){
        return userDao.saveUser(user);
    }
    public List<Commodity> getCommodity(User user){
        return userDao.getCommodity(user);
    }
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }
    public User getSingleUser(Integer user_id) {
        return userDao.getSingleUser(user_id);
    }
    public boolean delUser(Integer user_id){
        return userDao.delUser(user_id);
    }
}
