package com.demo.async;

import com.demo.async.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AsyncApplication.class)
class AsyncApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private OrderService orderService;

    @Test
    public void testAsync() {
        orderService.doShop();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
