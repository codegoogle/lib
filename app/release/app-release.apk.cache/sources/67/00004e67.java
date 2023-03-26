package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import com.p7700g.p99005.we0;
import java.util.List;

/* compiled from: RawWorkInfoDao.java */
@a40
/* loaded from: classes.dex */
public interface le0 {
    @a50(observedEntities = {we0.class})
    @x1
    List<we0.c> a(@x1 q60 query);

    @a50(observedEntities = {we0.class})
    @x1
    LiveData<List<we0.c>> b(@x1 q60 query);
}