package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: DocumentsContractCompat.java */
/* loaded from: classes.dex */
public final class pn {
    private static final String a = "tree";

    /* compiled from: DocumentsContractCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 512;

        private a() {
        }
    }

    /* compiled from: DocumentsContractCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @e1
        public static boolean b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @e1
        public static String c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @e1
        public static boolean d(Context context, @z1 Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    /* compiled from: DocumentsContractCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @e1
        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @e1
        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @e1
        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @e1
        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @e1
        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @e1
        public static Uri g(@x1 ContentResolver contentResolver, @x1 Uri uri, @x1 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* compiled from: DocumentsContractCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static boolean a(@x1 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @e1
        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private pn() {
    }

    @z1
    public static Uri a(@x1 String str, @z1 String str2) {
        return c.a(str, str2);
    }

    @z1
    public static Uri b(@x1 Uri uri, @x1 String str) {
        return c.b(uri, str);
    }

    @z1
    public static Uri c(@x1 String str, @x1 String str2) {
        return b.a(str, str2);
    }

    @z1
    public static Uri d(@x1 Uri uri, @x1 String str) {
        return c.c(uri, str);
    }

    @z1
    public static Uri e(@x1 String str, @x1 String str2) {
        return c.d(str, str2);
    }

    @z1
    public static Uri f(@x1 ContentResolver contentResolver, @x1 Uri uri, @x1 String str, @x1 String str2) throws FileNotFoundException {
        return c.e(contentResolver, uri, str, str2);
    }

    @z1
    public static String g(@x1 Uri uri) {
        return b.c(uri);
    }

    @z1
    public static String h(@x1 Uri uri) {
        return c.f(uri);
    }

    public static boolean i(@x1 Context context, @z1 Uri uri) {
        return b.d(context, uri);
    }

    public static boolean j(@x1 Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            return pathSegments.size() >= 2 && a.equals(pathSegments.get(0));
        }
        return d.a(uri);
    }

    public static boolean k(@x1 ContentResolver contentResolver, @x1 Uri uri, @x1 Uri uri2) throws FileNotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.b(contentResolver, uri, uri2);
        }
        return b.b(contentResolver, uri);
    }

    @z1
    public static Uri l(@x1 ContentResolver contentResolver, @x1 Uri uri, @x1 String str) throws FileNotFoundException {
        return c.g(contentResolver, uri, str);
    }
}