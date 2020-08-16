package com.design.pattern.playground.pattern.creation.prototype;

import java.util.HashMap;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/16 16:13
 */
// 刚刚的两种实现方法，不管采用哪种，深拷贝都要比浅拷贝耗时、耗内存空间。
// 针对我们这个应用场景，有没有更快、更省内存的实现方式呢？
// 我们可以先采用浅拷贝的方式创建 newKeywords。对于需要更新的 SearchWord 对象，我们再使用深度拷贝的方式创建一份新的对象，
// 替换 newKeywords 中的老对象。毕竟需要更新的数据是很少的。这种方式即利用了浅拷贝节省时间、空间的优点，
// 又能保证 currentKeywords 中的中数据都是老版本的数据。具体的代码实现如下所示。
// 这也是标题中讲到的，在我们这个应用场景下，最快速 clone 散列表的方式。
public class DemoV6 {
    //private HashMap<String, SearchWord> currentKeywords=new HashMap<>();
    //private long lastUpdateTime = -1;
    //
    //public void refresh() {
    //    // Shallow copy
    //    HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords.clone();
    //
    //    // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
    //    List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
    //    long maxNewUpdatedTime = lastUpdateTime;
    //    for (SearchWord searchWord : toBeUpdatedSearchWords) {
    //        if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
    //            maxNewUpdatedTime = searchWord.getLastUpdateTime();
    //        }
    //        if (newKeywords.containsKey(searchWord.getKeyword())) {
    //            newKeywords.remove(searchWord.getKeyword());
    //        }
    //        newKeywords.put(searchWord.getKeyword(), searchWord);
    //    }
    //
    //    lastUpdateTime = maxNewUpdatedTime;
    //    currentKeywords = newKeywords;
    //}
    //
    //private List<SearchWord> getSearchWords(long lastUpdateTime) {
    //    // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
    //    return null;
    //}
}
