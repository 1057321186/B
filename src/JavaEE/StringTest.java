package JavaEE;

public class StringTest {
	
	public static void main(String[] args) {
		String string="你吃饭,我学习,他打游戏";
		String[] stringArray= string.split(",");
		System.out.println(string);
		for(String s:stringArray) {
			System.out.println(s);
		}
		String string2= string.concat(",睡觉");
		System.out.println(string+"\n"+string2);
		
		
		   String str1 = "let there ";
	        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
	        sb.append("be light"); //在最后追加	         
	        System.out.println(sb);	         
	        sb.delete(4, 10);//删除4-10之间的字符	         
	        System.out.println(sb);	         
	        sb.insert(4, "there ");//在4这个位置插入 there	         
	        System.out.println(sb);	         
	        sb.reverse(); //反转	         
	        System.out.println(sb);
	 
	}
	
}
