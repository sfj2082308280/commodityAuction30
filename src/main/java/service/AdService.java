package service;

import Dao.AdDao;
import bean.Administrator;

public class AdService {
    AdDao adDao=new AdDao();
    public Administrator getAdUserByEmailAndPassword(String account, String password) {
        return adDao.getAdUserByEmailAndPassword(account,password);
    }
}
