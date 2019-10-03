package com.e.robospiceextension;

import android.app.Application;

import com.e.robospiceextension.persistence.CacheManager;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheSavingException;

/***
 * Concrete implementation of {@link SpiceService} with an empty CacheManager.
 * Using this class, requests will not be cached.
 * @author rciovati
 */
public class UncachedSpiceService extends SpiceService {

    @Override
    public CacheManager createCacheManager(Application application) {
        // Just return an empty CacheManager
        return new CacheManager() {
            @Override
            public <T> T saveDataToCacheAndReturnData(T data, Object cacheKey) throws CacheSavingException, CacheCreationException {

                return data;
            }
        };
    }
}
