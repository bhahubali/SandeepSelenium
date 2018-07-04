package Programs;

public class RemoveJunk {

	public static void main(String[] args) {
	
		String s="@#$ sandeep012345 *&#$%";
		s=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);

	}

}
