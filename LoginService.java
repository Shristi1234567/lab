package Project;

import java.util.ArrayList;
import java.util.List;

public class LoginService {
public boolean getCheck(String name,String password)
{
	LoginDao ld=new LoginDao();
	List<Login> daolist=new ArrayList();
	List<Login> newList=new ArrayList();
	daolist=ld.getLogin();
	for(Login log:daolist)
	{
		if(log.getPassword().equals(password) && log.getUserName().equals(name))
		{
			System.out.println("login successfull");
			return true;
		}
		else
		{
			//System.out.println("create account");
			System.out.println("login unsuccessfull");
		}
	}
	return false;
	
}
}
