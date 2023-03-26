package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.p7700g.p99005.hq;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class us {
    private static final String a = "InputConnectionCompat";
    private static final String b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int p = 1;
    private static final String q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* compiled from: InputConnectionCompat.java */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, d dVar) {
            super(inputConnection, z);
            this.a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(vs.g(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z, d dVar) {
            super(inputConnection, z);
            this.a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (us.e(str, bundle, this.a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    @e2(25)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(@x1 vs vsVar, int i, @z1 Bundle bundle);
    }

    public static boolean a(@x1 InputConnection inputConnection, @x1 EditorInfo editorInfo, @x1 vs vsVar, int i2, @z1 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25) {
            return c.a(inputConnection, (InputContentInfo) vsVar.f(), i2, bundle);
        }
        int e2 = ts.e(editorInfo);
        boolean z = false;
        if (e2 == 2) {
            z = true;
        } else if (e2 != 3 && e2 != 4) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z ? e : d, vsVar.a());
        bundle2.putParcelable(z ? g : f, vsVar.b());
        bundle2.putParcelable(z ? i : h, vsVar.c());
        bundle2.putInt(z ? m : l, i2);
        bundle2.putParcelable(z ? k : j, bundle);
        return inputConnection.performPrivateCommand(z ? c : b, bundle2);
    }

    @x1
    private static d b(@x1 final View view) {
        jp.l(view);
        return new d() { // from class: com.p7700g.p99005.ss
            @Override // com.p7700g.p99005.us.d
            public final boolean a(vs vsVar, int i2, Bundle bundle) {
                return us.f(view, vsVar, i2, bundle);
            }
        };
    }

    @x1
    public static InputConnection c(@x1 View view, @x1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @x1
    @Deprecated
    public static InputConnection d(@x1 InputConnection inputConnection, @x1 EditorInfo editorInfo, @x1 d dVar) {
        ep.e(inputConnection, "inputConnection must be non-null");
        ep.e(editorInfo, "editorInfo must be non-null");
        ep.e(dVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, dVar);
        }
        return ts.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean e(@z1 String str, @z1 Bundle bundle, @x1 d dVar) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(b, str)) {
            z = false;
        } else if (!TextUtils.equals(c, str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? o : n);
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? e : d);
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? g : f);
            Uri uri2 = (Uri) bundle.getParcelable(z ? i : h);
            int i2 = bundle.getInt(z ? m : l);
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? k : j);
            if (uri != null && clipDescription != null) {
                r0 = dVar.a(new vs(uri, clipDescription, uri2), i2, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r0, null);
            }
            return r0;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean f(View view, vs vsVar, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                vsVar.e();
                InputContentInfo inputContentInfo = (InputContentInfo) vsVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(q, inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        return sr.l1(view, new hq.b(new ClipData(vsVar.b(), new ClipData.Item(vsVar.a())), 2).e(vsVar.c()).c(bundle).a()) == null;
    }
}