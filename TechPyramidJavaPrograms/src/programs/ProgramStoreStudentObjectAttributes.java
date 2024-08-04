package programs;


public class ProgramStoreStudentObjectAttributes {

	public static void main(String[] args) {

//	WAJP to store student object with attributes name, id in an array
		
		Student [] students = new Student [5];
		students[0]= new Student("Ram", 123);
		students[1]=new Student("Nakul", 453);
		students[2]= new Student("Rakesh", 163);
		students[3]=new Student("Somu", 473);
		students[4]= new Student("Mary", 183);

		System.out.println("Student #1===Details:");
		System.out.println("Name is: "+students[0].name);
		System.out.println("Id is: "+students[0].id);
		
		System.out.println("Student #2===Details:");
		System.out.println("Name is: "+students[1].name);
		System.out.println("Id is: "+students[1].id);
		
		System.out.println("Student #3===Details:");
		System.out.println("Name is: "+students[2].name);
		System.out.println("Id is: "+students[2].id);
		
		System.out.println("Student #3===Details:");
		System.out.println("Name is: "+students[3].name);
		System.out.println("Id is: "+students[3].id);
		
		System.out.println("Student #4===Details:");
		System.out.println("Name is: "+students[4].name);
		System.out.println("Id is: "+students[4].id);
		
		
		
	}

}
