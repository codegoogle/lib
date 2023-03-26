package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

/* compiled from: DocumentsContractApi19.java */
@e2(19)
/* loaded from: classes.dex */
public class hu {
    private static final String a = "DocumentFile";
    private static final int b = 512;

    private hu() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g = g(context, uri);
        int n = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        if ((n & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g) || (n & 8) == 0) {
            return (TextUtils.isEmpty(g) || (n & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@z1 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e) {
            String str = "Failed query: " + e;
            return false;
        } finally {
            c(cursor);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @z1
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @z1
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @z1
    public static String h(Context context, Uri uri) {
        String g = g(context, uri);
        if ("vnd.android.document/directory".equals(g)) {
            return null;
        }
        return g;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g = g(context, uri);
        return ("vnd.android.document/directory".equals(g) || TextUtils.isEmpty(g)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int i) {
        return (int) o(context, uri, str, i);
    }

    private static long o(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j : cursor.getLong(0);
        } catch (Exception e) {
            String str2 = "Failed query: " + e;
            return j;
        } finally {
            c(cursor);
        }
    }

    @z1
    private static String p(Context context, Uri uri, String str, @z1 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e) {
            String str3 = "Failed query: " + e;
            return str2;
        } finally {
            c(cursor);
        }
    }
}