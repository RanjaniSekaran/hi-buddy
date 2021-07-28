import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class userdefined{
	int sum1=0;
	public int sum(int s) {
		if(s>=0) {
			
		sum1=sum1+s%10;
		sum(s/10);
	}else {
		return s;
	}
		return s;
		}
public static void main(String[] args) {
	userdefined ud= new userdefined();
	int number=8853;
	ud.sum(number);
	
//	for (; number>0; number=number/10) {
//		int last_digit=number%10;
//		sum=sum+last_digit;
//	}
//	System.out.println(sum);
}
	}

			
		


