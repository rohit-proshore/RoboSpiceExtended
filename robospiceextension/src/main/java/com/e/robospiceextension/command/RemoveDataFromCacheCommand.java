package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;

public class RemoveDataFromCacheCommand extends SpiceManager.SpiceManagerCommand<Void> {
    private final Class<?> clazz;
    private Object cacheKey;

    public <T> RemoveDataFromCacheCommand(SpiceManager spiceManager, Class<T> clazz, Object cacheKey) {
        super(spiceManager);
        this.clazz = clazz;
        this.cacheKey = cacheKey;
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.removeDataFromCache(clazz, cacheKey);
        return null;
    }
}
