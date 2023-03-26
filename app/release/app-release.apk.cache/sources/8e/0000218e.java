package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.z1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchp extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzchn {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcho zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzchp(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzcho zzchoVar = new zzcho(context);
        this.zzb = zzchoVar;
        zzchoVar.zza(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        if (GLES20.glGetError() != 0) {
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[1] * fArr3[3];
        fArr[0] = (fArr2[2] * fArr3[6]) + f + (fArr2[0] * fArr3[0]);
        fArr[1] = (fArr2[2] * fArr3[7]) + (fArr2[1] * fArr3[4]) + (fArr2[0] * fArr3[1]);
        fArr[2] = (fArr2[2] * fArr3[8]) + (fArr2[1] * fArr3[5]) + (fArr2[0] * fArr3[2]);
        fArr[3] = (fArr2[5] * fArr3[6]) + (fArr2[4] * fArr3[3]) + (fArr2[3] * fArr3[0]);
        fArr[4] = (fArr2[5] * fArr3[7]) + (fArr2[4] * fArr3[4]) + (fArr2[3] * fArr3[1]);
        fArr[5] = (fArr2[5] * fArr3[8]) + (fArr2[4] * fArr3[5]) + (fArr2[3] * fArr3[2]);
        fArr[6] = (fArr2[8] * fArr3[6]) + (fArr2[7] * fArr3[3]) + (fArr2[6] * fArr3[0]);
        fArr[7] = (fArr2[8] * fArr3[7]) + (fArr2[7] * fArr3[4]) + (fArr2[6] * fArr3[1]);
        float f2 = fArr2[6] * fArr3[2];
        fArr[8] = (fArr2[8] * fArr3[8]) + (fArr2[7] * fArr3[5]) + f2;
    }

    private static final void zzj(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static final void zzk(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int zzl;
        int glCreateProgram;
        if (this.zzp != null) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.zzw = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.zzx = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.zzw.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGLContext eglCreateContext = this.zzw.eglCreateContext(this.zzx, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.zzy = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                        EGLSurface eglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                        this.zzz = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.zzw.eglMakeCurrent(this.zzx, eglCreateWindowSurface, eglCreateWindowSurface, this.zzy)) {
                            z = true;
                            zzbhr zzbhrVar = zzbhz.zzbc;
                            zzl = zzl(35633, ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).equals(zzbhrVar.zzm()) ? (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (zzl != 0) {
                                zzbhr zzbhrVar2 = zzbhz.zzbd;
                                int zzl2 = zzl(35632, !((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar2)).equals(zzbhrVar2.zzm()) ? (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (zzl2 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    zzh("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, zzl);
                                        zzh("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, zzl2);
                                        zzh("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        zzh("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        zzh("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            GLES20.glGetProgramInfoLog(glCreateProgram);
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            zzh("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            zzh("validateProgram");
                                        }
                                    }
                                    this.zzq = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    zzh("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.zzt);
                                    zzh("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    zzh("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    zzh("genTextures");
                                    int i = iArr3[0];
                                    GLES20.glBindTexture(36197, i);
                                    zzh("bindTextures");
                                    GLES20.glTexParameteri(36197, kb0.c, 9729);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    zzh("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                                    this.zzr = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i2 = this.zzq;
                                    if (!z && i2 != 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                        this.zzo = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(this);
                                        this.zzu.countDown();
                                        this.zzb.zzb();
                                        try {
                                            try {
                                                this.zzA = true;
                                                while (!this.zzB) {
                                                    while (this.zzs > 0) {
                                                        this.zzo.updateTexImage();
                                                        this.zzs--;
                                                    }
                                                    if (this.zzb.zzd(this.zzc)) {
                                                        if (Float.isNaN(this.zzj)) {
                                                            float[] fArr = this.zzc;
                                                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                            float f = fArr[0];
                                                            float f2 = fArr2[0];
                                                            float f3 = fArr[1];
                                                            float f4 = fArr2[1];
                                                            float f5 = (f3 * f4) + (f * f2);
                                                            float f6 = fArr[2];
                                                            float f7 = fArr2[2];
                                                            float[] fArr3 = {(f6 * f7) + f5, (fArr[5] * f7) + (fArr[4] * f4) + (fArr[3] * f2), (fArr[8] * f7) + (fArr[7] * f4) + (fArr[6] * f2)};
                                                            this.zzj = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        zzk(this.zzh, this.zzj + this.zzk);
                                                    } else {
                                                        zzj(this.zzc, -1.5707964f);
                                                        zzk(this.zzh, this.zzk);
                                                    }
                                                    zzj(this.zzd, 1.5707964f);
                                                    zzi(this.zze, this.zzh, this.zzd);
                                                    zzi(this.zzf, this.zzc, this.zze);
                                                    zzj(this.zzg, this.zzl);
                                                    zzi(this.zzi, this.zzg, this.zzf);
                                                    GLES20.glUniformMatrix3fv(this.zzr, 1, false, this.zzi, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    zzh("drawArrays");
                                                    GLES20.glFinish();
                                                    this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                                                    if (this.zzA) {
                                                        GLES20.glViewport(0, 0, this.zzn, this.zzm);
                                                        zzh("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                                                        int i3 = this.zzn;
                                                        int i4 = this.zzm;
                                                        if (i3 > i4) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i3 * 0.87266463f) / i4);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.zzA = false;
                                                    }
                                                    try {
                                                        synchronized (this.zzv) {
                                                            if (!this.zzB && !this.zzA && this.zzs == 0) {
                                                                this.zzv.wait();
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                }
                                                return;
                                            } catch (IllegalStateException unused2) {
                                                zzcfi.zzj("SphericalVideoProcessor halted unexpectedly.");
                                                return;
                                            } catch (Throwable th) {
                                                zzcfi.zzh("SphericalVideoProcessor died.", th);
                                                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SphericalVideoProcessor.run.2");
                                                return;
                                            }
                                        } finally {
                                            this.zzb.zzc();
                                            this.zzo.setOnFrameAvailableListener(null);
                                            this.zzo = null;
                                            zzg();
                                        }
                                    }
                                    String concat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError())));
                                    zzcfi.zzg(concat);
                                    com.google.android.gms.ads.internal.zzt.zzo().zzt(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                    zzg();
                                    this.zzu.countDown();
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.zzq = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            zzh("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.zzt);
                            zzh("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            zzh("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            zzh("genTextures");
                            int i5 = iArr32[0];
                            GLES20.glBindTexture(36197, i5);
                            zzh("bindTextures");
                            GLES20.glTexParameteri(36197, kb0.c, 9729);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            zzh("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                            this.zzr = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i22 = this.zzq;
                            if (!z) {
                            }
                            String concat2 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError())));
                            zzcfi.zzg(concat2);
                            com.google.android.gms.ads.internal.zzt.zzo().zzt(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                            zzg();
                            this.zzu.countDown();
                            return;
                        }
                    }
                }
            }
            z = false;
            zzbhr zzbhrVar3 = zzbhz.zzbc;
            zzl = zzl(35633, ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar3)).equals(zzbhrVar3.zzm()) ? (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
            if (zzl != 0) {
            }
            glCreateProgram = 0;
            this.zzq = glCreateProgram;
            GLES20.glUseProgram(glCreateProgram);
            zzh("useProgram");
            int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
            GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.zzt);
            zzh("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
            zzh("enableVertexAttribArray");
            int[] iArr322 = new int[1];
            GLES20.glGenTextures(1, iArr322, 0);
            zzh("genTextures");
            int i52 = iArr322[0];
            GLES20.glBindTexture(36197, i52);
            zzh("bindTextures");
            GLES20.glTexParameteri(36197, kb0.c, 9729);
            zzh("texParameteri");
            GLES20.glTexParameteri(36197, 10241, 9729);
            zzh("texParameteri");
            GLES20.glTexParameteri(36197, 10242, 33071);
            zzh("texParameteri");
            GLES20.glTexParameteri(36197, 10243, 33071);
            zzh("texParameteri");
            int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
            this.zzr = glGetUniformLocation42;
            GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            int i222 = this.zzq;
            if (!z) {
            }
            String concat22 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError())));
            zzcfi.zzg(concat22);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(new Throwable(concat22), "SphericalVideoProcessor.run.1");
            zzg();
            this.zzu.countDown();
            return;
        }
        zzcfi.zzg("SphericalVideoProcessor started with no output texture.");
        this.zzu.countDown();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    @z1
    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i, int i2) {
        synchronized (this.zzv) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f, float f2) {
        int i = this.zzn;
        int i2 = this.zzm;
        float f3 = i > i2 ? i : i2;
        this.zzk -= (f * 1.7453293f) / f3;
        float f4 = this.zzl - ((f2 * 1.7453293f) / f3);
        this.zzl = f4;
        if (f4 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    @VisibleForTesting
    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay);
            this.zzx = null;
            return eglTerminate | z;
        }
        return z;
    }
}