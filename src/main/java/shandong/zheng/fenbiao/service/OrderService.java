package shandong.zheng.fenbiao.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import shandong.zheng.fenbiao.common.utils.KeyGenerator;
import shandong.zheng.fenbiao.dao.OrderMapper;
import shandong.zheng.fenbiao.entity.Order;

import javax.annotation.Resource;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/7 11:27
 */
@Service
public class OrderService {
    private final static Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Resource
    private OrderMapper orderDao;
    @Resource
    private KeyGenerator keyGenerator;

    public void add(Order order) {
        logger.info("add order");
        order.setId(keyGenerator.getLongId());
        orderDao.insert(order);
    }


}
