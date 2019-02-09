package whilelang.interp;

import whilelang.ast.*;
import java.util.*;

public class TreeSimplifier implements Visitor<Tree> {


    public Tree visit(Print n) {
        return n;
    }

    public Tree visit(Assign n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Skip n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Block n) {
        Block newBlock = new Block(new ArrayList<>());
        for (Statement state: n.body) {
            newBlock.body.add((Statement)state.accept(this));
        }
        return newBlock;
    }

    public Tree visit(IfThenElse n) {
        n.then.accept(this);
        n.elze.accept(this);
        return n;
    }

    public Tree visit(While n) {
        n.expr = (Expression)n.expr.accept(this);
        n.body = (Statement)n.body.accept(this);
        return n;
    }

    public Tree visit(For n) {
        Statement initStatement = (Statement)n.init.accept(new TreeSimplifier());
        ArrayList<Statement> newStatement = new ArrayList<>();
        newStatement.add(n.body);
        newStatement.add(n.step);

        Statement statement = new Block(newStatement);
        statement = (Statement)statement.accept(this);
        While whileBlock = new While(n.expr, statement);


        ArrayList<Statement> allStatement = new ArrayList<>();
        allStatement.add(initStatement);
        allStatement.add(whileBlock);

        Block allBlock = new Block(allStatement);

        return allBlock;
    }

    public Tree visit(Var n) {
        return n;
    }

    public Tree visit(IntLiteral n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Plus n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Minus n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Times n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Division n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Modulo n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Equals n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(GreaterThan n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(LessThan n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(And n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Or n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Neg n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(Not n) {
        // TODO Implement this!
        return n;
    }

    public Tree visit(UnaryExpression n) {
        // TODO Implement this!
        return null;
    }

    public Tree visit(BinaryExpression n) {
        // TODO Implement this!
        return null;
    }
}