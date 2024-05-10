package com.jdbc;
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
   public void getUserById(int id){
        userDao.queryUserById(id);
   }
   public void queryUserList(){
        userDao.queryUserList();
   }
}
