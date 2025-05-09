package com.ms30.ms_designPatterns2.decorator;

public abstract class SmartWatchDecorator implements SmartWatch {
    public SmartWatch smartWatch;

    public SmartWatchDecorator(SmartWatch smartWatch) {
        this.smartWatch = smartWatch;
    }
}
