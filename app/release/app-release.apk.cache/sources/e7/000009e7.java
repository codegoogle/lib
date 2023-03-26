package com.anythink.expressad.video.dynview.endcard.cloudview.a;

/* loaded from: classes2.dex */
public final class a {
    public float a;
    public float b;
    public float c;

    public a() {
    }

    private void a(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    private void b(float f, float f2, float f3) {
        this.a += f;
        this.b += f2;
        this.c += f3;
    }

    private boolean c(float f, float f2, float f3) {
        return this.a == f && this.b == f2 && this.c == f3;
    }

    public final String toString() {
        return "Point3DF(" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public a(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    private void a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    private a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    private void a() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
    }
}