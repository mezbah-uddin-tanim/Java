
package Collection;


public class Student1 {
    public String name;
    public int id;
    public int MobileNo;
    public boolean isComplited;
    
    
    public void setInfo(String name, int id, int MobileNo, boolean isComplited) {
        this.name = name;
        this.id = id;
        this.MobileNo =MobileNo;
        this.isComplited = isComplited;
    }

    public String getInfo() {
        return "Student [Name: " + name + ", ID: " + id + ", Mobile No: " + MobileNo + ", Completed: " + isComplited + "]";
    }
}
