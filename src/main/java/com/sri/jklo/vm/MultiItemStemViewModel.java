package com.sri.jklo.vm;

import com.sri.jklo.interfaces.IItemViewModel;
import com.sri.jklo.interfaces.IPersistent;

import java.io.Serializable;

/**
 * Created by jklo on 10/25/16.
 */

public class MultiItemStemViewModel implements Serializable {

    private static final long serialVersionUID = 3087672368384133543L;

    private IItemViewModel<String, IPersistent> item;
    private String instrumentId;
    private String classname;
    private String id;
    private String text;
    private Integer itemIndex;
    private Integer subItemIndex;

    public MultiItemStemViewModel() {

    }



    public MultiItemStemViewModel(IPersistent<String, IItemViewModel> item, String instrumentId, Integer itemIndex) {
        this(item,instrumentId,itemIndex,-1);
    }

    public MultiItemStemViewModel(IPersistent<String, IItemViewModel> item, String instrumentId, Integer itemIndex, Integer subItemIndex) {
        this.item = item.convert();
        this.instrumentId = instrumentId;
        this.itemIndex = itemIndex;
        this.subItemIndex = subItemIndex;
        init();
    }

    public MultiItemStemViewModel(IItemViewModel<String, IPersistent> item, String instrumentId) {
        this.item = item;
        this.instrumentId = instrumentId;
        init();

    }

    private void init() {
        this.id = this.item.getId();
        this.classname = this.item.getClass().getName();
        this.text = this.item.getText();
    }


    public IItemViewModel<String, ? extends IPersistent> getItem() {
        return item;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public void setItem(IPersistent<String, IItemViewModel> item) {
        this.item = item.convert();
    }


    public void setItem(IItemViewModel<String, IPersistent> item) {
        this.item = item;
    }


    public ItemViewModel getSubItem() {
        ItemViewModel ret;
        if (this.item instanceof ItemViewModel) {
            ret =  (ItemViewModel)this.item;
        } else {
            ret = null;
        }
        return ret;
    }


    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getItemIndex() {
        return itemIndex;
    }

    public void setItemIndex(Integer itemIndex) {
        this.itemIndex = itemIndex;
    }

    public Integer getSubItemIndex() {
        return subItemIndex;
    }

    public void setSubItemIndex(Integer subItemIndex) {
        this.subItemIndex = subItemIndex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultiItemStemViewModel that = (MultiItemStemViewModel) o;

        if (getItem() != null ? !getItem().equals(that.getItem()) : that.getItem() != null) return false;
        if (getInstrumentId() != null ? !getInstrumentId().equals(that.getInstrumentId()) : that.getInstrumentId() != null)
            return false;
        if (getClassname() != null ? !getClassname().equals(that.getClassname()) : that.getClassname() != null)
            return false;
        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getText() != null ? !getText().equals(that.getText()) : that.getText() != null) return false;
        if (getItemIndex() != null ? !getItemIndex().equals(that.getItemIndex()) : that.getItemIndex() != null)
            return false;
        return !(getSubItemIndex() != null ? !getSubItemIndex().equals(that.getSubItemIndex()) : that.getSubItemIndex() != null);

    }

    @Override
    public int hashCode() {
        int result = getItem() != null ? getItem().hashCode() : 0;
        result = 31 * result + (getInstrumentId() != null ? getInstrumentId().hashCode() : 0);
        result = 31 * result + (getClassname() != null ? getClassname().hashCode() : 0);
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (getItemIndex() != null ? getItemIndex().hashCode() : 0);
        result = 31 * result + (getSubItemIndex() != null ? getSubItemIndex().hashCode() : 0);
        return result;
    }

}
