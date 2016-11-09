package com.sri.jklo.interfaces;

/**
 * Created by jklo on 11/8/16.
 */
public interface IItemViewModel<T, C extends IPersistent> extends IViewModel<T, C> {
    String getText();
    void setText(String text);
}
