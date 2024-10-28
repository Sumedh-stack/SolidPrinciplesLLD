package org.DependencyInversionPrinciple.BadCode;


/**
 * Class should depend on Interfaces rather than concrete classes
 */





public class MacBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook(){
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}

