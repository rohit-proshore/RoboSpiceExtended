package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;

public class RemoveDataClassFromCacheCommand extends SpiceManager.SpiceManagerCommand<Void> {
    private final Class<?> clazz;

    public <T> RemoveDataClassFromCacheCommand(SpiceManager spiceManager, Class<T> clazz) {
        super(spiceManager);
        this.clazz = clazz;
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.removeAllDataFromCache(clazz);
        return null;
    }
}
