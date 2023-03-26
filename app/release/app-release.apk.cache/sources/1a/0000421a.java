package com.p7700g.p99005;

import android.app.Activity;
import com.p7700g.p99005.ec2;

/* compiled from: DynamicColorsOptions.java */
/* loaded from: classes3.dex */
public class fc2 {
    private static final ec2.f a = new a();
    private static final ec2.e b = new b();
    @m2
    private final int c;
    @x1
    private final ec2.f d;
    @x1
    private final ec2.e e;

    /* compiled from: DynamicColorsOptions.java */
    /* loaded from: classes3.dex */
    public class a implements ec2.f {
        @Override // com.p7700g.p99005.ec2.f
        public boolean a(@x1 Activity activity, int i) {
            return true;
        }
    }

    /* compiled from: DynamicColorsOptions.java */
    /* loaded from: classes3.dex */
    public class b implements ec2.e {
        @Override // com.p7700g.p99005.ec2.e
        public void a(@x1 Activity activity) {
        }
    }

    /* compiled from: DynamicColorsOptions.java */
    /* loaded from: classes3.dex */
    public static class c {
        @m2
        private int a;
        @x1
        private ec2.f b = fc2.a;
        @x1
        private ec2.e c = fc2.b;

        @x1
        public fc2 d() {
            return new fc2(this, null);
        }

        @x1
        public c e(@x1 ec2.e eVar) {
            this.c = eVar;
            return this;
        }

        @x1
        public c f(@x1 ec2.f fVar) {
            this.b = fVar;
            return this;
        }

        @x1
        public c g(@m2 int i) {
            this.a = i;
            return this;
        }
    }

    public /* synthetic */ fc2(c cVar, a aVar) {
        this(cVar);
    }

    @x1
    public ec2.e c() {
        return this.e;
    }

    @x1
    public ec2.f d() {
        return this.d;
    }

    @m2
    public int e() {
        return this.c;
    }

    private fc2(c cVar) {
        this.c = cVar.a;
        this.d = cVar.b;
        this.e = cVar.c;
    }
}