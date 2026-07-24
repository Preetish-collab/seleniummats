package seleniumprac;

import org.testng.annotations.Test;

public class TestNGSequence {
    @Test(priority = 1)
    public void seqTest1() {
        System.out.println("Sequential 1 - Thread: " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void seqTest2() {
        System.out.println("Sequential 2 - Thread: " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void seqTest3() {
        System.out.println("Sequential 3 - Thread: " + Thread.currentThread().getId());
    }

    @Test(priority = 4)
    public void seqTest4() {
        System.out.println("Sequential 4 - Thread: " + Thread.currentThread().getId());
    }

    // --- PARALLEL METHODS ---
    // 'dependsOnMethods' ensures these only start AFTER seqTest4 finishes.

    @Test(dependsOnMethods = {"seqTest4"})
    public void parallelTest1() {
        System.out.println("Parallel 1 - Thread: " + Thread.currentThread().getId());
    }

    @Test(dependsOnMethods = {"seqTest4"})
    public void parallelTest2() {
        System.out.println("Parallel 2 - Thread: " + Thread.currentThread().getId());
    }

    @Test(dependsOnMethods = {"seqTest4"})
    public void parallelTest3() {
        System.out.println("Parallel 3 - Thread: " + Thread.currentThread().getId());
    }

    @Test(dependsOnMethods = {"seqTest4"})
    public void parallelTest4() {
        System.out.println("Parallel 4 - Thread: " + Thread.currentThread().getId());
    }
}

