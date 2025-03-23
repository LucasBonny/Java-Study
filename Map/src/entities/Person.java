package entities;

import java.util.Objects;

public class Person {
	private String name;
	private int qntvotes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQntvotes() {
		return qntvotes;
	}
	public void setQntvotes(int qntvotes) {
		this.qntvotes = qntvotes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, qntvotes);
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
		return Objects.equals(name, other.name) && qntvotes == other.qntvotes;
	}

	
}
