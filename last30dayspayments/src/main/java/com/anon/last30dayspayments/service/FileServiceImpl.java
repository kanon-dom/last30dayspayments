package com.anon.last30dayspayments.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Service
public class FileServiceImpl implements FileService{
    @Override
    public Map<String, Integer> top10MostFrequestWords(MultipartFile file) {
        Map<String, Integer> top10MostFrequestWords = new HashMap<>();
        top10MostFrequestWords.put("the", 2000);
        top10MostFrequestWords.put("good", 20);
        top10MostFrequestWords.put("boy", 10);
        top10MostFrequestWords.put("school", 20);
        top10MostFrequestWords.put("student", 20);
        top10MostFrequestWords.put("girl", 2000);
        top10MostFrequestWords.put("class", 20);
        top10MostFrequestWords.put("mark", 10);
        top10MostFrequestWords.put("pass", 200);
        top10MostFrequestWords.put("fail", 20);

        return top10MostFrequestWords;
    }
}
