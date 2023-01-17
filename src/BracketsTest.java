import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    @Test
    public void getBracketsWithDescriptionTest() {
        Assert.assertEquals("2 - ()", Brackets.getBracketsWithDescription("(()"));
        Assert.assertEquals("4 - ()()", Brackets.getBracketsWithDescription(")()())"));
        Assert.assertEquals("6 - (()())", Brackets.getBracketsWithDescription(")(()())"));
        Assert.assertEquals("0", Brackets.getBracketsWithDescription(")("));
        Assert.assertEquals("10 - ()(()())()", Brackets.getBracketsWithDescription("())(()())(()"));
    }

}
