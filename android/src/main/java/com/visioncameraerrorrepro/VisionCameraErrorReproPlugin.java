package com.visioncameraerrorrepro;

import android.util.Log;

import androidx.camera.core.ImageProxy;

import com.facebook.react.bridge.WritableNativeArray;
import com.mrousavy.camera.frameprocessor.FrameProcessorPlugin;

import org.jetbrains.annotations.NotNull;

public class VisionCameraErrorReproPlugin extends FrameProcessorPlugin {
  private final static String TAG = "VisionCameraErrorReproPlugin";

  @Override
  public Object callback(@NotNull ImageProxy frame, @NotNull Object[] params) {
    Log.d(TAG, "2: " + frame.getWidth() + " x " + frame.getHeight() + " frame with format #" + frame.getFormat() + ". Logging " + params.length + " parameters:" + params.length);
    for (Object param : params) {
      Log.d(TAG, "  -> " + (param == null ? "(null)" : param.toString() + " (" + param.getClass().getName() + ")"));
    }

    if (params.length == 0) {
      try {
        throw new Exception("This is a test exception");
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    // throw new RuntimeException("This is a test exception");


    WritableNativeArray results = new WritableNativeArray();
    return results;
  }

  public VisionCameraErrorReproPlugin() {
    super("xyz");
  }
}
