package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.a0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;

/* compiled from: ExtractFromZipSoSource.java */
/* loaded from: classes2.dex */
public class o extends a0 {
    public final String A;
    public final File z;

    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends a0.b implements Comparable {
        public final ZipEntry u;
        public final int v;

        public b(String str, ZipEntry zipEntry, int i) {
            super(str, a(zipEntry));
            this.u = zipEntry;
            this.v = i;
        }

        private static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.s.compareTo(((b) obj).s);
        }
    }

    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes2.dex */
    public class c extends a0.f {
        @Nullable
        private b[] s;
        private final ZipFile t;
        private final a0 u;

        /* compiled from: ExtractFromZipSoSource.java */
        /* loaded from: classes2.dex */
        public final class a extends a0.e {
            private int s;

            private a() {
            }

            @Override // com.facebook.soloader.a0.e
            public boolean a() {
                c.this.f();
                return this.s < c.this.s.length;
            }

            @Override // com.facebook.soloader.a0.e
            public a0.d b() throws IOException {
                c.this.f();
                b[] bVarArr = c.this.s;
                int i = this.s;
                this.s = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.t.getInputStream(bVar.u);
                try {
                    return new a0.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public c(a0 a0Var) throws IOException {
            this.t = new ZipFile(o.this.z);
            this.u = a0Var;
        }

        @Override // com.facebook.soloader.a0.f
        public final a0.c a() throws IOException {
            return new a0.c(f());
        }

        @Override // com.facebook.soloader.a0.f
        public final a0.e b() throws IOException {
            return new a();
        }

        @Override // com.facebook.soloader.a0.f, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.t.close();
        }

        public final b[] f() {
            if (this.s == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(o.this.A);
                String[] h = y.h();
                Enumeration<? extends ZipEntry> entries = this.t.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e = y.e(h, group);
                        if (e >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || e < bVar.v) {
                                hashMap.put(group2, new b(group2, nextElement, e));
                            }
                        }
                    }
                }
                this.u.s((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    b bVar2 = bVarArr[i2];
                    if (h(bVar2.u, bVar2.s)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                b[] bVarArr2 = new b[i];
                int i3 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.s = bVarArr2;
            }
            return this.s;
        }

        public boolean h(ZipEntry zipEntry, String str) {
            return true;
        }
    }

    public o(Context context, String str, File file, String str2) {
        super(context, str);
        this.z = file;
        this.A = str2;
    }

    @Override // com.facebook.soloader.a0
    public a0.f o() throws IOException {
        return new c(this);
    }
}