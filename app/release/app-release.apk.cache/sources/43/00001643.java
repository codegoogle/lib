package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.a0;
import com.p7700g.p99005.wo1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: ExoSoSource.java */
/* loaded from: classes2.dex */
public final class n extends a0 {

    /* compiled from: ExoSoSource.java */
    /* loaded from: classes2.dex */
    public final class b extends a0.f {
        private final c[] s;

        /* compiled from: ExoSoSource.java */
        /* loaded from: classes2.dex */
        public final class a extends a0.e {
            private int s;

            private a() {
            }

            @Override // com.facebook.soloader.a0.e
            public boolean a() {
                return this.s < b.this.s.length;
            }

            @Override // com.facebook.soloader.a0.e
            public a0.d b() throws IOException {
                c[] cVarArr = b.this.s;
                int i = this.s;
                this.s = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.u);
                try {
                    return new a0.d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(a0 a0Var) throws IOException {
            boolean z;
            Context context = n.this.v;
            StringBuilder G = wo1.G("/data/local/tmp/exopackage/");
            G.append(context.getPackageName());
            G.append("/native-libs/");
            File file = new File(G.toString());
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String[] h = y.h();
            int length = h.length;
            int i = 0;
            int i2 = 0;
            loop0: while (i2 < length) {
                String str = h[i2];
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    linkedHashSet.add(str);
                    File file3 = new File(file2, "metadata.txt");
                    if (file3.isFile()) {
                        FileReader fileReader = new FileReader(file3);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    if (readLine.length() != 0) {
                                        int indexOf = readLine.indexOf(32);
                                        if (indexOf == -1) {
                                            break loop0;
                                        }
                                        String str2 = readLine.substring(i, indexOf) + ".so";
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                z = false;
                                                break;
                                            } else if (((c) arrayList.get(i3)).s.equals(str2)) {
                                                z = true;
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        if (!z) {
                                            String substring = readLine.substring(indexOf + 1);
                                            arrayList.add(new c(str2, substring, new File(file2, substring)));
                                        }
                                        i = 0;
                                    }
                                } else {
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                            }
                        } finally {
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
                i = 0;
            }
            a0Var.s((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            this.s = (c[]) arrayList.toArray(new c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.a0.f
        public a0.c a() throws IOException {
            return new a0.c(this.s);
        }

        @Override // com.facebook.soloader.a0.f
        public a0.e b() throws IOException {
            return new a();
        }
    }

    /* compiled from: ExoSoSource.java */
    /* loaded from: classes2.dex */
    public static final class c extends a0.b {
        public final File u;

        public c(String str, String str2, File file) {
            super(str, str2);
            this.u = file;
        }
    }

    public n(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.a0
    public a0.f o() throws IOException {
        return new b(this);
    }
}