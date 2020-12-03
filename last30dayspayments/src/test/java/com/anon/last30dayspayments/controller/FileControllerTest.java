package com.anon.last30dayspayments.controller;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class FileControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTop10MostFrequentWords() throws Exception{
        MockMultipartFile file
                = new MockMultipartFile(
                "file",
                "testFile",
                MediaType.TEXT_PLAIN_VALUE,
                "Two thousand students, equally split one thousand boys, and one thousand girls".getBytes()
        );

        this.mockMvc.perform(multipart("/file/top10mostfrequentwords").file(file)/*post("/file/top10mostfrequentwords").file(mpf)*/)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("boy")));
    }
}
