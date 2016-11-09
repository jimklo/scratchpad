package com.sri.jklo.vm;


import com.sri.jklo.interfaces.IViewModel;
import com.sri.jklo.m.Code;

/**
 * @author charliegels on 6/21/16.
 */
public class CodeViewModel extends AbstractViewModel implements IViewModel<String, Code> {

    private static final long serialVersionUID = -4077464703888615504L;

    private String name = "";
    private Boolean active = true;


    public CodeViewModel() {
        super();
    }

    public CodeViewModel(Code code) {
        super(code);
        this.name = code.getName();
        this.active = code.getActive();

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof CodeViewModel)) return false;

        CodeViewModel code = (CodeViewModel) o;

        if (getId() != null ? !getId().equals(code.getId()) : code.getId() != null) return false;
        if (!getName().equals(code.getName())) return false;
        return getActive().equals(code.getActive());

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getName().hashCode();
        result = 31 * result + getActive().hashCode();
        return result;
    }

    @Override
    public Code convert() {
        return new Code(this);
    }
}
