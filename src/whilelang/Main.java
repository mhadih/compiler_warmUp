package whilelang;

import whilelang.ast.*;
import whilelang.interp.*;
import whilelang.progs.Programs;

import java.io.IOException;

class Main {
	
    public static void main(String args[]) throws IOException {
    	// pretty print
        Visitor<String> tp = new TreePrinter();
		Visitor<Tree> ts = new TreeSimplifier();
    	System.out.println("############## Program Squares: ##############");
    	System.out.println(Programs.squares.accept(tp));
    	System.out.println("############## Program Collatz: ##############");
    	System.out.println(Programs.collatz.accept(tp));

    	System.out.println("############## Program Sums: ##############");
    	System.out.println(Programs.sums.accept(tp));
    	System.out.println("############## Program Sums After Simplification: ##############");
    	System.out.println(Programs.sums.accept(ts).accept(tp));

		System.out.println("############## Program Nested: ##############");
		System.out.println(Programs.nested.accept(tp));
		System.out.println("############## Program Nested After Simplification: ##############");
		System.out.println(Programs.nested.accept(ts).accept(tp));

        System.out.println("############## Program mySample: ##############");
        System.out.println(Programs.newSample.accept(tp));
        System.out.println("############## Program Nested After Simplification: ##############");
        System.out.println(Programs.newSample.accept(ts).accept(tp));
    	// interpret
    	Visitor<Integer> ip = new Interpreter();
    	Programs.squares.accept(ip);
    	Programs.collatz.accept(ip);
    	Programs.sums.accept(ip);
//    	Programs.nested.accept(ip);
        Programs.newSample.accept(ip);
    }
}