/**
 * 
 */
package Authorization.Service;

import java.util.Map;

import Authorization.pojo.user_info;

/**
 * @author Administrator
 *
 */
public interface UserAuthorizationManage {
     public String Add(user_info user);
     public String Update(user_info user);
     public String Delete(user_info user);
     public String Delete(String id);
     public user_info Query(Map<String,Object> user);
}
