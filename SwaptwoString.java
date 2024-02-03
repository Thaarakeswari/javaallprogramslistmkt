package classwork;

public class SwaptwoString {

	public static void main(String[] args) {
		String s1="Archana";
		String s2="Bayary";



		s1=s1+s2;//ArchanaBayary


		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());//6

		System.out.println(s1);
		System.out.println(s2);


	}

}


