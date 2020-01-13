public class StarPattern{
	public void starPattern(int n){
		for (int i=0; i<n; i++){
			for (int j=n; j>=i; j--){
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i=n; i>=0; i--){
			for (int j=n; j>=i; j--){
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String args[]){
		StarPattern starPattern = new StarPattern();
		starPattern.starPattern(10);
	}
}