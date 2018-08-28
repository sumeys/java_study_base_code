package com.sumey.design.factory;

import java.util.Map;

public class HairFactory {

    public HairIf getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }


    //根据类的名称来生产对象，避免了上面越来越多的if else
    public HairIf getHairByClass(String key) {
        try {
            Map<String, String> map = new PropertieReader().getProperties();
            HairIf hair = (HairIf) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
