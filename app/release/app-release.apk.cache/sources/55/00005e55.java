package com.p7700g.p99005;

import com.p7700g.p99005.em3;
import com.p7700g.p99005.jm3;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/* compiled from: OSDynamicTriggerController.java */
/* loaded from: classes3.dex */
public class tj3 {
    private static final double a = 0.3d;
    private static final long b = 999999;
    private static Date c = new Date();
    private final c d;
    private final ArrayList<String> e = new ArrayList<>();

    /* compiled from: OSDynamicTriggerController.java */
    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public final /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            tj3.this.e.remove(this.s);
            tj3.this.d.a();
        }
    }

    /* compiled from: OSDynamicTriggerController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            em3.b.values();
            int[] iArr = new int[9];
            b = iArr;
            try {
                iArr[em3.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[em3.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[em3.b.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[em3.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[em3.b.EQUAL_TO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[em3.b.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            em3.a.values();
            int[] iArr2 = new int[4];
            a = iArr2;
            try {
                iArr2[em3.a.SESSION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[em3.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: OSDynamicTriggerController.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(String str);
    }

    public tj3(c cVar) {
        this.d = cVar;
    }

    private static boolean d(double d, double d2, em3.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return d2 >= d;
        } else if (ordinal == 1) {
            return d2 < d;
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return d2 <= d || f(d, d2);
                } else if (ordinal == 5) {
                    return d2 >= d || f(d, d2);
                } else {
                    jm3.u0 u0Var = jm3.u0.ERROR;
                    StringBuilder G = wo1.G("Attempted to apply an invalid operator on a time-based in-app-message trigger: ");
                    G.append(bVar.toString());
                    jm3.P1(u0Var, G.toString());
                    return false;
                }
            }
            return !f(d, d2);
        } else {
            return f(d, d2);
        }
    }

    public static void e() {
        c = new Date();
    }

    private static boolean f(double d, double d2) {
        return Math.abs(d - d2) < a;
    }

    public boolean c(em3 em3Var) {
        long time;
        long time2;
        long j;
        if (em3Var.e == null) {
            return false;
        }
        synchronized (this.e) {
            if (em3Var.e instanceof Number) {
                int ordinal = em3Var.b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        j = 0;
                    } else {
                        time = new Date().getTime();
                        time2 = c.getTime();
                        j = time - time2;
                    }
                } else if (jm3.u0().d0()) {
                    return false;
                } else {
                    Date date = jm3.u0().z;
                    if (date == null) {
                        j = b;
                    } else {
                        time = new Date().getTime();
                        time2 = date.getTime();
                        j = time - time2;
                    }
                }
                String str = em3Var.a;
                long doubleValue = (long) (((Number) em3Var.e).doubleValue() * 1000.0d);
                if (d(doubleValue, j, em3Var.d)) {
                    this.d.b(str);
                    return true;
                }
                long j2 = doubleValue - j;
                if (j2 <= 0) {
                    return false;
                }
                if (this.e.contains(str)) {
                    return false;
                }
                uj3.a(new a(str), str, j2);
                this.e.add(str);
                return false;
            }
            return false;
        }
    }
}