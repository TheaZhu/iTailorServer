package recommendation.pickColor;

import hibernate.elements.Color;

/**
 * Created by liker on 09/08/2015 0009.
 * Group iTailor.hunters.neu.edu.cn
 */
public class PickColorForColor {
    public void run(Color first){
        //这个颜色是根据用户信息推荐的主力颜色
        //TODO 根据肤色，BMI，年龄，性格等越多要素考虑进去越好
        //TODO 筛选出适合用户的颜色集A[]
        //TODO 根据表三取出用户喜欢的颜色集B[] 根据概率取用或不取用
        //TODO A[]与B[] 合并为C[]
        //TODO 取出第一个颜色的HSB信息
        //TODO 明度搭配，色调搭配，饱和度搭配
        //TODO 在C[]中过滤出与第一颜色搭配的颜色集[]
        //TODO 导入表一的概率进行运算推荐出第二颜色
    }
}
