package hibernate.services;

import crawler.Item;
import crawler.TmallSearch;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liker on 02/08/2015 0002.
 * Group iTailor.hunters.neu.edu.cn
 */
public class CrawlerService {
    private static Logger logger = Logger.getLogger(CrawlerService.class);
    private TmallSearch tmallSearch = new TmallSearch();
    private ArrayList<Item> items = new ArrayList<>();

    public void onLineSearch(String searchKeys) {
        tmallSearch.search(searchKeys);
        items = tmallSearch.getItems();
        for (Item item : items) {
            System.out.println(item.getItemId());
        }
    }

    public void filtrationAfterSearch() {
        //TO DO
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public static void main(String[] args) {
        CrawlerService crawlerService = new CrawlerService();
        crawlerService.onLineSearch("超短裙  通勤 V领 无袖");
//        crawlerService.initCoatIntoDB();
//        crawlerService.initDressIntoDB();
//        crawlerService.initHDressIntoDB();
//        crawlerService.initPantIntoDB();
    }


    public void initCoatIntoDB() {
        //即将导入外套
        List<String> buttons = PropertiesDBService.takeOutAListOf("button", "Coat");
        List<String> collar_types = PropertiesDBService.takeOutAListOf("collar_type", "Coat");
        List<String> lengths = PropertiesDBService.takeOutAListOf("length", "Coat");
        List<String> sleeve_types = PropertiesDBService.takeOutAListOf("sleeve_type", "Coat");
        List<String> styles = PropertiesDBService.takeOutAListOf("style", "Coat");
        List<String> thicknesses = PropertiesDBService.takeOutAListOf("thickness", "Coat");
        for (String button : buttons) {
            for (String collar : collar_types) {
                for (String length : lengths) {
                    for (String sleeve_type : sleeve_types) {
                        for (String style : styles) {
                            for (String thickness : thicknesses) {
                                String key = button + " " + collar + " " + length + " " + sleeve_type + " " + style + " " + thickness;
                                logger.debug("[Coat] SEARCH WORDS:" + key);
                                onLineSearch(key);
                            }
                        }
                    }
                }
            }
        }
    }

    public void initDressIntoDB() {
        //即将导入外套
        List<String> collar_types = PropertiesDBService.takeOutAListOf("collar_type", "Dress");
        List<String> dress_lengths = PropertiesDBService.takeOutAListOf("dress_length", "Dress");
        List<String> shapes = PropertiesDBService.takeOutAListOf("shape", "Dress");
        List<String> sleeve_types = PropertiesDBService.takeOutAListOf("sleeve_type", "Dress");
        List<String> styles = PropertiesDBService.takeOutAListOf("style", "Dress");
        for (String collar : collar_types) {
            for (String length : dress_lengths) {
                for (String shape : shapes) {
                    for (String sleeve_type : sleeve_types) {
                        for (String style : styles) {
                            String key = collar + " " + length + " " + shape + " " + sleeve_type + " " + style;
                            logger.debug("[Dress] SEARCH WORDS:" + key);
                            onLineSearch(key);

                        }
                    }
                }
            }
        }

    }

    public void initHDressIntoDB() {
        //即将导入外套
        List<String> dress_lengths = PropertiesDBService.takeOutAListOf("dress_length", "HDress");
        List<String> shapes = PropertiesDBService.takeOutAListOf("shape", "HDress");
        List<String> styles = PropertiesDBService.takeOutAListOf("style", "HDress");
        List<String> waist_heights = PropertiesDBService.takeOutAListOf("waist_height", "HDress");

        for (String length : dress_lengths) {
            for (String shape : shapes) {
                for (String style : styles) {
                    for (String height : waist_heights) {
                        String key = length + " " + shape + " " + style + " " + height;
                        logger.debug("[HDress] SEARCH WORDS:" + key);
                        onLineSearch(key);
                    }

                }

            }
        }
    }


    public void initPantIntoDB() {
        //即将导入外套
        List<String> lengths = PropertiesDBService.takeOutAListOf("dress_length", "Pant");
        List<String> shapes = PropertiesDBService.takeOutAListOf("shape", "Pant");
        List<String> styles = PropertiesDBService.takeOutAListOf("style", "Pant");
        List<String> thicknesses = PropertiesDBService.takeOutAListOf("thickness", "Pant");
        List<String> waist_heights = PropertiesDBService.takeOutAListOf("waist_height", "Pant");

        for (String length : lengths) {
            for (String shape : shapes) {
                for (String style : styles) {
                    for (String thickness : thicknesses) {
                        for (String height : waist_heights) {
                            String key = length + " " + shape + " " + style + " " + thickness + "" + height;
                            logger.debug("[Pant] SEARCH WORDS:" + key);
                            onLineSearch(key);
                        }
                    }
                }
            }
        }
    }

    public void initUClothIntoDB() {
        //即将导入外套
        List<String> collar_types = PropertiesDBService.takeOutAListOf("collar_type", "UCloth");
        List<String> lengths = PropertiesDBService.takeOutAListOf("length", "UCloth");
        List<String> patterns = PropertiesDBService.takeOutAListOf("pattern", "UCloth");
        List<String> sleeve_types = PropertiesDBService.takeOutAListOf("sleeve_type", "UCloth");
        List<String> styles = PropertiesDBService.takeOutAListOf("style", "UCloth");

        for (String collar : collar_types) {
            for (String length : lengths) {
                for (String pattern : patterns) {
                    for (String sleeve : sleeve_types) {
                        for (String style : styles) {
                            String key = collar + " " + length + " " + pattern + " " + sleeve + "" + style;
                            logger.debug("[UCloth] SEARCH WORDS:" + key);
                            onLineSearch(key);
                        }
                    }
                }
            }
        }
    }


}
