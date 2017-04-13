package com.service;

import com.model.GoodEntity;
import com.repository.GoodRepository;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("searchService")
@Transactional
public class SearchServiceImpl implements SearchService{

    @Autowired
    private GoodRepository goodRepository;


    @Override
    public List<GoodEntity> analyse(String[] keywords) {
        //匹配关键词
        for (String key:keywords){



        }

        List<GoodEntity> goodEntities=goodRepository.findAll();
            return goodEntities;

    }
}
