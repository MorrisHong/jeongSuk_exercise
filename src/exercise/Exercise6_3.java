package exercise;

public class Exercise6_3 {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}
class Student{
	String name;
	int ban, no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name +","+ ban + "," + no + "," +kor + "," +eng + "," +math + "," +getTotal() + "," +getAverage();
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		float avg = (int)((getTotal() / 3f) * 10 + 0.5f) / 10f;
		return avg;
	}
}
