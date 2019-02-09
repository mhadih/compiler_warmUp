package whilelang.interp;

import whilelang.ast.*;

public class Interpreter implements Visitor<Integer>{

	public Integer visit(Print n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Assign n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Skip n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Block n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(IfThenElse n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(While n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(For n) {
		// TODO Implement this!
		return null;
	}


	public Integer visit(Var n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(IntLiteral n) {
		return n.value;
	}

	public Integer visit(Plus n) {
		Integer lhsValue = n.lhs.accept(new Interpreter());
		Integer rhsValue = n.rhs.accept(new Interpreter());
		return lhsValue + rhsValue;
	}

	public Integer visit(Minus n) {
		Integer lhsValue = n.lhs.accept(new Interpreter());
		Integer rhsValue = n.rhs.accept(new Interpreter());
		return lhsValue - rhsValue;
	}

	public Integer visit(Times n) {
		Integer lhsValue = n.lhs.accept(new Interpreter());
		Integer rhsValue = n.rhs.accept(new Interpreter());
		return lhsValue * rhsValue;
	}

	public Integer visit(Division n) {
		Integer lhsValue = n.lhs.accept(new Interpreter());
		Integer rhsValue = n.rhs.accept(new Interpreter());
		return lhsValue / rhsValue;
	}

	public Integer visit(Modulo n) {
		Integer lhsValue = n.lhs.accept(new Interpreter());
		Integer rhsValue = n.rhs.accept(new Interpreter());
		return lhsValue / rhsValue;
	}

	public Integer visit(Equals n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(GreaterThan n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(LessThan n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(And n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Or n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Neg n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(Not n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(UnaryExpression n) {
		// TODO Implement this!
		return null;
	}

	public Integer visit(BinaryExpression n) {
		// TODO Implement this!
		return null;
	}
}