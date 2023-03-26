package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p7700g.p99005.jp5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.pubnative.player.widget.CountDownView;

/* compiled from: VASTPlayer.java */
/* loaded from: classes3.dex */
public class lp5 extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, View.OnClickListener {
    private static final String s = lp5.class.getName();
    private static final String t = "Buffering...";
    private static final long u = 250;
    private static final long v = 50;
    private static final long w = 50;
    private static final int x = 20;
    private Timer A;
    private Timer B;
    private HashMap<mp5, List<String>> C;
    private pp5 D;
    private String E;
    private int F;
    private MediaPlayer G;
    private View H;
    private View I;
    private View J;
    private TextView K;
    private View L;
    private SurfaceView M;
    private RelativeLayout N;
    private TextView O;
    private ImageView P;
    private CountDownView Q;
    private Handler R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int u0;
    private g v0;
    private j w0;
    private List<Integer> x0;
    private i y;
    private double y0;
    private Timer z;
    private h z0;

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            String unused = lp5.s;
            lp5.this.t();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            String unused = lp5.s;
            Surface surface = holder.getSurface();
            if (surface == null || (!surface.isValid())) {
                return;
            }
            lp5.this.x();
            lp5.this.G.setDisplay(holder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            String unused = lp5.s;
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public class b extends TimerTask {

        /* compiled from: VASTPlayer.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                lp5.this.A();
            }
        }

        /* compiled from: VASTPlayer.java */
        /* renamed from: com.p7700g.p99005.lp5$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0211b implements Runnable {
            public RunnableC0211b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                lp5.this.b0(lp5.t);
            }
        }

        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (lp5.this.x0.size() > 20) {
                if (((Integer) lp5.this.x0.get(lp5.this.x0.size() - 1)).intValue() > ((Integer) lp5.this.x0.get(0)).intValue()) {
                    if (lp5.this.V) {
                        lp5.this.V = false;
                        lp5.this.R.post(new a());
                    }
                } else if (!lp5.this.V) {
                    lp5.this.V = true;
                    lp5.this.R.post(new RunnableC0211b());
                }
                lp5.this.x0.remove(0);
            }
            lp5.this.x0.add(Integer.valueOf(lp5.this.G.getCurrentPosition()));
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                if (lp5.this.G.getCurrentPosition() == 0) {
                    return;
                }
                int currentPosition = (lp5.this.G.getCurrentPosition() * 100) / lp5.this.G.getDuration();
                if (currentPosition >= lp5.this.u0 * 25) {
                    if (lp5.this.u0 == 0) {
                        String str = lp5.s;
                        bq5.e(str, "Video at start: (" + currentPosition + "%)");
                        lp5.this.T();
                        lp5.this.S(mp5.start);
                        lp5.this.I();
                    } else if (lp5.this.u0 == 1) {
                        String str2 = lp5.s;
                        bq5.e(str2, "Video at first quartile: (" + currentPosition + "%)");
                        lp5.this.S(mp5.firstQuartile);
                    } else if (lp5.this.u0 == 2) {
                        String str3 = lp5.s;
                        bq5.e(str3, "Video at midpoint: (" + currentPosition + "%)");
                        lp5.this.S(mp5.midpoint);
                    } else if (lp5.this.u0 == 3) {
                        String str4 = lp5.s;
                        bq5.e(str4, "Video at third quartile: (" + currentPosition + "%)");
                        lp5.this.S(mp5.thirdQuartile);
                        lp5.this.m0();
                    }
                    lp5.r(lp5.this);
                }
            } catch (Exception e) {
                String str5 = lp5.s;
                StringBuilder G = wo1.G("QuartileTimer error: ");
                G.append(e.getMessage());
                bq5.b(str5, G.toString());
                cancel();
            }
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public class d extends TimerTask {

        /* compiled from: VASTPlayer.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (lp5.this.G == null || !lp5.this.G.isPlaying()) {
                        return;
                    }
                    int currentPosition = lp5.this.G.getCurrentPosition();
                    lp5.this.Q.b(currentPosition, lp5.this.G.getDuration());
                    if (TextUtils.isEmpty(lp5.this.E) || lp5.this.F <= currentPosition) {
                        return;
                    }
                    lp5.this.O.setText(lp5.this.E);
                    lp5.this.O.setVisibility(0);
                } catch (Exception e) {
                    String unused = lp5.s;
                    String str = "Layout timer error: " + e;
                    d.this.cancel();
                }
            }
        }

        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (lp5.this.G != null) {
                lp5.this.R.post(new a());
            } else {
                cancel();
            }
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lp5.this.t();
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            j.values();
            int[] iArr = new int[5];
            a = iArr;
            try {
                iArr[j.Empty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.Ready.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.Playing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.Pause.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public enum g {
        CPC,
        CPM
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public enum h {
        OnResume,
        OnPause
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public interface i {
        void a();

        void b();

        void c(Exception exception);

        void d();

        void e();
    }

    /* compiled from: VASTPlayer.java */
    /* loaded from: classes3.dex */
    public enum j {
        Empty,
        Loading,
        Ready,
        Playing,
        Pause
    }

    public lp5(Context context) {
        super(context);
        this.y = null;
        this.R = null;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = false;
        this.W = false;
        this.u0 = 0;
        this.v0 = g.CPM;
        this.w0 = j.Empty;
        this.x0 = null;
        this.y0 = -1.0d;
        this.R = new Handler(getContext().getMainLooper());
        w();
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        this.J.setVisibility(4);
    }

    private void B() {
        this.I.setVisibility(4);
    }

    private void C() {
        this.O.setVisibility(4);
        this.P.setVisibility(4);
        this.Q.setVisibility(4);
    }

    private void D() {
        this.M.setVisibility(4);
    }

    private void E(Exception exception) {
        bq5.g(s, "invokeOnFail");
        i iVar = this.y;
        if (iVar != null) {
            iVar.c(exception);
        }
    }

    private void F() {
        bq5.g(s, "invokeOnPlayerLoadFinish");
        i iVar = this.y;
        if (iVar != null) {
            iVar.a();
        }
    }

    private void G() {
        bq5.g(s, "invokeOnPlayerClick");
        i iVar = this.y;
        if (iVar != null) {
            iVar.b();
        }
    }

    private void H() {
        bq5.g(s, "invokeOnPlayerPlaybackFinish");
        i iVar = this.y;
        if (iVar != null) {
            iVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        bq5.g(s, "invokeOnPlayerPlaybackStart");
        i iVar = this.y;
        if (iVar != null) {
            iVar.d();
        }
    }

    private void O() {
        String a2 = this.D.u().a();
        String str = s;
        bq5.a(str, "openOffer - clickThrough url: " + a2);
        z(this.D.u().b());
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a2));
            if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                bq5.b(str, "openOffer -clickthrough error occured, uri unresolvable");
                return;
            }
            G();
            getContext().startActivity(intent);
        } catch (NullPointerException e2) {
            bq5.c(s, e2.getMessage(), e2);
        }
    }

    private void R() {
        bq5.g(s, "processErrorEvent");
        z(this.D.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(mp5 eventName) {
        String str = s;
        bq5.g(str, "processEvent: " + eventName);
        HashMap<mp5, List<String>> hashMap = this.C;
        if (hashMap != null) {
            z(hashMap.get(eventName));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        bq5.g(s, "processImpressions");
        z(this.D.i());
    }

    private void V() {
        D();
        C();
        B();
        A();
        n0();
        v();
        this.W = false;
        this.D = null;
        this.u0 = 0;
        this.C = null;
        this.x0 = null;
    }

    private void W() {
        C();
        e0();
        b0("");
        this.C = this.D.p();
        x();
        p0();
        f0();
    }

    private void X() {
        A();
        C();
        c0();
        e0();
        p0();
        U();
    }

    private void Y() {
        A();
        c0();
        e0();
        d0();
        SurfaceView surfaceView = this.M;
        if (surfaceView != null && surfaceView.getHolder() != null && this.M.getHolder().getSurface().isValid()) {
            this.G.setDisplay(this.M.getHolder());
        }
        t();
        U();
        this.G.start();
        i0();
    }

    private void Z() {
        A();
        C();
        c0();
        e0();
        p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(String message) {
        if (this.w0 != j.Pause) {
            this.J.setVisibility(0);
            this.K.setText(message);
            this.K.setVisibility(TextUtils.isEmpty(message) ? 8 : 0);
        }
    }

    private void c0() {
        this.I.setVisibility(0);
    }

    private void d0() {
        this.O.setVisibility(TextUtils.isEmpty(this.E) ? 4 : 0);
        this.P.setVisibility(0);
        this.Q.setVisibility(0);
    }

    private void e0() {
        this.M.setVisibility(0);
    }

    private void f0() {
        bq5.g(s, "startCaching");
        try {
            if (!this.W) {
                this.W = true;
                String o = this.D.o();
                File a2 = xp5.a(getContext(), o);
                if (a2 == null) {
                    this.G.setDataSource(o);
                } else {
                    this.G.setDataSource(a2.getAbsolutePath());
                }
            }
            this.G.prepareAsync();
        } catch (Exception e2) {
            E(e2);
            y();
        }
    }

    private void g0() {
        bq5.g(s, "startLayoutTimer");
        Timer timer = new Timer();
        this.z = timer;
        timer.scheduleAtFixedRate(new d(), 0L, 50L);
    }

    private void h0() {
        bq5.g(s, "startQuartileTimer");
        this.u0 = 0;
        Timer timer = new Timer();
        this.B = timer;
        timer.scheduleAtFixedRate(new c(), 0L, u);
    }

    private void i0() {
        bq5.g(s, "startTimers");
        n0();
        h0();
        g0();
        j0();
    }

    private void j0() {
        bq5.a(s, "startVideoProgressTimer");
        this.A = new Timer();
        this.x0 = new ArrayList();
        this.A.scheduleAtFixedRate(new b(), 0L, 50L);
    }

    private void l0() {
        bq5.a(s, "stopLayoutTimer");
        Timer timer = this.z;
        if (timer != null) {
            timer.cancel();
            this.z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        bq5.g(s, "stopQuartileTimer");
        Timer timer = this.B;
        if (timer != null) {
            timer.cancel();
            this.B = null;
        }
    }

    private void n0() {
        bq5.g(s, "stopTimers");
        m0();
        l0();
        o0();
        this.R.removeMessages(0);
    }

    private void o0() {
        bq5.a(s, "stopVideoProgressTimer");
        Timer timer = this.A;
        if (timer != null) {
            timer.cancel();
            this.A = null;
        }
    }

    public static /* synthetic */ int r(lp5 lp5Var) {
        int i2 = lp5Var.u0;
        lp5Var.u0 = i2 + 1;
        return i2;
    }

    private void s0() {
        bq5.g(s, "updateLayout");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.P.getLayoutParams();
        int i2 = jp5.b.i;
        layoutParams.addRule(6, i2);
        layoutParams.addRule(5, i2);
        this.P.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.I.getLayoutParams();
        layoutParams2.addRule(6, i2);
        layoutParams2.addRule(7, i2);
        this.I.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.Q.getLayoutParams();
        layoutParams3.addRule(8, i2);
        layoutParams3.addRule(5, i2);
        this.Q.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
        layoutParams4.addRule(8, i2);
        layoutParams4.addRule(7, i2);
        this.O.setLayoutParams(layoutParams4);
    }

    private void setState(j playerState) {
        playerState.name();
        if (u(playerState)) {
            int ordinal = playerState.ordinal();
            if (ordinal == 0) {
                V();
            } else if (ordinal == 1) {
                W();
            } else if (ordinal == 2) {
                Z();
            } else if (ordinal == 3) {
                Y();
            } else if (ordinal == 4) {
                X();
            }
            this.w0 = playerState;
        }
    }

    private boolean u(j playerState) {
        int ordinal = playerState.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    j jVar = this.w0;
                    if (!(jVar == j.Ready || jVar == j.Pause) || this.z0 != h.OnResume) {
                        return false;
                    }
                } else if (ordinal != 4) {
                    return false;
                }
            } else if (j.Loading != this.w0) {
                return false;
            }
        }
        return true;
    }

    private void v() {
        bq5.g(s, "cleanUpMediaPlayer");
        if (this.G != null) {
            p0();
            this.G.setOnCompletionListener(null);
            this.G.setOnErrorListener(null);
            this.G.setOnPreparedListener(null);
            this.G.setOnVideoSizeChangedListener(null);
            this.G.release();
            this.G = null;
        }
    }

    private void w() {
        bq5.g(s, "createLayout");
        if (this.H == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(jp5.c.a, (ViewGroup) null);
            this.H = inflate;
            View findViewById = inflate.findViewById(jp5.b.g);
            this.L = findViewById;
            SurfaceView surfaceView = (SurfaceView) findViewById.findViewById(jp5.b.i);
            this.M = surfaceView;
            surfaceView.getHolder().addCallback(new a());
            ImageView imageView = (ImageView) this.L.findViewById(jp5.b.e);
            this.P = imageView;
            imageView.setVisibility(4);
            this.P.setOnClickListener(this);
            CountDownView countDownView = (CountDownView) this.L.findViewById(jp5.b.a);
            this.Q = countDownView;
            countDownView.setVisibility(4);
            TextView textView = (TextView) this.L.findViewById(jp5.b.h);
            this.O = textView;
            textView.setVisibility(4);
            this.O.setOnClickListener(this);
            this.J = this.H.findViewById(jp5.b.b);
            TextView textView2 = (TextView) this.H.findViewById(jp5.b.d);
            this.K = textView2;
            textView2.setVisibility(8);
            View findViewById2 = this.H.findViewById(jp5.b.f);
            this.I = findViewById2;
            findViewById2.setVisibility(4);
            this.I.setOnClickListener(this);
            addView(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        bq5.g(s, "createMediaPlayer");
        if (this.G == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.G = mediaPlayer;
            mediaPlayer.setOnCompletionListener(this);
            this.G.setOnErrorListener(this);
            this.G.setOnPreparedListener(this);
            this.G.setOnVideoSizeChangedListener(this);
            this.G.setAudioStreamType(3);
        }
    }

    private void z(List<String> urls) {
        String str = s;
        bq5.g(str, "fireUrls");
        if (urls != null) {
            for (String str2 : urls) {
                String str3 = s;
                bq5.g(str3, "\tfiring url:" + str2);
                zp5.d(str2);
            }
            return;
        }
        bq5.a(str, "\turl list is null");
    }

    public void J(pp5 model) {
        bq5.g(s, "load");
        setState(j.Empty);
        this.D = model;
        this.W = false;
        setState(j.Loading);
    }

    public void K() {
        if (this.U) {
            return;
        }
        L();
    }

    public void L() {
        bq5.g(s, "onMuteClick");
        if (this.G != null) {
            S(this.U ? mp5.unmute : mp5.mute);
            this.U = !this.U;
            U();
        }
    }

    public void M() {
        bq5.g(s, "onOpenClick");
        J(this.D);
        O();
    }

    public void N() {
        bq5.g(s, "onSkipClick");
        S(mp5.close);
        k0();
    }

    public void P() {
        String str = s;
        bq5.g(str, com.anythink.expressad.foundation.d.c.bZ);
        j jVar = j.Pause;
        if (u(jVar) && this.W) {
            MediaPlayer mediaPlayer = this.G;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                this.G.seekTo(0);
                this.G.pause();
            }
            setState(jVar);
            return;
        }
        StringBuilder G = wo1.G("ERROR, player in wrong state: ");
        G.append(this.w0.name());
        bq5.b(str, G.toString());
    }

    public void Q() {
        String str = s;
        bq5.g(str, "play");
        j jVar = j.Playing;
        if (u(jVar)) {
            setState(jVar);
        } else if (this.w0 == j.Empty) {
            setState(j.Ready);
        } else {
            StringBuilder G = wo1.G("ERROR, player in wrong state: ");
            G.append(this.w0.name());
            bq5.b(str, G.toString());
        }
    }

    public void U() {
        if (this.U) {
            p0();
            this.P.setImageResource(jp5.a.d);
            return;
        }
        q0();
        this.P.setImageResource(jp5.a.c);
    }

    public void a0(String name, int delay) {
        TextUtils.isEmpty(name);
        this.E = name;
        this.F = delay;
    }

    public void k0() {
        String str = s;
        bq5.g(str, "stop");
        j jVar = j.Loading;
        if (u(jVar) && this.W) {
            n0();
            MediaPlayer mediaPlayer = this.G;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.G.reset();
                this.W = false;
            }
            setState(jVar);
            return;
        }
        StringBuilder G = wo1.G("ERROR, player in wrong state: ");
        G.append(this.w0.name());
        bq5.b(str, G.toString());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        bq5.g(s, "onClick -- (View.OnClickListener callback)");
        if (this.I == view) {
            M();
        } else if (this.O == view) {
            N();
        } else if (this.P == view) {
            L();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        bq5.g(s, "onCompletion -- (MediaPlayer callback)");
        if (this.u0 > 3) {
            S(mp5.complete);
            H();
        }
        k0();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp, int what, int extra) {
        String t2;
        bq5.g(s, "onError -- (MediaPlayer callback)");
        R();
        String str = what != 100 ? "unknown: " : "server died: ";
        if (extra == -1010) {
            t2 = wo1.t(str, "MEDIA_ERROR_UNSUPPORTED");
        } else if (extra == -1007) {
            t2 = wo1.t(str, "MEDIA_ERROR_MALFORMED");
        } else if (extra == -1004) {
            t2 = wo1.t(str, "MEDIA_ERROR_IO");
        } else if (extra != -110) {
            t2 = wo1.t(str, "low-level system error");
        } else {
            t2 = wo1.t(str, "MEDIA_ERROR_TIMED_OUT");
        }
        E(new Exception(wo1.t("VASTPlayer error: ", t2)));
        y();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        int i3;
        if (this.y0 > zg2.s) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int i4 = size - paddingRight;
            int i5 = size2 - paddingBottom;
            double d2 = i4;
            double d3 = i5;
            double d4 = (this.y0 / (d2 / d3)) - 1.0d;
            if (Math.abs(d4) >= 0.01d) {
                if (d4 > zg2.s) {
                    i5 = (int) (d2 / this.y0);
                } else {
                    i4 = (int) (d3 * this.y0);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(i4 + paddingRight, 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(i5 + paddingBottom, 1073741824);
                super.onMeasure(i2, i3);
            }
        }
        i2 = widthMeasureSpec;
        i3 = heightMeasureSpec;
        super.onMeasure(i2, i3);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mp) {
        bq5.g(s, "onPrepared --(MediaPlayer callback) ....about to play");
        setState(j.Ready);
        F();
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        new Handler().post(new e());
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
        String str = s;
        bq5.g(str, "onVideoSizeChanged -- " + width + " x " + height);
        this.T = width;
        this.S = height;
    }

    public void p0() {
        this.G.setVolume(0.0f, 0.0f);
    }

    public void q0() {
        this.G.setVolume(1.0f, 1.0f);
    }

    public void r0() {
        if (this.U) {
            L();
        }
    }

    public void setAspectRatio(double aspectRatio) {
        if (aspectRatio >= zg2.s) {
            if (this.y0 != aspectRatio) {
                this.y0 = aspectRatio;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setCampaignType(g campaignType) {
        this.v0 = campaignType;
    }

    public void setLifecycleState(h lifecycleState) {
        this.z0 = lifecycleState;
    }

    public void setListener(i listener) {
        this.y = listener;
    }

    @Deprecated
    public void setSkipName(String skipName) {
    }

    @Deprecated
    public void setSkipTime(int skipTime) {
    }

    public void t() {
        String str = s;
        bq5.g(str, "calculateAspectRatio");
        if (this.T != 0 && this.S != 0) {
            double max = Math.max((getWidth() * 1.0d) / this.T, (getHeight() * 1.0d) / this.S);
            int i2 = (int) (this.T * max);
            int i3 = (int) (max * this.S);
            StringBuilder G = wo1.G(" view size:     ");
            G.append(getWidth());
            G.append("x");
            G.append(getHeight());
            bq5.e(str, G.toString());
            bq5.e(str, " video size:    " + this.T + "x" + this.S);
            bq5.e(str, " surface size:  " + i2 + "x" + i3);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i3);
            layoutParams.addRule(13);
            this.M.setLayoutParams(layoutParams);
            this.M.getHolder().setFixedSize(i2, i3);
            s0();
            setAspectRatio(this.T / this.S);
            return;
        }
        bq5.h(str, "calculateAspectRatio - video source width or height is 0, skipping...");
    }

    public void y() {
        bq5.g(s, "clear");
        setState(j.Empty);
    }

    public lp5(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.y = null;
        this.R = null;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = false;
        this.W = false;
        this.u0 = 0;
        this.v0 = g.CPM;
        this.w0 = j.Empty;
        this.x0 = null;
        this.y0 = -1.0d;
        this.R = new Handler(getContext().getMainLooper());
        w();
        V();
    }

    public lp5(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.y = null;
        this.R = null;
        this.S = 0;
        this.T = 0;
        this.U = true;
        this.V = false;
        this.W = false;
        this.u0 = 0;
        this.v0 = g.CPM;
        this.w0 = j.Empty;
        this.x0 = null;
        this.y0 = -1.0d;
        this.R = new Handler(getContext().getMainLooper());
        w();
        V();
    }
}