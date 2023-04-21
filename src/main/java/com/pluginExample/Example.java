package com.pluginExample;

import com.niniconi.plugin.api.Mrm;
import com.niniconi.plugin.api.Plugin;

public class Example implements Plugin {
    @Override
    public void init(Mrm mrm) {
        System.out.println(mrm.config().getGlobalValue("content-path"));
        System.out.println("this is plugin!");
    }
}