package com.p7700g.p99005;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* compiled from: ContentResolverCompat.java */
/* loaded from: classes.dex */
public final class eh {

    /* compiled from: ContentResolverCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private eh() {
    }

    @z1
    public static Cursor a(@x1 ContentResolver contentResolver, @x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2, @z1 nm nmVar) {
        Object b;
        if (nmVar != null) {
            try {
                b = nmVar.b();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new zm();
                }
                throw e;
            }
        } else {
            b = null;
        }
        return a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) b);
    }
}