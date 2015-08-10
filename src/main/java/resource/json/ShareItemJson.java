package resource.json;

import hibernate.community.ShareItem;
import hibernate.recommendation.Resource;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liker on 05/08/2015 0005.
 * Group iTailor.hunters.neu.edu.cn
 */
@XmlRootElement(name = "ShareItemJson")
public class ShareItemJson {
    private int accountID;
    private ImageJson imageJson;
    private List<CommentJson> commentJsons = new ArrayList<>();
    private Timestamp createdTime;

    public ShareItem becomeToJson() {
        ShareItem shareItem = new ShareItem();
        //TODO
        shareItem.setComments(null);
        shareItem.setResource(new Resource());
        return shareItem;
    }
}
