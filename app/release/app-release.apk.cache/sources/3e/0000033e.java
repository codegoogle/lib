package com.anchorfree.sdk.gson;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.TTL;

/* loaded from: classes.dex */
public class BundleTypeAdapterFactory implements jw2 {
    @x1
    public static final kj1 s = kj1.b("BundleTAF");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            px2.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[px2.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[px2.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[px2.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[px2.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[px2.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[px2.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[px2.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[px2.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.p7700g.p99005.jw2
    @z1
    public <T> TypeAdapter<T> create(@x1 final Gson gson, @x1 lx2<T> lx2Var) {
        if (Bundle.class.isAssignableFrom(lx2Var.f())) {
            return (TypeAdapter<T>) new TypeAdapter<Bundle>() { // from class: com.anchorfree.sdk.gson.BundleTypeAdapterFactory.1
                private List b(nx2 nx2Var) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    nx2Var.a();
                    while (nx2Var.Y() != px2.END_ARRAY) {
                        arrayList.add(e(nx2Var));
                    }
                    nx2Var.h();
                    return arrayList;
                }

                private Object c(nx2 nx2Var) throws IOException {
                    double z = nx2Var.z();
                    if (z - Math.ceil(z) == zg2.s) {
                        long j = (long) z;
                        if (j >= -2147483648L && j <= TTL.MAX_VALUE) {
                            return Integer.valueOf((int) j);
                        }
                        return Long.valueOf(j);
                    }
                    return Double.valueOf(z);
                }

                private List<Pair<String, Object>> d(nx2 nx2Var) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    nx2Var.b();
                    while (nx2Var.Y() != px2.END_OBJECT) {
                        int ordinal = nx2Var.Y().ordinal();
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                arrayList.add(new Pair(nx2Var.F(), e(nx2Var)));
                            } else {
                                StringBuilder G = wo1.G("expecting object: ");
                                G.append(nx2Var.getPath());
                                throw new IOException(G.toString());
                            }
                        }
                    }
                    nx2Var.j();
                    return arrayList;
                }

                @z1
                private Object e(nx2 nx2Var) throws IOException {
                    int ordinal = nx2Var.Y().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 2) {
                            if (ordinal != 5) {
                                if (ordinal != 6) {
                                    if (ordinal != 7) {
                                        if (ordinal == 8) {
                                            nx2Var.P();
                                            return null;
                                        }
                                        StringBuilder G = wo1.G("expecting value: ");
                                        G.append(nx2Var.getPath());
                                        throw new IOException(G.toString());
                                    }
                                    return Boolean.valueOf(nx2Var.w());
                                }
                                return c(nx2Var);
                            }
                            return nx2Var.W();
                        }
                        return d(nx2Var);
                    }
                    return b(nx2Var);
                }

                @x1
                private Bundle f(List<Pair<String, Object>> list) {
                    Bundle bundle = new Bundle();
                    for (Pair<String, Object> pair : list) {
                        String str = (String) pair.first;
                        Object obj = pair.second;
                        if (obj instanceof String) {
                            bundle.putString(str, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(str, ((Double) obj).doubleValue());
                        } else if (obj instanceof Parcelable) {
                            bundle.putParcelable(str, (Parcelable) obj);
                        } else if (obj instanceof List) {
                            bundle.putParcelable(str, f((List) obj));
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else {
                            kj1 kj1Var = BundleTypeAdapterFactory.s;
                            kj1Var.e("Unparcelable key, value: " + str + ", " + obj + ", class of value " + obj.getClass().getCanonicalName(), new Object[0]);
                        }
                    }
                    return bundle;
                }

                @Override // com.google.gson.TypeAdapter
                @z1
                /* renamed from: a */
                public Bundle read(nx2 nx2Var) throws IOException {
                    int ordinal = nx2Var.Y().ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 8) {
                            nx2Var.P();
                            return null;
                        }
                        StringBuilder G = wo1.G("expecting object: ");
                        G.append(nx2Var.getPath());
                        throw new IOException(G.toString());
                    }
                    return f(d(nx2Var));
                }

                @Override // com.google.gson.TypeAdapter
                /* renamed from: g */
                public void write(qx2 qx2Var, Bundle bundle) throws IOException {
                    if (bundle == null) {
                        qx2Var.w();
                        return;
                    }
                    qx2Var.e();
                    for (String str : bundle.keySet()) {
                        qx2Var.s(str);
                        Object obj = bundle.get(str);
                        if (obj == null) {
                            qx2Var.w();
                        } else {
                            gson.E(obj, obj.getClass(), qx2Var);
                        }
                    }
                    qx2Var.j();
                }
            };
        }
        return null;
    }
}