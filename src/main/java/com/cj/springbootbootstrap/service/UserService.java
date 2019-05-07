package com.cj.springbootbootstrap.service;

import com.cj.springbootbootstrap.entity.User;

import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/27 13:44<br>
 *     用户service层
 */
public interface UserService {
  /**
   * 查询所有用户客户端
   *
   * @return 用户集合
   */
  List<User> userPage2();


  /**
   * 获得数据总数
   * @return int
   */
  int getTotal();
  /**
   * 查询所有用户服务器端
   *
   * @return 用户集合
   */
  List<User> userPage(User user);
  /**
   * 通过用户id查询用户
   *
   * @param userId 用户id
   * @return 用户对象
   */
  User findUserByuserId(Integer userId);

  /**
   * 修改用户
   * @param user user对象
   * @return int
   */
  int userUpdate(User user);



  /**
   * 删除用户
   *
   * @param userId 用户id
   * @return  int
   */
  int userDelete(Integer userId);
}
