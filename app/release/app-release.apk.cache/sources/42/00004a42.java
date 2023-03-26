package com.p7700g.p99005;

import androidx.lifecycle.LiveData;

/* compiled from: PreferenceDao.java */
@a40
/* loaded from: classes.dex */
public interface je0 {
    @x1
    @y40("SELECT long_value FROM Preference where `key`=:key")
    LiveData<Long> a(@x1 String key);

    @z1
    @y40("SELECT long_value FROM Preference where `key`=:key")
    Long b(@x1 String key);

    @r40(onConflict = 1)
    void c(@x1 ie0 preference);
}