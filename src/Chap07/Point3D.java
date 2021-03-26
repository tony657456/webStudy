package Chap07;

public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}

	// this와 마찬가지로 super 붙이지 않고 메서드를 호출
	
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation() + ", z :" +z;
	}
	
//	public String getLocation() {
//		// TODO Auto-generated method stub
//		return getLocation() + ", z :" +z;
//	}
	
	
}
