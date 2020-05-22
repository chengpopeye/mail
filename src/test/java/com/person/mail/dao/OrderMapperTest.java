package com.person.mail.dao;

import com.person.mail.BaseTests;
import com.person.mail.pojo.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author popeye
 * @Date 2020/05/21
 * @Version V1.0
 **/
public class OrderMapperTest extends BaseTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println(order.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}