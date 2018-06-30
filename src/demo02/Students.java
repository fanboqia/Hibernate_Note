package demo02;

import java.util.HashSet;
import java.util.Set;

public class Students {
	private int id;
	private String name;
	private String sex;
	private Classroom room;
	private int classId;
	//private Set<Courses> courses = new HashSet<>();
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Classroom getRoom() {
		return room;
	}
	public void setRoom(Classroom room) {
		this.room = room;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
}
