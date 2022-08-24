package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {
    private static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";


    /*Получение пароля из проперти*/
    public static String getPassword() {
        Properties props = new Properties();
        FileInputStream fis;

        try {
            fis = new FileInputStream(PATH_TO_PROPERTIES);
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return props.getProperty("password");
    }






}
