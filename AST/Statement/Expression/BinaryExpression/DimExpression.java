package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class DimExpression extends Expression {
    public Expression lhs, rhs;

    public DimExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
