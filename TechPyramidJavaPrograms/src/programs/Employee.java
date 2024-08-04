package programs;

import java.util.Objects;

public class Employee {

	int id;
	double sal;
	String department;

	private Employee() {
		super();
	}

	private Employee(int id, double sal, String department) {
		super();
		this.id = id;
		this.sal = sal;
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id, sal);
	}

	public boolean equals(Object obj) {

		Employee e = (Employee) obj;
		return this.id == e.id &&
				this.sal == e.sal &&
					this.department == e.department;

	}

}

