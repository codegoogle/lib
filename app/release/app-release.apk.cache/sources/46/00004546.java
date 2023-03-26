package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

/* compiled from: DocumentFile.java */
/* loaded from: classes.dex */
public abstract class gu {
    public static final String a = "DocumentFile";
    @z1
    private final gu b;

    public gu(@z1 gu guVar) {
        this.b = guVar;
    }

    @x1
    public static gu h(@x1 File file) {
        return new iu(null, file);
    }

    @z1
    public static gu i(@x1 Context context, @x1 Uri uri) {
        return new ju(null, context, uri);
    }

    @z1
    public static gu j(@x1 Context context, @x1 Uri uri) {
        return new ku(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@x1 Context context, @z1 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @z1
    public abstract gu c(@x1 String str);

    @z1
    public abstract gu d(@x1 String str, @x1 String str2);

    public abstract boolean e();

    public abstract boolean f();

    @z1
    public gu g(@x1 String str) {
        gu[] u;
        for (gu guVar : u()) {
            if (str.equals(guVar.k())) {
                return guVar;
            }
        }
        return null;
    }

    @z1
    public abstract String k();

    @z1
    public gu l() {
        return this.b;
    }

    @z1
    public abstract String m();

    @x1
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @x1
    public abstract gu[] u();

    public abstract boolean v(@x1 String str);
}