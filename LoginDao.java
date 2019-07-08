package Project;

import java.util.ArrayList;
import java.util.List;

public class LoginDao {
public List<Login> getLogin()
{
	Login l=new Login();
	l.setPassword("capgemini");
	l.setUserName("shristi");
	ArrayList<Login> log=new ArrayList();
	log.add(l);
	return log;
}
}
