package JavaEE;
/*�ڼ̳��д����ִ��˳��Ϊ��1.���ྲ̬���󣬸��ྲ̬�����
2.���ྲ̬�������ྲ̬�����
3.����Ǿ�̬���󣬸���Ǿ�̬�����
4.���๹�캯��
5.����Ǿ�̬��������Ǿ�̬�����
6.���๹�캯��
*/

public interface Itest {
		int c=0;//Ĭ����public static final ������ʡ�����η�
	 	static int a=1;
	 	final String string="�ٺ�";
		default void say() {
			System.out.println("heihei");
		}
		public static void say1() {
			System.out.println("xixi");
		}
		
		public static void main(String[] args) {
		double x=2.0;
		int y=4;
		System.out.println(x/=++y);
			
		}
		
}
