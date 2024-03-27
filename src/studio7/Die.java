package studio7;

public class Die {
	private int n;

public Die (int n) {
	this.n =n;
}

public int roll() {
	return (int)(Math.random()*this.n)+1;
}
public static void main (String [] args) {
	Die d6 = new Die(6);
	System.out.println(d6.roll());
}
}