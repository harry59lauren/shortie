package com.xlabs.shortieapi;

import java.net.URL;

public interface ShotenerService {

    public String shortenUrl(URL url);
    public String getUrlByKey(String key);
}
