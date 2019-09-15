import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1 []= new int [5];
Scanner rd = new Scanner(System.in);
for (int i=0;i<5;i++){
	System.out.println("array1["+i +"]");
	array1[i]=rd.nextInt();
}
for( int j=0;j<5;j++) {
	System.out.print(array1[j]);
}

	}

}
