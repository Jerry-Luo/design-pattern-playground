package com.design.pattern.playground.pattern.creation.prototype;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/16 12:58
 */

//public class DemoV2 {
//    private HashMap<String, SearchWord> currentKeywords=new HashMap<>();
//
//    public void refresh() {
//        HashMap<String, SearchWord> newKeywords = new LinkedHashMap<>();
//
//        // 从数据库中取出所有的数据，放入到newKeywords中
//        List<SearchWord> toBeUpdatedSearchWords = getSearchWords();
//        for (SearchWord searchWord : toBeUpdatedSearchWords) {
//            newKeywords.put(searchWord.getKeyword(), searchWord);
//        }
//
//        currentKeywords = newKeywords;
//    }
//
//    private List<SearchWord> getSearchWords() {
//        // TODO: 从数据库中取出所有的数据
//        return null;
//    }
//}
