package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: WorkName.java */
@i2({i2.a.LIBRARY_GROUP})
@g40(foreignKeys = {@j40(childColumns = {"work_spec_id"}, entity = we0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@q40({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
/* loaded from: classes.dex */
public class qe0 {
    @x1
    @z30(name = "name")
    public final String a;
    @x1
    @z30(name = "work_spec_id")
    public final String b;

    public qe0(@x1 String name, @x1 String workSpecId) {
        this.a = name;
        this.b = workSpecId;
    }
}