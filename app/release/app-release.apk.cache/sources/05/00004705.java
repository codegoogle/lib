package com.p7700g.p99005;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.rs2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class hq {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 1;
    @x1
    private final g h;

    /* compiled from: ContentInfoCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        @x1
        @e1
        public static Pair<ContentInfo, ContentInfo> a(@x1 ContentInfo contentInfo, @x1 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h = hq.h(clip, new kp() { // from class: com.p7700g.p99005.eq
                @Override // com.p7700g.p99005.kp
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (h.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (h.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h.second).build());
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(int i);

        void b(@z1 Uri uri);

        @x1
        hq build();

        void c(@x1 ClipData clipData);

        void i(int i);

        void setExtras(@z1 Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static final class f implements g {
        @x1
        private final ContentInfo a;

        public f(@x1 ContentInfo contentInfo) {
            this.a = (ContentInfo) jp.l(contentInfo);
        }

        @Override // com.p7700g.p99005.hq.g
        @z1
        public Uri a() {
            return this.a.getLinkUri();
        }

        @Override // com.p7700g.p99005.hq.g
        @x1
        public ClipData b() {
            return this.a.getClip();
        }

        @Override // com.p7700g.p99005.hq.g
        public int c() {
            return this.a.getFlags();
        }

        @Override // com.p7700g.p99005.hq.g
        @x1
        public ContentInfo d() {
            return this.a;
        }

        @Override // com.p7700g.p99005.hq.g
        public int e() {
            return this.a.getSource();
        }

        @Override // com.p7700g.p99005.hq.g
        @z1
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @x1
        public String toString() {
            StringBuilder G = wo1.G("ContentInfoCompat{");
            G.append(this.a);
            G.append("}");
            return G.toString();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        @z1
        Uri a();

        @x1
        ClipData b();

        int c();

        @z1
        ContentInfo d();

        int e();

        @z1
        Bundle getExtras();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class h implements g {
        @x1
        private final ClipData a;
        private final int b;
        private final int c;
        @z1
        private final Uri d;
        @z1
        private final Bundle e;

        public h(e eVar) {
            this.a = (ClipData) jp.l(eVar.a);
            this.b = jp.g(eVar.b, 0, 5, rs2.f.b);
            this.c = jp.k(eVar.c, 1);
            this.d = eVar.d;
            this.e = eVar.e;
        }

        @Override // com.p7700g.p99005.hq.g
        @z1
        public Uri a() {
            return this.d;
        }

        @Override // com.p7700g.p99005.hq.g
        @x1
        public ClipData b() {
            return this.a;
        }

        @Override // com.p7700g.p99005.hq.g
        public int c() {
            return this.c;
        }

        @Override // com.p7700g.p99005.hq.g
        @z1
        public ContentInfo d() {
            return null;
        }

        @Override // com.p7700g.p99005.hq.g
        public int e() {
            return this.b;
        }

        @Override // com.p7700g.p99005.hq.g
        @z1
        public Bundle getExtras() {
            return this.e;
        }

        @x1
        public String toString() {
            String sb;
            StringBuilder G = wo1.G("ContentInfoCompat{clip=");
            G.append(this.a.getDescription());
            G.append(", source=");
            G.append(hq.k(this.b));
            G.append(", flags=");
            G.append(hq.b(this.c));
            if (this.d == null) {
                sb = "";
            } else {
                StringBuilder G2 = wo1.G(", hasLinkUri(");
                G2.append(this.d.toString().length());
                G2.append(")");
                sb = G2.toString();
            }
            G.append(sb);
            return wo1.C(G, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    /* compiled from: ContentInfoCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* compiled from: ContentInfoCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public hq(@x1 g gVar) {
        this.h = gVar;
    }

    @x1
    public static ClipData a(@x1 ClipDescription clipDescription, @x1 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            clipData.addItem(list.get(i2));
        }
        return clipData;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static String b(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    @x1
    public static Pair<ClipData, ClipData> h(@x1 ClipData clipData, @x1 kp<ClipData.Item> kpVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            ClipData.Item itemAt = clipData.getItemAt(i2);
            if (kpVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @e2(31)
    @x1
    public static Pair<ContentInfo, ContentInfo> i(@x1 ContentInfo contentInfo, @x1 Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static String k(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @e2(31)
    @x1
    public static hq m(@x1 ContentInfo contentInfo) {
        return new hq(new f(contentInfo));
    }

    @x1
    public ClipData c() {
        return this.h.b();
    }

    @z1
    public Bundle d() {
        return this.h.getExtras();
    }

    public int e() {
        return this.h.c();
    }

    @z1
    public Uri f() {
        return this.h.a();
    }

    public int g() {
        return this.h.e();
    }

    @x1
    public Pair<hq, hq> j(@x1 kp<ClipData.Item> kpVar) {
        ClipData b2 = this.h.b();
        if (b2.getItemCount() == 1) {
            boolean test = kpVar.test(b2.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> h2 = h(b2, kpVar);
        if (h2.first == null) {
            return Pair.create(null, this);
        }
        if (h2.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new b(this).b((ClipData) h2.first).a(), new b(this).b((ClipData) h2.second).a());
    }

    @e2(31)
    @x1
    public ContentInfo l() {
        ContentInfo d2 = this.h.d();
        Objects.requireNonNull(d2);
        return d2;
    }

    @x1
    public String toString() {
        return this.h.toString();
    }

    /* compiled from: ContentInfoCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static final class c implements d {
        @x1
        private final ContentInfo.Builder a;

        public c(@x1 ClipData clipData, int i) {
            this.a = new ContentInfo.Builder(clipData, i);
        }

        @Override // com.p7700g.p99005.hq.d
        public void a(int i) {
            this.a.setSource(i);
        }

        @Override // com.p7700g.p99005.hq.d
        public void b(@z1 Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.p7700g.p99005.hq.d
        @x1
        public hq build() {
            return new hq(new f(this.a.build()));
        }

        @Override // com.p7700g.p99005.hq.d
        public void c(@x1 ClipData clipData) {
            this.a.setClip(clipData);
        }

        @Override // com.p7700g.p99005.hq.d
        public void i(int i) {
            this.a.setFlags(i);
        }

        @Override // com.p7700g.p99005.hq.d
        public void setExtras(@z1 Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public c(@x1 hq hqVar) {
            this.a = new ContentInfo.Builder(hqVar.l());
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class e implements d {
        @x1
        public ClipData a;
        public int b;
        public int c;
        @z1
        public Uri d;
        @z1
        public Bundle e;

        public e(@x1 ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.p7700g.p99005.hq.d
        public void a(int i) {
            this.b = i;
        }

        @Override // com.p7700g.p99005.hq.d
        public void b(@z1 Uri uri) {
            this.d = uri;
        }

        @Override // com.p7700g.p99005.hq.d
        @x1
        public hq build() {
            return new hq(new h(this));
        }

        @Override // com.p7700g.p99005.hq.d
        public void c(@x1 ClipData clipData) {
            this.a = clipData;
        }

        @Override // com.p7700g.p99005.hq.d
        public void i(int i) {
            this.c = i;
        }

        @Override // com.p7700g.p99005.hq.d
        public void setExtras(@z1 Bundle bundle) {
            this.e = bundle;
        }

        public e(@x1 hq hqVar) {
            this.a = hqVar.c();
            this.b = hqVar.g();
            this.c = hqVar.e();
            this.d = hqVar.f();
            this.e = hqVar.d();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b {
        @x1
        private final d a;

        public b(@x1 hq hqVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new c(hqVar);
            } else {
                this.a = new e(hqVar);
            }
        }

        @x1
        public hq a() {
            return this.a.build();
        }

        @x1
        public b b(@x1 ClipData clipData) {
            this.a.c(clipData);
            return this;
        }

        @x1
        public b c(@z1 Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        @x1
        public b d(int i) {
            this.a.i(i);
            return this;
        }

        @x1
        public b e(@z1 Uri uri) {
            this.a.b(uri);
            return this;
        }

        @x1
        public b f(int i) {
            this.a.a(i);
            return this;
        }

        public b(@x1 ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new c(clipData, i);
            } else {
                this.a = new e(clipData, i);
            }
        }
    }
}