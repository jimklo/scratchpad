package com.sri.jklo.interfaces;

import java.io.Serializable;

/**
 * Created by jklo on 9/21/16.
 */
public interface Identifiable<T> extends Serializable {
    T getId();
    void setId(T id);
}
