package com.sri.jklo.interfaces;

/**
 * @author charliegels on 6/22/16.
 */
public interface IViewModel<T, C extends IPersistent> extends Identifiable<T> {
    C convert();

}
