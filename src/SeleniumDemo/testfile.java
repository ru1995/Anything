package SeleniumDemo;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfile {

	public static void main(String[] args) {
	
		       List<String> al = new ArrayList<String>();
		       al.add("pen");
		       al.add("pencil");
		       al.add("ink");
		       al.add("notebook");
		       al.add("book");
		       al.add("books");
		       al.add("paper");
		       al.add("white board");

//		       System.out.println("First element of the ArrayList: "+al.get(0));
//		       System.out.println("Third element of the ArrayList: "+al.get(2));
//		       System.out.println("Sixth element of the ArrayList: "+al.get(5));
//		       System.out.println("Fourth element of the ArrayList: "+al.get(3));
		       
		       String s=al.get(0);
		       System.out.println(s);
}}
