import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {
    @Test
    public void checkBracketsTest() {
        Assert.assertEquals("()", Brackets.checkBrackets("(()"));
        Assert.assertEquals("()()", Brackets.checkBrackets(")()())"));
        Assert.assertEquals("(()())", Brackets.checkBrackets(")(()())"));
        Assert.assertEquals("", Brackets.checkBrackets(")("));
        Assert.assertEquals("()(()())()", Brackets.checkBrackets("())(()())(()"));
    }
}
