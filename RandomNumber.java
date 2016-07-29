package random;

public class RandomNumber {
	public static void main(String[] args){
		double rd = Math.random();//0.0 <= rd < 1.0
		double Rd = Math.ceil(rd * 100);//the smallest integer which greater than it
		System.out.println((int) Rd);
	}
}
