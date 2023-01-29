package main;
import java.util.*;

import service.*;

public class driver {

	public static void main(String[] args) {
		
	    {
	        String expr = "({[{}]})";
	        boolean result;
	 
	        // Function call
	        result=BalancedBrackets.areBracketsBalanced(expr);
	        if (result)
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced ");
	    }
	}

}


