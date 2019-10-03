package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheLoadingException;

public class GetDataFromCacheCommand<T> extends SpiceManager.SpiceManagerCommand<T> {
    private Object cacheKey;
    private Class<T> clazz;

    public GetDataFromCacheCommand(SpiceManager spiceManager, Class<T> clazz, Object cacheKey) {
        super(spiceManager);
        this.clazz = clazz;
        this.cacheKey = cacheKey;
    }

    @Override
    protected T executeWhenBound(SpiceService spiceService) throws CacheLoadingException, CacheCreationException {
        return spiceService.getDataFromCache(clazz, cacheKey);
    }
}
