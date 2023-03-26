package com.adssdk.Model;

public class ChooseRowModel {
    Integer id;
    Boolean isSelected = false;

    public ChooseRowModel(int id, boolean isSelected) {
        this.id = id;
        this.isSelected = isSelected;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }


}
