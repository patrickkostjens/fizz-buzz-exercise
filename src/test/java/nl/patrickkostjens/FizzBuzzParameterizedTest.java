package nl.patrickkostjens;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzParameterizedTest {
    @Parameterized.Parameters(name = "{0} should return {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        {1, "1"}, {2, "2"}, {3, "Fizz"}, {4, "4"}, {5, "Buzz"}, {6, "Fizz"}, {7, "7"}, {8, "8"}, {9, "Fizz"},
        {10, "Buzz"}, {11, "11"}, {15, "Fizz Buzz"}
        });
    }

    private FizzBuzz testObject = new FizzBuzz();
    private final Integer question;
    private final String expectedAnswer;

    public FizzBuzzParameterizedTest(Integer question, String expectedAnswer) {
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    @Test
    public void test() {
        Assert.assertEquals(expectedAnswer, testObject.getAnswer(question));
    }
}
