package com.android.example.cameraxbasic.fragments;

import java.lang.System;

/**
 * Main fragment for this app. Implements all camera operations including:
 * - Viewfinder
 * - Image analysis
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u0010\u000b\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016J\u001a\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u00108\u001a\u00020&H\u0002J\b\u00109\u001a\u00020&H\u0002J\b\u0010:\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/android/example/cameraxbasic/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "()V", "broadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "displayId", "", "displayListener", "Landroid/hardware/display/DisplayManager$DisplayListener;", "displayManager", "Landroid/hardware/display/DisplayManager;", "getDisplayManager", "()Landroid/hardware/display/DisplayManager;", "displayManager$delegate", "Lkotlin/Lazy;", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "lensFacing", "outputDirectory", "Ljava/io/File;", "preview", "Landroidx/camera/core/Preview;", "viewFinder", "Landroidx/camera/view/PreviewView;", "aspectRatio", "width", "height", "bindCameraUseCases", "", "hasBackCamera", "", "hasFrontCamera", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "setUpCamera", "updateCameraSwitchButton", "updateCameraUi", "Companion", "LuminosityAnalyzer", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment {
    private androidx.constraintlayout.widget.ConstraintLayout container;
    private androidx.camera.view.PreviewView viewFinder;
    private java.io.File outputDirectory;
    private androidx.localbroadcastmanager.content.LocalBroadcastManager broadcastManager;
    private int displayId = -1;
    private int lensFacing = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    private androidx.camera.core.Preview preview;
    private androidx.camera.core.ImageCapture imageCapture;
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    private androidx.camera.core.Camera camera;
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    private final kotlin.Lazy displayManager$delegate = null;
    
    /**
     * Blocking camera operations are performed using this executor
     */
    private java.util.concurrent.ExecutorService cameraExecutor;
    
    /**
     * We need a display listener for orientation changes that do not trigger a configuration
     * change, for example if we choose to override config change in manifest or for 180-degree
     * orientation changes.
     */
    private final android.hardware.display.DisplayManager.DisplayListener displayListener = null;
    private static final java.lang.String TAG = "CameraXBasic";
    private static final double RATIO_4_3_VALUE = 1.3333333333333333;
    private static final double RATIO_16_9_VALUE = 1.7777777777777777;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.cameraxbasic.fragments.CameraFragment.Companion Companion = null;
    
    private final android.hardware.display.DisplayManager getDisplayManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Inflate camera controls and update the UI manually upon config changes to avoid removing
     * and re-adding the view finder from the view hierarchy; this provides a seamless rotation
     * transition on devices that support it.
     *
     * NOTE: The flag is supported starting in Android 8 but there still is a small flash on the
     * screen for devices that run Android 9 or below.
     */
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    /**
     * Initialize CameraX, and prepare to bind the camera use cases
     */
    private final void setUpCamera() {
    }
    
    /**
     * Declare and bind preview, capture and analysis use cases
     */
    private final void bindCameraUseCases() {
    }
    
    /**
     * [androidx.camera.core.ImageAnalysisConfig] requires enum value of
     * [androidx.camera.core.AspectRatio]. Currently it has values of 4:3 & 16:9.
     *
     * Detecting the most suitable ratio for dimensions provided in @params by counting absolute
     * of preview ratio to one of the provided values.
     *
     * @param width - preview width
     * @param height - preview height
     * @return suitable aspect ratio
     */
    private final int aspectRatio(int width, int height) {
        return 0;
    }
    
    /**
     * Method used to re-draw the camera UI controls, called every time configuration changes.
     */
    private final void updateCameraUi() {
    }
    
    /**
     * Enabled or disabled a button to switch cameras depending on the available cameras
     */
    private final void updateCameraSwitchButton() {
    }
    
    /**
     * Returns true if the device has an available back camera. False otherwise
     */
    private final boolean hasBackCamera() {
        return false;
    }
    
    /**
     * Returns true if the device has an available front camera. False otherwise
     */
    private final boolean hasFrontCamera() {
        return false;
    }
    
    public CameraFragment() {
        super();
    }
    
    /**
     * Our custom image analysis class.
     *
     * <p>All we need to do is override the function `analyze` with our desired operations. Here,
     * we compute the average luminosity of the image by looking at the Y plane of the YUV frame.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B2\u0012+\b\u0002\u0010\u0002\u001a%\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J-\u0010\u001a\u001a\u00020\u001b2%\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R/\u0010\u0015\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00030\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/android/example/cameraxbasic/fragments/CameraFragment$LuminosityAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "listener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "luma", "", "Lcom/android/example/cameraxbasic/fragments/LumaListener;", "(Lkotlin/jvm/functions/Function1;)V", "frameRateWindow", "", "frameTimestamps", "Ljava/util/ArrayDeque;", "", "<set-?>", "framesPerSecond", "getFramesPerSecond", "()D", "lastAnalyzedTimestamp", "listeners", "Ljava/util/ArrayList;", "analyze", "image", "Landroidx/camera/core/ImageProxy;", "onFrameAnalyzed", "", "toByteArray", "", "Ljava/nio/ByteBuffer;", "app_debug"})
    static final class LuminosityAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
        private final int frameRateWindow = 8;
        private final java.util.ArrayDeque<java.lang.Long> frameTimestamps = null;
        private final java.util.ArrayList<kotlin.jvm.functions.Function1<java.lang.Double, kotlin.Unit>> listeners = null;
        private long lastAnalyzedTimestamp = 0L;
        private double framesPerSecond = -1.0;
        
        public final double getFramesPerSecond() {
            return 0.0;
        }
        
        /**
         * Used to add listeners that will be called with each luma computed
         */
        public final boolean onFrameAnalyzed(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> listener) {
            return false;
        }
        
        /**
         * Helper extension function used to extract a byte array from an image plane buffer
         */
        private final byte[] toByteArray(java.nio.ByteBuffer $this$toByteArray) {
            return null;
        }
        
        /**
         * Analyzes an image to produce a result.
         *
         * <p>The caller is responsible for ensuring this analysis method can be executed quickly
         * enough to prevent stalls in the image acquisition pipeline. Otherwise, newly available
         * images will not be acquired and analyzed.
         *
         * <p>The image passed to this method becomes invalid after this method returns. The caller
         * should not store external references to this image, as these references will become
         * invalid.
         *
         * @param image image being analyzed VERY IMPORTANT: Analyzer method implementation must
         * call image.close() on received images when finished using them. Otherwise, new images
         * may not be received or the camera may stall, depending on back pressure setting.
         */
        @java.lang.Override()
        public void analyze(@org.jetbrains.annotations.NotNull()
        androidx.camera.core.ImageProxy image) {
        }
        
        public LuminosityAnalyzer(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> listener) {
            super();
        }
        
        public LuminosityAnalyzer() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/android/example/cameraxbasic/fragments/CameraFragment$Companion;", "", "()V", "RATIO_16_9_VALUE", "", "RATIO_4_3_VALUE", "TAG", "", "createFile", "Ljava/io/File;", "baseFolder", "format", "extension", "app_debug"})
    public static final class Companion {
        
        /**
         * Helper function used to create a timestamped file
         */
        private final java.io.File createFile(java.io.File baseFolder, java.lang.String format, java.lang.String extension) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}