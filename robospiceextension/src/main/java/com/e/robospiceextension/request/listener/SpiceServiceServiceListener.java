package com.e.robospiceextension.request.listener;

import java.util.Set;

import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.request.CachedSpiceRequest;

/**
 * Defines the behavior of a listener that will be notified of request
 * processing by the {@link SpiceService}.
 * @author sni
 */
public interface SpiceServiceServiceListener {
    void onRequestProcessed(CachedSpiceRequest<?> cachedSpiceRequest, Set<RequestListener<?>> listeners);
}
