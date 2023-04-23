package pkg6AbstractionInterface;

public  class Class6Interface implements Class5Interface, Class4Interface {

	@Override
	public void m2() {
		System.out.println("override m2 method");

	}

	@Override
	public void m3() {
		System.out.println("Override m3 method");
	}

	@Override
	public void m4() {
		System.out.println("Override m4 method");
	}

	@Override
	public void m5() {
		System.out.println("Override m5 method");

	}

	public void m6() {
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m5(int num) {
		// m5(int num) is overloaded method in Class5Interface but when we implements it override that method
		
	}

	@Override
	public void m11() {
//same method name and argument present in both implemented classes 		
	}

	

}
