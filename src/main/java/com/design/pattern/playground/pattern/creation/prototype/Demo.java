package com.design.pattern.playground.pattern.creation.prototype;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/16 12:56
 */

//public class Demo {
//    private ConcurrentHashMap<String, SearchWord> currentKeywords = new ConcurrentHashMap<>();
//    private long lastUpdateTime = -1;
//
//    public void refresh() {
//        // 从数据库中取出更新时间>lastUpdateTime的数据，放入到currentKeywords中
//        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
//        long maxNewUpdatedTime = lastUpdateTime;
//        for (SearchWord searchWord : toBeUpdatedSearchWords) {
//            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
//                maxNewUpdatedTime = searchWord.getLastUpdateTime();
//            }
//            if (currentKeywords.containsKey(searchWord.getKeyword())) {
//                currentKeywords.replace(searchWord.getKeyword(), searchWord);
//            } else {
//                currentKeywords.put(searchWord.getKeyword(), searchWord);
//            }
//        }
//
//        lastUpdateTime = maxNewUpdatedTime;
//    }
//
//    private List<SearchWord> getSearchWords(long lastUpdateTime) {
//        // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
//        return null;
//    }
//}
