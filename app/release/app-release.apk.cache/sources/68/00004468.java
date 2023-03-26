package com.p7700g.p99005;

import java.util.List;

/* compiled from: DependencyDao.java */
@a40
/* loaded from: classes.dex */
public interface ge0 {
    @r40(onConflict = 5)
    void a(fe0 dependency);

    @y40("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> b(String id);

    @y40("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(String id);

    @y40("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean d(String id);

    @y40("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> e(String id);
}