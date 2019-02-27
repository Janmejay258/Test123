package Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Sort {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>(10);
	
	al.add("java");
	al.add("bava");
	al.add("mava");
	al.add("lava");
	al.add("aava");
	al.add("pavaava");
	al.add("java");
	al.add("zava");
	al.add("mava");
	System.out.println(al);
	Collections.sort(al);
	System.out.println(" Assending order ");
	System.out.println(al);
	System.out.println("Duplicate");
	HashSet<String> set=new HashSet<>();
	set.addAll(al);
	System.out.println(set);
	
}
}
