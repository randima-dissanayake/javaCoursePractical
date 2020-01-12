public class Test{
	int reverseNumber(int num){
		int reverseNum = 0;
		while(num > 0){
			int lastDigit = 0;
			lastDigit = num % 10;
			reverseNum = (reverseNum * 10) + lastDigit;
			num = num /10;
		}
	return reverseNum;
	}

	public static void main(String args[]){
		Test t = new Test();
		System.out.println(t.reverseNumber(123));
	}
}