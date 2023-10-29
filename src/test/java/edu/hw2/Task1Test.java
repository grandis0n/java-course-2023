package edu.hw2;

import edu.hw2.task1.Expr.Addition;
import edu.hw2.task1.Expr.Constant;
import edu.hw2.task1.Expr.Exponent;
import edu.hw2.task1.Expr.Multiplication;
import edu.hw2.task1.Expr.Negate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    void evaluateTest() {
        var two = new Constant(2);
        var four = new Constant(4);
        var negOne = new Negate(new Constant(1));
        var sumTwoFour = new Addition(two, four);
        var mult = new Multiplication(sumTwoFour, negOne);
        var exp = new Exponent(mult, 2);
        var res = new Addition(exp, new Constant(1));
        Assertions.assertEquals(res.evaluate(), 37);
        Assertions.assertEquals(res.evaluate(), (Math.pow((2+4)*(-1),2)+1));
    }
}
