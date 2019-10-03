package com.e.robospiceextension.request.simple;

import java.io.File;

import android.graphics.Bitmap;

import com.e.robospiceextension.request.SpiceRequest;

/**
 * Describes the common behavior of all {@link SpiceRequest} that allow get
 * fetch Bitmaps.
 * @author SNI
 */
public interface IBitmapRequest {

    Bitmap loadDataFromNetwork() throws Exception;

    File getCacheFile();

}
