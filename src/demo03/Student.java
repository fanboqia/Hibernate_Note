package demo03;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private Set<Course> courseSet = new HashSet<>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<Course> getCourseSet() {
		return courseSet;
	}
	public void setCourseSet(Set<Course> courseSet) {
		this.courseSet = courseSet;
	}
}
