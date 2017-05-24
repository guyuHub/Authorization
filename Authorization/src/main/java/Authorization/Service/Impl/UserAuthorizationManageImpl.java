/**
 * 
 */
package Authorization.Service.Impl;

import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import Authorization.Service.UserAuthorizationManage;
import Authorization.pojo.user_info;

/**
 * @author Administrator
 *
 */
@Configuration(value = "userAuthorizationManage")
public class UserAuthorizationManageImpl implements UserAuthorizationManage {


	@Override
	public String Add(user_info user) {
		
		return null;
	}


	@Override
	public String Update(user_info user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String Delete(user_info user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String Delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public user_info Query(Map<String, Object> user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
