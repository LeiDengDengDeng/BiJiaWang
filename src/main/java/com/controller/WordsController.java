package com.controller;

import com.model.SensitiveEntity;
import com.model.SynonymsEntity;
import com.service.SensitiveWordsService;
import com.service.SynonymsService;
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
    private SensitiveWordsService sensitiveWordsService;

    @Autowired
    private SynonymsService synonymsService;

    @RequestMapping("/addSensitiveWords")
    public boolean addSensitiveWords(String words){
        SensitiveEntity sensitiveEntity = new SensitiveEntity();
        sensitiveEntity.setSensitiveWord(words);
        sensitiveEntity.setId(sensitiveWordsService.getCount()+1);
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
    public boolean synonymsWords(String words){
        SynonymsEntity synonymsEntity = new SynonymsEntity();
        synonymsEntity.setSynonymsWord(words);
        synonymsEntity.setId(synonymsService.getCount()+1);
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
