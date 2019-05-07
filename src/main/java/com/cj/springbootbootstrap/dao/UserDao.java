package com.cj.springbootbootstrap.dao;

import com.cj.springbootbootstrap.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/27 13:35<br>
 *     用户dao层接口
 */
@Repository
public interface UserDao {
  /**
   * 查询所有用户客户端
   *
   * @return 用户集合
   */
  List<User> userPage2();

  /**
   * 查询所有用户服务器端
   *
   * @return 用户集合
   */
  List<User> userPage(Integer offset, Integer limit);
  /**
   * 获得数据总数
   *
   * @return int
   */
  int getTotal();

  /**
   * 通过用户id查询用户
   *
   * @param userId 用户id
   * @return 用户对象
   */
  User findUserByuserId(Integer userId);

  /**
   * 修改用户
   *
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
