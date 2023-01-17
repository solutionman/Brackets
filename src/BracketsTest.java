import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    @Test
    public void printBracktesTest() {
        Assert.assertEquals("()", Brackets.printBrackets("(()"));
        Assert.assertEquals("()()", Brackets.printBrackets(")()())"));
        Assert.assertEquals("(()())", Brackets.printBrackets(")(()())"));
        Assert.assertEquals("", Brackets.printBrackets(")("));
        Assert.assertEquals("()(()())()", Brackets.printBrackets("())(()())(()"));
    }

//    @Test
//    public void checkBracketsTest() {
//        Assert.assertEquals("()", Brackets.checkBrackets("(()"));
//        Assert.assertEquals("()()", Brackets.checkBrackets(")()())"));
//        Assert.assertEquals("(()())", Brackets.checkBrackets(")(()())"));
//        Assert.assertEquals("", Brackets.checkBrackets(")("));
//        Assert.assertEquals("()(()())()", Brackets.checkBrackets("())(()())(()"));
//    }
}
