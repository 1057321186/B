package JavaEE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Riqi {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh");
		String string=dateFormat.format(date);
		System.out.println(string);
		System.out.println(date.getHours());
		System.out.println(date.getTime());//Ê±¼ä´Á
	 System.out.println(System.currentTimeMillis()+"\t"+new Date().getTime());
	 Date d=new Date();
	 try {
	d=dateFormat.parse(string);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(d.toString());
	}
}
