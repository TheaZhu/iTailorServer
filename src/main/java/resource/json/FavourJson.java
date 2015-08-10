package resource.json;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

/**
 * Created by liker on 24/07/2015 0024.
 * Group iTailor.hunters.neu.edu.cn
 */
@XmlRootElement(name = "favour")
public class FavourJson {
    private int userID;
    private int imageID;
    private Timestamp timestamp;

}
