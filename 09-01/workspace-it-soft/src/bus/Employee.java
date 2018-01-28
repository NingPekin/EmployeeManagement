package bus;

import bus.EnumType.Type;
import java.io.Serializable;
public class Employee implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6666791834628502219L;
	private int id;
	private String fn;
	private String ln;
	private int sin;
	private String email;
	private String address;
	private int telephone;
	private EnumType.Type type;
	private EnumType.Performance performance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) throws MyException 
	{
		Validation.validName(fn);
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) throws MyException {
		Validation.validName(ln);
		this.ln = ln;
	}

	public int getSin() {
		
		return sin;
	}
	public void setSin(int sin) throws MyException {
		Validation.validSIN(String.valueOf(sin));
		this.sin = sin;
	}
	public String getEmail() {

		return email;
	}
	public void setEmail(String email)throws MyException  {
		Validation.validEmail(email);
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) throws MyException {
		Validation.negativeNumberException(telephone);
		this.telephone = telephone;
	}
	public EnumType.Type getType() {
		return type;
	}
	public void setType(EnumType.Type type) {
		this.type = type;
	}

	public EnumType.Performance getPerformance() {
		return performance;
	}
	public void setPerformance(EnumType.Performance performance) {
		this.performance = performance;
	}
	public Employee() {
		super();
	}

	public Employee(int id, String fn, String ln, int sin, String email,
			String address, int telephone, Type type, EnumType.Performance performance) {
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
		this.sin = sin;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
		this.type = type;
		this.setPerformance(performance);
	}
	public double Bonus()
	{
		double bonus=0.00;
		return bonus;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fn=" + fn + ", ln=" + ln + ", sin="
				+ sin + ", email=" + email + ", address=" + address
				+ ", telephone=" + telephone + ", type=" + type + ", performance="+getPerformance()+"]";
	}


		

	

}
