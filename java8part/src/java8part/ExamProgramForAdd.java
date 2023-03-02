package java8part;
class ExAdd
{
	void add1(int a,int b)
	{
		System.out.println("Add1---->"+(a+b));
	}
	int add2(int a,int b)
	{
		return a+b;
	}
	static int add3(int a,int b)
	{
		return a+b;
	}
}
public class ExamProgramForAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExAdd f= new ExAdd();
		int s=f.add2(4, 5);
		f.add1(2, 2);
		int y=ExAdd.add3(8, 8);
		System.out.println("Add2----->"+s+"\nAdd3------->"+y);

	}

}
