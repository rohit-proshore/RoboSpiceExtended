package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheSavingException;

public class PutDataInCacheCommand<T> extends SpiceManager.SpiceManagerCommand<T> {
    private Object cacheKey;
    private T data;

    public PutDataInCacheCommand(SpiceManager spiceManager, T data, Object cacheKey) {
        super(spiceManager);
        this.data = data;
        this.cacheKey = cacheKey;
    }

    @Override
    protected T executeWhenBound(SpiceService spiceService) throws CacheSavingException, CacheCreationException {
        return spiceService.putDataInCache(cacheKey, data);
    }
}
