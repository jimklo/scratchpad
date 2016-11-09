package com.sri.jklo.vm;


import com.sri.jklo.interfaces.IItemViewModel;
import com.sri.jklo.interfaces.IViewModel;
import com.sri.jklo.m.Item;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author charliegels on 6/28/16.
 */
public class ItemViewModel extends AbstractViewModel implements IViewModel<String, Item>, IItemViewModel<String, Item> {

    private static final long serialVersionUID = 9211825603701763383L;
    private String subItemText = "";
    private Set<CodeViewModel> codes = new LinkedHashSet<>();


    public ItemViewModel() {
        super();
    }

    public ItemViewModel(Item item) {
        super(item);
        subItemText = item.getSubItemText();

        if (item.getCodes() != null) {
            item.getCodes().forEach(c -> {
                codes.add(new CodeViewModel(c));
            });
        }
    }


    public String getSubItemText() {
        return subItemText;
    }

    public void setSubItemText(String subItemText) {
        this.subItemText = subItemText;
    }

    public String getText() {
        return getSubItemText();
    }

    public void setText(String text) {
        setSubItemText(text);
    }

    public Set<CodeViewModel> getCodes() {
        return codes;
    }

    public void setCodes(Set<CodeViewModel> codes) {
        this.codes = codes;
    }


    @Override
    public Item convert() {
        return new Item(this);
    }
}
