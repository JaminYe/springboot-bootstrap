package com.cj.springbootbootstrap.entity;

import com.cj.springbootbootstrap.util.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jamin <br>
 * @date 2019/4/27 13:20<br>
 *     用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Page {

  /** 用户id */
  private Integer userId;
  /** 用户账号 */
  private String userAccount;
  /** 用户密码 */
  private String userPassword;
  /** 用户名 */
  private String userName;
  /** 用户手机号 */
  private String userTel;
  /** 用户邮箱 */
  private String userEmail;
}
