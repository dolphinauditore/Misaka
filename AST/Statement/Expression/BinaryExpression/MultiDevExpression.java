package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class MultiDevExpression extends Expression {
    public Expression lhs, rhs;

    public MultiDevExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
