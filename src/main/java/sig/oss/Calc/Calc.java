package sig.oss.Calc;

public class Calc {
	private int r=0;
	public void add(int x, int y) { //add method
		r=x+y;
	}
	
	public void sub(int x, int y) {//subtraction method
		r=x-y;
	}
	
	public void mul(int x, int y) {
		r=x*y;
	}
	public int getResult() {
		return r;
	}
}
