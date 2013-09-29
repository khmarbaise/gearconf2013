package com.soebes.utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class InformationProperties {

    private static final String SERVER = "server";
    
    private Properties properties;

    public InformationProperties(String propertiesFile) throws IOException {
        properties = new Properties();
        properties.load(this.getClass().getResourceAsStream(propertiesFile));
    }

    public URL getServer() throws MalformedURLException {
        String url = properties.getProperty(SERVER);
        return new URL(url);
    }

}
