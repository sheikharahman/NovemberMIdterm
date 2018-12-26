package ClassFour;

public class testEncaptulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaptulation tes= new Encaptulation();
		tes.setCity("Jackson Heights");
		tes.setStID(100);
		tes.setStName("Rahman");
		tes.setZipCode(11372);
		System.out.println(tes.getCity() + ","+tes.getStID()+","+tes.getStName()+","+tes.getZipCode());
		Encaptulation enc = new Encaptulation("Sheikh",101,"Jackson Heights",11372);
		System.out.println(enc.getStName()+","+enc.getStID()+","+enc.getCity()+","+ 11375);

	}

}
