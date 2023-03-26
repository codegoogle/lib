package com.anchorfree.vpnsdk.reconnect;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import org.xbill.DNS.TTL;

/* loaded from: classes2.dex */
public class BundleTypeAdapterFactory implements jw2 {

    /* loaded from: classes2.dex */
    public static final class BundleTypeAdapter extends TypeAdapter<Bundle> {
        @x1
        private final Gson a;

        public BundleTypeAdapter(@x1 Gson gson) {
            this.a = gson;
        }

        @x1
        private Object b(@x1 nx2 nx2Var) throws IOException {
            String W = nx2Var.W();
            try {
                long parseLong = Long.parseLong(W);
                if (parseLong >= -2147483648L && parseLong <= TTL.MAX_VALUE) {
                    return Integer.valueOf((int) parseLong);
                }
                return Long.valueOf(parseLong);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.parseDouble(W));
            }
        }

        @x1
        private Bundle c(@x1 nx2 nx2Var) throws IOException {
            Bundle bundle = new Bundle();
            nx2Var.b();
            while (nx2Var.Y() != px2.END_OBJECT) {
                int ordinal = nx2Var.Y().ordinal();
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        e(bundle, nx2Var.F(), d(nx2Var));
                    } else {
                        StringBuilder G = wo1.G("expecting object: ");
                        G.append(nx2Var.getPath());
                        throw new IOException(G.toString());
                    }
                }
            }
            nx2Var.j();
            return bundle;
        }

        @z1
        private Object d(@x1 nx2 nx2Var) throws IOException {
            int ordinal = nx2Var.Y().ordinal();
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
                    return b(nx2Var);
                }
                return nx2Var.W();
            }
            return c(nx2Var);
        }

        private void e(@x1 Bundle bundle, @x1 String str, @z1 Object obj) throws IOException {
            if (obj == null) {
                bundle.putParcelable(str, null);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else {
                throw new IOException("Unparcelable key, value: " + str + ", " + obj);
            }
        }

        @Override // com.google.gson.TypeAdapter
        @z1
        /* renamed from: a */
        public Bundle read(@x1 nx2 nx2Var) throws IOException {
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
            return c(nx2Var);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f */
        public void write(@x1 qx2 qx2Var, @z1 Bundle bundle) throws IOException {
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
                    this.a.E(obj, obj.getClass(), qx2Var);
                }
            }
            qx2Var.j();
        }
    }

    /* loaded from: classes2.dex */
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
                a[px2.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[px2.NUMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[px2.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.p7700g.p99005.jw2
    @z1
    public <T> TypeAdapter<T> create(@x1 Gson gson, @x1 lx2<T> lx2Var) {
        if (Bundle.class.isAssignableFrom(lx2Var.f())) {
            return new BundleTypeAdapter(gson);
        }
        return null;
    }
}