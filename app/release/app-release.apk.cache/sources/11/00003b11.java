package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShortcutInfoCompatSaver.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class bi<T> {

    /* compiled from: ShortcutInfoCompatSaver.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends bi<Void> {
        @Override // com.p7700g.p99005.bi
        /* renamed from: e */
        public Void a(List<ai> list) {
            return null;
        }

        @Override // com.p7700g.p99005.bi
        /* renamed from: f */
        public Void c() {
            return null;
        }

        @Override // com.p7700g.p99005.bi
        /* renamed from: g */
        public Void d(List<String> list) {
            return null;
        }
    }

    @o0
    public abstract T a(List<ai> list);

    @s2
    public List<ai> b() throws Exception {
        return new ArrayList();
    }

    @o0
    public abstract T c();

    @o0
    public abstract T d(List<String> list);
}