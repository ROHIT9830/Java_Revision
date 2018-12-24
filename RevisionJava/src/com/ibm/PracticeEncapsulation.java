package com.ibm;

class GetterSetter{
	
	private int eid;
	private String ename;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}

public class PracticeEncapsulation {

	public static void main(String[] args) {
		GetterSetter gs=new GetterSetter();
		gs.setEid(101);
		gs.setEname("Rohit Das");
		System.out.println("My Emp. Id is "+gs.getEid()+" and my name is "+gs.getEname());
	}

}
