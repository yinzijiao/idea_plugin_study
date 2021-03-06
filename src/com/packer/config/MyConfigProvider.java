package com.packer.config;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Created by yin on 2017/5/15.
 */
public class MyConfigProvider extends ConfigurableProvider {


    @Nullable
    @Override
    public Configurable createConfigurable() {
        return new MyConfig("packer", "packer", "packerWithFlavors");
    }

}
