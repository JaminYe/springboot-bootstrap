package com.cj.springbootbootstrap.service.impl;

import com.cj.springbootbootstrap.dao.UserDao;
import com.cj.springbootbootstrap.entity.User;
import com.cj.springbootbootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/27 13:45<br>
 *     用户service层接口实现
 */
@Service
public class UserServiceImpl implements UserService {
  @Resource private UserDao userDao;

  @Override
  public List<User> userPage(User user) {
    return userDao.userPage(user.getOffset(), user.getLimit());
  }

  @Override
  public User findUserByuserId(Integer userId) {
    return userDao.findUserByuserId(userId);
  }

  @Override
  public int userUpdate(User user) {
    return userDao.userUpdate(user);
  }

  @Override
  public int userDelete(Integer userId) {
    return userDao.userDelete(userId);
  }

  @Override
  public List<User> userPage2() {
    return userDao.userPage2();
  }

  @Override
  public int getTotal() {
    return userDao.getTotal();
  }
}
