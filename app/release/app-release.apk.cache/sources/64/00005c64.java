package com.p7700g.p99005;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: AggregateException.java */
/* loaded from: classes.dex */
public class sp0 extends Exception {
    private static final long s = 1;
    private static final String t = "There were multiple errors.";
    private List<Throwable> u;

    public sp0(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    @Deprecated
    public Throwable[] f() {
        List<Throwable> list = this.u;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    @x1
    @Deprecated
    public List<Exception> g() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.u;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public List<Throwable> h() {
        return this.u;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@x1 PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.u) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    public sp0(String str, @z1 List<? extends Throwable> list) {
        super(str, (list == null || list.size() <= 0) ? null : list.get(0));
        this.u = Collections.unmodifiableList(list);
    }

    public sp0(List<? extends Throwable> list) {
        this(t, list);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@x1 PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.u) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}