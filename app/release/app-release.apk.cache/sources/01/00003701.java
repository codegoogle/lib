package com.microsoft.appcenter.crashes;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.microsoft.appcenter.AbstractAppCenterService;
import com.microsoft.appcenter.Constants;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import com.microsoft.appcenter.crashes.ingestion.models.Exception;
import com.microsoft.appcenter.crashes.ingestion.models.HandledErrorLog;
import com.microsoft.appcenter.crashes.ingestion.models.ManagedErrorLog;
import com.microsoft.appcenter.crashes.ingestion.models.StackFrame;
import com.microsoft.appcenter.crashes.ingestion.models.json.ErrorAttachmentLogFactory;
import com.microsoft.appcenter.crashes.ingestion.models.json.HandledErrorLogFactory;
import com.microsoft.appcenter.crashes.ingestion.models.json.ManagedErrorLogFactory;
import com.microsoft.appcenter.crashes.model.ErrorReport;
import com.microsoft.appcenter.crashes.model.NativeException;
import com.microsoft.appcenter.crashes.model.TestCrashException;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import com.microsoft.appcenter.ingestion.models.Device;
import com.microsoft.appcenter.ingestion.models.json.DefaultLogSerializer;
import com.microsoft.appcenter.ingestion.models.json.LogFactory;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.HandlerUtils;
import com.microsoft.appcenter.utils.async.AppCenterFuture;
import com.microsoft.appcenter.utils.async.DefaultAppCenterFuture;
import com.microsoft.appcenter.utils.context.SessionContext;
import com.microsoft.appcenter.utils.context.UserIdContext;
import com.microsoft.appcenter.utils.storage.FileManager;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Crashes extends AbstractAppCenterService {
    public static final int ALWAYS_SEND = 2;
    public static final int DONT_SEND = 1;
    @r2
    public static final String ERROR_GROUP = "groupErrors";
    public static final String LOG_TAG = "AppCenterCrashes";
    private static final int MAX_ATTACHMENT_SIZE = 7340032;
    @r2
    public static final String MINIDUMP_FILE = "minidump";
    @r2
    public static final String PREF_KEY_ALWAYS_SEND = "com.microsoft.appcenter.crashes.always.send";
    @r2
    public static final String PREF_KEY_MEMORY_RUNNING_LEVEL = "com.microsoft.appcenter.crashes.memory";
    public static final int SEND = 0;
    private static final String SERVICE_NAME = "Crashes";
    private boolean mAutomaticProcessing = true;
    private Context mContext;
    private CrashesListener mCrashesListener;
    private Device mDevice;
    private final Map<UUID, ErrorLogReport> mErrorReportCache;
    private final Map<String, LogFactory> mFactories;
    private boolean mHasReceivedMemoryWarningInLastSession;
    private long mInitializeTimestamp;
    private ErrorReport mLastSessionErrorReport;
    private LogSerializer mLogSerializer;
    private ComponentCallbacks2 mMemoryWarningListener;
    private boolean mSavedUncaughtException;
    private UncaughtExceptionHandler mUncaughtExceptionHandler;
    private final Map<UUID, ErrorLogReport> mUnprocessedErrorReports;
    private static final CrashesListener DEFAULT_ERROR_REPORTING_LISTENER = new DefaultCrashesListener();
    @SuppressLint({"StaticFieldLeak"})
    private static Crashes sInstance = null;

    /* loaded from: classes3.dex */
    public interface CallbackProcessor {
        void onCallBack(ErrorReport errorReport);
    }

    /* loaded from: classes3.dex */
    public static class DefaultCrashesListener extends AbstractCrashesListener {
        private DefaultCrashesListener() {
        }
    }

    /* loaded from: classes3.dex */
    public static class ErrorLogReport {
        private final ManagedErrorLog log;
        private final ErrorReport report;

        private ErrorLogReport(ManagedErrorLog managedErrorLog, ErrorReport errorReport) {
            this.log = managedErrorLog;
            this.report = errorReport;
        }
    }

    /* loaded from: classes3.dex */
    public interface ExceptionModelBuilder {
        Exception buildExceptionModel();
    }

    private Crashes() {
        HashMap hashMap = new HashMap();
        this.mFactories = hashMap;
        hashMap.put(ManagedErrorLog.TYPE, ManagedErrorLogFactory.getInstance());
        hashMap.put(HandledErrorLog.TYPE, HandledErrorLogFactory.getInstance());
        hashMap.put(ErrorAttachmentLog.TYPE, ErrorAttachmentLogFactory.getInstance());
        DefaultLogSerializer defaultLogSerializer = new DefaultLogSerializer();
        this.mLogSerializer = defaultLogSerializer;
        defaultLogSerializer.addLogFactory(ManagedErrorLog.TYPE, ManagedErrorLogFactory.getInstance());
        this.mLogSerializer.addLogFactory(ErrorAttachmentLog.TYPE, ErrorAttachmentLogFactory.getInstance());
        this.mCrashesListener = DEFAULT_ERROR_REPORTING_LISTENER;
        this.mUnprocessedErrorReports = new LinkedHashMap();
        this.mErrorReportCache = new LinkedHashMap();
    }

    public static void generateTestCrash() {
        if (!Constants.APPLICATION_DEBUGGABLE) {
            AppCenterLog.warn(LOG_TAG, "The application is not debuggable so SDK won't generate test crash");
            return;
        }
        throw new TestCrashException();
    }

    @x1
    public static synchronized Crashes getInstance() {
        Crashes crashes;
        synchronized (Crashes.class) {
            if (sInstance == null) {
                sInstance = new Crashes();
            }
            crashes = sInstance;
        }
        return crashes;
    }

    private synchronized AppCenterFuture<ErrorReport> getInstanceLastSessionCrashReport() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.4
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(Crashes.this.mLastSessionErrorReport);
            }
        }, defaultAppCenterFuture, null);
        return defaultAppCenterFuture;
    }

    public static AppCenterFuture<ErrorReport> getLastSessionCrashReport() {
        return getInstance().getInstanceLastSessionCrashReport();
    }

    public static AppCenterFuture<String> getMinidumpDirectory() {
        return getInstance().getNewMinidumpDirectoryAsync();
    }

    private synchronized AppCenterFuture<String> getNewMinidumpDirectoryAsync() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.1
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(ErrorLogHelper.getNewMinidumpSubfolderWithContextData(Crashes.this.mContext).getAbsolutePath());
            }
        }, defaultAppCenterFuture, null);
        return defaultAppCenterFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @r2
    public synchronized void handleUserConfirmation(final int i) {
        post(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.12
            /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                File file;
                int i2 = i;
                if (i2 == 1) {
                    Iterator it = Crashes.this.mUnprocessedErrorReports.keySet().iterator();
                    while (it.hasNext()) {
                        it.remove();
                        Crashes.this.removeAllStoredErrorLogFiles((UUID) it.next());
                    }
                    ErrorLogHelper.cleanPendingMinidumps();
                    return;
                }
                if (i2 == 2) {
                    SharedPreferencesManager.putBoolean(Crashes.PREF_KEY_ALWAYS_SEND, true);
                }
                Iterator it2 = Crashes.this.mUnprocessedErrorReports.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    ErrorLogReport errorLogReport = (ErrorLogReport) entry.getValue();
                    ErrorAttachmentLog errorAttachmentLog = null;
                    if (errorLogReport.report.getDevice() != null && Constants.WRAPPER_SDK_NAME_NDK.equals(errorLogReport.report.getDevice().getWrapperSdkName())) {
                        Exception exception = errorLogReport.log.getException();
                        String minidumpFilePath = exception.getMinidumpFilePath();
                        exception.setMinidumpFilePath(null);
                        if (minidumpFilePath == null) {
                            minidumpFilePath = exception.getStackTrace();
                            exception.setStackTrace(null);
                        }
                        if (minidumpFilePath != null) {
                            File file2 = new File(minidumpFilePath);
                            errorAttachmentLog = ErrorAttachmentLog.attachmentWithBinary(FileManager.readBytes(file2), "minidump.dmp", tm4.x);
                            file = file2;
                            Crashes.this.mChannel.enqueue(errorLogReport.log, Crashes.ERROR_GROUP, 2);
                            if (errorAttachmentLog != null) {
                                Crashes.this.sendErrorAttachment(errorLogReport.log.getId(), Collections.singleton(errorAttachmentLog));
                                file.delete();
                            }
                            if (!Crashes.this.mAutomaticProcessing) {
                                Crashes.this.sendErrorAttachment(errorLogReport.log.getId(), Crashes.this.mCrashesListener.getErrorAttachments(errorLogReport.report));
                            }
                            it2.remove();
                            ErrorLogHelper.removeStoredErrorLogFile((UUID) entry.getKey());
                        } else {
                            AppCenterLog.warn(Crashes.LOG_TAG, "NativeException found without minidump.");
                        }
                    }
                    file = null;
                    Crashes.this.mChannel.enqueue(errorLogReport.log, Crashes.ERROR_GROUP, 2);
                    if (errorAttachmentLog != null) {
                    }
                    if (!Crashes.this.mAutomaticProcessing) {
                    }
                    it2.remove();
                    ErrorLogHelper.removeStoredErrorLogFile((UUID) entry.getKey());
                }
            }
        });
    }

    public static AppCenterFuture<Boolean> hasCrashedInLastSession() {
        return getInstance().hasInstanceCrashedInLastSession();
    }

    private synchronized AppCenterFuture<Boolean> hasInstanceCrashedInLastSession() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.2
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(Boolean.valueOf(Crashes.this.mLastSessionErrorReport != null));
            }
        }, defaultAppCenterFuture, Boolean.FALSE);
        return defaultAppCenterFuture;
    }

    private synchronized AppCenterFuture<Boolean> hasInstanceReceivedMemoryWarningInLastSession() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.3
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(Boolean.valueOf(Crashes.this.mHasReceivedMemoryWarningInLastSession));
            }
        }, defaultAppCenterFuture, Boolean.FALSE);
        return defaultAppCenterFuture;
    }

    public static AppCenterFuture<Boolean> hasReceivedMemoryWarningInLastSession() {
        return getInstance().hasInstanceReceivedMemoryWarningInLastSession();
    }

    private void initialize() {
        boolean isInstanceEnabled = isInstanceEnabled();
        this.mInitializeTimestamp = isInstanceEnabled ? System.currentTimeMillis() : -1L;
        if (!isInstanceEnabled) {
            UncaughtExceptionHandler uncaughtExceptionHandler = this.mUncaughtExceptionHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.unregister();
                this.mUncaughtExceptionHandler = null;
                return;
            }
            return;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler2 = new UncaughtExceptionHandler();
        this.mUncaughtExceptionHandler = uncaughtExceptionHandler2;
        uncaughtExceptionHandler2.register();
        processMinidumpFiles();
    }

    public static AppCenterFuture<Boolean> isEnabled() {
        return getInstance().isInstanceEnabledAsync();
    }

    private static boolean isMemoryRunningLevelWasReceived(int i) {
        return i == 5 || i == 10 || i == 15 || i == 80;
    }

    public static void notifyUserConfirmation(int i) {
        getInstance().handleUserConfirmation(i);
    }

    private void processMinidumpFiles() {
        File[] newMinidumpFiles;
        for (File file : ErrorLogHelper.getNewMinidumpFiles()) {
            if (!file.isDirectory()) {
                AppCenterLog.debug(LOG_TAG, "Found a minidump from a previous SDK version.");
                processSingleMinidump(file, file);
            } else {
                File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.microsoft.appcenter.crashes.Crashes.10
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file2, String str) {
                        return str.endsWith(ErrorLogHelper.MINIDUMP_FILE_EXTENSION);
                    }
                });
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        processSingleMinidump(file2, file);
                    }
                }
            }
        }
        File lastErrorLogFile = ErrorLogHelper.getLastErrorLogFile();
        while (lastErrorLogFile != null && lastErrorLogFile.length() == 0) {
            AppCenterLog.warn(LOG_TAG, "Deleting empty error file: " + lastErrorLogFile);
            lastErrorLogFile.delete();
            lastErrorLogFile = ErrorLogHelper.getLastErrorLogFile();
        }
        if (lastErrorLogFile != null) {
            AppCenterLog.debug(LOG_TAG, "Processing crash report for the last session.");
            String read = FileManager.read(lastErrorLogFile);
            if (read == null) {
                AppCenterLog.error(LOG_TAG, "Error reading last session error log.");
            } else {
                try {
                    this.mLastSessionErrorReport = buildErrorReport((ManagedErrorLog) this.mLogSerializer.deserializeLog(read, null));
                    AppCenterLog.debug(LOG_TAG, "Processed crash report for the last session.");
                } catch (JSONException e) {
                    AppCenterLog.error(LOG_TAG, "Error parsing last session error log.", e);
                }
            }
        }
        ErrorLogHelper.removeStaleMinidumpSubfolders();
    }

    private void processPendingErrors() {
        File[] storedErrorLogFiles;
        for (File file : ErrorLogHelper.getStoredErrorLogFiles()) {
            AppCenterLog.debug(LOG_TAG, "Process pending error file: " + file);
            String read = FileManager.read(file);
            if (read != null) {
                try {
                    ManagedErrorLog managedErrorLog = (ManagedErrorLog) this.mLogSerializer.deserializeLog(read, null);
                    UUID id = managedErrorLog.getId();
                    ErrorReport buildErrorReport = buildErrorReport(managedErrorLog);
                    if (buildErrorReport == null) {
                        removeAllStoredErrorLogFiles(id);
                    } else {
                        if (this.mAutomaticProcessing && !this.mCrashesListener.shouldProcess(buildErrorReport)) {
                            AppCenterLog.debug(LOG_TAG, "CrashesListener.shouldProcess returned false, clean up and ignore log: " + id.toString());
                            removeAllStoredErrorLogFiles(id);
                        }
                        if (!this.mAutomaticProcessing) {
                            AppCenterLog.debug(LOG_TAG, "CrashesListener.shouldProcess returned true, continue processing log: " + id.toString());
                        }
                        this.mUnprocessedErrorReports.put(id, this.mErrorReportCache.get(id));
                    }
                } catch (JSONException e) {
                    AppCenterLog.error(LOG_TAG, "Error parsing error log. Deleting invalid file: " + file, e);
                    file.delete();
                }
            }
        }
        boolean isMemoryRunningLevelWasReceived = isMemoryRunningLevelWasReceived(SharedPreferencesManager.getInt(PREF_KEY_MEMORY_RUNNING_LEVEL, -1));
        this.mHasReceivedMemoryWarningInLastSession = isMemoryRunningLevelWasReceived;
        if (isMemoryRunningLevelWasReceived) {
            AppCenterLog.debug(LOG_TAG, "The application received a low memory warning in the last session.");
        }
        SharedPreferencesManager.remove(PREF_KEY_MEMORY_RUNNING_LEVEL);
        if (this.mAutomaticProcessing) {
            sendCrashReportsOrAwaitUserConfirmation();
        }
    }

    private void processSingleMinidump(File file, File file2) {
        AppCenterLog.debug(LOG_TAG, "Process pending minidump file: " + file);
        long lastModified = file.lastModified();
        File file3 = new File(ErrorLogHelper.getPendingMinidumpDirectory(), file.getName());
        Exception exception = new Exception();
        exception.setType(MINIDUMP_FILE);
        exception.setWrapperSdkName(Constants.WRAPPER_SDK_NAME_NDK);
        exception.setMinidumpFilePath(file3.getPath());
        ManagedErrorLog managedErrorLog = new ManagedErrorLog();
        managedErrorLog.setException(exception);
        managedErrorLog.setTimestamp(new Date(lastModified));
        managedErrorLog.setFatal(Boolean.TRUE);
        managedErrorLog.setId(ErrorLogHelper.parseLogFolderUuid(file2));
        SessionContext.SessionInfo sessionAt = SessionContext.getInstance().getSessionAt(lastModified);
        if (sessionAt != null && sessionAt.getAppLaunchTimestamp() <= lastModified) {
            managedErrorLog.setAppLaunchTimestamp(new Date(sessionAt.getAppLaunchTimestamp()));
        } else {
            managedErrorLog.setAppLaunchTimestamp(managedErrorLog.getTimestamp());
        }
        managedErrorLog.setProcessId(0);
        managedErrorLog.setProcessName("");
        try {
            String storedUserInfo = ErrorLogHelper.getStoredUserInfo(file2);
            Device storedDeviceInfo = ErrorLogHelper.getStoredDeviceInfo(file2);
            if (storedDeviceInfo == null) {
                storedDeviceInfo = getDeviceInfo(this.mContext);
                storedDeviceInfo.setWrapperSdkName(Constants.WRAPPER_SDK_NAME_NDK);
            }
            managedErrorLog.setDevice(storedDeviceInfo);
            managedErrorLog.setUserId(storedUserInfo);
            saveErrorLogFiles(new NativeException(), managedErrorLog);
            if (file.renameTo(file3)) {
                return;
            }
            throw new IOException("Failed to move file");
        } catch (Exception e) {
            file.delete();
            removeAllStoredErrorLogFiles(managedErrorLog.getId());
            AppCenterLog.error(LOG_TAG, "Failed to process new minidump file: " + file, e);
        }
    }

    private synchronized void queueException(@x1 final Throwable th, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        queueException(new ExceptionModelBuilder() { // from class: com.microsoft.appcenter.crashes.Crashes.7
            @Override // com.microsoft.appcenter.crashes.Crashes.ExceptionModelBuilder
            public Exception buildExceptionModel() {
                return ErrorLogHelper.getModelExceptionFromThrowable(th);
            }
        }, map, iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllStoredErrorLogFiles(UUID uuid) {
        ErrorLogHelper.removeStoredErrorLogFile(uuid);
        removeStoredThrowable(uuid);
    }

    private void removeStoredThrowable(UUID uuid) {
        this.mErrorReportCache.remove(uuid);
        WrapperSdkExceptionManager.deleteWrapperExceptionData(uuid);
    }

    @x1
    private UUID saveErrorLogFiles(Throwable th, ManagedErrorLog managedErrorLog) throws JSONException, IOException {
        File errorStorageDirectory = ErrorLogHelper.getErrorStorageDirectory();
        UUID id = managedErrorLog.getId();
        String uuid = id.toString();
        AppCenterLog.debug(LOG_TAG, "Saving uncaught exception.");
        File file = new File(errorStorageDirectory, wo1.t(uuid, ErrorLogHelper.ERROR_LOG_FILE_EXTENSION));
        FileManager.write(file, this.mLogSerializer.serializeLog(managedErrorLog));
        AppCenterLog.debug(LOG_TAG, "Saved JSON content for ingestion into " + file);
        return id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public static void saveMemoryRunningLevel(int i) {
        SharedPreferencesManager.putInt(PREF_KEY_MEMORY_RUNNING_LEVEL, i);
        AppCenterLog.debug(LOG_TAG, String.format("The memory running level (%s) was saved.", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendCrashReportsOrAwaitUserConfirmation() {
        final boolean z = SharedPreferencesManager.getBoolean(PREF_KEY_ALWAYS_SEND, false);
        HandlerUtils.runOnUiThread(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.11
            @Override // java.lang.Runnable
            public void run() {
                if (Crashes.this.mUnprocessedErrorReports.size() > 0) {
                    if (!z) {
                        if (Crashes.this.mAutomaticProcessing) {
                            if (!Crashes.this.mCrashesListener.shouldAwaitUserConfirmation()) {
                                AppCenterLog.debug(Crashes.LOG_TAG, "CrashesListener.shouldAwaitUserConfirmation returned false, will send logs.");
                                Crashes.this.handleUserConfirmation(0);
                                return;
                            }
                            AppCenterLog.debug(Crashes.LOG_TAG, "CrashesListener.shouldAwaitUserConfirmation returned true, wait sending logs.");
                            return;
                        }
                        AppCenterLog.debug(Crashes.LOG_TAG, "Automatic processing disabled, will wait for explicit user confirmation.");
                        return;
                    }
                    AppCenterLog.debug(Crashes.LOG_TAG, "The flag for user confirmation is set to ALWAYS_SEND, will send logs.");
                    Crashes.this.handleUserConfirmation(0);
                }
            }
        });
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void sendErrorAttachment(UUID uuid, Iterable<ErrorAttachmentLog> iterable) {
        if (iterable == null) {
            StringBuilder G = wo1.G("Error report: ");
            G.append(uuid.toString());
            G.append(" does not have any attachment.");
            AppCenterLog.debug(LOG_TAG, G.toString());
            return;
        }
        for (ErrorAttachmentLog errorAttachmentLog : iterable) {
            if (errorAttachmentLog != null) {
                errorAttachmentLog.setId(UUID.randomUUID());
                errorAttachmentLog.setErrorId(uuid);
                if (!errorAttachmentLog.isValid()) {
                    AppCenterLog.error(LOG_TAG, "Not all required fields are present in ErrorAttachmentLog.");
                } else if (errorAttachmentLog.getData().length > MAX_ATTACHMENT_SIZE) {
                    AppCenterLog.error(LOG_TAG, String.format(Locale.ENGLISH, "Discarding attachment with size above %d bytes: size=%d, fileName=%s.", Integer.valueOf((int) MAX_ATTACHMENT_SIZE), Integer.valueOf(errorAttachmentLog.getData().length), errorAttachmentLog.getFileName()));
                } else {
                    this.mChannel.enqueue(errorAttachmentLog, ERROR_GROUP, 1);
                }
            } else {
                AppCenterLog.warn(LOG_TAG, "Skipping null ErrorAttachmentLog.");
            }
        }
    }

    public static AppCenterFuture<Void> setEnabled(boolean z) {
        return getInstance().setInstanceEnabledAsync(z);
    }

    public static void setListener(CrashesListener crashesListener) {
        getInstance().setInstanceListener(crashesListener);
    }

    public static void trackError(Throwable th) {
        trackError(th, null, null);
    }

    @r2
    public static synchronized void unsetInstance() {
        synchronized (Crashes.class) {
            sInstance = null;
        }
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    public synchronized void applyEnabledState(boolean z) {
        initialize();
        if (z) {
            ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2() { // from class: com.microsoft.appcenter.crashes.Crashes.5
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@x1 Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    Crashes.saveMemoryRunningLevel(80);
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    Crashes.saveMemoryRunningLevel(i);
                }
            };
            this.mMemoryWarningListener = componentCallbacks2;
            this.mContext.registerComponentCallbacks(componentCallbacks2);
        } else {
            File[] listFiles = ErrorLogHelper.getErrorStorageDirectory().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    AppCenterLog.debug(LOG_TAG, "Deleting file " + file);
                    if (!file.delete()) {
                        AppCenterLog.warn(LOG_TAG, "Failed to delete file " + file);
                    }
                }
            }
            AppCenterLog.info(LOG_TAG, "Deleted crashes local files");
            this.mErrorReportCache.clear();
            this.mLastSessionErrorReport = null;
            this.mContext.unregisterComponentCallbacks(this.mMemoryWarningListener);
            this.mMemoryWarningListener = null;
            SharedPreferencesManager.remove(PREF_KEY_MEMORY_RUNNING_LEVEL);
        }
    }

    @r2
    public ErrorReport buildErrorReport(ManagedErrorLog managedErrorLog) {
        UUID id = managedErrorLog.getId();
        if (this.mErrorReportCache.containsKey(id)) {
            ErrorReport errorReport = this.mErrorReportCache.get(id).report;
            errorReport.setDevice(managedErrorLog.getDevice());
            return errorReport;
        }
        File storedThrowableFile = ErrorLogHelper.getStoredThrowableFile(id);
        String read = (storedThrowableFile == null || storedThrowableFile.length() <= 0) ? null : FileManager.read(storedThrowableFile);
        if (read == null) {
            if (MINIDUMP_FILE.equals(managedErrorLog.getException().getType())) {
                read = Log.getStackTraceString(new NativeException());
            } else {
                read = buildStackTrace(managedErrorLog.getException());
            }
        }
        ErrorReport errorReportFromErrorLog = ErrorLogHelper.getErrorReportFromErrorLog(managedErrorLog, read);
        this.mErrorReportCache.put(id, new ErrorLogReport(managedErrorLog, errorReportFromErrorLog));
        return errorReportFromErrorLog;
    }

    @r2
    public String buildStackTrace(Exception exception) {
        String format = String.format("%s: %s", exception.getType(), exception.getMessage());
        if (exception.getFrames() == null) {
            return format;
        }
        for (StackFrame stackFrame : exception.getFrames()) {
            StringBuilder G = wo1.G(format);
            G.append(String.format("\n\t at %s.%s(%s:%s)", stackFrame.getClassName(), stackFrame.getMethodName(), stackFrame.getFileName(), stackFrame.getLineNumber()));
            format = G.toString();
        }
        return format;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    public Channel.GroupListener getChannelListener() {
        return new Channel.GroupListener() { // from class: com.microsoft.appcenter.crashes.Crashes.6
            private void processCallback(final com.microsoft.appcenter.ingestion.models.Log log, final CallbackProcessor callbackProcessor) {
                Crashes.this.post(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.microsoft.appcenter.ingestion.models.Log log2 = log;
                        if (log2 instanceof ManagedErrorLog) {
                            ManagedErrorLog managedErrorLog = (ManagedErrorLog) log2;
                            final ErrorReport buildErrorReport = Crashes.this.buildErrorReport(managedErrorLog);
                            UUID id = managedErrorLog.getId();
                            if (buildErrorReport != null) {
                                HandlerUtils.runOnUiThread(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.6.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        callbackProcessor.onCallBack(buildErrorReport);
                                    }
                                });
                                return;
                            }
                            AppCenterLog.warn(Crashes.LOG_TAG, "Cannot find crash report for the error log: " + id);
                        } else if ((log2 instanceof ErrorAttachmentLog) || (log2 instanceof HandledErrorLog)) {
                        } else {
                            StringBuilder G = wo1.G("A different type of log comes to crashes: ");
                            G.append(log.getClass().getName());
                            AppCenterLog.warn(Crashes.LOG_TAG, G.toString());
                        }
                    }
                });
            }

            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onBeforeSending(com.microsoft.appcenter.ingestion.models.Log log) {
                processCallback(log, new CallbackProcessor() { // from class: com.microsoft.appcenter.crashes.Crashes.6.2
                    @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
                    public void onCallBack(ErrorReport errorReport) {
                        Crashes.this.mCrashesListener.onBeforeSending(errorReport);
                    }
                });
            }

            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onFailure(com.microsoft.appcenter.ingestion.models.Log log, final Exception exc) {
                processCallback(log, new CallbackProcessor() { // from class: com.microsoft.appcenter.crashes.Crashes.6.4
                    @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
                    public void onCallBack(ErrorReport errorReport) {
                        Crashes.this.mCrashesListener.onSendingFailed(errorReport, exc);
                    }
                });
            }

            @Override // com.microsoft.appcenter.channel.Channel.GroupListener
            public void onSuccess(com.microsoft.appcenter.ingestion.models.Log log) {
                processCallback(log, new CallbackProcessor() { // from class: com.microsoft.appcenter.crashes.Crashes.6.3
                    @Override // com.microsoft.appcenter.crashes.Crashes.CallbackProcessor
                    public void onCallBack(ErrorReport errorReport) {
                        Crashes.this.mCrashesListener.onSendingSucceeded(errorReport);
                    }
                });
            }
        };
    }

    public synchronized Device getDeviceInfo(Context context) throws DeviceInfoHelper.DeviceInfoException {
        if (this.mDevice == null) {
            this.mDevice = DeviceInfoHelper.getDeviceInfo(context);
        }
        return this.mDevice;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    public String getGroupName() {
        return ERROR_GROUP;
    }

    public synchronized long getInitializeTimestamp() {
        return this.mInitializeTimestamp;
    }

    @r2
    public CrashesListener getInstanceListener() {
        return this.mCrashesListener;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public Map<String, LogFactory> getLogFactories() {
        return this.mFactories;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    public String getLoggerTag() {
        return LOG_TAG;
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public String getServiceName() {
        return SERVICE_NAME;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService
    public int getTriggerCount() {
        return 1;
    }

    @r2
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.mUncaughtExceptionHandler;
    }

    public AppCenterFuture<Collection<ErrorReport>> getUnprocessedErrorReports() {
        final DefaultAppCenterFuture defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.13
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(Crashes.this.mUnprocessedErrorReports.size());
                for (ErrorLogReport errorLogReport : Crashes.this.mUnprocessedErrorReports.values()) {
                    arrayList.add(errorLogReport.report);
                }
                defaultAppCenterFuture.complete(arrayList);
            }
        }, defaultAppCenterFuture, Collections.emptyList());
        return defaultAppCenterFuture;
    }

    @Override // com.microsoft.appcenter.AbstractAppCenterService, com.microsoft.appcenter.AppCenterService
    public synchronized void onStarted(@x1 Context context, @x1 Channel channel, String str, String str2, boolean z) {
        this.mContext = context;
        if (!isInstanceEnabled()) {
            ErrorLogHelper.removeMinidumpFolder();
            AppCenterLog.debug(LOG_TAG, "Clean up minidump folder.");
        }
        super.onStarted(context, channel, str, str2, z);
        if (isInstanceEnabled()) {
            processPendingErrors();
            if (this.mErrorReportCache.isEmpty()) {
                ErrorLogHelper.removeLostThrowableFiles();
            }
        }
    }

    public UUID saveUncaughtException(Thread thread, Throwable th) {
        try {
            return saveUncaughtException(thread, th, ErrorLogHelper.getModelExceptionFromThrowable(th));
        } catch (IOException e) {
            AppCenterLog.error(LOG_TAG, "Error writing error log to file", e);
            return null;
        } catch (JSONException e2) {
            AppCenterLog.error(LOG_TAG, "Error serializing error log to JSON", e2);
            return null;
        }
    }

    @s2
    public void sendErrorAttachments(final String str, final Iterable<ErrorAttachmentLog> iterable) {
        post(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Crashes.this.sendErrorAttachment(UUID.fromString(str), iterable);
                } catch (RuntimeException unused) {
                    AppCenterLog.error(Crashes.LOG_TAG, "Error report identifier has an invalid format for sending attachments.");
                }
            }
        });
    }

    public void setAutomaticProcessing(boolean z) {
        this.mAutomaticProcessing = z;
    }

    @r2
    public synchronized void setInstanceListener(CrashesListener crashesListener) {
        if (crashesListener == null) {
            crashesListener = DEFAULT_ERROR_REPORTING_LISTENER;
        }
        this.mCrashesListener = crashesListener;
    }

    @r2
    public void setLogSerializer(LogSerializer logSerializer) {
        this.mLogSerializer = logSerializer;
    }

    @r2
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mUncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    public static void trackError(Throwable th, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        getInstance().queueException(th, map, iterable);
    }

    public synchronized UUID queueException(@x1 final Exception exception, Map<String, String> map, Iterable<ErrorAttachmentLog> iterable) {
        return queueException(new ExceptionModelBuilder() { // from class: com.microsoft.appcenter.crashes.Crashes.8
            @Override // com.microsoft.appcenter.crashes.Crashes.ExceptionModelBuilder
            public Exception buildExceptionModel() {
                return exception;
            }
        }, map, iterable);
    }

    public AppCenterFuture<Boolean> sendCrashReportsOrAwaitUserConfirmation(final Collection<String> collection) {
        final DefaultAppCenterFuture defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.14
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = Crashes.this.mUnprocessedErrorReports.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    UUID uuid = (UUID) entry.getKey();
                    String id = ((ErrorLogReport) entry.getValue()).report.getId();
                    Collection collection2 = collection;
                    if (collection2 != null && collection2.contains(id)) {
                        AppCenterLog.debug(Crashes.LOG_TAG, "CrashesListener.shouldProcess returned true, continue processing log: " + id);
                    } else {
                        AppCenterLog.debug(Crashes.LOG_TAG, "CrashesListener.shouldProcess returned false, clean up and ignore log: " + id);
                        Crashes.this.removeAllStoredErrorLogFiles(uuid);
                        it.remove();
                    }
                }
                defaultAppCenterFuture.complete(Boolean.valueOf(Crashes.this.sendCrashReportsOrAwaitUserConfirmation()));
            }
        }, defaultAppCenterFuture, Boolean.FALSE);
        return defaultAppCenterFuture;
    }

    private synchronized UUID queueException(@x1 final ExceptionModelBuilder exceptionModelBuilder, Map<String, String> map, final Iterable<ErrorAttachmentLog> iterable) {
        final UUID randomUUID;
        final String userId = UserIdContext.getInstance().getUserId();
        randomUUID = UUID.randomUUID();
        final Map<String, String> validateProperties = ErrorLogHelper.validateProperties(map, "HandledError");
        post(new Runnable() { // from class: com.microsoft.appcenter.crashes.Crashes.9
            @Override // java.lang.Runnable
            public void run() {
                HandledErrorLog handledErrorLog = new HandledErrorLog();
                handledErrorLog.setId(randomUUID);
                handledErrorLog.setUserId(userId);
                handledErrorLog.setException(exceptionModelBuilder.buildExceptionModel());
                handledErrorLog.setProperties(validateProperties);
                Crashes.this.mChannel.enqueue(handledErrorLog, Crashes.ERROR_GROUP, 1);
                Crashes.this.sendErrorAttachment(randomUUID, iterable);
            }
        });
        return randomUUID;
    }

    public UUID saveUncaughtException(Thread thread, Throwable th, Exception exception) throws JSONException, IOException {
        if (isEnabled().get().booleanValue() && !this.mSavedUncaughtException) {
            this.mSavedUncaughtException = true;
            return saveErrorLogFiles(th, ErrorLogHelper.createErrorLog(this.mContext, thread, exception, Thread.getAllStackTraces(), this.mInitializeTimestamp, true));
        }
        return null;
    }
}