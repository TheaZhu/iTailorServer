package resource.json;

import hibernate.elements.SearchWord;
import hibernate.recommendation.Wardrobe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liker on 05/08/2015 0005.
 * Group iTailor.hunters.neu.edu.cn
 */
public class UserJson {
    private int accountID;
    private int user;
    private String nickname;
    private PreferenceMatrixJson preferenceMatrixJson;
    private List<ImageJson> imageJsons = new ArrayList<>();
    private List<SearchWord> searchWords = new ArrayList<>();
    private BodyJson bodyJson;
    private Wardrobe rootWardrobe;
}
