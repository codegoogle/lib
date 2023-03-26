package com.p7700g.p99005;

import com.p7700g.p99005.p20;
import java.util.List;

/* compiled from: OpReorderer.java */
/* loaded from: classes.dex */
public class k30 {
    public final a a;

    /* compiled from: OpReorderer.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(p20.b bVar);

        p20.b b(int i, int i2, int i3, Object obj);
    }

    public k30(a aVar) {
        this.a = aVar;
    }

    private int a(List<p20.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<p20.b> list, int i, p20.b bVar, int i2, p20.b bVar2) {
        int i3 = bVar.i;
        int i4 = bVar2.g;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.g;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.g = i6 + bVar2.i;
        }
        int i7 = bVar2.g;
        if (i7 <= i3) {
            bVar.i = i3 + bVar2.i;
        }
        bVar2.g = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    private void d(List<p20.b> list, int i, int i2) {
        p20.b bVar = list.get(i);
        p20.b bVar2 = list.get(i2);
        int i3 = bVar2.f;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            e(list, i, bVar, i2, bVar2);
        } else if (i3 != 4) {
        } else {
            f(list, i, bVar, i2, bVar2);
        }
    }

    public void b(List<p20.b> list) {
        while (true) {
            int a2 = a(list);
            if (a2 == -1) {
                return;
            }
            d(list, a2, a2 + 1);
        }
    }

    public void e(List<p20.b> list, int i, p20.b bVar, int i2, p20.b bVar2) {
        boolean z;
        int i3 = bVar.g;
        int i4 = bVar.i;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.g == i3 && bVar2.i == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.g == i4 + 1 && bVar2.i == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.g;
        if (i4 < i5) {
            bVar2.g = i5 - 1;
        } else {
            int i6 = bVar2.i;
            if (i4 < i5 + i6) {
                bVar2.i = i6 - 1;
                bVar.f = 2;
                bVar.i = 1;
                if (bVar2.i == 0) {
                    list.remove(i2);
                    this.a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.g;
        int i8 = bVar2.g;
        p20.b bVar3 = null;
        if (i7 <= i8) {
            bVar2.g = i8 + 1;
        } else {
            int i9 = bVar2.i;
            if (i7 < i8 + i9) {
                bVar3 = this.a.b(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.i = bVar.g - bVar2.g;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.a.a(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.g;
                if (i10 > bVar3.g) {
                    bVar.g = i10 - bVar3.i;
                }
                int i11 = bVar.i;
                if (i11 > bVar3.g) {
                    bVar.i = i11 - bVar3.i;
                }
            }
            int i12 = bVar.g;
            if (i12 > bVar2.g) {
                bVar.g = i12 - bVar2.i;
            }
            int i13 = bVar.i;
            if (i13 > bVar2.g) {
                bVar.i = i13 - bVar2.i;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.g;
                if (i14 >= bVar3.g) {
                    bVar.g = i14 - bVar3.i;
                }
                int i15 = bVar.i;
                if (i15 >= bVar3.g) {
                    bVar.i = i15 - bVar3.i;
                }
            }
            int i16 = bVar.g;
            if (i16 >= bVar2.g) {
                bVar.g = i16 - bVar2.i;
            }
            int i17 = bVar.i;
            if (i17 >= bVar2.g) {
                bVar.i = i17 - bVar2.i;
            }
        }
        list.set(i, bVar2);
        if (bVar.g != bVar.i) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(List<p20.b> list, int i, p20.b bVar, int i2, p20.b bVar2) {
        p20.b b;
        int i3;
        int i4;
        int i5 = bVar.i;
        int i6 = bVar2.g;
        p20.b bVar3 = null;
        if (i5 < i6) {
            bVar2.g = i6 - 1;
        } else {
            int i7 = bVar2.i;
            if (i5 < i6 + i7) {
                bVar2.i = i7 - 1;
                b = this.a.b(4, bVar.g, 1, bVar2.h);
                i3 = bVar.g;
                i4 = bVar2.g;
                if (i3 > i4) {
                    bVar2.g = i4 + 1;
                } else {
                    int i8 = bVar2.i;
                    if (i3 < i4 + i8) {
                        int i9 = (i4 + i8) - i3;
                        bVar3 = this.a.b(4, i3 + 1, i9, bVar2.h);
                        bVar2.i -= i9;
                    }
                }
                list.set(i2, bVar);
                if (bVar2.i <= 0) {
                    list.set(i, bVar2);
                } else {
                    list.remove(i);
                    this.a.a(bVar2);
                }
                if (b != null) {
                    list.add(i, b);
                }
                if (bVar3 == null) {
                    list.add(i, bVar3);
                    return;
                }
                return;
            }
        }
        b = null;
        i3 = bVar.g;
        i4 = bVar2.g;
        if (i3 > i4) {
        }
        list.set(i2, bVar);
        if (bVar2.i <= 0) {
        }
        if (b != null) {
        }
        if (bVar3 == null) {
        }
    }
}