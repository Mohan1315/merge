package DsaQ;
import java.util.Scanner;


public class ArrQ2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // input the size of the array
		
		int arr[] = new int[N];
		int count=0;
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
			if(i>0) {
				if(arr[i]>arr[i-1]) {
					count++;
				}
			}
		}
		
//		for(int j=0; j<N-1; j++) {
//			if(arr[j]<=arr[j+1]) {
//				count++;
//			}
//		}
		System.out.println(count);

	}

}
