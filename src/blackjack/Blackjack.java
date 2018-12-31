package blackjack;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println(closeToTwentyOne(21, 12));
	}
	
	public static int closeToTwentyOne(int firstnumber, int secondnumber) {
		if(firstnumber > 21 && secondnumber > 21) { 
			return 0;
		}
	    else if (firstnumber <= 21 && firstnumber > secondnumber || secondnumber > 21) { 
	    	return firstnumber;
	    }
	    else {
	    	return secondnumber;
	    }
	}	
}
