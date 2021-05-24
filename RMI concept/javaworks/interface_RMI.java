import java.rmi.*;

public interface interface_RMI extends Remote
{
	int Add(int x,int y) throws RemoteException;
}