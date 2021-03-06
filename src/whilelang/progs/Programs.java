package whilelang.progs;

import whilelang.ast.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Programs {

    public static Statement squares = new Block( new ArrayList<Statement>( Arrays.asList(
            new Assign("i", new IntLiteral(0)),
            new Assign("j", new IntLiteral(1)),
            new While( new LessThan(new Var("i"), new IntLiteral(10)),
                    new Block(new ArrayList<Statement>(Arrays.asList(
                            new Print("", "j"),
                            new Assign("i", new Plus(new Var("i"), new IntLiteral(1))),
                            new Assign("j", new Plus(new Var("j"),
                                    new Plus(new Times(new IntLiteral(2), new Var("i")), new IntLiteral(1))))
                    )))))));

    public static Statement collatz = new Block( new ArrayList<Statement>( Arrays.asList(
            new Assign("x", new IntLiteral(13)),
            new While(new GreaterThan(new Var("x"), new IntLiteral(1)),
                    new Block( new ArrayList<Statement>( Arrays.asList(
                            new Print("x=", "x"),
                            new IfThenElse( new Equals( new Modulo( new Var("x"), new IntLiteral(2)), new IntLiteral(0)),
                                    new Assign("x", new Division( new Var("x"), new IntLiteral(2))),
                                    new Assign("x", new Plus( new Times(new IntLiteral(3), new Var("x")), new IntLiteral(1))))
                    )))))));

    public static Statement sums = new Block( new ArrayList<Statement>( Arrays.asList(
            new Assign("sum", new IntLiteral(0)),
            new For(new Assign("i", new IntLiteral(1)),
                    new LessThan( new Var("i"), new IntLiteral(100)),
                    new Assign("i", new Plus( new Var("i"), new IntLiteral(1))),
                    new IfThenElse( new Equals( new Modulo( new Var("i"), new IntLiteral(2)), new IntLiteral(0)),
                            new Assign( "sum", new Plus( new Var("sum"), new Var("i"))),
                            new Skip())),
            new Print("sum: ", "sum"))));

    public static Statement nested = new Block ( new ArrayList<Statement>( Arrays.asList(
        new For(new Assign ("i", new IntLiteral(0)),
            new LessThan( new Var("i"), new IntLiteral(10)),
            new Assign("i", new Plus( new Var("i"), new IntLiteral(1))),
            new For( new Assign ("j", new IntLiteral(0)),
                new LessThan( new Var("j"), new IntLiteral(10)),
                new Assign("j", new Plus( new Var("j"), new IntLiteral(1))),
                new Block( new ArrayList<Statement> ( Arrays.asList(
                        new Print("i: ", "i"),
                        new Print("j: ", "j")
                )))
        )))));

    public static Statement newSample = new Block ( new ArrayList<Statement>( Arrays.asList(
            new For (new Assign ("i", new IntLiteral(0)),
                    new LessThan( new Var("i"), new IntLiteral(10)),
                    new Assign("i", new Plus( new Var("i"), new IntLiteral(1))),
                    new IfThenElse( new Equals( new Modulo( new Var("i"), new IntLiteral(2)), new IntLiteral(0)),
                            new For( new Assign ("j", new Var("i")),
                                    new GreaterThan( new Var("j"), new IntLiteral(0)),
                                    new Assign("j", new Minus( new Var("j"), new IntLiteral(2))),
                                    new Print("j: ", "j")),
                            new Skip())
            ))));

}