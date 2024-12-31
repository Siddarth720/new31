package Demo;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}


public class ExceptionDemo3 {

	public static void main(String[] args) {
	
	//	Student s1 = new Student(100,"Amar");
		try {
			Student s1 = null;


				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Student s2 = new Student(7242,"samba");
		
		System.out.println("Name------>"+s2.getName());
		System.out.println("Id---->"+s2.getId());
		
		Student s3 = new Student(7227,"Mamba");
		
		System.out.println("Name------>"+s3.getName());
		System.out.println("Id---->"+s3.getId());
		
		
	}

}