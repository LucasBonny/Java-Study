package entities;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private String name;
	private Double salary;
	private String email;
	
	public Person(String name, Double salary, String email) {
		this.name = name;
		this.salary = salary;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Person class [name=" + name + ", salary=" + String.format("%.2f", salary) + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Person other) {
		return this.getSalary().compareTo(other.getSalary());
	}
	
	
	
	
}
