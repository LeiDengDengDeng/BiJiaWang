package controller;

import model.SensitiveEntity;
import model.SynonymsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.SensitiveWordsService;
import service.SynonymsService;

import javax.servlet.http.HttpServletRequest;
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
    public boolean addSensitiveWords(HttpServletRequest request){
        String words = (String) request.getAttribute("sensitiveWord");
        SensitiveEntity sensitiveEntity = new SensitiveEntity();
        sensitiveEntity.setSensitiveWord(words);
        sensitiveEntity.setId(sensitiveWordsService.findAll().size()+1);
        sensitiveWordsService.addSensitiveWords(sensitiveEntity);
        return true;

    }

    @RequestMapping("/getSensitiveWords")
    public List<SensitiveEntity> getSensitiveWords(){
        return sensitiveWordsService.findAll();
    }

    @RequestMapping("/deleteSensitiveWords")
    public boolean deleteSensitiveWords(HttpServletRequest request){
        int id = (int) request.getAttribute("sensitiveId");
        SensitiveEntity sensitiveEntity = sensitiveWordsService.getOne(id);
        sensitiveWordsService.deleteSensitiveWords(sensitiveEntity);
        return true;
    }


    @RequestMapping("/addSynonymsWords")
    public boolean synonymsWords(HttpServletRequest request){
        String words = (String) request.getAttribute("synonymsWord");
        SynonymsEntity synonymsEntity = new SynonymsEntity();
        synonymsEntity.setSynonymsWord(words);
        synonymsEntity.setGroupid(synonymsService.getCount()+1);
        synonymsEntity.setId(synonymsService.findAll().size()+1);
        synonymsService.addSynonyms(synonymsEntity);
        return true;
    }

    @RequestMapping("/getSynonymsWords")
    public List<SynonymsEntity> getSynonymsWords(){
        return synonymsService.findAll();
    }

    @RequestMapping("/deleteSynonymsWords")
    public boolean deleteSynonymsWords(HttpServletRequest request){
        int id = (int) request.getAttribute("synonymsId");
        SynonymsEntity synonymsEntity = synonymsService.getOne(id);
        synonymsService.deleteSynonyms(synonymsEntity);
        return true;
    }

    @RequestMapping("/getSynonymsGroup")
    public List<List<String>> getSynonymsGroup(){
        return  synonymsService.getSynonymsGroup();
    }


}
