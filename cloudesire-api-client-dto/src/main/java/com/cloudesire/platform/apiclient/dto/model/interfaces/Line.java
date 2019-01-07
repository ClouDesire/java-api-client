package com.cloudesire.platform.apiclient.dto.model.interfaces;

import com.cloudesire.platform.apiclient.dto.model.enums.LineType;

public interface Line
{
    LineType getType();

    boolean isSetup();
}
