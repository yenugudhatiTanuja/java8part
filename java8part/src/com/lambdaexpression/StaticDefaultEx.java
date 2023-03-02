package com.lambdaexpression;

/*class DefStaCla
{
	
}*/
public class StaticDefaultEx implements DefStaEx{
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefStaEx.display();
		StaticDefaultEx td=new StaticDefaultEx();
		td.show();
        td.message();
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("---Message---");
	}

}
