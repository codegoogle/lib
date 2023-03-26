package com.p7700g.p99005;

/* compiled from: ChooseRowModel.java */
/* loaded from: classes.dex */
public class qg0 {
    public Integer a;
    public Boolean b;

    public qg0(int id, boolean isSelected) {
        this.b = Boolean.FALSE;
        this.a = Integer.valueOf(id);
        this.b = Boolean.valueOf(isSelected);
    }

    public Integer a() {
        return this.a;
    }

    public Boolean b() {
        return this.b;
    }

    public void c(Integer id) {
        this.a = id;
    }

    public void d(Boolean selected) {
        this.b = selected;
    }
}