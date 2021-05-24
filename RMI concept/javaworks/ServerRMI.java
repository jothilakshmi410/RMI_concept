import java.rmi.*;
import java.rmi.server.*;
public class ServerRMI extends UnicastRemoteObject implements interface_RMI
{
	public ServerRMI() throws RemoteException
	    {
	        super();
         }
     public int Add(int x,int y) throws RemoteException {return (x+y);}

 public static void main (String args[])
 {
	 try
	 {
		 ServerRMI Remote_Server= new ServerRMI();
		 Naming.rebind("MYServer",Remote_Server);
		 System.out.println("System is Ready....");
	 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
 }
}
