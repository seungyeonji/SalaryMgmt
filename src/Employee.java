
public class Employee {
	private String empno;	//멤버변수
	private int base, night, family, hopay, fampay, nightpay, total, salary;
	private String name, dname;
	
	public Employee() {	//기본생성자
		
	}

	public Employee(String empno, String name, int base, int night, int family) {		//생성자
		super();
		this.empno = empno;	//사원번호
		this.name = name;		//사원이름
		this.base = base;			//기본급
		this.night = night;		//야근시간
		this.family = family;		//가족수
	}

	//getter & setter
	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getHopay() {
		return hopay;
	}

	public void setHopay(int hopay) {
		this.hopay = hopay;
	}

	public int getFampay() {
		return fampay;
	}

	public void setFampay(int fampay) {
		this.fampay = fampay;
	}

	public int getNightpay() {
		return nightpay;
	}

	public void setNightpay(int nightpay) {
		this.nightpay = nightpay;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	//toString()
	@Override
	public String toString() {
		return String.format(
				"%-5s%5s%5s%5d%10d%7d%7d%10d%10d",
				empno, name, dname, base, hopay, fampay, nightpay, total, salary);
	}
}
