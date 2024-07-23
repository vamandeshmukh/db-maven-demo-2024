package com.db.demo.fundas;

import java.util.Objects;

public class Employee {

	private Integer eid;
	private String firstName;
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(Integer eid, String firstName) {
		super();
		this.eid = eid;
		this.firstName = firstName;
	}

	public Employee(Integer eid, String firstName, Double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, firstName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eid, other.eid) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
