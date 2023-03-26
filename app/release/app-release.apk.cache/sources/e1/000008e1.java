package com.anythink.expressad.playercommon;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import com.anythink.expressad.foundation.g.i.a;
import com.anythink.expressad.foundation.g.i.b;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class VideoFeedsPlayer implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private Timer mBufferTimeoutTimer;
    private int mCurrentPosition;
    private View mFullScreenLoadingView;
    private VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private MediaPlayer mMediaPlayer;
    private String mNetUrl;
    private VideoPlayerStatusListener mOutterVFListener;
    private Timer mPlayProgressTimer;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private b wrapper;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };

    /* loaded from: classes2.dex */
    public class PlayProgressTask extends TimerTask {
        private PlayProgressTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i;
            try {
                if (VideoFeedsPlayer.this.mMediaPlayer == null || !VideoFeedsPlayer.this.mMediaPlayer.isPlaying()) {
                    return;
                }
                VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.mMediaPlayer.getCurrentPosition();
                float f = VideoFeedsPlayer.this.mCurrentPosition % 1000;
                int round = Math.round(VideoFeedsPlayer.this.mCurrentPosition / 1000.0f);
                if (VideoFeedsPlayer.this.mMediaPlayer == null || VideoFeedsPlayer.this.mMediaPlayer.getDuration() <= 0) {
                    i = 0;
                } else {
                    i = VideoFeedsPlayer.this.mMediaPlayer.getDuration() / 1000;
                    if (f > 0.0f && f < 500.0f) {
                        round++;
                    }
                }
                if (round >= 0 && i > 0 && round < i + 1) {
                    VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(round, i);
                }
                VideoFeedsPlayer.this.mIsComplete = false;
                if (VideoFeedsPlayer.this.mIsBuffering) {
                    return;
                }
                VideoFeedsPlayer.this.hideLoading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            Timer timer = this.mPlayProgressTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i, final int i2) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i, i2);
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i, i2);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final int i) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i);
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startBufferIngTimer(final String str) {
        if (this.mIsNeedBufferingTimeout) {
            cancelBufferTimeoutTimer();
            Timer timer = new Timer();
            this.mBufferTimeoutTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        if (!VideoFeedsPlayer.this.mHasPrepare || VideoFeedsPlayer.this.mIsBuffering) {
                            VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, this.mBufferTime * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mPlayProgressTimer = new Timer();
            this.mPlayProgressTimer.schedule(new PlayProgressTask(), 0L, 1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeSound() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.setVolume(0.0f, 0.0f);
            this.mIsSilent = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            if (view != null) {
                return view.getVisibility() == 0;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public int getCurPosition() {
        return this.mCurrentPosition;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.getDuration();
            return 0;
        }
        return 0;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            return this.mLoadingView.get().getVisibility() == 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i) {
        if (i > 0) {
            this.mBufferTime = i;
        }
        this.mIsNeedBufferingTimeout = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r7 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean initMediaPlayer(String str, View view, VideoPlayerStatusListener videoPlayerStatusListener, String str2) {
        try {
            synchronized (this.mLock) {
                if (this.mMediaPlayer == null) {
                    b a = a.a(str2);
                    this.wrapper = a;
                    if (a != null) {
                        MediaPlayer b = a.b();
                        this.mMediaPlayer = b;
                    }
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    this.mMediaPlayer = mediaPlayer;
                    mediaPlayer.reset();
                }
                if (view == null) {
                    postOnPlayErrorOnMainThread("MediaPlayer init error");
                    return false;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.mNetUrl = str;
                }
                this.mOutterVFListener = videoPlayerStatusListener;
                this.mLoadingView = new WeakReference<>(view);
                this.mMediaPlayer.setOnCompletionListener(this);
                this.mMediaPlayer.setOnErrorListener(this);
                if (this.wrapper == null) {
                    this.mMediaPlayer.setOnPreparedListener(this);
                }
                this.mMediaPlayer.setOnInfoListener(this);
                this.mMediaPlayer.setOnBufferingUpdateListener(this);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i) {
        try {
            this.mCurrentPosition = i;
            if (!this.mHasPrepare) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0;
            hideLoading();
            postOnPlayCompletedOnMainThread();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            hideLoading();
            this.mHasPrepare = false;
            postOnPlayErrorOnMainThread(PlayerErrorConstant.UNKNOW_ERROR);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i != 701) {
            if (i == 702) {
                this.mIsBuffering = false;
                hideLoading();
                postOnBufferinEndOnMainThread();
            }
            return false;
        }
        this.mIsBuffering = true;
        showLoading();
        startBufferIngTimer("play buffering tiemout");
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (this.mIsFrontDesk) {
            this.mMediaPlayer.seekTo(this.mCurrentPosition);
            this.mMediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.3
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public void onSeekComplete(MediaPlayer mediaPlayer2) {
                    try {
                        if (VideoFeedsPlayer.this.mIsFrontDesk) {
                            VideoFeedsPlayer.this.hideLoading();
                            VideoFeedsPlayer.this.mHasPrepare = true;
                            if (VideoFeedsPlayer.this.mMediaPlayer != null) {
                                VideoFeedsPlayer.this.mIsPlaying = true;
                                if (!VideoFeedsPlayer.this.isStart) {
                                    VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                                    videoFeedsPlayer.postOnPlayStartOnMainThread(videoFeedsPlayer.mMediaPlayer.getDuration() / 1000);
                                    VideoFeedsPlayer.this.isStart = true;
                                }
                                VideoFeedsPlayer.this.mMediaPlayer.start();
                            }
                            VideoFeedsPlayer.this.postOnBufferinEndOnMainThread();
                            VideoFeedsPlayer.this.startPlayProgressTimer();
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        }
    }

    public void openSound() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.setVolume(1.0f, 1.0f);
            this.mIsSilent = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        MediaPlayer mediaPlayer;
        try {
            if (this.mHasPrepare && (mediaPlayer = this.mMediaPlayer) != null && mediaPlayer.isPlaying()) {
                hideLoading();
                this.mMediaPlayer.pause();
                this.mIsPlaying = false;
            }
        } catch (Exception unused) {
        }
    }

    public void play(String str, int i) {
        try {
            synchronized (this.mLock) {
                if (i > 0) {
                    this.mCurrentPosition = i;
                }
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                showLoading();
                setDataSource();
            }
        } catch (Exception e) {
            e.printStackTrace();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void prepare() {
        MediaPlayer mediaPlayer;
        try {
            if (this.mHasPrepare || (mediaPlayer = this.mMediaPlayer) == null) {
                return;
            }
            mediaPlayer.prepare();
            this.mHasPrepare = true;
            this.mIsPlaying = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void releasePlayer() {
        try {
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.mMediaPlayer != null) {
                stop();
                new Thread(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.15
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            VideoFeedsPlayer.this.mMediaPlayer.stop();
                            VideoFeedsPlayer.this.mMediaPlayer.reset();
                            VideoFeedsPlayer.this.mMediaPlayer.release();
                            VideoFeedsPlayer.this.mMediaPlayer = null;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
                this.mInnerVFPLisener = null;
                this.mOutterVFListener = null;
            }
            hideLoading();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void seekTo(int i) {
        MediaPlayer mediaPlayer;
        try {
            this.mCurrentPosition = i;
            if (this.mHasPrepare && (mediaPlayer = this.mMediaPlayer) != null) {
                mediaPlayer.seekTo(i);
                this.mMediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.14
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(MediaPlayer mediaPlayer2) {
                        try {
                            if (!VideoFeedsPlayer.this.mMediaPlayer.isPlaying()) {
                                VideoFeedsPlayer.this.mMediaPlayer.start();
                            }
                            VideoFeedsPlayer.this.mIsPlaying = true;
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDataSource() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                if (this.wrapper == null) {
                    mediaPlayer.reset();
                    this.mMediaPlayer.setDataSource(this.mPlayUrl);
                }
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    this.mMediaPlayer.setDisplay(surfaceHolder);
                }
                b bVar = this.wrapper;
                if (bVar == null) {
                    this.mHasPrepare = false;
                    this.mMediaPlayer.prepareAsync();
                    startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
                } else if (bVar.a()) {
                    onPrepared(this.mMediaPlayer);
                } else {
                    this.mHasPrepare = false;
                    this.wrapper.a(this);
                    startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setIsComplete(boolean z) {
        this.mIsComplete = z;
    }

    public void setPlaybackParams(float f) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.mMediaPlayer.isPlaying()) {
                    MediaPlayer mediaPlayer = this.mMediaPlayer;
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
                    return;
                }
                MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                mediaPlayer2.setPlaybackParams(mediaPlayer2.getPlaybackParams().setSpeed(f));
                this.mMediaPlayer.pause();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f, float f2) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f, f2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setisFrontDesk(boolean z) {
        try {
            this.mIsFrontDesk = z;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.mHasPrepare || (mediaPlayer = this.mMediaPlayer) == null || mediaPlayer.isPlaying()) {
                return;
            }
            showLoading();
            this.mMediaPlayer.start();
            this.mIsPlaying = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        MediaPlayer mediaPlayer;
        try {
            if (this.mHasPrepare && (mediaPlayer = this.mMediaPlayer) != null && mediaPlayer.isPlaying()) {
                hideLoading();
                this.mMediaPlayer.stop();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(int i) {
        MediaPlayer mediaPlayer;
        try {
            if (!this.mHasPrepare || (mediaPlayer = this.mMediaPlayer) == null || mediaPlayer.isPlaying()) {
                return;
            }
            if (i > 0) {
                this.mMediaPlayer.seekTo(i);
                this.mMediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.13
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(MediaPlayer mediaPlayer2) {
                        VideoFeedsPlayer.this.mMediaPlayer.start();
                        VideoFeedsPlayer.this.mIsPlaying = true;
                    }
                });
                return;
            }
            this.mMediaPlayer.start();
            this.mIsPlaying = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                this.mSurfaceHolder = surfaceHolder;
                showLoading();
                setDataSource();
            }
        } catch (Exception e) {
            e.printStackTrace();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }
}