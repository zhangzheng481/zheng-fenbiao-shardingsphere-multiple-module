package shandong.zheng.fenbiao.dao;

import shandong.zheng.fenbiao.entity.Order;

import java.util.List;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/6 21:13
 */
public interface OrderMapper {
    //查询
    List<Order> selectList(Order order);

    //插入
    int insert(Order order);

}
