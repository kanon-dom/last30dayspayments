package com.anon.last30dayspayments.controller;

import com.anon.last30dayspayments.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping(value="/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping(value="/top10mostfrequentwords")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Integer> top10MostFrequentWords(@RequestPart("file") MultipartFile file){
        return fileService.top10MostFrequestWords(file);
    }
}
