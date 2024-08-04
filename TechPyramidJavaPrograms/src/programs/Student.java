package programs;

public class Student {

	String name;
	int id;

	public Student() {

	}

	public Student(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}
	
	/* display method for student*/
	public void display() {

		System.out.println(id);
		System.out.println(name);

	}


	/* Overriding toString method */
	public String toString() {

		return name + "name" + id + "id";

	}

	/* Overriding equals method */
	public boolean equals(Object o) {

		Student p = (Student) o;

		if (this.name == p.name && this.id == p.id) {
			return true;
		} else {
			return false;
		}
	}
}