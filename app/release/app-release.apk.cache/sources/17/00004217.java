package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.p7700g.p99005.dc0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkQuery.java */
/* loaded from: classes.dex */
public final class fc0 {
    private final List<UUID> a;
    private final List<String> b;
    private final List<String> c;
    private final List<dc0.a> d;

    /* compiled from: WorkQuery.java */
    /* loaded from: classes.dex */
    public static final class a {
        public List<UUID> a = new ArrayList();
        public List<String> b = new ArrayList();
        public List<String> c = new ArrayList();
        public List<dc0.a> d = new ArrayList();

        private a() {
        }

        @x1
        @SuppressLint({"BuilderSetStyle"})
        public static a f(@x1 List<UUID> ids) {
            a aVar = new a();
            aVar.a(ids);
            return aVar;
        }

        @x1
        @SuppressLint({"BuilderSetStyle"})
        public static a g(@x1 List<dc0.a> states) {
            a aVar = new a();
            aVar.b(states);
            return aVar;
        }

        @x1
        @SuppressLint({"BuilderSetStyle"})
        public static a h(@x1 List<String> tags) {
            a aVar = new a();
            aVar.c(tags);
            return aVar;
        }

        @x1
        @SuppressLint({"BuilderSetStyle"})
        public static a i(@x1 List<String> uniqueWorkNames) {
            a aVar = new a();
            aVar.d(uniqueWorkNames);
            return aVar;
        }

        @x1
        public a a(@x1 List<UUID> ids) {
            this.a.addAll(ids);
            return this;
        }

        @x1
        public a b(@x1 List<dc0.a> states) {
            this.d.addAll(states);
            return this;
        }

        @x1
        public a c(@x1 List<String> tags) {
            this.c.addAll(tags);
            return this;
        }

        @x1
        public a d(@x1 List<String> uniqueWorkNames) {
            this.b.addAll(uniqueWorkNames);
            return this;
        }

        @x1
        public fc0 e() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new fc0(this);
        }
    }

    public fc0(@x1 a builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    @x1
    public List<UUID> a() {
        return this.a;
    }

    @x1
    public List<dc0.a> b() {
        return this.d;
    }

    @x1
    public List<String> c() {
        return this.c;
    }

    @x1
    public List<String> d() {
        return this.b;
    }
}