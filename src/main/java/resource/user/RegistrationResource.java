package resource.user;

import entity.Account;
import entity.BaseUser;
import org.apache.log4j.Logger;
import resource.message.Registration;
import util.BaseDAO;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by liker on 23/07/2015 0023.
 * Group iTailor.hunters.neu.edu.cn
 */
@Path("registration")
public class RegistrationResource {
    private static final Logger LOGGER = Logger.getLogger(RegistrationResource.class);

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String put(Registration jsonObject) {
        Account account = new Account(jsonObject.getEmail(),jsonObject.getPassword());
        BaseUser baseUser = new BaseUser(jsonObject.getNickname(),account);
        BaseDAO<BaseUser> accountDAO2 = new BaseDAO<>();
        accountDAO2.create(baseUser);
        BaseDAO<Account> accountDAO = new BaseDAO<>();
        accountDAO.create(account);
        return "Yes,we save it!";
    }

}