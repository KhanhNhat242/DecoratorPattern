package com.example.itemdecoratorpattern.Pattern;

public abstract class ItemDecorator implements Item{
    protected Item cItem;

    public Item getcItem() {
        return cItem;
    }

    public void setcItem(Item cItem) {
        this.cItem = cItem;
    }

    public ItemDecorator(Item cItem) {
        this.cItem = cItem;
    }
}
