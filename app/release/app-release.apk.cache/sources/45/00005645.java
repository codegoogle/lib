package com.p7700g.p99005;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.p7700g.p99005.qm3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class pg {
    private static final String a = "NotifManCompat";
    private static final String b = "checkOpNoThrow";
    private static final String c = "OP_POST_NOTIFICATION";
    public static final String d = "android.support.useSideChannel";
    public static final String e = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final int f = 19;
    private static final int g = 1000;
    private static final int h = 6;
    private static final String i = "enabled_notification_listeners";
    @k1("sEnabledNotificationListenersLock")
    private static String k = null;
    @k1("sLock")
    private static d n = null;
    public static final int o = -1000;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = 5;
    private final Context v;
    private final NotificationManager w;
    private static final Object j = new Object();
    @k1("sEnabledNotificationListenersLock")
    private static Set<String> l = new HashSet();
    private static final Object m = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;

        public b(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // com.p7700g.p99005.pg.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.C1(this.a, this.b, this.c, this.d);
        }

        @x1
        public String toString() {
            StringBuilder K = wo1.K("NotifyTask[", "packageName:");
            K.append(this.a);
            K.append(", id:");
            K.append(this.b);
            K.append(", tag:");
            return wo1.C(K, this.c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public final ComponentName a;
        public final IBinder b;

        public c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {
        private static final int s = 0;
        private static final int t = 1;
        private static final int u = 2;
        private static final int v = 3;
        private final Context w;
        private final HandlerThread x;
        private final Handler y;
        private final Map<ComponentName, a> z = new HashMap();
        private Set<String> A = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {
            public final ComponentName a;
            public INotificationSideChannel c;
            public boolean b = false;
            public ArrayDeque<e> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public d(Context context) {
            this.w = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.x = handlerThread;
            handlerThread.start();
            this.y = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean bindService = this.w.bindService(new Intent(pg.e).setComponent(aVar.a), this, 33);
            aVar.b = bindService;
            if (bindService) {
                aVar.e = 0;
            } else {
                StringBuilder G = wo1.G("Unable to bind to listener ");
                G.append(aVar.a);
                G.toString();
                this.w.unbindService(this);
            }
            return aVar.b;
        }

        private void b(a aVar) {
            if (aVar.b) {
                this.w.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.z.values()) {
                aVar.d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.z.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.z.get(componentName);
            if (aVar != null) {
                aVar.c = INotificationSideChannel.Stub.N1(iBinder);
                aVar.e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.z.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable(pg.a, 3)) {
                StringBuilder G = wo1.G("Processing component ");
                G.append(aVar.a);
                G.append(", ");
                G.append(aVar.d.size());
                G.append(" queued tasks");
                G.toString();
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.c != null) {
                while (true) {
                    e peek = aVar.d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(pg.a, 3)) {
                            String str = "Sending task " + peek;
                        }
                        peek.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(pg.a, 3)) {
                            StringBuilder G2 = wo1.G("Remote service has died: ");
                            G2.append(aVar.a);
                            G2.toString();
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder G3 = wo1.G("RemoteException communicating with ");
                        G3.append(aVar.a);
                        G3.toString();
                    }
                }
                if (aVar.d.isEmpty()) {
                    return;
                }
                i(aVar);
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.y.hasMessages(3, aVar.a)) {
                return;
            }
            int i = aVar.e + 1;
            aVar.e = i;
            if (i > 6) {
                StringBuilder G = wo1.G("Giving up on delivering ");
                G.append(aVar.d.size());
                G.append(" tasks to ");
                G.append(aVar.a);
                G.append(" after ");
                G.append(aVar.e);
                G.append(" retries");
                G.toString();
                aVar.d.clear();
                return;
            }
            Log.isLoggable(pg.a, 3);
            this.y.sendMessageDelayed(this.y.obtainMessage(3, aVar.a), (1 << (i - 1)) * 1000);
        }

        private void j() {
            Set<String> q = pg.q(this.w);
            if (q.equals(this.A)) {
                return;
            }
            this.A = q;
            List<ResolveInfo> queryIntentServices = this.w.getPackageManager().queryIntentServices(new Intent().setAction(pg.e), 0);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (q.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        String str = "Permission present on component " + componentName + ", not adding listener record.";
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ComponentName componentName2 = (ComponentName) it.next();
                if (!this.z.containsKey(componentName2)) {
                    if (Log.isLoggable(pg.a, 3)) {
                        String str2 = "Adding listener record for " + componentName2;
                    }
                    this.z.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it2 = this.z.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<ComponentName, a> next = it2.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(pg.a, 3)) {
                        StringBuilder G = wo1.G("Removing listener record for ");
                        G.append(next.getKey());
                        G.toString();
                    }
                    b(next.getValue());
                    it2.remove();
                }
            }
        }

        public void h(e eVar) {
            this.y.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c((e) message.obj);
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                e(cVar.a, cVar.b);
                return true;
            } else if (i == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(pg.a, 3)) {
                String str = "Connected to service " + componentName;
            }
            this.y.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(pg.a, 3)) {
                String str = "Disconnected from service " + componentName;
            }
            this.y.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private pg(Context context) {
        this.v = context;
        this.w = (NotificationManager) context.getSystemService(qm3.b.a);
    }

    private void E(e eVar) {
        synchronized (m) {
            if (n == null) {
                n = new d(this.v.getApplicationContext());
            }
            n.h(eVar);
        }
    }

    private static boolean F(Notification notification) {
        Bundle n2 = kg.n(notification);
        return n2 != null && n2.getBoolean(d);
    }

    @x1
    public static pg p(@x1 Context context) {
        return new pg(context);
    }

    @x1
    public static Set<String> q(@x1 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), i);
        synchronized (j) {
            if (string != null) {
                if (!string.equals(k)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    l = hashSet;
                    k = string;
                }
            }
            set = l;
        }
        return set;
    }

    @x1
    public List<NotificationChannel> A() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.w.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    @x1
    public List<ig> B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> A = A();
            if (!A.isEmpty()) {
                ArrayList arrayList = new ArrayList(A.size());
                for (NotificationChannel notificationChannel : A) {
                    arrayList.add(new ig(notificationChannel));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void C(int i2, @x1 Notification notification) {
        D(null, i2, notification);
    }

    public void D(@z1 String str, int i2, @x1 Notification notification) {
        if (F(notification)) {
            E(new b(this.v.getPackageName(), i2, str, notification));
            this.w.cancel(str, i2);
            return;
        }
        this.w.notify(str, i2, notification);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.w.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.v.getSystemService("appops");
        ApplicationInfo applicationInfo = this.v.getApplicationInfo();
        String packageName = this.v.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod(b, cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(c).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i2) {
        c(null, i2);
    }

    public void c(@z1 String str, int i2) {
        this.w.cancel(str, i2);
    }

    public void d() {
        this.w.cancelAll();
    }

    public void e(@x1 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.createNotificationChannel(notificationChannel);
        }
    }

    public void f(@x1 ig igVar) {
        e(igVar.m());
    }

    public void g(@x1 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void h(@x1 jg jgVar) {
        g(jgVar.f());
    }

    public void i(@x1 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.createNotificationChannelGroups(list);
        }
    }

    public void j(@x1 List<jg> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (jg jgVar : list) {
            arrayList.add(jgVar.f());
        }
        this.w.createNotificationChannelGroups(arrayList);
    }

    public void k(@x1 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.createNotificationChannels(list);
        }
    }

    public void l(@x1 List<ig> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ig igVar : list) {
            arrayList.add(igVar.m());
        }
        this.w.createNotificationChannels(arrayList);
    }

    public void m(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.deleteNotificationChannel(str);
        }
    }

    public void n(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.w.deleteNotificationChannelGroup(str);
        }
    }

    public void o(@x1 Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel notificationChannel : this.w.getNotificationChannels()) {
                if (!collection.contains(notificationChannel.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(notificationChannel.getParentChannelId()))) {
                    this.w.deleteNotificationChannel(notificationChannel.getId());
                }
            }
        }
    }

    public int r() {
        return Build.VERSION.SDK_INT >= 24 ? this.w.getImportance() : o;
    }

    @z1
    public NotificationChannel s(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.w.getNotificationChannel(str);
        }
        return null;
    }

    @z1
    public NotificationChannel t(@x1 String str, @x1 String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.w.getNotificationChannel(str, str2);
        }
        return s(str);
    }

    @z1
    public ig u(@x1 String str) {
        NotificationChannel s2;
        if (Build.VERSION.SDK_INT < 26 || (s2 = s(str)) == null) {
            return null;
        }
        return new ig(s2);
    }

    @z1
    public ig v(@x1 String str, @x1 String str2) {
        NotificationChannel t2;
        if (Build.VERSION.SDK_INT < 26 || (t2 = t(str, str2)) == null) {
            return null;
        }
        return new ig(t2);
    }

    @z1
    public NotificationChannelGroup w(@x1 String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return this.w.getNotificationChannelGroup(str);
        }
        if (i2 >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : y()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    @z1
    public jg x(@x1 String str) {
        NotificationChannelGroup w;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            NotificationChannelGroup w2 = w(str);
            if (w2 != null) {
                return new jg(w2);
            }
            return null;
        } else if (i2 < 26 || (w = w(str)) == null) {
            return null;
        } else {
            return new jg(w, A());
        }
    }

    @x1
    public List<NotificationChannelGroup> y() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.w.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    @x1
    public List<jg> z() {
        List<NotificationChannel> A;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            List<NotificationChannelGroup> y = y();
            if (!y.isEmpty()) {
                if (i2 >= 28) {
                    A = Collections.emptyList();
                } else {
                    A = A();
                }
                ArrayList arrayList = new ArrayList(y.size());
                for (NotificationChannelGroup notificationChannelGroup : y) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new jg(notificationChannelGroup));
                    } else {
                        arrayList.add(new jg(notificationChannelGroup, A));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        public final String a;
        public final int b;
        public final String c;
        public final boolean d;

        public a(String str) {
            this.a = str;
            this.b = 0;
            this.c = null;
            this.d = true;
        }

        @Override // com.p7700g.p99005.pg.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.d) {
                iNotificationSideChannel.Y(this.a);
            } else {
                iNotificationSideChannel.L0(this.a, this.b, this.c);
            }
        }

        @x1
        public String toString() {
            StringBuilder K = wo1.K("CancelTask[", "packageName:");
            K.append(this.a);
            K.append(", id:");
            K.append(this.b);
            K.append(", tag:");
            K.append(this.c);
            K.append(", all:");
            K.append(this.d);
            K.append("]");
            return K.toString();
        }

        public a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = false;
        }
    }
}