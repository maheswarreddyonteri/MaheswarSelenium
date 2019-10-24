package oops1;

public class AccountDetails {
	
	private String AcctName;
	private int age;
	private String AcctType;
	private int AcctNumber;
	private String IFSC;
	
	public void setAcctName(String AcctName) {
		
		this.AcctName= AcctName;
	}
	 public void setage(int age) {
		this.age= age;
	 }
public void setAcctType(String AcctType) {
	this.AcctType= AcctType;
}
public void setAcctNumber(int AcctNumber) {
	this.AcctNumber= AcctNumber;
}
public void setIFSC(String IFSC) {
	this.IFSC= IFSC;
}
public String getAcctName() {
	return AcctName;
}
public  int getage() {
	return age;
}
public String getAcctType() {
	return AcctType;
}
public int getAcctNumber() {
	return AcctNumber;
}
	public String getIFSC() {
		return IFSC;
	}

	public static void main(String[] args) {
	AccountDetails obj= new AccountDetails();
	obj.setAcctName("maheswar");
	obj.setage(23);
	obj.setAcctType("SavingsAccount");
	
	System.out.println("account name is:" +obj.AcctName);
	System.out.println("age is:" +obj.age);
	System.out.println("account type is:" +obj.AcctType);

	AccountDetails obj1 = new AccountDetails();
	obj1.setAcctName("anjani");
	obj1.setage(20);
	obj1.setAcctType("SavigsAccount");
	
	System.out.println("account name is:" +obj1.AcctName);
	System.out.println("age is:" +obj1.age);
	System.out.println("account type is:" +obj1.AcctType);

	
	}

}
