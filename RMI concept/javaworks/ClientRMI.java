import java.rmi.*;

public class ClientRMI
{
	 public static void main (String args[])
	 {
		 try
		 {
			 interface_RMI obj=(interface_RMI)
			 Naming.lookup("//localhost/MYServer");
			 int A=obj.Add(4,5);
			 System.out.println("The Value is : "+A);
		 }
		 catch (Exception e)
		 	 {
		 		 System.out.println(e);
	 		}
 	}
}