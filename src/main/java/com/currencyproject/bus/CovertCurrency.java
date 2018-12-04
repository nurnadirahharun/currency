package com.currencyproject.bus;


import com.currencyproject.model.Convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CovertCurrency {
			private Map<String, ArrayList> currenciesMap = new HashMap<>();
			private ArrayList<Convert> list;
	
	public CovertCurrency() {
	Convert currencyMalaysia1= new Convert( "EUR", 0.21);
	Convert currencyMalaysia2 = new Convert( "AUD", 0.33);
	Convert currencyMalaysia3 = new Convert( "HKD",1.87);
	
	list = new ArrayList<>();
	list.add(currencyMalaysia1);
	list.add(currencyMalaysia2);
	list.add(currencyMalaysia3);
	currenciesMap.put("MYR", list);
	
	Convert currencyEuro1= new Convert( "MYR", 4.74);
	Convert currencyEuro2 = new Convert( "AUD", 1.54);
	Convert currencyEuro3 = new Convert( "HKD", 8.88);
	
	list = new ArrayList<>();
	list.add(currencyEuro1);
	list.add(currencyEuro2);
	list.add(currencyEuro3);
	currenciesMap.put("EUR", list);
	
	Convert currencyHongKong1= new Convert( "MYR", 0.53 );
	Convert currencyHongKong2 = new Convert( "AUD", 0.17);
	Convert currencyHongKong3 = new Convert( "EURO", 0.11);
	
	list = new ArrayList<>();
	list.add(currencyHongKong1);
	list.add(currencyHongKong2);
	list.add(currencyHongKong3);
	currenciesMap.put("HKD", list);

			}
	public ArrayList<Convert> getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);

	
	
	}
	
}
