package com.cj.springbootbootstrap.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cj.springbootbootstrap.entity.User;
import com.cj.springbootbootstrap.service.UserService;
import com.cj.springbootbootstrap.util.PageHelper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/4/27 13:48<br>
 *     用户controller层
 */
@Controller
public class UserController {
  @Resource private UserService userService;

  @RequestMapping("header")
  public String header() {
    return "header";
  }

  @RequestMapping("getUserPage")
  public String getUserPage() {
    return "userPage";
  }

  @RequestMapping("getUserPage2")
  public String getUserPage2() {
    return "userPage2";
  }

  /**
   * 服务器端
   *
   * @param user 用户对象
   * @return PageHelper
   */
  @RequestMapping("getUser")
  @ResponseBody
  public PageHelper<User> getUser(User user) {
    PageHelper<User> pageHelper = new PageHelper<>();
    int total = userService.getTotal();
    pageHelper.setTotal(total);
    List<User> users = userService.userPage(user);
    pageHelper.setRows(users);
    return pageHelper;
  }

  /**
   * 查询客户端
   *
   * @return aa
   */
  @RequestMapping("getUser2")
  @ResponseBody
  public List<User> getUser2() {
    List<User> users = userService.userPage2();
    return users;
  }

  /**
   * 修改前的回显
   *
   * @param userId 用户id
   * @param model 用户
   * @return 用户修改页面
   */
  @RequestMapping("userUpload")
  public String userUpload(Integer userId, Model model) {
    User user = userService.findUserByuserId(userId);
    System.out.println(user);

    model.addAttribute("user", user);
    return "userUpdate";
  }

  /**
   * 修改用户信息
   *
   * @param user 用户对象
   * @return int
   */
  @RequestMapping("userUpdate")
  @ResponseBody
  public int userUpdate(User user) {
    return userService.userUpdate(user);
  }

  /**
   * 删除用户
   *
   * @param userId 用户id
   * @return int
   */
  @ResponseBody
  @RequestMapping("userDelete")
  public int userDelete(Integer userId) {
    return userService.userDelete(userId);
  }
}
