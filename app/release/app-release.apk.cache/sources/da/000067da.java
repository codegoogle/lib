package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultMediaPicker.java */
/* loaded from: classes3.dex */
public class yp5 implements sp5 {
    private static final String a = "com.p7700g.p99005.yp5";
    private static final int b = 5000;
    public String c = "video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)";
    private int d;
    private int e;
    private int f;
    private Context g;

    /* compiled from: DefaultMediaPicker.java */
    /* loaded from: classes3.dex */
    public class b implements Comparator<op5> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(op5 obj1, op5 obj2) {
            int intValue = obj1.d().intValue() * obj1.h().intValue();
            int intValue2 = obj2.d().intValue() * obj2.h().intValue();
            int abs = Math.abs(intValue - yp5.this.f);
            int abs2 = Math.abs(intValue2 - yp5.this.f);
            String str = yp5.a;
            bq5.g(str, "AreaComparator: obj1:" + abs + " obj2:" + abs2);
            if (abs < abs2) {
                return -1;
            }
            return abs > abs2 ? 1 : 0;
        }
    }

    public yp5(Context context) {
        this.g = context;
        g();
    }

    private op5 d(List<op5> list) {
        bq5.a(a, "getBestMatch");
        for (op5 op5Var : list) {
            if (e(op5Var)) {
                return op5Var;
            }
        }
        return null;
    }

    private boolean e(op5 media) {
        return media.f().matches(this.c);
    }

    private int f(List<op5> mediaFiles) {
        Iterator<op5> it = mediaFiles.iterator();
        while (it.hasNext()) {
            op5 next = it.next();
            if (TextUtils.isEmpty(next.f())) {
                bq5.a(a, "Validator error: mediaFile type empty");
                it.remove();
            } else if (TextUtils.isEmpty(next.g())) {
                bq5.a(a, "Validator error: mediaFile url empty");
                it.remove();
            }
        }
        return mediaFiles.size();
    }

    private void g() {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.d = i;
        int i2 = displayMetrics.heightPixels;
        this.e = i2;
        this.f = i * i2;
    }

    private void h(int width, int height) {
        this.d = width;
        this.e = height;
        this.f = width * height;
    }

    @Override // com.p7700g.p99005.sp5
    public op5 a(List<op5> mediaFiles) {
        if (mediaFiles == null || f(mediaFiles) == 0) {
            return null;
        }
        Collections.sort(mediaFiles, new b());
        return d(mediaFiles);
    }

    public yp5(int width, int height) {
        h(width, height);
    }
}