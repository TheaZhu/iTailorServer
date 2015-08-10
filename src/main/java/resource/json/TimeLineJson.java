package resource.json;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liker on 10/08/2015 0010.
 * Group iTailor.hunters.neu.edu.cn
 */
public class TimeLineJson {
    private int timelineID;
    private int accountID;
    private List<ShareItemJson> shareItemJsons = new ArrayList<>();
    private Timestamp timestamp;
}
