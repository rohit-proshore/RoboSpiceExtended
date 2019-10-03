package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.request.listener.SpiceServiceListener;

public class RemoveSpiceServiceListenerCommand extends SpiceManager.SpiceManagerCommand<Void> {
    private SpiceServiceListener spiceServiceListener;

    public RemoveSpiceServiceListenerCommand(SpiceManager spiceManager, SpiceServiceListener spiceServiceListener) {
        super(spiceManager);
        this.spiceServiceListener = spiceServiceListener;
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.removeSpiceServiceListener(spiceServiceListener);
        return null;
    }
}
