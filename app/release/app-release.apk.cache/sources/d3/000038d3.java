package com.p7700g.p99005;

import java.util.List;

/* compiled from: WorkTagDao.java */
@a40
/* loaded from: classes.dex */
public interface af0 {
    @r40(onConflict = 5)
    void a(ze0 workTag);

    @y40("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> b(String id);

    @y40("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> c(String tag);
}