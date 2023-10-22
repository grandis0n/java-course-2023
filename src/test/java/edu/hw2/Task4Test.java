package edu.hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    static class infoTest{
        public static Task4.CallingInfo nameTest(){
            return Task4.callingInfo();
        }
    }

    @Test
    void testCallingInfo() {
        Task4.CallingInfo call = infoTest.nameTest();
        Assertions.assertEquals(call.className(), infoTest.class.getName());
        Assertions.assertEquals(call.methodName(), "nameTest");
    }
}
