package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.p7700g.p99005.n10;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* compiled from: CursorLoader.java */
/* loaded from: classes.dex */
public class m10 extends l10<Cursor> {
    public final n10<Cursor>.a r;
    public Uri s;
    public String[] t;
    public String u;
    public String[] v;
    public String w;
    public Cursor x;
    public nm y;

    public m10(@x1 Context context) {
        super(context);
        this.r = new n10.a();
    }

    @Override // com.p7700g.p99005.l10
    public void D() {
        super.D();
        synchronized (this) {
            nm nmVar = this.y;
            if (nmVar != null) {
                nmVar.a();
            }
        }
    }

    @Override // com.p7700g.p99005.n10
    /* renamed from: N */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.x;
        this.x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @z1
    public String[] O() {
        return this.t;
    }

    @z1
    public String P() {
        return this.u;
    }

    @z1
    public String[] Q() {
        return this.v;
    }

    @z1
    public String R() {
        return this.w;
    }

    @x1
    public Uri S() {
        return this.s;
    }

    @Override // com.p7700g.p99005.l10
    /* renamed from: T */
    public Cursor I() {
        synchronized (this) {
            if (!H()) {
                this.y = new nm();
            } else {
                throw new zm();
            }
        }
        try {
            Cursor a = eh.a(i().getContentResolver(), this.s, this.t, this.u, this.v, this.w, this.y);
            if (a != null) {
                try {
                    a.getCount();
                    a.registerContentObserver(this.r);
                } catch (RuntimeException e) {
                    a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.y = null;
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.y = null;
                throw th;
            }
        }
    }

    @Override // com.p7700g.p99005.l10
    /* renamed from: U */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@z1 String[] strArr) {
        this.t = strArr;
    }

    public void W(@z1 String str) {
        this.u = str;
    }

    public void X(@z1 String[] strArr) {
        this.v = strArr;
    }

    public void Y(@z1 String str) {
        this.w = str;
    }

    public void Z(@x1 Uri uri) {
        this.s = uri;
    }

    @Override // com.p7700g.p99005.l10, com.p7700g.p99005.n10
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.h);
    }

    @Override // com.p7700g.p99005.n10
    public void r() {
        super.r();
        t();
        Cursor cursor = this.x;
        if (cursor != null && !cursor.isClosed()) {
            this.x.close();
        }
        this.x = null;
    }

    @Override // com.p7700g.p99005.n10
    public void s() {
        Cursor cursor = this.x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.x == null) {
            h();
        }
    }

    @Override // com.p7700g.p99005.n10
    public void t() {
        b();
    }

    public m10(@x1 Context context, @x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        super(context);
        this.r = new n10.a();
        this.s = uri;
        this.t = strArr;
        this.u = str;
        this.v = strArr2;
        this.w = str2;
    }
}