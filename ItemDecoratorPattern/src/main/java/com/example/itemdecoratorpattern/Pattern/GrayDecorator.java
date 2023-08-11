package com.example.itemdecoratorpattern.Pattern;

public class GrayDecorator extends ItemDecorator{

    public GrayDecorator(Item cItem) {
        super(cItem);
    }

    @Override
    public String produce(){
        String color =  cItem.produce();
        return color + addColor();
    }

    public String addColor(){
        return "with Gray color";
    }
}
