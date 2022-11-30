package in.ashokit.beans;

public class DemoToTestPasswordUtilsDependency
{
	public static void main(String[] args) 
	{
		EncodeDecodeUtls edutls = new EncodeDecodeUtls();
		String encodedValue = edutls.encode("KaranKumar123");
		System.out.println("Encoded Vlaue is : : "+encodedValue);
		
		String decodedValue = edutls.decode(encodedValue);
		System.out.println("Decoded Vlaue is : : "+decodedValue);
	}

}
