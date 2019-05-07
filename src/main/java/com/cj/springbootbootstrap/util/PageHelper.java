package com.cj.springbootbootstrap.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/5/7 14:27<br>
 *     封装数据实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageHelper<T> {
  /** 实体类集合 */
  private List<T> rows = new ArrayList<>();
  /** 数据总数 */
  private int total;
}
