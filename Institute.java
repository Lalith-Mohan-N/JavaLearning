public class Institute {
    static int totalInstitute;
    static int maxDept;
    public int classroom;
    public int totalStudInClass;
    public String DeptName;
    public int totalDepartment;
    public int totalClasses;
    public int totalStaff;
    public int staff=4;
    public int maxStudent;
    public int students =0;
    static{
        totalInstitute=0;
    }
    {
        totalInstitute++;
    }
     

    Institute(int totalDepartment,int classroom,int staff){
        maxDept=6;
        this.totalDepartment=totalDepartment;
        maxStudent=600;
    }
    Institute(int totalDepartment){
       this(totalDepartment, 0,4);
    }
    public int Dept(String DeptName){
        if(totalDepartment<=maxDept){
            System.out.println("Your Department "+ DeptName+" crtead sucessfully : ");
            totalDepartment++;
        }else{
            System.out.println("Maximum departments reacheed \nplease remove any one of department to add new department ");
        }
        return totalDepartment;
    }
    int classRoom(int students){
        if(students==maxStudent){
            System.out.println("Maximum Students for the class is filled !\nplease join for other department");
        }
        else{
            System.out.println(students+" student's are joinedn to "+this.DeptName+" Department");
            this.students+=students;
        }
        return students;
    }
    public static void main(String[] args) {
        
    }
}
