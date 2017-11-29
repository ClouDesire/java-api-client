package com.liberologico.cloudesire.cmw.model.interfaces;

import com.liberologico.cloudesire.cmw.model.enums.LineType;

public interface Line
{
    LineType getType();

    boolean isSetup();
}
