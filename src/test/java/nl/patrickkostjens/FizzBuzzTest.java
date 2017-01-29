package nl.patrickkostjens;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz testObject = new FizzBuzz();

    @Test
    public void test1Returns1() {
        Assert.assertEquals("1", testObject.getAnswer(1));
    }

/* Uncomment the tests one by one. After uncommenting a test, you run the tests again.
 * If the test fails, you change the program just enough to get that test running and continue with the next test.
 */

//    @Test
//    public void test2Returns2() {
//        Assert.assertEquals("2", testObject.getAnswer(2));
//    }

//    @Test
//    public void test3ReturnsFizz() {
//        Assert.assertEquals("Fizz", testObject.getAnswer(3));
//    }

//    @Test
//    public void test4Returns4() {
//        Assert.assertEquals("4", testObject.getAnswer(4));
//    }

//    @Test
//    public void test5ReturnsBuzz() {
//        Assert.assertEquals("Buzz", testObject.getAnswer(5));
//    }

//    @Test
//    public void test6ReturnsFizz() {
//        Assert.assertEquals("Fizz", testObject.getAnswer(6));
//    }

//    @Test
//    public void test7Returns7() {
//        Assert.assertEquals("7", testObject.getAnswer(7));
//    }

//    @Test
//    public void test8Returns8() {
//        Assert.assertEquals("8", testObject.getAnswer(8));
//    }

//    @Test
//    public void test9ReturnsFizz() {
//        Assert.assertEquals("Fizz", testObject.getAnswer(9));
//    }

//    @Test
//    public void test10ReturnsBuzz() {
//        Assert.assertEquals("Buzz", testObject.getAnswer(10));
//    }

//    @Test
//    public void test11Returns11() {
//        Assert.assertEquals("11", testObject.getAnswer(11));
//    }

//    @Test
//    public void test15ReturnsFizzBuzz() {
//        Assert.assertEquals("Fizz Buzz", testObject.getAnswer(15));
//    }
}
