package com.xlabs.shortieapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UrlController {

    @Autowired
    ShortendUrlRepository shortendUrlRepository;

    @PostMapping("/urls")
    public ResponseEntity<ShortenedUrl> createShortendUrl(@RequestBody Map<String, String> urlMap){
        String url = urlMap.get("url");
        String key = urlMap.get("key");
        ShortenedUrl newShortenedUrl = shortendUrlRepository.save(new ShortenedUrl(key, url));
        System.out.println(newShortenedUrl);
        return new ResponseEntity<ShortenedUrl>(newShortenedUrl, HttpStatus.CREATED);
        //return new String("daam");
    }

    @GetMapping("/urls")
    public List<ShortenedUrl> getAllUrls(){
        return (ArrayList<ShortenedUrl>)shortendUrlRepository.findAll();
    }

    @GetMapping("/urls/{key}")
    public @ResponseBody ShortenedUrl getUrlByKey( @PathVariable String key) {
        return shortendUrlRepository.findByUrlKey(key);
    }


}
