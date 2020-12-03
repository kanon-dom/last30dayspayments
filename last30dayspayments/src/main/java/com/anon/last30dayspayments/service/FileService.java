package com.anon.last30dayspayments.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface FileService {
    Map<String, Integer> top10MostFrequestWords(MultipartFile file);
}
