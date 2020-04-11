package JavaEE;
/*在继承中代码的执行顺序为：1.父类静态对象，父类静态代码块
2.子类静态对象，子类静态代码块
3.父类非静态对象，父类非静态代码块
4.父类构造函数
5.子类非静态对象，子类非静态代码块
6.子类构造函数
*/

public interface Itest {
		int c=0;//默认是public static final ，可以省略修饰符
	 	static int a=1;
	 	final String string="嘿嘿";
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
