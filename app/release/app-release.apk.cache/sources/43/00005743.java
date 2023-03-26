package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class q10 {
    private static final String a = "LocalBroadcastManager";
    private static final boolean b = false;
    public static final int c = 1;
    private static final Object d = new Object();
    private static q10 e;
    private final Context f;
    private final HashMap<BroadcastReceiver, ArrayList<c>> g = new HashMap<>();
    private final HashMap<String, ArrayList<c>> h = new HashMap<>();
    private final ArrayList<b> i = new ArrayList<>();
    private final Handler j;

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                q10.this.a();
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Intent a;
        public final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private q10(Context context) {
        this.f = context;
        this.j = new a(context.getMainLooper());
    }

    @x1
    public static q10 b(@x1 Context context) {
        q10 q10Var;
        synchronized (d) {
            if (e == null) {
                e = new q10(context.getApplicationContext());
            }
            q10Var = e;
        }
        return q10Var;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.g) {
                size = this.i.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.i.toArray(bVarArr);
                this.i.clear();
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int size2 = bVar.b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c cVar = bVar.b.get(i2);
                    if (!cVar.d) {
                        cVar.b.onReceive(this.f, bVar.a);
                    }
                }
            }
        }
    }

    public void c(@x1 BroadcastReceiver broadcastReceiver, @x1 IntentFilter intentFilter) {
        synchronized (this.g) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.g.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.g.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<c> arrayList2 = this.h.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.h.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(@x1 Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.g) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str3 = "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent;
            }
            ArrayList<c> arrayList3 = this.h.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    String str4 = "Action list: " + arrayList3;
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    c cVar = arrayList3.get(i2);
                    if (z) {
                        String str5 = "Matching against filter " + cVar.a;
                    }
                    if (cVar.c) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, a);
                        if (match >= 0) {
                            if (z) {
                                Integer.toHexString(match);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((c) arrayList5.get(i3)).c = false;
                    }
                    this.i.add(new b(intent, arrayList5));
                    if (!this.j.hasMessages(1)) {
                        this.j.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(@x1 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@x1 BroadcastReceiver broadcastReceiver) {
        synchronized (this.g) {
            ArrayList<c> remove = this.g.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.d = true;
                for (int i = 0; i < cVar.a.countActions(); i++) {
                    String action = cVar.a.getAction(i);
                    ArrayList<c> arrayList = this.h.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.b == broadcastReceiver) {
                                cVar2.d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.h.remove(action);
                        }
                    }
                }
            }
        }
    }
}