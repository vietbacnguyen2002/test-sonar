package bac.dev.se.testapp;

import bac.dev.se.testapp.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class TestAppApplicationTests {

    TestController testController = new TestController();
    @Test
    void contextLoads() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int result = testController.sum(nums);
        assertEquals(15, result, "The sum should be 15");
    }

}
