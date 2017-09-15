package com.gsq.springbootdemo.dao;

import com.gsq.springbootdemo.DemoApplication;
import com.gsq.springbootdemo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by Administrator on 2017/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoApplication.class)
@WebAppConfiguration
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        String name = "AAA_" + Math.random();
        userDao.insert(name, 20);

        User user = userDao.findByName(name);
        System.out.println("user = " + user);
        Assert.assertEquals(20, user.getAge().intValue());

        user.setAge(30);
        userDao.update(user);
        user = userDao.findByName(name);
        System.out.println("user = " + user);
        Assert.assertEquals(30, user.getAge().intValue());

        userDao.delete(user.getId().intValue());
        user = userDao.findByName(name);
        System.out.println("user = " + user);
        Assert.assertEquals(null, user);

        List<User> users = userDao.findAll();
        for (User u : users) {
            System.out.println("u = " + u);
        }
    }
}
