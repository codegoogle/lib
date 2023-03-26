package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.p7700g.p99005.fi3;
import com.p7700g.p99005.gi3;
import com.p7700g.p99005.gn3;
import com.p7700g.p99005.ii3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PermissionsActivity extends Activity {
    private static final String A = "INTENT_EXTRA_PERMISSION_TYPE";
    private static final String B = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    private static final String C = "INTENT_EXTRA_CALLBACK_CLASS";
    private static final int t = 500;
    private static final int u = 2;
    private static final int v = 3;
    private static boolean w;
    private static boolean x;
    private static boolean y;
    private static fi3.b z;
    private String E;
    private String F;
    private static final String s = PermissionsActivity.class.getCanonicalName();
    private static final HashMap<String, c> D = new HashMap<>();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ int[] s;

        public a(int[] iArr) {
            this.s = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = this.s;
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            c cVar = (c) PermissionsActivity.D.get(PermissionsActivity.this.E);
            if (cVar == null) {
                StringBuilder G = wo1.G("Missing handler for permissionRequestType: ");
                G.append(PermissionsActivity.this.E);
                throw new RuntimeException(G.toString());
            } else if (!z) {
                cVar.b(PermissionsActivity.this.h());
            } else {
                cVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends fi3.b {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Class c;

        public b(String str, String str2, Class cls) {
            this.a = str;
            this.b = str2;
            this.c = cls;
        }

        @Override // com.p7700g.p99005.fi3.b
        public void a(@x1 Activity activity) {
            if (activity.getClass().equals(PermissionsActivity.class)) {
                return;
            }
            Intent intent = new Intent(activity, PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.A, this.a).putExtra(PermissionsActivity.B, this.b).putExtra(PermissionsActivity.C, this.c.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(gn3.a.z, gn3.a.A);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(boolean z);
    }

    private void d(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(gn3.a.z, gn3.a.A);
            return;
        }
        g(bundle);
        this.E = bundle.getString(A);
        String string = bundle.getString(B);
        this.F = string;
        f(string);
    }

    public static void e(@x1 String str, @x1 c cVar) {
        D.put(str, cVar);
    }

    private void f(String str) {
        if (w) {
            return;
        }
        w = true;
        y = !ii3.a.b(this, str);
        ii3.a.a(this, new String[]{str}, 2);
    }

    private void g(Bundle bundle) {
        String string = bundle.getString(C);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(wo1.t("Could not find callback class for PermissionActivity: ", string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return x && y && !ii3.a.b(this, this.F);
    }

    public static void i(boolean z2, String str, String str2, Class<?> cls) {
        if (w) {
            return;
        }
        x = z2;
        z = new b(str, str2, cls);
        fi3 b2 = gi3.b();
        if (b2 != null) {
            b2.b(s, z);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jm3.q1(this);
        d(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, @x1 String[] strArr, @x1 int[] iArr) {
        w = false;
        if (i == 2) {
            new Handler().postDelayed(new a(iArr), 500L);
        }
        fi3 b2 = gi3.b();
        if (b2 != null) {
            b2.q(s);
        }
        finish();
        overridePendingTransition(gn3.a.z, gn3.a.A);
    }
}