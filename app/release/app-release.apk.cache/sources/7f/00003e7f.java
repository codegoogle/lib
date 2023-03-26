package com.p7700g.p99005;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes.dex */
public class dg {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    private static final int j = 8;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 4;
    public static final int n = 8;
    public static final int o = 16;
    public static final int p = 32;
    public static final int q = 64;
    public static final int r = 128;
    public static final int s = 256;
    public static final int t = 511;
    private final b u;

    /* compiled from: FrameMetricsAggregator.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a extends b {
        private static final int a = 1000000;
        private static final int b = 500000;
        private static HandlerThread c;
        private static Handler d;
        public int e;
        public SparseIntArray[] f = new SparseIntArray[9];
        private final ArrayList<WeakReference<Activity>> g = new ArrayList<>();
        public Window.OnFrameMetricsAvailableListener h = new Window$OnFrameMetricsAvailableListenerC0159a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: com.p7700g.p99005.dg$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0159a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC0159a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.e & 1) != 0) {
                    aVar.f(aVar.f[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.e & 2) != 0) {
                    aVar2.f(aVar2.f[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.e & 4) != 0) {
                    aVar3.f(aVar3.f[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.e & 8) != 0) {
                    aVar4.f(aVar4.f[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.e & 16) != 0) {
                    aVar5.f(aVar5.f[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.e & 64) != 0) {
                    aVar6.f(aVar6.f[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.e & 32) != 0) {
                    aVar7.f(aVar7.f[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.e & 128) != 0) {
                    aVar8.f(aVar8.f[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.e & 256) != 0) {
                    aVar9.f(aVar9.f[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i) {
            this.e = i;
        }

        @Override // com.p7700g.p99005.dg.b
        public void a(Activity activity) {
            if (c == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                c = handlerThread;
                handlerThread.start();
                d = new Handler(c.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f;
                if (sparseIntArrayArr[i] == null && (this.e & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.h, d);
            this.g.add(new WeakReference<>(activity));
        }

        @Override // com.p7700g.p99005.dg.b
        public SparseIntArray[] b() {
            return this.f;
        }

        @Override // com.p7700g.p99005.dg.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.g.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.h);
            return this.f;
        }

        @Override // com.p7700g.p99005.dg.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f;
            this.f = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // com.p7700g.p99005.dg.b
        public SparseIntArray[] e() {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.g.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.h);
                    this.g.remove(size);
                }
            }
            return this.f;
        }

        public void f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* loaded from: classes.dex */
    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    @i2({i2.a.u})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public dg() {
        this(1);
    }

    public void a(@x1 Activity activity) {
        this.u.a(activity);
    }

    @z1
    public SparseIntArray[] b() {
        return this.u.b();
    }

    @z1
    public SparseIntArray[] c(@x1 Activity activity) {
        return this.u.c(activity);
    }

    @z1
    public SparseIntArray[] d() {
        return this.u.d();
    }

    @z1
    public SparseIntArray[] e() {
        return this.u.e();
    }

    public dg(int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.u = new a(i2);
        } else {
            this.u = new b();
        }
    }
}