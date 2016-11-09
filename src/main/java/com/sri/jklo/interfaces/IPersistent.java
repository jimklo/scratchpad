package com.sri.jklo.interfaces;

/**
 * Created by jklo on 11/8/16.
 */
public interface IPersistent<T, C extends IViewModel> extends Identifiable<T> {
    C convert();
}

