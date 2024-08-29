
public class Student {
	private  int id;
	private  String name;
	private  char gender;
	private  String branch;
	
	public  int getId() {
		return id;
	}
	public  boolean setId(int id) {
		if(id>=100000000 && id <=999999999)
		{
			this.id = id;
			return true;
		}
		return false;
		
	}
	public  String getName() {
		return name;
	}
	public  boolean setName(String name) {
		if (name.matches("[a-zA-Z]+"))
		{
            this.name = name;
            return true;
		}
		return false;
	}
	public  char getGender() {
		return gender;
	}
	public  boolean setGender(char gender) {
		if(gender == 'M' || gender =='F')
		{
			this.gender = gender;
			return true;
		}
		return false;
	}
	public  String getBranch() {
		return branch;
	}
	public  boolean setBranch(String branch) {
		if(branch.equals("BCA") || branch.equals("MCA"))
		{
			this.branch = branch;
			return true;
		}
		return false;
	}
	public String toString()
	{
		String res="";
		res = "Id: "+id+"\n"+"Name: "+name+"\n"+"Gender: "+gender+"\n"+"Branch: "+branch;
		return res;
	}
	
	
}
