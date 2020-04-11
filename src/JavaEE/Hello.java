package JavaEE;

public class Hello {
	 public static void main (String [] args) {
		 char chr = 127;
		 int sum = 200;
		 chr += 1;
		 sum += chr;
		 System.out.println("sum:"+sum);
		 System.out.println("chr:"+chr);
		 
		 int count=0;
		 int num=0;
		 for (int i = 0; i < 100; i++) {
			 //System.out.println(i+":"+count);
			num=num+i;
			count=count++;
		}
		 System.out.println(num);
		 System.out.println(count);
	 }
	 
}
