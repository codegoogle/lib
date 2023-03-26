package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.a.a.e;
import com.anythink.basead.c.f;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.h;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.z1;
import java.io.FileDescriptor;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public class PlayerView extends RelativeLayout implements TextureView.SurfaceTextureListener {
    public static final String TAG = PlayerView.class.getSimpleName();
    private int A;
    private boolean B;
    private MediaPlayer a;
    private SurfaceTexture b;
    private TextureView c;
    private Surface d;
    private FileInputStream e;
    private FileDescriptor f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private a v;
    private Handler w;
    private boolean x;
    private Thread y;
    private int z;

    /* renamed from: com.anythink.basead.ui.PlayerView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (PlayerView.this.r) {
                if (!PlayerView.this.t && PlayerView.this.a != null && PlayerView.this.a.isPlaying() && PlayerView.this.w != null) {
                    PlayerView.this.w.sendEmptyMessage(PlayerView.this.a.getCurrentPosition());
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements MediaPlayer.OnPreparedListener {
        public AnonymousClass3() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            e.a(PlayerView.TAG, "MediaPlayer onPrepared()...");
            PlayerView.this.u = true;
            PlayerView playerView = PlayerView.this;
            playerView.k = playerView.a.getDuration();
            if (PlayerView.this.v != null) {
                PlayerView.this.v.c(PlayerView.this.k);
            }
            PlayerView playerView2 = PlayerView.this;
            playerView2.l = Math.round(playerView2.k * 0.25f);
            PlayerView playerView3 = PlayerView.this;
            playerView3.m = Math.round(playerView3.k * 0.5f);
            PlayerView playerView4 = PlayerView.this;
            playerView4.n = Math.round(playerView4.k * 0.75f);
            if (PlayerView.this.j > 0) {
                PlayerView.this.a.seekTo(PlayerView.this.j);
            } else {
                PlayerView.this.start();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements MediaPlayer.OnSeekCompleteListener {
        public AnonymousClass4() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            PlayerView.this.start();
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements MediaPlayer.OnCompletionListener {
        public AnonymousClass5() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            PlayerView.this.d();
            PlayerView.this.t = true;
            PlayerView playerView = PlayerView.this;
            playerView.j = playerView.k;
            if (PlayerView.this.v != null) {
                PlayerView.this.v.c();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements MediaPlayer.OnErrorListener {
        public AnonymousClass6() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (PlayerView.this.v != null) {
                if (PlayerView.this.u) {
                    PlayerView.this.v.a(f.a(f.k, f.z));
                    return true;
                }
                PlayerView.this.v.a(f.a(f.k, f.B));
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PlayerView.this.v != null) {
                PlayerView.this.v.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i);

        void a(com.anythink.basead.c.e eVar);

        void b();

        void b(int i);

        void c();

        void c(int i);

        void d();

        void e();

        void f();
    }

    public PlayerView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = -1;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        setSaveEnabled(true);
        this.w = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                PlayerView.this.j = message.what;
                if (PlayerView.this.j <= 0) {
                    return;
                }
                if (!PlayerView.this.s && !PlayerView.this.t) {
                    PlayerView.this.s = true;
                    if (PlayerView.this.v != null) {
                        PlayerView.this.v.a();
                    }
                }
                if (PlayerView.this.v != null) {
                    PlayerView.this.v.a(PlayerView.this.j);
                }
                if (PlayerView.this.o || PlayerView.this.j < PlayerView.this.l) {
                    if (PlayerView.this.p || PlayerView.this.j < PlayerView.this.m) {
                        if (PlayerView.this.q || PlayerView.this.j < PlayerView.this.n) {
                            return;
                        }
                        PlayerView.this.q = true;
                        if (PlayerView.this.v != null) {
                            PlayerView.this.v.b(75);
                            return;
                        }
                        return;
                    }
                    PlayerView.this.p = true;
                    if (PlayerView.this.v != null) {
                        PlayerView.this.v.b(50);
                        return;
                    }
                    return;
                }
                PlayerView.this.o = true;
                if (PlayerView.this.v != null) {
                    PlayerView.this.v.b(25);
                }
            }
        };
        setBackgroundColor(sr.t);
    }

    public int getCurrentPosition() {
        int i = this.j;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public int getVideoLength() {
        return this.k;
    }

    public boolean hasVideo() {
        return this.B;
    }

    public void initMuteStatus(boolean z) {
        this.x = z;
    }

    public boolean isMute() {
        return this.x;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null || !this.u) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public void load(String str) {
        this.g = str;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e.a(TAG, "onDetachedFromWindow()...");
        release();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        String str = TAG;
        e.a(str, "onRestoreInstanceState...");
        b bVar = (b) parcelable;
        e.a(str, "onRestoreInstanceState..." + bVar.a());
        super.onRestoreInstanceState(bVar.getSuperState());
        this.j = bVar.a;
        this.o = bVar.b;
        this.p = bVar.c;
        this.q = bVar.d;
        this.s = bVar.e;
        this.t = bVar.f;
        boolean z = bVar.g;
        this.x = z;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(z ? 0.0f : 1.0f, z ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        String str = TAG;
        e.a(str, "onSaveInstanceState...");
        b bVar = new b(super.onSaveInstanceState());
        bVar.a = this.j;
        bVar.b = this.o;
        bVar.c = this.p;
        bVar.d = this.q;
        bVar.e = this.s;
        bVar.f = this.t;
        bVar.g = this.x;
        e.a(str, "onSaveInstanceState..." + bVar.a());
        return bVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = TAG;
        e.a(str, "onSurfaceTextureAvailable()...");
        this.b = surfaceTexture;
        a();
        try {
            this.a.reset();
            if (this.f.valid()) {
                e.a(str, "video resource valid - " + this.f.valid());
                this.a.setDataSource(this.f);
                FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (this.d == null) {
                    this.d = new Surface(this.b);
                }
                this.a.setSurface(this.d);
                this.a.prepareAsync();
                return;
            }
            throw new IllegalStateException("MyOffer video resource is valid");
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar = this.v;
            if (aVar != null) {
                aVar.a(f.a(f.k, th.getMessage()));
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e.a(TAG, "onSurfaceTextureDestroyed()...");
        release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void pause() {
        e.a(TAG, "pause()");
        d();
        if (isPlaying()) {
            this.a.pause();
        }
    }

    public void release() {
        if (this.u) {
            e.a(TAG, "release...");
            d();
            this.b = null;
            this.d = null;
            MediaPlayer mediaPlayer = this.a;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    this.a.stop();
                }
                this.a.reset();
                this.a.release();
                this.a = null;
            }
            Handler handler = this.w;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.u = false;
        }
    }

    public void setListener(a aVar) {
        this.v = aVar;
    }

    public void setMute(boolean z) {
        this.x = z;
        if (z) {
            MediaPlayer mediaPlayer = this.a;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
            a aVar = this.v;
            if (aVar != null) {
                aVar.e();
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = this.a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(1.0f, 1.0f);
        }
        a aVar2 = this.v;
        if (aVar2 != null) {
            aVar2.f();
        }
    }

    public void setVideoSize(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    public void start() {
        e.a(TAG, "start()");
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null && this.u) {
            mediaPlayer.start();
        }
        if (this.y == null) {
            this.r = true;
            Thread thread = new Thread(new AnonymousClass2());
            this.y = thread;
            thread.start();
        }
    }

    public void stop() {
        e.a(TAG, "stop()");
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        a aVar = this.v;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void f() {
        if (this.a == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.a = mediaPlayer;
            boolean z = this.x;
            mediaPlayer.setVolume(z ? 0.0f : 1.0f, z ? 0.0f : 1.0f);
            this.a.setAudioStreamType(3);
            this.a.setOnPreparedListener(new AnonymousClass3());
            this.a.setOnSeekCompleteListener(new AnonymousClass4());
            if (!this.t) {
                this.a.setOnCompletionListener(new AnonymousClass5());
            }
            this.a.setOnErrorListener(new AnonymousClass6());
        }
    }

    private void g() {
        int i;
        if (this.c == null) {
            TextureView textureView = new TextureView(getContext());
            this.c = textureView;
            textureView.setSurfaceTextureListener(this);
            this.c.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i2 = this.h;
            if (i2 != 0 && (i = this.i) != 0) {
                layoutParams.width = i2;
                layoutParams.height = i;
            }
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.c, layoutParams);
            this.c.setOnClickListener(new AnonymousClass7());
        }
    }

    private void h() {
        a();
        try {
            this.a.reset();
            if (this.f.valid()) {
                String str = TAG;
                e.a(str, "video resource valid - " + this.f.valid());
                this.a.setDataSource(this.f);
                FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (this.d == null) {
                    this.d = new Surface(this.b);
                }
                this.a.setSurface(this.d);
                this.a.prepareAsync();
                return;
            }
            throw new IllegalStateException("MyOffer video resource is valid");
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar = this.v;
            if (aVar != null) {
                aVar.a(f.a(f.k, th.getMessage()));
            }
        }
    }

    private void a() {
        int i;
        String str = TAG;
        e.a(str, "init...");
        if (e()) {
            a aVar = this.v;
            if (aVar != null) {
                aVar.a(f.a(f.k, f.B));
                return;
            }
            return;
        }
        if (this.h == 0 || this.i == 0) {
            try {
                FileDescriptor fileDescriptor = this.f;
                int i2 = this.z;
                int i3 = this.A;
                e.a a2 = com.anythink.basead.a.a.e.a(fileDescriptor);
                if (a2 == null) {
                    a2 = null;
                } else {
                    float f = (a2.a * 1.0f) / a2.b;
                    if (f < (i2 * 1.0f) / i3) {
                        a2.b = i3;
                        a2.a = (int) Math.ceil(i3 * f);
                    } else {
                        a2.a = i2;
                        a2.b = (int) Math.ceil(i2 / f);
                    }
                }
                if (a2 != null) {
                    this.h = a2.a;
                    this.i = a2.b;
                }
                com.anythink.core.common.j.e.b(str, "computeVideoSize: " + this.z + ", " + this.A + ", " + this.h + ", " + this.i);
                int i4 = this.z;
                int i5 = this.h;
                if (i4 == i5) {
                    if (this.A - this.i <= h.a(getContext(), 1.0f)) {
                        this.i = this.A;
                        com.anythink.core.common.j.e.b(str, "computeVideoSize: update height -> " + this.i);
                    }
                } else if (this.A == this.i && i4 - i5 <= h.a(getContext(), 1.0f)) {
                    this.h = this.z;
                    com.anythink.core.common.j.e.b(str, "computeVideoSize: update width -> " + this.h);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.c == null) {
            TextureView textureView = new TextureView(getContext());
            this.c = textureView;
            textureView.setSurfaceTextureListener(this);
            this.c.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i6 = this.h;
            if (i6 != 0 && (i = this.i) != 0) {
                layoutParams.width = i6;
                layoutParams.height = i;
            }
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.c, layoutParams);
            this.c.setOnClickListener(new AnonymousClass7());
        }
        if (this.a == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.a = mediaPlayer;
            boolean z = this.x;
            mediaPlayer.setVolume(z ? 0.0f : 1.0f, z ? 0.0f : 1.0f);
            this.a.setAudioStreamType(3);
            this.a.setOnPreparedListener(new AnonymousClass3());
            this.a.setOnSeekCompleteListener(new AnonymousClass4());
            if (!this.t) {
                this.a.setOnCompletionListener(new AnonymousClass5());
            }
            this.a.setOnErrorListener(new AnonymousClass6());
        }
    }

    private void b() {
        if (this.h == 0 || this.i == 0) {
            try {
                FileDescriptor fileDescriptor = this.f;
                int i = this.z;
                int i2 = this.A;
                e.a a2 = com.anythink.basead.a.a.e.a(fileDescriptor);
                if (a2 == null) {
                    a2 = null;
                } else {
                    float f = (a2.a * 1.0f) / a2.b;
                    if (f < (i * 1.0f) / i2) {
                        a2.b = i2;
                        a2.a = (int) Math.ceil(i2 * f);
                    } else {
                        a2.a = i;
                        a2.b = (int) Math.ceil(i / f);
                    }
                }
                if (a2 != null) {
                    this.h = a2.a;
                    this.i = a2.b;
                }
                String str = TAG;
                com.anythink.core.common.j.e.b(str, "computeVideoSize: " + this.z + ", " + this.A + ", " + this.h + ", " + this.i);
                int i3 = this.z;
                int i4 = this.h;
                if (i3 == i4) {
                    if (this.A - this.i <= h.a(getContext(), 1.0f)) {
                        this.i = this.A;
                        com.anythink.core.common.j.e.b(str, "computeVideoSize: update height -> " + this.i);
                    }
                } else if (this.A != this.i || i3 - i4 > h.a(getContext(), 1.0f)) {
                } else {
                    this.h = this.z;
                    com.anythink.core.common.j.e.b(str, "computeVideoSize: update width -> " + this.h);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void c() {
        if (this.y != null) {
            return;
        }
        this.r = true;
        Thread thread = new Thread(new AnonymousClass2());
        this.y = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.r = false;
        this.y = null;
    }

    private boolean e() {
        FileInputStream fileInputStream;
        com.anythink.basead.a.f.a();
        FileInputStream a2 = com.anythink.basead.a.f.a(this.g);
        this.e = a2;
        boolean z = true;
        if (a2 != null) {
            try {
                this.f = a2.getFD();
                this.B = true;
                z = false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (z && (fileInputStream = this.e) != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return z;
    }

    /* loaded from: classes2.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.ui.PlayerView.b.1
            private static b a(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i) {
                return new b[i];
            }

            private static b[] a(int i) {
                return new b[i];
            }
        };
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;

        public b(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            boolean[] zArr = new boolean[6];
            parcel.readBooleanArray(zArr);
            this.b = zArr[0];
            this.c = zArr[1];
            this.d = zArr[2];
            this.e = zArr[3];
            this.f = zArr[4];
            this.g = zArr[5];
        }

        public final String a() {
            return "SavedState(\nsavePosition - " + this.a + "\nsaveVideoPlay25 - " + this.b + "\nsaveVideoPlay50 - " + this.c + "\nsaveVideoPlay75 - " + this.d + "\nsaveIsVideoStart - " + this.e + "\nsaveIsVideoPlayCompletion - " + this.f + "\nsaveIsMute - " + this.g + "\n)";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeBooleanArray(new boolean[]{this.b, this.c, this.d, this.e, this.f, this.g});
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }
}