import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField; 

public class Layout3 extends JFrame{
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JPasswordField i4;
	
	public Layout3(){
		super("Window_Title");
		setLayout(new FlowLayout());
		i1=new JTextField(10);
		add(i1);
		
		i2=new JTextField("Enter Text here",20);
		add(i2);
		
		i3=new JTextField("The text is un editabe",20);
		i3.setEditable(false);
		add(i3);
		
		i4=new JPasswordField("hellobro");
		add(i4);
		
		thehandle h=new thehandle();
		i1.addActionListener(h);
		i2.addActionListener(h);
		i3.addActionListener(h);
		i4.addActionListener(h);
		
		
	}
	private class thehandle implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String s1="";
		
			if(event.getSource()==i1)
				s1=String.format("Field i1 : %s",event.getActionCommand());
			else if(event.getSource()==i2)
				s1=String.format("Field i2 : %s",event.getActionCommand());
			else if(event.getSource()==i3)
				s1=String.format("Field i3 : %s",event.getActionCommand());
			else if(event.getSource()==i4)
				s1=String.format("Field i4 : %s",event.getActionCommand());
			
			JOptionPane.showMessageDialog(null,s1);
		}
	}

}
/*
public Person SomeMethod(string fName)
{
    var con = ConfigurationManager.ConnectionStrings["Yourconnection"].ToString();

    Person matchingPerson = new Person();
    using (SqlConnection myConnection = new SqlConnection(con))
    {
        string oString = "Select * from Employees where FirstName=@fName";
        SqlCommand oCmd = new SqlCommand(oString, myConnection);
        oCmd.Parameters.AddWithValue("@Fname", fName);           
        myConnection.Open();
        using (SqlDataReader oReader = oCmd.ExecuteReader())
        {
            while (oReader.Read())
            {    
                matchingPerson.firstName = oReader["FirstName"].ToString();
                matchingPerson.lastName = oReader["LastName"].ToString();                       
            }

            myConnection.Close();
        }               
    }
    return matchingPerson;
}


int i = 0;
while (i < oTable.Rows.Count)
{
    int j = 0;
    string sData = "";
    while (j < oTable.Columns.Count)
    {
        sData += oTable.Rows[i][j].ToString() + " --> ";
        j++;
    }
    Response.Write(sData+"</br>");
    i++;
}	



C# Code:
Since we know the number of DataTable Columns. 
We can ommit inner While Loop like:

	
i = 0;
while (i < oTable.Rows.Count)
{
    // Since we know the number of columns in the DataTable
    Response.Write(oTable.Rows[i][0].ToString()
     + " --> " + oTable.Rows[i][1].ToString()
     + " --> " + oTable.Rows[i][2].ToString() + "</br>");
    i++;
}



i = 0;
while (i < oTable.Rows.Count)
{
    // Since we know the name of the DataTable Columns
    Response.Write(oTable.Rows[i]["ID"].ToString() + " --> " 
    + oTable.Rows[i]["Title"].ToString() + " --> " 
    + oTable.Rows[i]["Published"].ToString() + "</br>");
    i++;
}


































*/






























