package com.p7700g.p99005;

import com.p7700g.p99005.xy3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: OpenVPNThread.java */
/* loaded from: classes3.dex */
public class wy3 implements Runnable {
    private final a s;
    @x1
    public kj1 t = kj1.b("OpenVPNThread");
    private Process u;
    private ty3 v;
    @x1
    private final xy3.a w;

    /* compiled from: OpenVPNThread.java */
    /* loaded from: classes3.dex */
    public interface a {
        void c(@x1 String str);

        void d(long j, long j2);

        void e(@x1 String str);

        void f(@x1 String str);

        void g(@x1 String str, @x1 String str2);
    }

    public wy3(@x1 ty3 ty3Var, @x1 xy3.a aVar, @x1 a aVar2) {
        this.w = aVar;
        this.v = ty3Var;
        this.s = aVar2;
    }

    private void a() {
        ProcessBuilder processBuilder = new ProcessBuilder(new LinkedList(this.w.a()));
        processBuilder.environment().put("LD_LIBRARY_PATH", this.w.c());
        for (Map.Entry<String, String> entry : this.w.b().entrySet()) {
            processBuilder.environment().put(entry.getKey(), entry.getValue());
        }
        processBuilder.redirectErrorStream(true);
        try {
            Process start = processBuilder.start();
            this.u = start;
            start.getOutputStream().close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.u.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                this.t.c(readLine, new Object[0]);
                this.s.e(readLine);
            }
        } catch (IOException e) {
            this.t.f(e);
            b();
        }
    }

    public void b() {
        this.u.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i;
        Process process;
        int i2;
        Process process2;
        int i3;
        Process process3;
        try {
            try {
                this.t.i("Starting openvpn", new Object[0]);
                a();
                this.t.i("Giving up", new Object[0]);
                try {
                    process3 = this.u;
                } catch (IllegalThreadStateException e) {
                    this.t.f(e);
                } catch (InterruptedException e2) {
                    this.t.f(e2);
                }
                if (process3 != null) {
                    i3 = process3.waitFor();
                    if (i3 != 0) {
                        this.s.g("STARTERROR", String.valueOf(i3));
                        this.t.e(wo1.l("Process exited with exit value ", i3), new Object[0]);
                    }
                    this.s.g(qh3.y, "No process running.");
                    this.v.f();
                    this.t.i("Exiting", new Object[0]);
                }
                i3 = 0;
                if (i3 != 0) {
                }
                this.s.g(qh3.y, "No process running.");
                this.v.f();
                this.t.i("Exiting", new Object[0]);
            } catch (Exception e3) {
                this.t.f(e3);
                try {
                    process2 = this.u;
                } catch (IllegalThreadStateException e4) {
                    this.t.f(e4);
                } catch (InterruptedException e5) {
                    this.t.f(e5);
                }
                if (process2 != null) {
                    i2 = process2.waitFor();
                    if (i2 != 0) {
                        this.s.g("STARTERROR", String.valueOf(i2));
                        this.t.e(wo1.l("Process exited with exit value ", i2), new Object[0]);
                    }
                    this.s.g(qh3.y, "No process running.");
                    this.v.f();
                    this.t.i("Exiting", new Object[0]);
                }
                i2 = 0;
                if (i2 != 0) {
                }
                this.s.g(qh3.y, "No process running.");
                this.v.f();
                this.t.i("Exiting", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                process = this.u;
            } catch (IllegalThreadStateException e6) {
                this.t.f(e6);
            } catch (InterruptedException e7) {
                this.t.f(e7);
            }
            if (process != null) {
                i = process.waitFor();
                if (i != 0) {
                    this.s.g("STARTERROR", String.valueOf(i));
                    this.t.e(wo1.l("Process exited with exit value ", i), new Object[0]);
                }
                this.s.g(qh3.y, "No process running.");
                this.v.f();
                this.t.i("Exiting", new Object[0]);
                throw th;
            }
            i = 0;
            if (i != 0) {
            }
            this.s.g(qh3.y, "No process running.");
            this.v.f();
            this.t.i("Exiting", new Object[0]);
            throw th;
        }
    }
}