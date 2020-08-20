package com.design.pattern.playground.pattern.structure.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/20 12:27
 */
public class Demo2 {
}

//
//public class ASensitiveWordsFilter { // A敏感词过滤系统提供的接口
//    //text是原始文本，函数输出用***替换敏感词之后的文本
//    public String filterSexyWords(String text) {
//        // ...
//    }
//
//    public String filterPoliticalWords(String text) {
//        // ...
//    }
//}
//
//public class BSensitiveWordsFilter  { // B敏感词过滤系统提供的接口
//    public String filter(String text) {
//        //...
//    }
//}
//
//public class CSensitiveWordsFilter { // C敏感词过滤系统提供的接口
//    public String filter(String text, String mask) {
//        //...
//    }
//}
//
//// 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
//public class RiskManagement {
//    private ASensitiveWordsFilter aFilter = new ASensitiveWordsFilter();
//    private BSensitiveWordsFilter bFilter = new BSensitiveWordsFilter();
//    private CSensitiveWordsFilter cFilter = new CSensitiveWordsFilter();
//
//    public String filterSensitiveWords(String text) {
//        String maskedText = aFilter.filterSexyWords(text);
//        maskedText = aFilter.filterPoliticalWords(maskedText);
//        maskedText = bFilter.filter(maskedText);
//        maskedText = cFilter.filter(maskedText, "***");
//        return maskedText;
//    }
//}
//
//// 使用适配器模式进行改造
//public interface ISensitiveWordsFilter { // 统一接口定义
//    String filter(String text);
//}
//
//public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
//    private ASensitiveWordsFilter aFilter;
//    public String filter(String text) {
//        String maskedText = aFilter.filterSexyWords(text);
//        maskedText = aFilter.filterPoliticalWords(maskedText);
//        return maskedText;
//    }
//}
////...省略BSensitiveWordsFilterAdaptor、CSensitiveWordsFilterAdaptor...
//
//// 扩展性更好，更加符合开闭原则，如果添加一个新的敏感词过滤系统，
//// 这个类完全不需要改动；而且基于接口而非实现编程，代码的可测试性更好。
//public class RiskManagement {
//    private List<ISensitiveWordsFilter> filters = new ArrayList<>();
//
//    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
//        filters.add(filter);
//    }
//
//    public String filterSensitiveWords(String text) {
//        String maskedText = text;
//        for (ISensitiveWordsFilter filter : filters) {
//            maskedText = filter.filter(maskedText);
//        }
//        return maskedText;
//    }
//}
