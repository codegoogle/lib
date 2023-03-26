package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public final class dc0 {
    @x1
    private UUID a;
    @x1
    private a b;
    @x1
    private kb0 c;
    @x1
    private Set<String> d;
    @x1
    private kb0 e;
    private int f;

    /* compiled from: WorkInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean f() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public dc0(@x1 UUID id, @x1 a state, @x1 kb0 outputData, @x1 List<String> tags, @x1 kb0 progress, int runAttemptCount) {
        this.a = id;
        this.b = state;
        this.c = outputData;
        this.d = new HashSet(tags);
        this.e = progress;
        this.f = runAttemptCount;
    }

    @x1
    public UUID a() {
        return this.a;
    }

    @x1
    public kb0 b() {
        return this.c;
    }

    @x1
    public kb0 c() {
        return this.e;
    }

    @p1(from = 0)
    public int d() {
        return this.f;
    }

    @x1
    public a e() {
        return this.b;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || dc0.class != o.getClass()) {
            return false;
        }
        dc0 dc0Var = (dc0) o;
        if (this.f == dc0Var.f && this.a.equals(dc0Var.a) && this.b == dc0Var.b && this.c.equals(dc0Var.c) && this.d.equals(dc0Var.d)) {
            return this.e.equals(dc0Var.e);
        }
        return false;
    }

    @x1
    public Set<String> f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return ((this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f;
    }

    public String toString() {
        StringBuilder G = wo1.G("WorkInfo{mId='");
        G.append(this.a);
        G.append('\'');
        G.append(", mState=");
        G.append(this.b);
        G.append(", mOutputData=");
        G.append(this.c);
        G.append(", mTags=");
        G.append(this.d);
        G.append(", mProgress=");
        G.append(this.e);
        G.append('}');
        return G.toString();
    }
}