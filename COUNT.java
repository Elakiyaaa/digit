package COUNT;

import java.util.Scanner;

public class COUNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("ENTER THE INTEGER:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int r;
	int count=0;
	while(a!=0)
	{ r=a%10;
	a=a/10;
		count++;
	}
	System.out.println("NUMBER OF DIGITS: "+count);
	s.close();
	}

}
