package whilelang.interp;

import whilelang.ast.*;

import java.util.HashMap;

public class Interpreter implements Visitor<Integer>{

	public HashMap<String, Integer> mapVar;

	public Integer visit(Print n) {
		System.out.println(n.msg + n.varID);
		return null;
	}

	public Integer visit(Assign n) {
		System.out.println("hadi");
		Integer value = n.expr.accept(this);
		System.out.println(value);
		mapVar.put(n.varID, value);
		System.out.println(4);
		return value;
	}

	public Integer visit(Skip n) {
		return null;
	}

	public Integer visit(Block n) {
		System.out.println("Hadi");
		for (Statement state : n.body)
			state.accept(this);
		return null;
	}

	public Integer visit(IfThenElse n) {
		Integer cond = n.expr.accept(this);
		if (cond == 1)
			n.then.accept(this);
		else
			n.elze.accept(this);
		return null;
	}

	public Integer visit(While n) {
		System.out.println("Hadi");
		while (n.expr.accept(this) == 1) {
			n.body.accept(this);
		}
		return null;
	}

	public Integer visit(For n) {
		for (n.init.accept(this); (n.expr.accept(this) == 1); n.step.accept(this)) {
			n.body.accept(this);
		}
		return null;
	}


	public Integer visit(Var n) {
		if (!mapVar.containsKey(n.varID)) {
			mapVar.put(n.varID, 0);
		}
		return mapVar.get(n.varID);
	}

	public Integer visit(IntLiteral n) {
		System.out.println(3);
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

	public Integer visit(Neg n) {
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

		return null;
	}

	public Integer visit(BinaryExpression n) {

		return null;
	}
}