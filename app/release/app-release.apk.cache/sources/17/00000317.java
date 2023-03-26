package com.anchorfree.sdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class NotificationConfig implements Parcelable {
    public static final Parcelable.Creator<NotificationConfig> CREATOR = new a();
    public static final int UNDEFINED = 0;
    @x1
    private final String channelID;
    @z1
    private String clickAction;
    @z1
    private StateNotification cnlConfig;
    @z1
    private StateNotification connectedConfig;
    @z1
    private StateNotification connectingConfig;
    private final long createTime;
    private final boolean disabled;
    @z1
    private final Bitmap icon;
    @z1
    private StateNotification idleConfig;
    @z1
    private StateNotification pausedConfig;
    private int smallIconId;
    @z1
    private final String title;

    /* loaded from: classes.dex */
    public static final class Builder {
        @x1
        private String channelId;
        @z1
        private String clickAction;
        @z1
        private StateNotification cnlConfig;
        @z1
        private StateNotification connectedConfig;
        @z1
        private StateNotification connectingConfig;
        private boolean disabled;
        @z1
        private Bitmap icon;
        @z1
        private StateNotification idleConfig;
        @z1
        private StateNotification pausedConfig;
        private int smallIconId;
        @z1
        private String title;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        @x1
        public NotificationConfig build() {
            return new NotificationConfig(this, null);
        }

        @x1
        public Builder channelId(@x1 String str) {
            this.channelId = str;
            return this;
        }

        @x1
        public Builder clickAction(@x1 String str) {
            this.clickAction = str;
            return this;
        }

        @x1
        public Builder disabled() {
            this.disabled = true;
            return this;
        }

        @x1
        public Builder icon(@x1 Bitmap bitmap) {
            this.icon = bitmap;
            return this;
        }

        @x1
        public Builder inCnl(@x1 String str, @x1 String str2) {
            this.cnlConfig = new StateNotification(str, str2);
            return this;
        }

        @x1
        public Builder inConnected(@x1 String str, @x1 String str2) {
            this.connectedConfig = new StateNotification(str, str2);
            return this;
        }

        @x1
        public Builder inConnecting(@x1 String str, @x1 String str2) {
            this.connectingConfig = new StateNotification(str, str2);
            return this;
        }

        @x1
        public Builder inIdle(@x1 String str, @x1 String str2) {
            this.idleConfig = new StateNotification(str, str2);
            return this;
        }

        @x1
        public Builder inPause(@x1 String str, @x1 String str2) {
            this.pausedConfig = new StateNotification(str, str2);
            return this;
        }

        @x1
        public Builder smallIconId(int i) {
            this.smallIconId = i;
            return this;
        }

        @x1
        public Builder title(@x1 String str) {
            this.title = str;
            return this;
        }

        private Builder() {
            this.channelId = "";
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<NotificationConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NotificationConfig createFromParcel(Parcel parcel) {
            return new NotificationConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NotificationConfig[] newArray(int i) {
            return new NotificationConfig[i];
        }
    }

    public /* synthetic */ NotificationConfig(Builder builder, a aVar) {
        this(builder);
    }

    @x1
    public static NotificationConfig disabledNotification() {
        return new Builder(null).disabled().build();
    }

    @x1
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String getChannelID() {
        return this.channelID;
    }

    @z1
    public String getClickAction() {
        return this.clickAction;
    }

    @z1
    public StateNotification getCnlConfig() {
        return this.cnlConfig;
    }

    @z1
    public StateNotification getConnectedConfig() {
        return this.connectedConfig;
    }

    @z1
    public StateNotification getConnectingConfig() {
        return this.connectingConfig;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    @z1
    public StateNotification getIdleConfig() {
        return this.idleConfig;
    }

    @z1
    public StateNotification getPausedConfig() {
        return this.pausedConfig;
    }

    @z1
    public Bitmap icon() {
        return this.icon;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public int smallIconId() {
        return this.smallIconId;
    }

    @z1
    public String title() {
        return this.title;
    }

    @x1
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("NotificationConfig{");
        stringBuffer.append("title='");
        stringBuffer.append(this.title);
        stringBuffer.append('\'');
        stringBuffer.append(", icon=");
        stringBuffer.append(this.icon);
        stringBuffer.append(", disabled=");
        stringBuffer.append(this.disabled);
        stringBuffer.append(", smallIconId=");
        stringBuffer.append(this.smallIconId);
        stringBuffer.append(", channelID='");
        stringBuffer.append(this.channelID);
        stringBuffer.append('\'');
        stringBuffer.append(", idleConfig=");
        stringBuffer.append(this.idleConfig);
        stringBuffer.append(", pausedConfig=");
        stringBuffer.append(this.pausedConfig);
        stringBuffer.append(", connectedConfig=");
        stringBuffer.append(this.connectedConfig);
        stringBuffer.append(", connectingConfig=");
        stringBuffer.append(this.connectingConfig);
        stringBuffer.append(", cnlConfig=");
        stringBuffer.append(this.cnlConfig);
        stringBuffer.append(", creationTime=");
        stringBuffer.append(this.createTime);
        stringBuffer.append(", clickAction='");
        stringBuffer.append(this.clickAction);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeLong(this.createTime);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i);
        parcel.writeByte(this.disabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.smallIconId);
        parcel.writeString(this.channelID);
        parcel.writeParcelable(this.idleConfig, i);
        parcel.writeParcelable(this.pausedConfig, i);
        parcel.writeParcelable(this.connectedConfig, i);
        parcel.writeParcelable(this.connectingConfig, i);
        parcel.writeParcelable(this.cnlConfig, i);
        parcel.writeString(this.clickAction);
    }

    private NotificationConfig(@x1 Builder builder) {
        this.smallIconId = 0;
        this.title = builder.title;
        this.icon = builder.icon;
        this.disabled = builder.disabled;
        this.smallIconId = builder.smallIconId;
        this.channelID = builder.channelId;
        this.idleConfig = builder.idleConfig;
        this.pausedConfig = builder.pausedConfig;
        this.connectedConfig = builder.connectedConfig;
        this.connectingConfig = builder.connectingConfig;
        this.cnlConfig = builder.cnlConfig;
        this.clickAction = builder.clickAction;
        this.createTime = SystemClock.elapsedRealtime();
    }

    /* loaded from: classes.dex */
    public static class StateNotification implements Parcelable {
        @x1
        public static final Parcelable.Creator<StateNotification> CREATOR = new a();
        @x1
        private final String message;
        @x1
        private final String title;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<StateNotification> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public StateNotification createFromParcel(Parcel parcel) {
                return new StateNotification(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public StateNotification[] newArray(int i) {
                return new StateNotification[i];
            }
        }

        public StateNotification(@x1 String str, @x1 String str2) {
            this.title = str;
            this.message = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @x1
        public String getMessage() {
            return this.message;
        }

        @x1
        public String getTitle() {
            return this.title;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("StateNotification{");
            stringBuffer.append("title='");
            stringBuffer.append(this.title);
            stringBuffer.append('\'');
            stringBuffer.append(", message='");
            stringBuffer.append(this.message);
            stringBuffer.append('\'');
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.message);
        }

        public StateNotification(@x1 Parcel parcel) {
            this.title = parcel.readString();
            this.message = parcel.readString();
        }
    }

    public NotificationConfig(@x1 Parcel parcel) {
        this.smallIconId = 0;
        this.createTime = parcel.readLong();
        this.title = parcel.readString();
        this.icon = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.disabled = parcel.readByte() != 0;
        this.smallIconId = parcel.readInt();
        this.channelID = parcel.readString();
        this.idleConfig = (StateNotification) parcel.readParcelable(StateNotification.class.getClassLoader());
        this.pausedConfig = (StateNotification) parcel.readParcelable(StateNotification.class.getClassLoader());
        this.connectedConfig = (StateNotification) parcel.readParcelable(StateNotification.class.getClassLoader());
        this.connectingConfig = (StateNotification) parcel.readParcelable(StateNotification.class.getClassLoader());
        this.cnlConfig = (StateNotification) parcel.readParcelable(StateNotification.class.getClassLoader());
        this.clickAction = parcel.readString();
    }
}