package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;

/* compiled from: TreeDocumentFile.java */
@e2(21)
/* loaded from: classes.dex */
public class ku extends gu {
    private Context c;
    private Uri d;

    public ku(@z1 gu guVar, Context context, Uri uri) {
        super(guVar);
        this.c = context;
        this.d = uri;
    }

    private static void w(@z1 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @z1
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.gu
    public boolean a() {
        return hu.a(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean b() {
        return hu.b(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public gu c(String str) {
        Uri x = x(this.c, this.d, "vnd.android.document/directory", str);
        if (x != null) {
            return new ku(this, this.c, x);
        }
        return null;
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public gu d(String str, String str2) {
        Uri x = x(this.c, this.d, str, str2);
        if (x != null) {
            return new ku(this, this.c, x);
        }
        return null;
    }

    @Override // com.p7700g.p99005.gu
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p7700g.p99005.gu
    public boolean f() {
        return hu.d(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public String k() {
        return hu.f(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public String m() {
        return hu.h(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public Uri n() {
        return this.d;
    }

    @Override // com.p7700g.p99005.gu
    public boolean o() {
        return hu.i(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean q() {
        return hu.j(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean r() {
        return hu.k(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public long s() {
        return hu.l(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public long t() {
        return hu.m(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public gu[] u() {
        ContentResolver contentResolver = this.c.getContentResolver();
        Uri uri = this.d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.d, cursor.getString(0)));
                }
            } catch (Exception e) {
                String str = "Failed query: " + e;
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            gu[] guVarArr = new gu[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                guVarArr[i] = new ku(this, this.c, uriArr[i]);
            }
            return guVarArr;
        } finally {
            w(cursor);
        }
    }

    @Override // com.p7700g.p99005.gu
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.c.getContentResolver(), this.d, str);
            if (renameDocument != null) {
                this.d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}