package com.p7700g.p99005;

import com.google.android.gms.internal.firebase_messaging.zzx;
import com.google.android.gms.internal.firebase_messaging.zzz;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class av2 {
    private static final av2 a = new a().a();
    private final long b;
    private final String c;
    private final String d;
    private final c e;
    private final d f;
    private final String g;
    private final String h;
    private final int i;
    private final int j;
    private final String k;
    private final long l;
    private final b m;
    private final String n;
    private final long o;
    private final String p;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class a {
        private long a = 0;
        private String b = "";
        private String c = "";
        private c d = c.UNKNOWN;
        private d e = d.UNKNOWN_OS;
        private String f = "";
        private String g = "";
        private int h = 0;
        private int i = 0;
        private String j = "";
        private long k = 0;
        private b l = b.UNKNOWN_EVENT;
        private String m = "";
        private long n = 0;
        private String o = "";

        @x1
        public av2 a() {
            return new av2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        @x1
        public a b(@x1 String str) {
            this.m = str;
            return this;
        }

        @x1
        public a c(long j) {
            this.k = j;
            return this;
        }

        @x1
        public a d(long j) {
            this.n = j;
            return this;
        }

        @x1
        public a e(@x1 String str) {
            this.g = str;
            return this;
        }

        @x1
        public a f(@x1 String str) {
            this.o = str;
            return this;
        }

        @x1
        public a g(@x1 b bVar) {
            this.l = bVar;
            return this;
        }

        @x1
        public a h(@x1 String str) {
            this.c = str;
            return this;
        }

        @x1
        public a i(@x1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public a j(@x1 c cVar) {
            this.d = cVar;
            return this;
        }

        @x1
        public a k(@x1 String str) {
            this.f = str;
            return this;
        }

        @x1
        public a l(int i) {
            this.h = i;
            return this;
        }

        @x1
        public a m(long j) {
            this.a = j;
            return this;
        }

        @x1
        public a n(@x1 d dVar) {
            this.e = dVar;
            return this;
        }

        @x1
        public a o(@x1 String str) {
            this.j = str;
            return this;
        }

        @x1
        public a p(int i) {
            this.i = i;
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public enum b implements zzx {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int w;

        b(int i) {
            this.w = i;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzx
        public int getNumber() {
            return this.w;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public enum c implements zzx {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int x;

        c(int i) {
            this.x = i;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzx
        public int getNumber() {
            return this.x;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public enum d implements zzx {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int x;

        d(int i) {
            this.x = i;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzx
        public int getNumber() {
            return this.x;
        }
    }

    public av2(long j, String str, String str2, c cVar, d dVar, String str3, String str4, int i, int i2, String str5, long j2, b bVar, String str6, long j3, String str7) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = cVar;
        this.f = dVar;
        this.g = str3;
        this.h = str4;
        this.i = i;
        this.j = i2;
        this.k = str5;
        this.l = j2;
        this.m = bVar;
        this.n = str6;
        this.o = j3;
        this.p = str7;
    }

    @x1
    public static av2 f() {
        return a;
    }

    @x1
    public static a q() {
        return new a();
    }

    @x1
    @zzz(zza = 13)
    public String a() {
        return this.n;
    }

    @zzz(zza = 11)
    public long b() {
        return this.l;
    }

    @zzz(zza = 14)
    public long c() {
        return this.o;
    }

    @x1
    @zzz(zza = 7)
    public String d() {
        return this.h;
    }

    @x1
    @zzz(zza = 15)
    public String e() {
        return this.p;
    }

    @x1
    @zzz(zza = 12)
    public b g() {
        return this.m;
    }

    @x1
    @zzz(zza = 3)
    public String h() {
        return this.d;
    }

    @x1
    @zzz(zza = 2)
    public String i() {
        return this.c;
    }

    @x1
    @zzz(zza = 4)
    public c j() {
        return this.e;
    }

    @x1
    @zzz(zza = 6)
    public String k() {
        return this.g;
    }

    @zzz(zza = 8)
    public int l() {
        return this.i;
    }

    @zzz(zza = 1)
    public long m() {
        return this.b;
    }

    @x1
    @zzz(zza = 5)
    public d n() {
        return this.f;
    }

    @x1
    @zzz(zza = 10)
    public String o() {
        return this.k;
    }

    @zzz(zza = 9)
    public int p() {
        return this.j;
    }
}