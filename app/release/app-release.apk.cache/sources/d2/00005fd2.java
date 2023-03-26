package com.p7700g.p99005;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* compiled from: HeartBeat.java */
/* loaded from: classes2.dex */
public class ud1 extends HandlerThread {
    private static final int s = 49374;
    private static final long t = TimeUnit.MINUTES.toMillis(1);
    private static final kj1 u = kj1.b("HeartBeat");
    @z1
    private final PrintWriter v;
    @z1
    private Handler w;

    /* compiled from: HeartBeat.java */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@x1 Message message) {
            ud1.this.d();
            ((Handler) r81.f(ud1.this.w)).sendEmptyMessageDelayed(0, ud1.t);
        }
    }

    private ud1(@z1 PrintWriter printWriter) {
        super("S2C Heartbeat");
        this.v = printWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            PrintWriter printWriter = this.v;
            if (printWriter != null && !printWriter.checkError()) {
                u.i("send ka", new Object[0]);
                this.v.print(s);
                this.v.flush();
            } else {
                u.e("ka failed", new Object[0]);
            }
        } catch (Throwable th) {
            u.e("failed", th);
        }
    }

    @z1
    public static ud1 e(@x1 Socket socket) {
        if (socket.isConnected()) {
            try {
                return new ud1(new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true));
            } catch (IOException e) {
                u.e("failed", e);
                return null;
            }
        }
        return null;
    }

    private void f() {
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        PrintWriter printWriter = this.v;
        if (printWriter != null) {
            printWriter.flush();
            this.v.close();
        }
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        a aVar = new a(getLooper());
        this.w = aVar;
        aVar.sendEmptyMessageDelayed(0, t);
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        f();
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        f();
        return super.quitSafely();
    }
}