package com.smartbear.ready.plugin.discovery.har;

import com.eviware.soapui.plugins.PluginAdapter;
import com.eviware.soapui.plugins.PluginConfiguration;

@PluginConfiguration(groupId = "com.smartbear.ready.plugins",
        name = "HTTP Archive REST Discovery Plugin", version = "1.0.2",
        description = "Use an HTTP Archive (HAR) in REST Discovery",
        infoUrl = "https://github.com/joeljons/ready-api-discover-har")
public class PluginConfig extends PluginAdapter {
}
