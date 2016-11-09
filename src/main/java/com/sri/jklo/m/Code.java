package com.sri.jklo.m;


import com.sri.jklo.interfaces.IPersistent;
import com.sri.jklo.vm.CodeViewModel;

/**
 * Created by jklo on 2/21/14.
 */

public class Code extends AbstractPersistent implements IPersistent<String, CodeViewModel> {

    private String name = "";

    private Boolean active = true;


    public Code() {}

    /**
     * Constructor used to quickly convert IViewModel into Entity
     * */
    public Code(CodeViewModel cvm) {
        setId(cvm.getId());
        setName(cvm.getName());
        setActive(cvm.getActive());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    @Override
    public CodeViewModel convert() {
        return new CodeViewModel(this);
    }
}
