package test.springmvcsandbox.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
//	private Map<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;

	public Student() {
		// populate country options: used ISO country code
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("PH", "Philippines");
//		countryOptions.put("US", "USA");
//		countryOptions.put("ES", "Spain");
//		countryOptions.put("JP", "Japan");
//		countryOptions.put("DE", "Germany");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

//	public Map<String, String> getCountryOptions() {
//		return countryOptions;
//	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
