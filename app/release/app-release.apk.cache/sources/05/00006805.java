package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p7700g.p99005.i2;

/* compiled from: SimpleCursorAdapter.java */
/* loaded from: classes.dex */
public class yt extends xt {
    @i2({i2.a.LIBRARY_GROUP})
    public int[] s;
    @i2({i2.a.LIBRARY_GROUP})
    public int[] t;
    private int u;
    private a v;
    private b w;
    public String[] x;

    /* compiled from: SimpleCursorAdapter.java */
    /* loaded from: classes.dex */
    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    /* compiled from: SimpleCursorAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public yt(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.u = -1;
        this.t = iArr;
        this.x = strArr;
        b(cursor, strArr);
    }

    private void b(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.s;
            if (iArr == null || iArr.length != length) {
                this.s = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.s[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.s = null;
    }

    public void a(Cursor cursor, String[] strArr, int[] iArr) {
        this.x = strArr;
        this.t = iArr;
        b(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // com.p7700g.p99005.vt
    public void bindView(View view, Context context, Cursor cursor) {
        b bVar = this.w;
        int[] iArr = this.t;
        int length = iArr.length;
        int[] iArr2 = this.s;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null ? bVar.a(findViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        j((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        i((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    public a c() {
        return this.v;
    }

    @Override // com.p7700g.p99005.vt, com.p7700g.p99005.wt.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.v;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i = this.u;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.convertToString(cursor);
    }

    public int d() {
        return this.u;
    }

    public b e() {
        return this.w;
    }

    public void f(a aVar) {
        this.v = aVar;
    }

    public void g(int i) {
        this.u = i;
    }

    public void h(b bVar) {
        this.w = bVar;
    }

    public void i(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void j(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // com.p7700g.p99005.vt
    public Cursor swapCursor(Cursor cursor) {
        b(cursor, this.x);
        return super.swapCursor(cursor);
    }

    public yt(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.u = -1;
        this.t = iArr;
        this.x = strArr;
        b(cursor, strArr);
    }
}