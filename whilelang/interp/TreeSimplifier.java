package whilelang.interp;

import whilelang.ast.*;

public class TreeSimplifier implements Visitor<Tree> {


	  public Tree visit(Print n) {
		  // TODO Implement this!
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
		  // TODO Implement this!
		  return n;
	  }

	  public Tree visit(IfThenElse n) {
		  // TODO Implement this!
		  return n;
	  }

	  public Tree visit(While n) {
		n.expr = (Expression)n.expr.accept(this);
		n.body = (Statement)n.body.accept(this);
		return n;
	  }

	  public Tree visit(For n) {
		  // TODO Implement this!
		  return n;
	  }

	  public Tree visit(Var n) {
		  // TODO Implement this!
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