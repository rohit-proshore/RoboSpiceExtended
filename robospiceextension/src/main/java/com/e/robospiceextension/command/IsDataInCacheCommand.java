package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheSavingException;

public class IsDataInCacheCommand extends SpiceManager.SpiceManagerCommand<Boolean> {
    private Class<?> clazz;
    private Object cacheKey;
    private long cacheExpiryDuration;

    public IsDataInCacheCommand(SpiceManager spiceManager, Class<?> clazz, Object cacheKey, long cacheExpiryDuration) {
        super(spiceManager);
        this.clazz = clazz;
        this.cacheExpiryDuration = cacheExpiryDuration;
        this.cacheKey = cacheKey;
    }

    @Override
    protected Boolean executeWhenBound(SpiceService spiceService) throws CacheSavingException, CacheCreationException {
        return spiceService.isDataInCache(clazz, cacheKey, cacheExpiryDuration);
    }
}
