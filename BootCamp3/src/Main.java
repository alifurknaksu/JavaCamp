public class Main {

	public static void main(final String[] args) {

		final StudentManager studentManager = new StudentManager();

		final Student student = new Student("ali@ali.com", 1, "Ali Furkan Aksu", "155", 99);
		studentManager.add(student);
		student.setName("Ali Furkan Aksu");
		studentManager.update(student);
		studentManager.delete(student);
		
		System.out.println("Name ="+
				student.getName()+ " " + "Id= "+
				student.getId());

		final InstructorManager instructorManager = new InstructorManager();

		final Instructor instructor = new Instructor("engin@kodlamaio.com", 1, "Engin Demiroğ", "001", 445, 100);
		instructorManager.add(instructor);
		instructor.setName("Engin Demiroğ");
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		
		System.out.println("Name = "+
				instructor.getName()+ " " + "Id =" + 
				instructor.getId());
	}

}