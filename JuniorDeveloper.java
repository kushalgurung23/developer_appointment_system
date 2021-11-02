
/**
 * This is a child class which recieves the attributes from the parent class named Developer.
 * @author Kushal Gurung
 * @id 18029022
 * Date 24 January, 2019
 */
public class JuniorDeveloper extends Developer
{
    //declaration of attributes of the class JuniorDeveloper
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    //constructor with six parameters where initialization of attributes takes place
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, int salary, String appointedBy, String terminationDate) 
    {
        super(platform, interviewerName, workingHours);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }
    
    public int getSalary() 
    {
        return salary;//returns salary
    }
    
    public String getAppointedDate() 
    {
        return appointedDate;//returns appointedDate
    }
    
    public String getEvaluationPeriod() 
    {
        return evaluationPeriod;//returns evaluationPeriod
    }
    
    public String getTerminationDate()
    {
        return terminationDate;//returns terminationDate
    }
    
    public String getSpecialization() 
    {
        return specialization;//returns specialization
    }
    
    public String getAppointedBy() 
    {
        return appointedBy;//returns appointedBy
    }
    
    public boolean isJoined() 
    {
        return joined;//returns joined
    }
    
    public void setSalary(int salary) 
    {
        if(!joined) 
        {
            this.salary=salary;//sets the value of salary
        }
        else 
        {
            System.out.println("Sorry, new salary cannot be assigned.");
        }
    }
    
    public void setPlatform(String developerName, String appointedDate, String terminationDate, String specialization) 
    {
        if(!joined) 
        {
            super.setDeveloperName(developerName);//setDeveloperName method of parent class is called
            joined=true;
        }
        else 
        {
            System.out.println(developerName+" is already appointed.");
            System.out.println("Appointed Date is: "+appointedDate);
        }
        this.terminationDate=terminationDate;//initialization of termiationDate
        this.specialization=specialization;//initialization of specialization 
        this.appointedDate=appointedDate;//initialization of appointedDate
    }
    
    public void displayDetails()//This method displays the values of attributes
    {
        super.displayOutput();//calls displayOutput method of parent class
        if(joined) 
        {
            System.out.println("The appointed date was: "+getAppointedDate());
            System.out.println("The developer's name is: "+ getDeveloperName());
            System.out.println("Evaluation period: "+getEvaluationPeriod());
            System.out.println("Termination date: "+getTerminationDate());
            System.out.println("Salary of developer: "+getSalary());
            System.out.println("Specialization of the developer: "+getSpecialization());
            System.out.println("Developer is appointed by:"+getAppointedBy());
        }
    }
}
