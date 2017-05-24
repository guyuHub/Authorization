/**
 * 
 */
package Authorization.Service.Controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Authorization.Service.UserAuthorizationManage;
import Authorization.pojo.user_info;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class UserAuthorizationManageController {
	
	@Resource(name="userAuthorizationManage")
	private UserAuthorizationManage userAuthorizationManage;
	
	@RequestMapping("/add")
	public String add(String userinfo){
		return "add";
	}
}
