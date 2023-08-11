package com.example.itemdecoratorpattern.Pattern;

public class BlackDecorator extends ItemDecorator{

    public BlackDecorator(Item cItem) {
        super(cItem);
    }

    @Override
    public String produce(){
        String color =  cItem.produce();
        return color + addColor();
    }

    public String addColor(){
        return "with Black color";
    }
}
