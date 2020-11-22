package com.techtrade.rads.framework.context;

import java.util.Locale;
import java.util.Map;



public class RadsContext  implements IRadsContext{

	Map properties;
	String user;
	boolean isAuthenticated=true;
	boolean isAuthorized =true;
	
	
	@Override
	public boolean isAuthorized() {
		// TODO Auto-generated method stub
		return isAuthorized;
	}
	@Override
	public void addProperty(String key, String value) {
		// TODO Auto-generated method stub
		
	}
	public String getUser() {
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public void setUser(String user) {
		this.user = user ;
	}
	@Override
	public Map getProperties() {
		return properties ;
	}
	@Override
	public void setProperties(Map properties) {
		this.properties =properties; 
	}
	@Override
	public boolean isAuthenticated() {
		return isAuthenticated ;
		
	}
	public void setAuthenticated(boolean isAuth){
		isAuthenticated = isAuth;
	}
	@Override
	public Locale getLocale() {
		return Locale.US;
	}
	@Override
	public void setLocale(Locale locale) {
		
	}


	@Override
	public void setDateFormat(String format) {

	}

	@Override
	public String getDateFormat() {
		return "yyyy-MM-dd";
	}
}
