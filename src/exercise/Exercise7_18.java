package exercise;

public class Exercise7_18 {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
	
	static void action(Robot arr) {
		if(arr instanceof DanceRobot ) {
			DanceRobot robot = (DanceRobot)arr;
			robot.dance();
			
		}else if( arr instanceof SingRobot ) {
			SingRobot robot = (SingRobot)arr;
			robot.sing();
			
		}else if( arr instanceof DrawRobot ){
			DrawRobot robot = (DrawRobot)arr;
			robot.draw();
		}
	}
}

class Robot{}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
