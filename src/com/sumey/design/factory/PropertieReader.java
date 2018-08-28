package com.sumey.design.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//读取properties文件的内容
public class PropertieReader {
    public Map<String, String> getProperties() {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        InputStream in = getClass().getResourceAsStream("type.properties");
        try {
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}