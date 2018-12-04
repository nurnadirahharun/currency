package com.currencyproject.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.currencyproject.bus.CovertCurrency;
import com.currencyproject.model.Convert;



@WebService
public class CurrencyProjectService {
CovertCurrency cc = new CovertCurrency();


	@WebMethod
	public ArrayList<Convert> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
