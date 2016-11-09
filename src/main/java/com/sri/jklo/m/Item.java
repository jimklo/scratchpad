package com.sri.jklo.m;


import com.sri.jklo.interfaces.IPersistent;
import com.sri.jklo.vm.ItemViewModel;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jklo on 2/11/14.
 */
public class Item extends AbstractPersistent implements IPersistent<String, ItemViewModel> {



    private String subItemText = "";


    private Set<Code> codes = new LinkedHashSet<>();


    public Item() {
        super();
    }


    public Item(ItemViewModel ivm) {
        super(ivm);
        this.subItemText = ivm.getSubItemText();

        if (ivm.getCodes() != null) {
            ivm.getCodes().forEach(c -> {
                this.codes.add(new Code(c));
            });
        }
    }


    public String getSubItemText() {
        return subItemText;
    }

    public void setSubItemText(String questionText) {
        this.subItemText = questionText;
    }

    public Set<Code> getCodes() {
        return codes;
    }

    public void setCodes(Set<Code> codes) {
        this.codes = codes;
    }

    public ItemViewModel convert() {
        return new ItemViewModel(this);
    }


}
