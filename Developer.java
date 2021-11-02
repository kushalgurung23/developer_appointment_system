
/**
 * This is a parent class which has two child classes named SeniorDeveloper and JuniorDeveloper.
 * @author Kushal Gurung
 * @id 18029022
 * @Date 24 January, 2019
 */
public class Developer 
{
    //declaration of attributes of the class Developer
    private String platform;
    private String interviewerName;
    private String developerName;
    private float workingHours;
    //constructor with three parameters.
    public Developer(String platform, String interviewerName, float workingHours) 
    {
        this.platform=platform;//platform is initialized
        this.interviewerName=interviewerName;//interviewerName is initialized
        this.workingHours=workingHours;//workingHours is initialized
        developerName="";//developerName is assigned an empty string
    }
    
    public String getPlatform()//accessor method 
    {
        return platform;//returns platform
    }
    
    public String getInterviewerName()//accessor method 
    {
        return interviewerName;//returns interviewerName
    } 
    
    public float getWorkingHours()//accessor method 
    {
        return workingHours;//returns workingHours
    }
    
    public String getDeveloperName()//accessor method 
    {
        return developerName;//returns developerName
    }
    
    public void setDeveloperName(String newName) 
    {
        developerName=newName;//set new value of developerName
    }
    
    public void displayOutput() 
    {
        System.out.println("The platform is: "+getPlatform());//displays platform
        System.out.println("The interviewer's name: "+getInterviewerName());//displays interviewerName
        System.out.println("The working hours is: "+getWorkingHours()+" hours.");//displays workingHours
        if (developerName!="") 
        {
            System.out.println("Name of developer: "+getDeveloperName());//displays developerName
        }
    }
}