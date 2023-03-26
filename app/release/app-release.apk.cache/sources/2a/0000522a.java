package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: SystemIdInfo.java */
@i2({i2.a.LIBRARY_GROUP})
@g40(foreignKeys = {@j40(childColumns = {"work_spec_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
/* loaded from: classes.dex */
public class ne0 {
    @x1
    @x40
    @z30(name = "work_spec_id")
    public final String a;
    @z30(name = "system_id")
    public final int b;

    public ne0(@x1 String workSpecId, int systemId) {
        this.a = workSpecId;
        this.b = systemId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ne0) {
            ne0 ne0Var = (ne0) o;
            if (this.b != ne0Var.b) {
                return false;
            }
            return this.a.equals(ne0Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}