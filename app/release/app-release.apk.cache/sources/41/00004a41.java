package com.p7700g.p99005;

/* compiled from: OnSwipe.java */
/* loaded from: classes.dex */
public class je {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    public static final int D = 6;
    public static final int E = 7;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 4;
    public static final int v = 5;
    public static final int w = 6;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    private int F = 0;
    private int G = 0;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = 0;
    private int L = -1;
    private float M = 4.0f;
    private float N = 1.2f;
    private boolean O = true;
    private float P = 1.0f;
    private int Q = 0;
    private float R = 10.0f;
    private float S = Float.NaN;
    private float T = 1.0f;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private int W = 0;
    private int X = 0;

    public je A(boolean moveWhenScrollAtTop) {
        this.O = moveWhenScrollAtTop;
        return this;
    }

    public je B(int flags) {
        this.Q = flags;
        return this;
    }

    public je C(int mode) {
        this.K = mode;
        return this;
    }

    public je D(int rotationCenterId) {
        this.L = rotationCenterId;
        return this;
    }

    public je E(int springBoundary) {
        this.W = springBoundary;
        return this;
    }

    public je F(float springDamping) {
        this.S = springDamping;
        return this;
    }

    public je G(float springMass) {
        this.T = springMass;
        return this;
    }

    public je H(float springStiffness) {
        this.U = springStiffness;
        return this;
    }

    public je I(float springStopThreshold) {
        this.V = springStopThreshold;
        return this;
    }

    public je J(int side) {
        this.H = side;
        return this;
    }

    public je K(int side) {
        this.G = side;
        return this;
    }

    public je L(int side) {
        this.I = side;
        return this;
    }

    public int a() {
        return this.X;
    }

    public int b() {
        return this.F;
    }

    public float c() {
        return this.P;
    }

    public float d() {
        return this.R;
    }

    public int e() {
        return this.J;
    }

    public float f() {
        return this.N;
    }

    public float g() {
        return this.M;
    }

    public boolean h() {
        return this.O;
    }

    public int i() {
        return this.Q;
    }

    public int j() {
        return this.K;
    }

    public int k() {
        return this.L;
    }

    public int l() {
        return this.W;
    }

    public float m() {
        return this.S;
    }

    public float n() {
        return this.T;
    }

    public float o() {
        return this.U;
    }

    public float p() {
        return this.V;
    }

    public int q() {
        return this.H;
    }

    public int r() {
        return this.G;
    }

    public int s() {
        return this.I;
    }

    public void t(int autoCompleteMode) {
        this.X = autoCompleteMode;
    }

    public je u(int dragDirection) {
        this.F = dragDirection;
        return this;
    }

    public je v(int dragScale) {
        this.P = dragScale;
        return this;
    }

    public je w(int dragThreshold) {
        this.R = dragThreshold;
        return this;
    }

    public je x(int id) {
        this.J = id;
        return this;
    }

    public je y(int maxAcceleration) {
        this.N = maxAcceleration;
        return this;
    }

    public je z(int maxVelocity) {
        this.M = maxVelocity;
        return this;
    }
}