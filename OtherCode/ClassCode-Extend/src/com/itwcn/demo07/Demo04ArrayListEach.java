package com.itwcn.demo07;

import java.util.ArrayList;

/**
 * @program: Demo04ArrayListEach
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:13
 **/

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔查哈");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.fori  快捷键
//        for (int i = 0; i < list.size(); i++) {
//
//        }
    }
}
