/**
 * This is RigoTechnology class.
 * @Author Kushal Gurung
 * @London Met ID 18029022
 * @Date 17 April, 2019
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RigoTechnology
{
    //Declaration of labels for panel of JuniorDeveloper
    private JLabel platformLabelJD;
    private JLabel workingHoursLabel1JD;
    private JLabel developerNumberLabelJD;
    private JLabel developersNameLabelJD;
    private JLabel specializationLabelJD;
    private JLabel interviewersNameLabelJD;
    private JLabel appointedDateLabelJD;
    private JLabel appointedByLabelJD;
    private JLabel terminationDateLabelJD;
    private JLabel evaluationPeriodLabel1JD;
    private JLabel salaryLabel1JD;

    //Declaration of textfields for panel of JuniorDeveloper
    private JTextField platformTextFieldJD;
    private JTextField workingHours1TextFieldJD;
    private JTextField developerNumberTextFieldJD;
    private JTextField developerNameTextFieldJD;
    private JTextField specializationTextFieldJD;
    private JTextField interviewerNameTextFieldJD;
    private JTextField appointedByTextFieldJD;
    private JTextField appointedDateTextFieldJD;
    private JTextField terminationDateTextFieldJD;
    private JTextField evaluationPeriod1TextFieldJD;
    private JTextField salary1TextFieldJD;

    //Declaration of buttons for panel of JuniorDeveloper
    private JButton addIntoJuniorDeveloperButton;
    private JButton clearJuniorDeveloperButton;
    private JButton appointJuniorDeveloperButton;
    private JButton displayJuniorDeveloperButton;

    //Declaration of labels for panel of SeniorDeveloper
    private JLabel platformLabelSD;
    private JLabel developerNumberLabelSD;
    private JLabel developersNameLabelSD;
    private JLabel interviewersNameLabelSD;
    private JLabel advanceSalaryLabelSD;
    private JLabel contractPeriodLabelSD;
    private JLabel workingHoursLabelSD;
    private JLabel joiningDateLabelSD;
    private JLabel staffRoomNumberLabelSD;
    private JLabel salaryLabelSD;

    //Declaration of textfields for panel of SeniorDeveloper
    private JTextField platformTextFieldSD;
    private JTextField developerNumberTextFieldSD;
    private JTextField developerNameTextFieldSD;
    private JTextField interviewerNameTextFieldSD;
    private JTextField advanceSalaryTextFieldSD;
    private JTextField contractPeriod2TextFieldSD;
    private JTextField workingHoursTextFieldSD;
    private JTextField joiningDateTextFieldSD;
    private JTextField staffRoomNumberTextFieldSD;
    private JTextField salaryTextFieldSD;

    //Declaration of buttons for panel of SeniorDeveloper
    private JButton addIntoSeniorDeveloperButton;
    private JButton appointSeniorDeveloperButton;
    private JButton terminateContractButton;
    private JButton clearSeniorDeveloperButton;
    private JButton displaySeniorDeveloperButton;

    //Declaration and initialization of an array list
    private ArrayList<Developer> arrayObj  = new ArrayList<Developer>();

    //Declaration of remaining UI elements (Widgets)
    private JFrame mainFrame;
    private JTextArea textArea;
    private JPanel panelJD;
    private JPanel panelSD;
    private TitledBorder titledBorder;
    private TitledBorder titledBorder2;

    public RigoTechnology()
    {
        //mainFrame is the main frame where panel1 and panel2 are displayed.
        mainFrame = new JFrame("Appointment System");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 500);

        GridLayout gl = new GridLayout(2,2);
        mainFrame.setLayout(gl); //Setting mainFrame in GridLayout.

        //Initialization of panelJD.
        panelJD = new JPanel();
        panelJD.setSize(300, 300);

        //Initialization of panelSD.
        panelSD = new JPanel();
        panelSD.setSize(300, 300);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(10, 30, 10, 30);

        //Initialization of titledBorder.
        titledBorder = new TitledBorder("Junior Developer");
        titledBorder.setTitleJustification(TitledBorder.CENTER);
        titledBorder.setTitlePosition(TitledBorder.TOP);

        panelJD.setLayout(layout); //panelJD is set in GridBagLayout.
        panelJD.setBackground(Color.pink);
        panelJD.setBorder(titledBorder);

        //Initialization of labels and textfields of panelJD and adding in panelJD.
        platformLabelJD = new JLabel( "Platform: ");
        gbc1.gridx=2;
        gbc1.gridy=0;
        platformLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(platformLabelJD, gbc1);

        platformTextFieldJD = new JTextField(20);
        gbc1.gridx=3;
        gbc1.gridy=0;
        panelJD.add(platformTextFieldJD, gbc1);

        developerNumberLabelJD = new JLabel("Developer Number: ");
        gbc1.gridx = 2;
        gbc1.gridy = 1;
        developerNumberLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(developerNumberLabelJD, gbc1);

        developerNumberTextFieldJD = new JTextField(20);
        gbc1.gridx = 3;
        gbc1.gridy = 1;
        panelJD.add(developerNumberTextFieldJD, gbc1);

        developersNameLabelJD = new JLabel("Developer's Name: ");
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        developersNameLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(developersNameLabelJD, gbc1);

        developerNameTextFieldJD = new JTextField(20);
        gbc1.gridx = 1;
        gbc1.gridy = 2;
        panelJD.add(developerNameTextFieldJD, gbc1);

        appointedByLabelJD = new JLabel("Appointed By: ");
        gbc1.gridx=3;
        gbc1.gridy=2;
        appointedByLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(appointedByLabelJD, gbc1);

        appointedByTextFieldJD = new JTextField(20);
        gbc1.gridx=4;
        gbc1.gridy=2;
        panelJD.add(appointedByTextFieldJD, gbc1);

        interviewersNameLabelJD = new JLabel("Interviewer's Name: ");
        gbc1.gridx=0;
        gbc1.gridy=3;
        interviewersNameLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(interviewersNameLabelJD, gbc1);

        interviewerNameTextFieldJD = new JTextField(20);
        gbc1.gridx=1;
        gbc1.gridy=3;
        panelJD.add(interviewerNameTextFieldJD, gbc1);

        appointedDateLabelJD = new JLabel("Appointed Date: ");
        gbc1.gridx = 3;
        gbc1.gridy = 3;
        appointedDateLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(appointedDateLabelJD, gbc1);

        appointedDateTextFieldJD = new JTextField(20);
        gbc1.gridx = 4;
        gbc1.gridy = 3;
        panelJD.add(appointedDateTextFieldJD, gbc1);

        specializationLabelJD = new JLabel("Specialization: ");
        gbc1.gridx = 0;
        gbc1.gridy = 4;
        specializationLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(specializationLabelJD, gbc1);

        specializationTextFieldJD = new JTextField(20);
        gbc1.gridx = 1;
        gbc1.gridy = 4;
        panelJD.add(specializationTextFieldJD, gbc1);

        evaluationPeriodLabel1JD = new JLabel("Evaluation Period: ");
        gbc1.gridx=3;
        gbc1.gridy=4;
        evaluationPeriodLabel1JD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(evaluationPeriodLabel1JD, gbc1);

        evaluationPeriod1TextFieldJD = new JTextField(20);
        gbc1.gridx=4;
        gbc1.gridy=4;
        panelJD.add(evaluationPeriod1TextFieldJD, gbc1);

        salaryLabel1JD = new JLabel("Salary: ");
        gbc1.gridx=3;
        gbc1.gridy=5;
        salaryLabel1JD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(salaryLabel1JD, gbc1);

        salary1TextFieldJD = new JTextField(20);
        gbc1.gridx=4;
        gbc1.gridy=5;
        panelJD.add(salary1TextFieldJD, gbc1);

        terminationDateLabelJD = new JLabel("Termination Date: ");
        gbc1.gridx = 0;
        gbc1.gridy = 5;
        terminationDateLabelJD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(terminationDateLabelJD, gbc1);

        terminationDateTextFieldJD = new JTextField(20);
        gbc1.gridx = 1;
        gbc1.gridy = 5;
        panelJD.add(terminationDateTextFieldJD, gbc1);

        workingHoursLabel1JD = new JLabel("Working Hours per Day: ");
        gbc1.gridx=0;
        gbc1.gridy=6;
        workingHoursLabel1JD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelJD.add(workingHoursLabel1JD, gbc1);

        workingHours1TextFieldJD = new JTextField(20);
        gbc1.gridx=1;
        gbc1.gridy=6;
        panelJD.add(workingHours1TextFieldJD, gbc1);

        //Initializing all the four buttons of panelJD and their addition in panelJD.

        addIntoJuniorDeveloperButton = new JButton("Add Junior Developer");
        gbc1.gridx=0;
        gbc1.gridy=7;
        addIntoJuniorDeveloperButton.setBackground(Color.lightGray);
        panelJD.add(addIntoJuniorDeveloperButton, gbc1);

        appointJuniorDeveloperButton = new JButton("Appoint Junior Developer");
        gbc1.gridx = 1;
        gbc1.gridy = 7;
        appointJuniorDeveloperButton.setBackground(Color.lightGray);
        panelJD.add(appointJuniorDeveloperButton, gbc1);

        clearJuniorDeveloperButton = new JButton("Clear");
        gbc1.gridx =3;
        gbc1.gridy =7;
        clearJuniorDeveloperButton.setBackground(Color.lightGray);
        panelJD.add(clearJuniorDeveloperButton, gbc1);

        displayJuniorDeveloperButton = new JButton("Display");
        gbc1.gridx=4;
        gbc1.gridy=7;
        displayJuniorDeveloperButton.setBackground(Color.lightGray);
        panelJD.add(displayJuniorDeveloperButton, gbc1);

        //Adding actionListerners to all the four buttons of panelJD.

        addIntoJuniorDeveloperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // calling addJuniorDeveloper() method.
                addJuniorDeveloper();
            }
        });

        appointJuniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling appointJuniorDeveloper() method.
                appointJuniorDeveloper();
            }
        });

        clearJuniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling clearJuniorDeveloper() method.
                clearJuniorDeveloper();
            }
        });

        displayJuniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Calling displayJuniorDeveloper() method.
                displayJuniorDeveloper();
            }
        });

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(10,30, 10, 30);

        titledBorder2 = new TitledBorder("Senior Developer");
        titledBorder2.setTitleJustification(TitledBorder.CENTER);
        titledBorder2.setTitlePosition(TitledBorder.TOP);

        //panelSD is set to GridBagLayout.
        panelSD.setLayout(layout);
        panelSD.setBackground(Color.CYAN);
        panelSD.setBorder(titledBorder2);

        //Initialization of all labels and panels of panelSD and their addition in panelSD.
        platformLabelSD = new JLabel("Platform: ");
        gbc2.gridx=2;
        gbc2.gridy=0;
        platformLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(platformLabelSD, gbc2);

        platformTextFieldSD = new JTextField(20);
        gbc2.gridx=3;
        gbc2.gridy=0;
        panelSD.add(platformTextFieldSD, gbc2);

        developerNumberLabelSD = new JLabel("Developer's Number: ");
        gbc2.gridx = 2;
        gbc2.gridy = 1;
        developerNumberLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(developerNumberLabelSD, gbc2);

        developerNumberTextFieldSD = new JTextField(20);
        gbc2.gridx = 3;
        gbc2.gridy = 1;
        panelSD.add(developerNumberTextFieldSD, gbc2);

        developersNameLabelSD = new JLabel("Developer's Name: ");
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        developersNameLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(developersNameLabelSD, gbc2);

        developerNameTextFieldSD = new JTextField(20);
        gbc2.gridx = 1;
        gbc2.gridy = 2;
        panelSD.add(developerNameTextFieldSD, gbc2);

        workingHoursLabelSD = new JLabel("Working Hours Per Day: ");
        gbc2.gridx=3;
        gbc2.gridy=2;
        workingHoursLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(workingHoursLabelSD, gbc2);

        workingHoursTextFieldSD = new JTextField(20);
        gbc2.gridx=4;
        gbc2.gridy=2;
        panelSD.add(workingHoursTextFieldSD, gbc2);

        interviewersNameLabelSD = new JLabel("Interviewer's Name: ");
        gbc2.gridx=0;
        gbc2.gridy=3;
        interviewersNameLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(interviewersNameLabelSD, gbc2);

        interviewerNameTextFieldSD = new JTextField(20);
        gbc2.gridx=1;
        gbc2.gridy=3;
        panelSD.add(interviewerNameTextFieldSD, gbc2);

        joiningDateLabelSD = new JLabel("Joining Date: ");
        gbc2.gridx = 3;
        gbc2.gridy = 3;
        joiningDateLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(joiningDateLabelSD, gbc2);

        joiningDateTextFieldSD = new JTextField(20);
        gbc2.gridx = 4;
        gbc2.gridy = 3;
        panelSD.add(joiningDateTextFieldSD, gbc2);

        advanceSalaryLabelSD = new JLabel("Advance Salary: ");
        gbc2.gridx = 0;
        gbc2.gridy = 4;
        advanceSalaryLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(advanceSalaryLabelSD, gbc2);

        advanceSalaryTextFieldSD = new JTextField(20);
        gbc2.gridx = 1;
        gbc2.gridy = 4;
        panelSD.add(advanceSalaryTextFieldSD, gbc2);

        staffRoomNumberLabelSD = new JLabel("Staff Room Number: ");
        gbc2.gridx = 3;
        gbc2.gridy = 4;
        staffRoomNumberLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(staffRoomNumberLabelSD, gbc2);

        staffRoomNumberTextFieldSD = new JTextField(20);
        gbc2.gridx = 4;
        gbc2.gridy = 4;
        panelSD.add(staffRoomNumberTextFieldSD, gbc2);

        contractPeriodLabelSD = new JLabel("Contract Period: ");
        gbc2.gridx=0;
        gbc2.gridy=5;
        contractPeriodLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(contractPeriodLabelSD, gbc2);

        contractPeriod2TextFieldSD = new JTextField(20);
        gbc2.gridx=1;
        gbc2.gridy=5;
        panelSD.add(contractPeriod2TextFieldSD, gbc2);

        salaryLabelSD = new JLabel("Salary: ");
        gbc2.gridx=3;
        gbc2.gridy=5;
        salaryLabelSD.setFont(new Font("Georgia", Font.BOLD, 14));
        panelSD.add(salaryLabelSD, gbc2);

        salaryTextFieldSD = new JTextField(20);
        gbc2.gridx=4;
        gbc2.gridy=5;
        panelSD.add(salaryTextFieldSD, gbc2);

        //Initialization of all five buttons of panelSD and their addition in panelSD.

        addIntoSeniorDeveloperButton = new JButton("Add Senior Developer");
        gbc2.gridx=0;
        gbc2.gridy=7;
        addIntoSeniorDeveloperButton.setBackground(Color.lightGray);
        panelSD.add(addIntoSeniorDeveloperButton, gbc2);

        appointSeniorDeveloperButton = new JButton("Appoint Senior Developer");
        gbc2.gridx=1;
        gbc2.gridy=7;
        appointSeniorDeveloperButton.setBackground(Color.lightGray);
        panelSD.add(appointSeniorDeveloperButton, gbc2);

        terminateContractButton = new JButton("Terminate Contract");
        gbc2.gridx=2;
        gbc2.gridy=7;
        terminateContractButton.setBackground(Color.lightGray);
        panelSD.add(terminateContractButton, gbc2);

        clearSeniorDeveloperButton = new JButton("Clear");
        gbc2.gridx=3;
        gbc2.gridy=7;
        clearSeniorDeveloperButton.setBackground(Color.lightGray);
        panelSD.add(clearSeniorDeveloperButton, gbc2);

        displaySeniorDeveloperButton = new JButton("Display");
        gbc2.gridx=4;
        gbc2.gridy=7;
        displaySeniorDeveloperButton.setBackground(Color.lightGray);
        panelSD.add(displaySeniorDeveloperButton, gbc2);

        //Adding ActionListeners to all five buttons of panelSD.

        addIntoSeniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling addSeniorDeveloper() method.
               addSeniorDeveloper();
            }
        });

        terminateContractButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling terminateSeniorDeveloperContract() method.
               terminateSeniorDeveloperContract();
            }
        });

        appointSeniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling ppointSeniorDeveloper() method.
                appointSeniorDeveloper();
            }
        });

        clearSeniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling clearSeniorDeveloper() method.
                clearSeniorDeveloper();
            }
        });

        displaySeniorDeveloperButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //calling displaySeniorDeveloper() method.
                displaySeniorDeveloper();
            }

        });
        //Adding panelJD and panelSD in mainFrame.
        mainFrame.add(panelJD);
        mainFrame.add(panelSD);
    }
            //This method is used for adding JuniorDeveloper.
    public void addJuniorDeveloper()
    {
        if(platformTextFieldJD.getText().equals("") || interviewerNameTextFieldJD.getText().equals("") || workingHours1TextFieldJD.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill the textfiled of platform, interviewer's name and working hour to add junior developer.");
            //The value of developer number textfield will assigned with -1.
            developerNumberTextFieldJD.setText("-1");
        }
        else{
            try{
                if(Integer.parseInt(workingHours1TextFieldJD.getText())>0 && Integer.parseInt(workingHours1TextFieldJD.getText())<23)
                {
                    //Declaring and initializing the object of JuniorDeveloper class.
                    JuniorDeveloper juniorObject = new JuniorDeveloper(platformTextFieldJD.getText(), interviewerNameTextFieldJD.getText(), Integer.parseInt(workingHours1TextFieldJD.getText()), 0 , appointedByTextFieldJD.getText(), terminationDateTextFieldJD.getText());
                    //adding juniorObject in the object of array list, i.e. arrayObj.
                    arrayObj.add(juniorObject);
                    JOptionPane.showMessageDialog(null, "Junior Developer is successfully added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter correct value in working hours.");
                }
            }
            catch(NumberFormatException f)
            {
                JOptionPane.showMessageDialog(null, "Please enter the value of working hour in a whole number.");
                developerNumberTextFieldJD.setText("-1");
            }
            catch(IndexOutOfBoundsException h)
            {
                JOptionPane.showMessageDialog(null, "Please enter a new developer number.");
            }
            catch(Exception g)
            {
                JOptionPane.showMessageDialog(null, "An error has occured while adding the information. Please add again.");
                developerNumberTextFieldJD.setText("-1");
            }
        }
    }
            //This method is used to appoint JuniorDeveloper.
    public void appointJuniorDeveloper()
    {
        if (developerNumberTextFieldJD.getText().equals("") || developerNameTextFieldJD.getText().equals("") || appointedDateTextFieldJD.getText().equals(""))
        {
            developerNumberTextFieldJD.setText("-1");
            JOptionPane.showMessageDialog(null, "Please enter all the textfields to appoint junior developer.");
        }
        else
        {
            try
            {
                int i = Integer.parseInt(developerNumberTextFieldJD.getText());
                if (i>-1)
                {
                    if (arrayObj.get(i) instanceof JuniorDeveloper)
                    {
                        JuniorDeveloper enteredValue = (JuniorDeveloper) arrayObj.get(i);
                        String dName = developerNameTextFieldJD.getText();
                        String aDate = appointedDateTextFieldJD.getText();
                        String tDate = terminationDateTextFieldJD.getText();
                        String specializationVariable = specializationTextFieldJD.getText();

                        enteredValue.setPlatform(dName, aDate, tDate, specializationVariable);
                        JOptionPane.showMessageDialog(null, "Junior Developer is appointed successfully.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a new developer number.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter zero or positive value of developer number.");
                }
            }

            catch (NumberFormatException f)
            {
                JOptionPane.showMessageDialog(null, "Please only enter number in developer number.");
                developerNumberTextFieldJD.setText("-1");
            }
            catch(IndexOutOfBoundsException h)
            {
                JOptionPane.showMessageDialog(null, "Junior developer of this developer number doesn't exist. Please enter correct developer number.");
            }

            catch (Exception g)
            {
                developerNumberTextFieldJD.setText("-1");
                JOptionPane.showMessageDialog(null, "Junior Developer is not appointed. Please appoint with correct developer number.");
            }
        }
    }
        //This method is used to clear all the textfields of panelJD.
    public void clearJuniorDeveloper()
    {
        //Assigns the value of all textfield of panelJD with "".
        platformTextFieldJD.setText("");
        developerNumberTextFieldJD.setText("");
        developerNameTextFieldJD.setText("");
        interviewerNameTextFieldJD.setText("");
        specializationTextFieldJD.setText("");
        workingHours1TextFieldJD.setText("");
        appointedByTextFieldJD.setText("");
        appointedDateTextFieldJD.setText("");
        evaluationPeriod1TextFieldJD.setText("");
        salary1TextFieldJD.setText("");
        terminationDateTextFieldJD.setText("");
    }
        //This method is used for displaying all the values in a new JFrame "displayFrame" which were entered in textfield of panelJD.
    public void displayJuniorDeveloper()
    {
        //Initializing textArea
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial",Font.BOLD, 14));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JFrame displayFrame = new JFrame("Junior Developer Display");

        //Adding scrollPane in dispayFrame
        displayFrame.add(scrollPane);
        displayFrame.setSize(2000,2000);

        try
        {
            for(int i=0; i<arrayObj.size(); i++)
            {
                if(arrayObj.get(i) instanceof JuniorDeveloper)
                {
                    JuniorDeveloper obj = (JuniorDeveloper) arrayObj.get(i);
                    textArea.append(">>>>>>>>>>>>>>>>>>>> [Junior Developer Display] <<<<<<<<<<<<<<<<<<<<"+"\n\n");
                    textArea.append("Developer Number: "+i+"\n");
                    textArea.append("Developer Name: "+obj.getDeveloperName()+"\n");
                    textArea.append("Platform: "+obj.getPlatform()+"\n");
                    textArea.append("Interviewer Name: "+obj.getInterviewerName()+"\n");
                    textArea.append("Working Hours: "+obj.getWorkingHours()+"\n");
                    textArea.append("Specialization: "+obj.getSpecialization()+"\n");
                    textArea.append("Appointed Date: "+obj.getAppointedDate()+"\n");
                    textArea.append("Appointed By: "+obj.getAppointedBy()+"\n");
                    textArea.append("Evaluation Period: "+evaluationPeriod1TextFieldJD.getText()+"\n");
                    textArea.append("Salary: "+obj.getSalary()+"\n");
                    textArea.append("Termination Date: "+obj.getTerminationDate()+"\n");
                    textArea.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+"\n\n");
                }
            }
        }
        catch(Exception f)
        {
            JOptionPane.showMessageDialog(null, "Sorry, there was an error while displaying Junior Developer.");
        }
        displayFrame.setVisible(true);
    }

    //This method is used for adding SeniorDeveloper.
    public void addSeniorDeveloper()
    {
        if(platformTextFieldSD.getText().equals("") || interviewerNameTextFieldSD.getText().equals("") || workingHoursTextFieldSD.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill platform, interviewer's name and working hours to add senior developer.");
            developerNumberTextFieldSD.setText("-1");
        }
        else{
            try{
                if(Integer.parseInt(workingHoursTextFieldSD.getText())>0 && Integer.parseInt(workingHoursTextFieldSD.getText())<23)
                {
                    SeniorDeveloper seniorObject = new SeniorDeveloper(platformTextFieldSD.getText(), interviewerNameTextFieldSD.getText(), Integer.parseInt(workingHoursTextFieldSD.getText()), 0 , contractPeriod2TextFieldSD.getText());
                    arrayObj.add(seniorObject);
                    JOptionPane.showMessageDialog(null, "Senior Developer is successfully added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter correct value in working hours");
                }
            }
            catch(NumberFormatException f)
            {
                JOptionPane.showMessageDialog(null, "Please enter the value of working hours in whole number.");
                developerNumberTextFieldSD.setText("-1");
            }
            catch(IndexOutOfBoundsException h)
            {
                JOptionPane.showMessageDialog(null, "Please insert the value of developer number zero or above.");
            }
            catch(Exception g)
            {
                JOptionPane.showMessageDialog(null, "An error has occured while adding the information. Please add again.");
                developerNumberTextFieldSD.setText("-1");
            }
        }
    }
        //This method terminates the contract of seniorDeveloper.
    public void terminateSeniorDeveloperContract()
    {
        if(developerNumberTextFieldSD.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter correct developer number.");
        }
        else {
            try {
                if (arrayObj.get(Integer.parseInt(developerNumberTextFieldSD.getText())) instanceof SeniorDeveloper)
                {
                    if (Integer.parseInt(developerNumberTextFieldSD.getText()) > -1)
                    {
                        //Storing the object of certain index of array list in the object of Senior Developer.
                        SeniorDeveloper seniorObject = (SeniorDeveloper) arrayObj.get(Integer.parseInt(developerNumberTextFieldSD.getText()));
                        seniorObject.setTermination();
                        JOptionPane.showMessageDialog(null, "Contract of Senior developer is terminated successfully.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter correct developer number.");
                }
            } catch (NumberFormatException f)
            {
                JOptionPane.showMessageDialog(null, "Please enter zero or positive value in developer number.");
                developerNumberTextFieldSD.setText("-1");
            } catch (Exception g)
            {
                JOptionPane.showMessageDialog(null, "Sorry an error has occured while terminating senior developer's contract.");
                developerNumberTextFieldSD.setText("-1");
            }
        }
    }

    //This method is used to appoint SeniorDeveloper.
    public void appointSeniorDeveloper()
    {
        if(developerNumberTextFieldSD.getText().equals("") || developerNameTextFieldSD.getText().equals("") || joiningDateTextFieldSD.getText().equals(""))
        {
            developerNumberTextFieldSD.setText("-1");
            JOptionPane.showMessageDialog(null, "Please enter all the texfields to appoint Senior developer.");
        }
        else
        {
            try {
                int i = Integer.parseInt(developerNumberTextFieldSD.getText());
                if (i > -1)
                {
                    if (arrayObj.get(i) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper enteredValue = (SeniorDeveloper) arrayObj.get(i);
                        String dName = developerNameTextFieldSD.getText();
                        String jDate = joiningDateTextFieldSD.getText();
                        int aSalary = Integer.parseInt(advanceSalaryTextFieldSD.getText());
                        String sRoomNumber = staffRoomNumberTextFieldSD.getText();
                        enteredValue.hireDeveloper(dName, jDate, aSalary, sRoomNumber);
                        JOptionPane.showMessageDialog(null, "Senior Developer is appointed successfully.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter correct developer number.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "please enter zero or positive number in developer number.");
                }
            }
            catch(NumberFormatException f)
            {
                JOptionPane.showMessageDialog(null, "The value entered in developer number or advance salary is wrong. Please enter number in these fields and try again.");
                developerNumberTextFieldSD.setText("-1");
            }
            catch(IndexOutOfBoundsException h)
            {
                JOptionPane.showMessageDialog(null, "Senior developer of this developer number doesn't exist. Please enter correct developer number.");
            }
            catch(Exception g)
            {
                JOptionPane.showMessageDialog(null, "Sorry, there was an error while appointing Senior Developer.");
            }
        }
    }

    //This method is used to clear all the textfields of panelSD.
    public void clearSeniorDeveloper()
    {
        platformTextFieldSD.setText("");
        interviewerNameTextFieldSD.setText("");
        workingHoursTextFieldSD.setText("");
        developerNumberTextFieldSD.setText("");
        developerNameTextFieldSD.setText("");
        advanceSalaryTextFieldSD.setText("");
        joiningDateTextFieldSD.setText("");
        staffRoomNumberTextFieldSD.setText("");
        contractPeriod2TextFieldSD.setText("");
        salaryTextFieldSD.setText("");
    }

    //This method is used for displaying all the values in a new JFrame "displayFrame" which were entered in textfield of panelSD.
    public void displaySeniorDeveloper()
    {
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial",Font.BOLD, 14));
        JFrame displayFrame = new JFrame("Senior Developer Display");
        displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Making textArea uneditable.
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        displayFrame.add(scrollPane);
        displayFrame.setSize(2000,2000);

        //Using try catch to handle errors.
        try
        {
            for(int i=0; i<arrayObj.size(); i++)
            {
                if(arrayObj.get(i) instanceof SeniorDeveloper)
                {
                    SeniorDeveloper obj = (SeniorDeveloper) arrayObj.get(i);
                    textArea.append(">>>>>>>>>>>>>>>>>>>> [Senior Developer Display] <<<<<<<<<<<<<<<<<<<<"+"\n\n");
                    //Adding values in textArea.
                    textArea.append("Developer Number: "+i+"\n");
                    textArea.append("Developer Name: "+obj.getDeveloperName()+"\n");
                    textArea.append("Platform: "+obj.getPlatform()+"\n");
                    textArea.append("Interviewer Name: "+obj.getInterviewerName()+"\n");
                    textArea.append("Working Hours: "+obj.getWorkingHours()+"\n");
                    textArea.append("Advance Salary: "+obj.getAdvanceSalary()+"\n");
                    textArea.append("Joining Date: "+obj.getJoiningDate()+"\n");
                    textArea.append("Staff Room Number: "+obj.getStaffRoomNumber()+"\n");
                    textArea.append("Contract Period: "+obj.getContractPeriod()+"\n");
                    textArea.append("Salary: "+obj.getSalary()+"\n");
                    textArea.append("Termination: "+obj.isTerminated()+"\n");
                    textArea.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+"\n\n");
                }
            }
        }
        catch(Exception f)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        displayFrame.setVisible(true);
    }
        //Main method.
    public static void main(String[] args)
    {
        //Calling Constructor.
        new RigoTechnology();
    }
}
