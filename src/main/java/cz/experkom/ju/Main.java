package cz.experkom.ju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		List<String> list= new ArrayList<String>(); // LinkedList, Vector ??
		List<String> result= new ArrayList<String>(); // LinkedList, Vector ??
		List<String> listText = new ArrayList<String>();
		List<String> listText2 = new ArrayList<String>();
		List<String> listOnlyNumbers = new ArrayList<String>();
		List<Integer> listIntegers = new ArrayList<Integer>();

		
		list.add("text1");
		list.add("xtext2");
		list.add("text3");
		list.add("xtext4");
		list.add("text5");
		list.add("xtext6");
		list.add("text7");
		list.add("xtext8");
			
		for (String s: list) {
			if (s.startsWith("text")) {
				listText.add(s);
			}
		}
		
		System.out.println("Výsledek1");
		for (String s: listText) {
			System.out.println(s);
		}
		System.out.println("---------------");
		

		for (String s: list) {
			if ("text".equals(s.substring(0, 4))) { // == používat jen u primitivních typůmyslí se tím to samé místo v paměti, text konstantu dát na první místo, pak vezmě i případ kdy text subrtin je null !! == púoužívat jen u primtivních typů (např. intale už ne u Innteger !!
				listText2.add(s);
			}
		}
		
		System.out.println("Výsledek2");
		for (String s: listText2) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		String pomocny;
		for (String s: list) {
			pomocny=s.replace("text", "").replace("x", "");
			if (!pomocny.isEmpty())listOnlyNumbers.add(pomocny);
		}
		
		System.out.println("Výsledek3");
		for (String s: listOnlyNumbers) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		for (String s: list) {
			pomocny=s.replace("text", "").replace("x", "");
			Integer pomocnyInteger;
			pomocnyInteger=Integer.parseInt(pomocny);// ale šel by i valueof() - jednoduchý
			if (!pomocny.isEmpty())listIntegers.add(pomocnyInteger);
		}
		
		System.out.println("Výsledek4");
		for (Integer i: listIntegers) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		

		//result = Collections.sort(list);
		
		Collections.sort(list, new MyComparator());
		
		System.out.println("Výsledek5");
		for (String s: list) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		/* NEBO*/
		list.sort(new MyComparator());
		
		/*****************************************************************/
		/* mapy*/
		
		Map<Long, String> map = new HashMap<Long, String>();
		
		{
		Calendar c = Calendar.getInstance();
		c.clear();
		c.set(1950, 0, 12, 0,0,0);
		
		
		Long l = new Date().getTime();
		String description = "Jan Novak";
		
		/* mapa nemá add ale má put */
		
		map.put(c.getTimeInMillis(), description);
		}
		
		{
			Calendar c = Calendar.getInstance();
			c.clear();
			c.set(1951, 0, 12, 0,0,0);
			
			
			Long l = new Date().getTime();
			String description = "Jana Nováková";
			
			/* mapa nemá add ale má put */
			
			map.put(c.getTimeInMillis(), description);
		}
		
		System.out.println("Mapa");
		for (Entry<Long, String> radek: map.entrySet()) {
			System.out.println(radek.getKey()+"/ "+radek.getValue());
		}
		System.out.println("------------------------------");
		
		
		
		
		
		//String string = map.get(l);
		
		
		
		
		
		/*****************************************************************/

		
		
		
		
		
		String o = new String("3");
		
		list.add(o);
		
		/* prolítnou Listem*/
		System.out.println("List222:");
		for (String s:list) {
			System.out.println(s);
		}
		
		String[] array2 = new String[] {"1","2"};
		
		List<String> asList = Arrays.asList(array2);
		
		System.out.println("asList:");
		for (String s: asList) {
			System.out.println(s);
		}
		
		String[] array = list.toArray(new String[0]); // 999
		
		//list.add(0,"CCC");
		array[0]=new String ("BBB"); // pole neroste, List ANO
		
		
		/*prolítnout pole -má pevně danýrozměr neváhoda*/
		
		if (array.length > 0) {
			String s = array [0];
			System.out.println(s);
		}
		
		/*
		 * asList.addAll(list); - nemá definovanou metodu addAll - viz 999
		 
		for (String s: asList) {
			System.out.println(s);
		}
		*/
		
		System.out.println("Výsledný List");
//		List <String> result= new ArrayList<String>();
		result.addAll(asList);
		result.addAll(list);
		for (String s: result) {
			System.out.println(s);
		}
		
		
		
		
			
		
		
		
		

	}

}
