package DsaQ;
import java.util.Scanner;


public class ArrQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // input the size of the array
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		int large=arr[0];
		int sum = arr[0];
		System.out.print(sum+" ");
		for(int j=1; j<N; j++) {
			if(large<sum) {
			large = sum;
			}
			sum = sum+arr[j];
			if(large>sum) {
				sum=large+arr[j];
			}
			
			System.out.print(sum+" ");
		}

	}

}
