package com.cj.springbootbootstrap.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jamin <br>
 * @date 2019/5/7 14:17<br>
 *     bootstrap分页工具类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
  /** 每页显示数 */
  private Integer limit;
  /** 页码 */
  private Integer page;
  /** sql语句起始索引 */
  private Integer offset;
}
