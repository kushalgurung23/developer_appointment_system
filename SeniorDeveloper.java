 
/**
 * This is a child class which recieves the attributes from the parent class named Developer.
 * @author Kushal Gurung
 * @id 18029022
 * @Date 24 January, 2019
 */
public class SeniorDeveloper extends Developer
{
    //declaration of the attributes.
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private String contractPeriod;
    private int advanceSalary;
    private boolean appointed;
    private boolean terminated;
    //constructor with five parameters 
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, int salary, String contractPeriod)
    {
        super(platform, interviewerName, workingHours);//calling super class constructor
        this.salary=salary;//salary is initialized
        this.contractPeriod=contractPeriod;//contractPeriod is initialized
        joiningDate = "";//joiningDate is assigned an empty string
        staffRoomNumber = "";//staffRoomNumber is assigned an empty string
        advanceSalary = 0;//advanceSalary is assigned 0.0
        appointed = false;//appointed is assigned false
        terminated = false;//terminated is assigned false
    }
     
    public int getSalary()//accessor method 
    {
        return salary;//returns salary
    }
    
    public String getJoiningDate()//accessor method 
    {
        return joiningDate;//returns joiningDate
    }
    
    public String getStaffRoomNumber()//accessor method 
    {
        return staffRoomNumber;//returns staffRoomNumber
    }
    
    public String getContractPeriod()//accessor method
    {
        return contractPeriod;//returns contractPeriod
    }
    
    public double getAdvanceSalary()//accessor method 
    {
        return advanceSalary;//returns advanceSalary
    }   
    
    public boolean isAppointed()//accessor method 
    {
        return appointed;//returns appointed
    }
    
    public boolean isTerminated()//accessor method 
    {
        return terminated;//returns terminated
    }
    
    public void setSalary(int salary)//mutator method 
    {
        this.salary=salary;//sets new value of salary
    }
    
    public void setContractPeriod(String contractPeriod)//mutator method
    {
        this.contractPeriod=contractPeriod;//sets new value of contractPeriod 
    }
    //mutator method with four parameters
    public void hireDeveloper(String developerName, String joiningDate, int advanceSalary, String staffRoomNumber)
    {
        if(appointed)//if developer is appointed 
        {
            
            System.out.println("Developer is already appointed.");
            System.out.println(developerName+" is already appointed. The room number is "+staffRoomNumber);//displays developerName and staffRoomNumber
        }
        else 
        {     
            super.setDeveloperName(developerName);//calls setDeveloperName method from parent class
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed = true;//appointed assigned with true
            terminated = false;//terminated assigned with false
        }
    }
    
    public void setTermination()//sets values of attributes if contract is not terminated 
    {
        if(terminated) 
        {
            System.out.println("The developer's contract is terminated.");
        }
        else 
        {
            super.setDeveloperName("");//calls setDeveloperName method from parent class
            joiningDate="";
            advanceSalary=0;
            appointed=false;//appointed changed to false
            terminated=true;//terminated changed to true
        }
    }
    
    public void display()//This method displays values of platform, salary and interviewerName 
    {
        System.out.println("The platform is: "+getPlatform());
        System.out.println("The salary is: "+salary);
        System.out.println("The interviewer's name is: "+getInterviewerName());
    }
    
    public void displayDetails()//This method displays the values of attributes 
    {
        super.displayOutput();//calls displayOutput method from parent class
        if(appointed) 
        {
            System.out.println("Termination status is: "+isTerminated());
            System.out.println("The joining date is: "+getJoiningDate());
            System.out.println("Advanced salary is: "+getAdvanceSalary());
        }
    }
}
