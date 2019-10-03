package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.request.listener.SpiceServiceListener;

public class AddSpiceServiceListenerCommand extends SpiceManager.SpiceManagerCommand<Void> {
    private SpiceServiceListener spiceServiceListener;

    public AddSpiceServiceListenerCommand(SpiceManager spiceManager, SpiceServiceListener spiceServiceListener) {
        super(spiceManager);
        this.spiceServiceListener = spiceServiceListener;
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.addSpiceServiceListener(spiceServiceListener);
        return null;
    }
}
