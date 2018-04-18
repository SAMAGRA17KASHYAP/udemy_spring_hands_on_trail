package sam.web.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import sam.web.validation.CourseCode;

public class Student {
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String[] operatingSystems;
	@NotNull(message= "is Required")
	@Min(value=1,message="Value must be greater than 0")
	@Max(value=20,message="Value must be greater than 20")
	private Integer age;
	@NotNull
	//@Pattern(regexp="^[1-9]{5}",message="Postal Code can be  only digits")
	private String postalCode;
	@CourseCode
	private String courseCode;
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	private String favouriteLanguage;
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	public Student() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("sam1", "sam1");
		countryOptions.put("sam2", "sam2");
		countryOptions.put("sam3", "sam3");
		countryOptions.put("sam4", "sam4");
		countryOptions.put("sam5", "sam5");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
