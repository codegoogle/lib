package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class mq {
    private final a a;

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void b(boolean z);

        boolean c();

        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public static class b implements a {
        private static final int a = ViewConfiguration.getTapTimeout();
        private static final int b = ViewConfiguration.getDoubleTapTimeout();
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;
        private int f;
        private int g;
        private int h;
        private int i;
        private final Handler j;
        public final GestureDetector.OnGestureListener k;
        public GestureDetector.OnDoubleTapListener l;
        public boolean m;
        public boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        public MotionEvent r;
        private MotionEvent s;
        private boolean t;
        private float u;
        private float v;
        private float w;
        private float x;
        private boolean y;
        private VelocityTracker z;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.j = new a(handler);
            } else {
                this.j = new a();
            }
            this.k = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            g(context);
        }

        private void d() {
            this.j.removeMessages(1);
            this.j.removeMessages(2);
            this.j.removeMessages(3);
            this.z.recycle();
            this.z = null;
            this.t = false;
            this.m = false;
            this.p = false;
            this.q = false;
            this.n = false;
            if (this.o) {
                this.o = false;
            }
        }

        private void e() {
            this.j.removeMessages(1);
            this.j.removeMessages(2);
            this.j.removeMessages(3);
            this.t = false;
            this.p = false;
            this.q = false;
            this.n = false;
            if (this.o) {
                this.o = false;
            }
        }

        private void g(Context context) {
            if (context != null) {
                if (this.k != null) {
                    this.y = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.h = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.i = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f = scaledTouchSlop * scaledTouchSlop;
                    this.g = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        private boolean h(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.q && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= b) {
                int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (y * y) + (x * x) < this.g;
            }
            return false;
        }

        @Override // com.p7700g.p99005.mq.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.l = onDoubleTapListener;
        }

        @Override // com.p7700g.p99005.mq.a
        public void b(boolean z) {
            this.y = z;
        }

        @Override // com.p7700g.p99005.mq.a
        public boolean c() {
            return this.y;
        }

        public void f() {
            this.j.removeMessages(3);
            this.n = false;
            this.o = true;
            this.k.onLongPress(this.r);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021f  */
        @Override // com.p7700g.p99005.mq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            MotionEvent motionEvent2;
            MotionEvent motionEvent3;
            boolean onFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.z == null) {
                this.z = VelocityTracker.obtain();
            }
            this.z.addMovement(motionEvent);
            int i = action & 255;
            boolean z2 = i == 6;
            int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    f += motionEvent.getX(i2);
                    f2 += motionEvent.getY(i2);
                }
            }
            float f3 = z2 ? pointerCount - 1 : pointerCount;
            float f4 = f / f3;
            float f5 = f2 / f3;
            if (i == 0) {
                if (this.l != null) {
                    boolean hasMessages = this.j.hasMessages(3);
                    if (hasMessages) {
                        this.j.removeMessages(3);
                    }
                    MotionEvent motionEvent4 = this.r;
                    if (motionEvent4 != null && (motionEvent3 = this.s) != null && hasMessages && h(motionEvent4, motionEvent3, motionEvent)) {
                        this.t = true;
                        z = this.l.onDoubleTap(this.r) | false | this.l.onDoubleTapEvent(motionEvent);
                        this.u = f4;
                        this.w = f4;
                        this.v = f5;
                        this.x = f5;
                        motionEvent2 = this.r;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.r = MotionEvent.obtain(motionEvent);
                        this.p = true;
                        this.q = true;
                        this.m = true;
                        this.o = false;
                        this.n = false;
                        if (this.y) {
                            this.j.removeMessages(2);
                            this.j.sendEmptyMessageAtTime(2, this.r.getDownTime() + a + ViewConfiguration.getLongPressTimeout());
                        }
                        this.j.sendEmptyMessageAtTime(1, this.r.getDownTime() + a);
                        return z | this.k.onDown(motionEvent);
                    }
                    this.j.sendEmptyMessageDelayed(3, b);
                }
                z = false;
                this.u = f4;
                this.w = f4;
                this.v = f5;
                this.x = f5;
                motionEvent2 = this.r;
                if (motionEvent2 != null) {
                }
                this.r = MotionEvent.obtain(motionEvent);
                this.p = true;
                this.q = true;
                this.m = true;
                this.o = false;
                this.n = false;
                if (this.y) {
                }
                this.j.sendEmptyMessageAtTime(1, this.r.getDownTime() + a);
                return z | this.k.onDown(motionEvent);
            }
            if (i == 1) {
                this.m = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.t) {
                    onFling = this.l.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.o) {
                        this.j.removeMessages(3);
                        this.o = false;
                    } else if (this.p) {
                        boolean onSingleTapUp = this.k.onSingleTapUp(motionEvent);
                        if (this.n && (onDoubleTapListener = this.l) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        onFling = onSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.z;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.i);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.h || Math.abs(xVelocity) > this.h) {
                            onFling = this.k.onFling(this.r, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    onFling = false;
                }
                MotionEvent motionEvent5 = this.s;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.s = obtain;
                VelocityTracker velocityTracker2 = this.z;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.z = null;
                }
                this.t = false;
                this.n = false;
                this.j.removeMessages(1);
                this.j.removeMessages(2);
            } else if (i != 2) {
                if (i == 3) {
                    d();
                    return false;
                } else if (i == 5) {
                    this.u = f4;
                    this.w = f4;
                    this.v = f5;
                    this.x = f5;
                    e();
                    return false;
                } else if (i != 6) {
                    return false;
                } else {
                    this.u = f4;
                    this.w = f4;
                    this.v = f5;
                    this.x = f5;
                    this.z.computeCurrentVelocity(1000, this.i);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.z.getXVelocity(pointerId2);
                    float yVelocity2 = this.z.getYVelocity(pointerId2);
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (i3 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i3);
                            if ((this.z.getYVelocity(pointerId3) * yVelocity2) + (this.z.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                this.z.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
            } else if (this.o) {
                return false;
            } else {
                float f6 = this.u - f4;
                float f7 = this.v - f5;
                if (this.t) {
                    return false | this.l.onDoubleTapEvent(motionEvent);
                }
                if (this.p) {
                    int i4 = (int) (f4 - this.w);
                    int i5 = (int) (f5 - this.x);
                    int i6 = (i5 * i5) + (i4 * i4);
                    if (i6 > this.f) {
                        onFling = this.k.onScroll(this.r, motionEvent, f6, f7);
                        this.u = f4;
                        this.v = f5;
                        this.p = false;
                        this.j.removeMessages(3);
                        this.j.removeMessages(1);
                        this.j.removeMessages(2);
                    } else {
                        onFling = false;
                    }
                    if (i6 > this.f) {
                        this.q = false;
                    }
                } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    boolean onScroll = this.k.onScroll(this.r, motionEvent, f6, f7);
                    this.u = f4;
                    this.v = f5;
                    return onScroll;
                } else {
                    return false;
                }
            }
            return onFling;
        }

        /* compiled from: GestureDetectorCompat.java */
        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b bVar = b.this;
                    bVar.k.onShowPress(bVar.r);
                } else if (i == 2) {
                    b.this.f();
                } else if (i == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.l;
                    if (onDoubleTapListener != null) {
                        if (!bVar2.m) {
                            onDoubleTapListener.onSingleTapConfirmed(bVar2.r);
                        } else {
                            bVar2.n = true;
                        }
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public static class c implements a {
        private final GestureDetector a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // com.p7700g.p99005.mq.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // com.p7700g.p99005.mq.a
        public void b(boolean z) {
            this.a.setIsLongpressEnabled(z);
        }

        @Override // com.p7700g.p99005.mq.a
        public boolean c() {
            return this.a.isLongpressEnabled();
        }

        @Override // com.p7700g.p99005.mq.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    public mq(@x1 Context context, @x1 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.a.c();
    }

    public boolean b(@x1 MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z) {
        this.a.b(z);
    }

    public void d(@z1 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.a(onDoubleTapListener);
    }

    public mq(@x1 Context context, @x1 GestureDetector.OnGestureListener onGestureListener, @z1 Handler handler) {
        this.a = new c(context, onGestureListener, handler);
    }
}