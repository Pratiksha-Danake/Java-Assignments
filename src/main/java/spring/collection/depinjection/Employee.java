package spring.collection.depinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String eName;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	
	
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ "]";
	}
}
