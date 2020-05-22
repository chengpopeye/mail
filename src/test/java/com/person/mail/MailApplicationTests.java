package com.person.mail;

import com.person.mail.dao.CategoryMapper;
import com.person.mail.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author popeye
 * @Date 2020/05/20
 * @Version V1.0
 **/


public class MailApplicationTests extends BaseTests{

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void CategoryLoads() {
        Category byId = categoryMapper.findById(100001);
        System.out.println(byId.toString());
    }
}
