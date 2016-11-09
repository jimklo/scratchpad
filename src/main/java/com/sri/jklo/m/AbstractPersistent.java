package com.sri.jklo.m;


import com.sri.jklo.interfaces.Identifiable;
import com.sri.jklo.util.IdGenerator;

/**
 * Created by jklo on 10/15/16.
 */
public class AbstractPersistent implements Identifiable<String> {

    protected AbstractPersistent() {

    }

    protected AbstractPersistent(Identifiable<String> identifiable) {
        setId(identifiable.getId());
    }

    protected String id = IdGenerator.createId();

    private boolean defaultIdSet = true;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        if (id != null) {
            defaultIdSet = false;
            this.id = id;
        }
        else {
            this.id = IdGenerator.createId();
            defaultIdSet = true;
        }
    }

    public boolean isDefaultIdSet() {
        return defaultIdSet;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||
                !(o instanceof AbstractPersistent)) {

            return false;
        }

        AbstractPersistent other
                = (AbstractPersistent)o;

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
