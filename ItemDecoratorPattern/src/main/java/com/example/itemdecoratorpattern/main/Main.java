package com.example.itemdecoratorpattern.main;

import com.example.itemdecoratorpattern.Pattern.BlackDecorator;
import com.example.itemdecoratorpattern.Pattern.Chair;
import com.example.itemdecoratorpattern.Pattern.GrayDecorator;
import com.example.itemdecoratorpattern.Pattern.Table;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Table table = new Table();
        System.out.println(chair.produce());
        System.out.println(table.produce());

        BlackDecorator blackDecorator = new BlackDecorator(chair);
        GrayDecorator grayDecorator = new GrayDecorator(table);
        System.out.println(blackDecorator.produce());
        System.out.println(grayDecorator.produce());
    }
}
