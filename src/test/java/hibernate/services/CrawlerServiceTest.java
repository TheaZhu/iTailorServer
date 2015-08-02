package hibernate.services;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by liker on 02/08/2015 0002.
 * Group iTailor.hunters.neu.edu.cn
 */
public class CrawlerServiceTest {
    CrawlerService crawlerService = null;
    @Before
    public void setUp() throws Exception {
        crawlerService = new CrawlerService();
    }

    @Test
    public void testOnLineSearch() throws Exception {
//        assertTrue(crawlerService.onLineSearch("����ȹ")!=null);\
        crawlerService.onLineSearch("��ô�����ҵĳ�����");
        assertTrue(crawlerService.getItems().isEmpty());
    }
}