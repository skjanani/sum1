package janani;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,sum=0,rem;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for( ;n!=0; ){
	rem=n%10;
    sum=sum+rem;
    n=n/10;
		}
	System.out.println(sum);
}
	}


