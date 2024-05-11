package com.transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;
    @Autowired
    public UserService(UserDao userDao)
    {
        this.userDao = userDao;
    }
   public void setDeposit(){
        userDao.setDeposit();
   }
}
