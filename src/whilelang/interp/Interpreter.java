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
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue + rhsValue;
	}

	public Integer visit(Minus n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue - rhsValue;
	}

	public Integer visit(Times n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue * rhsValue;
	}

	public Integer visit(Division n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue / rhsValue;
	}

	public Integer visit(Modulo n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue % rhsValue;
	}

	public Integer visit(Equals n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		if (lhsValue == rhsValue)
			return 1;
		return 0;
	}

	public Integer visit(GreaterThan n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		if(lhsValue > rhsValue)
			return 1;
		return 0;
	}

	public Integer visit(LessThan n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		if(lhsValue > rhsValue)
			return 0;
		return 1;
	}

	public Integer visit(And n) {
		Integer lhsValue = n.lhs.accept(this);
		Integer rhsValue = n.rhs.accept(this);
		return lhsValue % rhsValue;
	}

	public Integer visit(Or n) {
		Boolean lhsValue = (n.lhs.accept(this) != 0);
		Boolean rhsValue = (n.rhs.accept(this) != 0);
		Integer result = 0;
		if (rhsValue || lhsValue)
			result = 1;
		return result;
	}

	public Integer visit(Neg n){
		Integer value = n.expr.accept(this);
		return -value;
	}

	public Integer visit(Not n) {
		Integer value = n.expr.accept(this);
		if (value == 0)
			return 1;
		else
			return 0;
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