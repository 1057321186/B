package JavaEE;

public class StringTest {
	
	public static void main(String[] args) {
		String string="��Է�,��ѧϰ,������Ϸ";
		String[] stringArray= string.split(",");
		System.out.println(string);
		for(String s:stringArray) {
			System.out.println(s);
		}
		String string2= string.concat(",˯��");
		System.out.println(string+"\n"+string2);
		
		
		   String str1 = "let there ";
	        StringBuffer sb = new StringBuffer(str1); //����str1����һ��StringBuffer����
	        sb.append("be light"); //�����׷��	         
	        System.out.println(sb);	         
	        sb.delete(4, 10);//ɾ��4-10֮����ַ�	         
	        System.out.println(sb);	         
	        sb.insert(4, "there ");//��4���λ�ò��� there	         
	        System.out.println(sb);	         
	        sb.reverse(); //��ת	         
	        System.out.println(sb);
	 
	}
	
}
