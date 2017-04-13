package com.controller;

import com.model.SensitiveEntity;
import com.model.SynonymsEntity;
import com.service.SensitiveWordsService;
import com.service.SensitiveWordsServiceImpl;
import com.service.SynonymsService;
import com.service.SynonymsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by luoxuechun on 2017/4/13.
 */
@Controller
@RequestMapping
public class WordsController {

    @Autowired
    SensitiveWordsService sensitiveWordsService = new SensitiveWordsServiceImpl();

    @Autowired
    SynonymsService synonymsService = new SynonymsServiceImpl();

    @RequestMapping("/addSensitiveWords")
    public boolean addSensitiveWords(String words,int id){
        SensitiveEntity sensitiveEntity = new SensitiveEntity();
        sensitiveEntity.setSensitiveWord(words);
        sensitiveEntity.setId(id);
        sensitiveWordsService.addShieldWords(sensitiveEntity);
        return true;

    }

    @RequestMapping("/getSensitiveWords")
    public List<SensitiveEntity> getSensitiveWords(){
        return sensitiveWordsService.findAll();
    }

    @RequestMapping("/deleteSensitiveWords")
    public boolean deleteSensitiveWords(String words,int id){
        SensitiveEntity sensitiveEntity = new SensitiveEntity();
        sensitiveEntity.setId(id);
        sensitiveEntity.setSensitiveWord(words);
        return true;
    }


    @RequestMapping("/addSynonymsWords")
    public boolean synonymsWords(String words,int id){
        SynonymsEntity synonymsEntity = new SynonymsEntity();
        synonymsEntity.setSynonymsWord(words);
        synonymsEntity.setId(id);
        synonymsService.addSynonyms(synonymsEntity);
        return true;
    }

    @RequestMapping("/getSynonymsWords")
    public List<SynonymsEntity> getSynonymsWords(){
        return synonymsService.findAll();
    }

    @RequestMapping("/deleteSynonymsWords")
    public boolean deleteSynonymsWords(String words,int id){
        SynonymsEntity synonymsEntity = new SynonymsEntity();
        synonymsEntity.setId(id);
        synonymsEntity.setSynonymsWord(words);
        synonymsService.deleteSynonyms(synonymsEntity);
        return true;
    }

}
