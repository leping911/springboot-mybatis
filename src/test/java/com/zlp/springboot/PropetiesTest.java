package com.zlp.springboot;

import com.zlp.springboot.properties.DataProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/8/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropetiesTest {
    @Autowired
    DataProperties dataProperties;

    @Test
    public void Test() {
        System.out.println(dataProperties.getName());

        System.out.println(dataProperties.getUser());
        ;
    }
}
