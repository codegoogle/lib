package com.p7700g.p99005;

import java.util.List;

/* compiled from: WorkNameDao.java */
@a40
/* loaded from: classes.dex */
public interface re0 {
    @r40(onConflict = 5)
    void a(qe0 workName);

    @y40("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> b(String name);

    @x1
    @y40("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> c(@x1 String workSpecId);
}