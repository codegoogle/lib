package com.p7700g.p99005;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.p7700g.p99005.du1;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes2.dex */
public class iu1<Data> implements du1<Integer, Data> {
    private static final String a = "ResourceLoader";
    private final du1<Uri, Data> b;
    private final Resources c;

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes2.dex */
    public static final class a implements eu1<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        public du1<Integer, AssetFileDescriptor> c(hu1 hu1Var) {
            return new iu1(this.a, hu1Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements eu1<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Integer, ParcelFileDescriptor> c(hu1 hu1Var) {
            return new iu1(this.a, hu1Var.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes2.dex */
    public static class c implements eu1<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Integer, InputStream> c(hu1 hu1Var) {
            return new iu1(this.a, hu1Var.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes2.dex */
    public static class d implements eu1<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Integer, Uri> c(hu1 hu1Var) {
            return new iu1(this.a, lu1.c());
        }
    }

    public iu1(Resources resources, du1<Uri, Data> du1Var) {
        this.c = resources;
        this.b = du1Var;
    }

    @z1
    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.c.getResourcePackageName(num.intValue()) + j14.P + this.c.getResourceTypeName(num.intValue()) + j14.P + this.c.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (Log.isLoggable(a, 5)) {
                String str = "Received invalid resource id: " + num;
                return null;
            }
            return null;
        }
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 Integer num, int i, int i2, @x1 jq1 jq1Var) {
        Uri d2 = d(num);
        if (d2 == null) {
            return null;
        }
        return this.b.b(d2, i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: e */
    public boolean a(@x1 Integer num) {
        return true;
    }
}