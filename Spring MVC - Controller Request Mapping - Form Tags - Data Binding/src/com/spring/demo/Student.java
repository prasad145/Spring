package com.spring.demo;

import java.util.LinkedHashMap;

public class Student {
	public String firstName;
	public String lastName;
	public String country;
	public LinkedHashMap<String, String> countryOptions;
	public String programmingLanguage;
	public String[] operatingSystems;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "United States Of America");
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	// to set the First Name once the form is Loaded and data is provided, based on the path provided in form input tag
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// to set the Last Name once the form is Loaded and data is provided, based on the path provided in form input tag
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
