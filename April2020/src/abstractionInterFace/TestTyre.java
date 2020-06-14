package abstractionInterFace;

public class TestTyre implements Tyre {


	public void countTyre() {
		
		System.out.println("countTyre");
		
	}

	
	public void colorTyre() {
		System.out.println("colorTyre");
		
	}
	
	public static void main(String[] args) {
		
		TestTyre tt = new TestTyre();
		tt.colorTyre();
		tt.countTyre();
		
	}


	@Override
	public void same() {
		// TODO Auto-generated method stub
		
	}

}
