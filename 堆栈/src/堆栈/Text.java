package ¶ÑÕ»;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import org.xml.sax.HandlerBase;

public class Text {

	public static void main(String[] args) {
		int[] a = { 1, 213, 12, 4334, 222, 31 };
		HashMap hm = new HashMap<>();
		hm.put("À­", "221");
		hm.put("Å¶", "2211");
		hm.put("¹þ¹þ", "22111");
		hm.put("g", "221111");
		HashSet hs = new HashSet<>();
		hs.add(11);
		hs.add(13);
		hs.add(14);
		hs.add(10);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		ArrayList l = new ArrayList();
		l.add(a[0]);
		l.add(a[1]);
		l.add(a[2]);
		l.add(a[3]);
		l.add(a[4]);
		l.add(a[5]);
		Collections.sort(l);
		System.out.println("test"+l.toString());
		System.out.println(hm.toString());
		System.out.println(hs.toString());
	}

}
