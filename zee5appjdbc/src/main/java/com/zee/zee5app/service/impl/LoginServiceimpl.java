package com.zee.zee5app.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.ROLE;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.repository.impl.LoginRepositoryimpl;
import com.zee.zee5app.service.LoginService;
@Service
public class LoginServiceimpl implements LoginService {
	
	public LoginServiceimpl() throws IOException{
		
	}
//	private static LoginServiceimpl loginservice;
//	public static LoginServiceimpl getInstance() throws IOException
//	{
//		if(loginservice==null)
//			loginservice=new LoginServiceimpl();
//		return loginservice;
//	}
	@Override
	public String addCredentials(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCredentials(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String changerole(String username, ROLE role) {
		// TODO Auto-generated method stub
		return null;
//		return repo.changerole(username, role);
	}

}
