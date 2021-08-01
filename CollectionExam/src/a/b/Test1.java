package a.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1;
		int kor2;
		int kor3;
		int kor4;
		int kor5;
		int kor6;

		int[] kors = new int[6];// 객체자료형
		int[] maths = new int[6];
		String[] names = new String[6];

		kor1 = 10;
		kor2 = 10;
		kor3 = 10;
		kor4 = 10;
		kor5 = 10;
		kor6 = 10;

		kors[0] = 10;

		for (int i = 0; i < kors.length; i++) {
			kors[i] = 10;
		}

		// 한사람의 성적데이터 처리
		학생 일번 = new 학생();
		일번.out();

		// 여러사람의 성적

		학생[] 학생s = new 학생[6];
		학생s[0] = new 학생();
		학생s[0].out();

		// 컬렉션
		List<학생> 학생List = new ArrayList<학생>();
		학생List.add(new 학생());
		학생List.get(0).out();

		학생 temp;
		for (int i = 0; i < 학생List.size(); i++) {
			temp = 학생List.get(i);
			temp.out();
		}

		for (학생 stud : 학생List) {
			stud.out();
		}

		Map<String, 학생> 학생map = new HashMap<String, 학생>();
		학생map.put("크로", new 학생());
		학생map.get("크로").out();
	}

//properties

	Properties props = new Properties();
	Properties props2 = new Properties();
	Reader reader = null;
	Writer writer = null;
	try	{
		reader = new BufferedReader(new FileReader("message.properties"));
		props.load(reader);
		System.out.println(props.get("hi"));
		String value = props.getProperty("hi");
		System.out.println(value);

		writer = new BufferedWriter(new FileWriter("a/b/message2.properties"));

		props.setProperty("jvm-version", "1.8");
		props.put("jvm", "1.8");
		props.store(writer, "comments");

	}catch(
	FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(
	IOException e)
	{
	}
}
