package com.my.Comparable;
/**
 * @author 丫丫
 *	Hashiset 添加一个学生类对象
 */
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int no;
	
	public Student(String name, int age, int no) {
		this.name = name;
		this.age = age;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", no=" + no + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.no == o.no){
			return 0;
		}else if(this.no < o.no){
			return 1;
		}else if(this.no > o.no){
			return -1;
		}
		return 0;
	}
	
	
	

}
