package com.sri.jklo.vm;


import com.sri.jklo.interfaces.Identifiable;

import java.io.Serializable;

/**
 * Created by jklo on 10/15/16.
 */
public class AbstractViewModel implements Identifiable<String>, Serializable {

    protected AbstractViewModel() {

    }

    protected AbstractViewModel(Identifiable<String> identifiable) {
        setId(identifiable.getId());
    }


    protected String id = null;

    private boolean defaultIdSet = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
            defaultIdSet = false;
            this.id = id;
    }

    public boolean isDefaultIdSet() {
        return defaultIdSet;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||
                !(o instanceof AbstractViewModel)) {

            return false;
        }

        AbstractViewModel other
                = (AbstractViewModel)o;

        // if the id is missing, return false
        if (id == null) return false;

        // equivalence by id
        return id.equals(other.getId());
    }

    public int hashCode() {
        if (id != null) {
            return id.hashCode();
        } else {
            return super.hashCode();
        }
    }

    public String toString() {
        return this.getClass().getName()
                + "[id=" + id + "]";
    }
}
