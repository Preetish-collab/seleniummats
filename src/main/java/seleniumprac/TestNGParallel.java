package seleniumprac;

import org.testng.annotations.Test;

public class TestNGParallel {
    @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
    public void testMethod()
    {
        System.out.println("Thread ID Is : " + Thread.currentThread().getId());
    }
}
