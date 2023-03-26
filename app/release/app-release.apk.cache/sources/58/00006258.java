package com.p7700g.p99005;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class vs {
    private final c a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements c {
        @x1
        private final Uri a;
        @x1
        private final ClipDescription b;
        @z1
        private final Uri c;

        public b(@x1 Uri uri, @x1 ClipDescription clipDescription, @z1 Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // com.p7700g.p99005.vs.c
        @z1
        public Uri a() {
            return this.c;
        }

        @Override // com.p7700g.p99005.vs.c
        @x1
        public Uri b() {
            return this.a;
        }

        @Override // com.p7700g.p99005.vs.c
        public void c() {
        }

        @Override // com.p7700g.p99005.vs.c
        @z1
        public Object d() {
            return null;
        }

        @Override // com.p7700g.p99005.vs.c
        public void e() {
        }

        @Override // com.p7700g.p99005.vs.c
        @x1
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        @z1
        Uri a();

        @x1
        Uri b();

        void c();

        @z1
        Object d();

        void e();

        @x1
        ClipDescription getDescription();
    }

    public vs(@x1 Uri uri, @x1 ClipDescription clipDescription, @z1 Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    @z1
    public static vs g(@z1 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new vs(new a(obj));
        }
        return null;
    }

    @x1
    public Uri a() {
        return this.a.b();
    }

    @x1
    public ClipDescription b() {
        return this.a.getDescription();
    }

    @z1
    public Uri c() {
        return this.a.a();
    }

    public void d() {
        this.a.e();
    }

    public void e() {
        this.a.c();
    }

    @z1
    public Object f() {
        return this.a.d();
    }

    /* compiled from: InputContentInfoCompat.java */
    @e2(25)
    /* loaded from: classes.dex */
    public static final class a implements c {
        @x1
        public final InputContentInfo a;

        public a(@x1 Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // com.p7700g.p99005.vs.c
        @z1
        public Uri a() {
            return this.a.getLinkUri();
        }

        @Override // com.p7700g.p99005.vs.c
        @x1
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // com.p7700g.p99005.vs.c
        public void c() {
            this.a.requestPermission();
        }

        @Override // com.p7700g.p99005.vs.c
        @x1
        public Object d() {
            return this.a;
        }

        @Override // com.p7700g.p99005.vs.c
        public void e() {
            this.a.releasePermission();
        }

        @Override // com.p7700g.p99005.vs.c
        @x1
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(@x1 Uri uri, @x1 ClipDescription clipDescription, @z1 Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private vs(@x1 c cVar) {
        this.a = cVar;
    }
}