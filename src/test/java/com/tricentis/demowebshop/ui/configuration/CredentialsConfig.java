package com.tricentis.demowebshop.ui.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {
    String user();

    String password();
}
