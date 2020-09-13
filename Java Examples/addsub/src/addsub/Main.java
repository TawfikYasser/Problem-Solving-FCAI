package addsub;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		adder newadd= new adder();
		double a = newadd.add(10, 5);
		double s = newadd.sub(12, 10);
		System.out.println(newadd.sub(12, 10)+" "+newadd.add(10, 5));
	}

}
