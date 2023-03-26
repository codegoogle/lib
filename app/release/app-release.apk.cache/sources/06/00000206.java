package androidx.lifecycle;

import com.p7700g.p99005.hz;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements oz {
    private final hz s;
    private final oz t;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            mz.b.values();
            int[] iArr = new int[7];
            a = iArr;
            try {
                iArr[mz.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mz.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mz.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mz.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[mz.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[mz.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[mz.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(hz hzVar, oz ozVar) {
        this.s = hzVar;
        this.t = ozVar;
    }

    @Override // com.p7700g.p99005.oz
    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                this.s.b(qzVar);
                break;
            case 1:
                this.s.h(qzVar);
                break;
            case 2:
                this.s.a(qzVar);
                break;
            case 3:
                this.s.c(qzVar);
                break;
            case 4:
                this.s.d(qzVar);
                break;
            case 5:
                this.s.g(qzVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        oz ozVar = this.t;
        if (ozVar != null) {
            ozVar.i(qzVar, bVar);
        }
    }
}