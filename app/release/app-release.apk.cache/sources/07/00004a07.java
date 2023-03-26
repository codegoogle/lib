package com.p7700g.p99005;

import android.net.Uri;
import com.p7700g.p99005.i2;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class jb0 {
    private final Set<a> a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: classes.dex */
    public static final class a {
        @x1
        private final Uri a;
        private final boolean b;

        public a(@x1 Uri uri, boolean triggerForDescendants) {
            this.a = uri;
            this.b = triggerForDescendants;
        }

        @x1
        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || a.class != o.getClass()) {
                return false;
            }
            a aVar = (a) o;
            return this.b == aVar.b && this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(@x1 Uri uri, boolean triggerForDescendants) {
        this.a.add(new a(uri, triggerForDescendants));
    }

    @x1
    public Set<a> b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || jb0.class != o.getClass()) {
            return false;
        }
        return this.a.equals(((jb0) o).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}