package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.p7700g.p99005.vl0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class hj0 implements jj0, fj0 {
    private final String d;
    private final vl0 f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<jj0> e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            vl0.a.values();
            int[] iArr = new int[5];
            a = iArr;
            try {
                iArr[vl0.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[vl0.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[vl0.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[vl0.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[vl0.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public hj0(vl0 vl0Var) {
        this.d = vl0Var.c();
        this.f = vl0Var;
    }

    private void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).getPath());
        }
    }

    @TargetApi(19)
    private void c(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            jj0 jj0Var = this.e.get(size);
            if (jj0Var instanceof zi0) {
                zi0 zi0Var = (zi0) jj0Var;
                List<jj0> j = zi0Var.j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path path = j.get(size2).getPath();
                    path.transform(zi0Var.k());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(jj0Var.getPath());
            }
        }
        jj0 jj0Var2 = this.e.get(0);
        if (jj0Var2 instanceof zi0) {
            zi0 zi0Var2 = (zi0) jj0Var2;
            List<jj0> j2 = zi0Var2.j();
            for (int i = 0; i < j2.size(); i++) {
                Path path2 = j2.get(i).getPath();
                path2.transform(zi0Var2.k());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(jj0Var2.getPath());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b(list, list2);
        }
    }

    @Override // com.p7700g.p99005.fj0
    public void f(ListIterator<yi0> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            yi0 previous = listIterator.previous();
            if (previous instanceof jj0) {
                this.e.add((jj0) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.d;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int ordinal = this.f.b().ordinal();
        if (ordinal == 0) {
            a();
        } else if (ordinal == 1) {
            c(Path.Op.UNION);
        } else if (ordinal == 2) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            c(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            c(Path.Op.XOR);
        }
        return this.c;
    }
}