package classwork;

class Amazon
{
	private int otp=1234; //updated to 555
	private String pwd="123@thaara";

public void setotp(int otp) //syntax of setter method
{
	this.otp=otp;
}

public int getotp() //syntax of getter method
{
	return otp;
}

public void setpwd(String pwd) {
	this.pwd=pwd;
}

public String getpwd()
{
	return pwd;
}
}

public class Encpaulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon a1=new Amazon();
		a1.setotp(555); //setting otp
		System.out.println(a1.getotp()); //retrieving output
		
		a1.setpwd("thaara@1243455556");
		System.out.println(a1.getpwd());

	}

}

