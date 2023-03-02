package java8part;
class CollectStudent 
{
	String name;
	String age;
	int  salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "CollectStudent [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}



