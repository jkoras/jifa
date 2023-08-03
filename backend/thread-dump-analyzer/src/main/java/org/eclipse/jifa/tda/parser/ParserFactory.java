/********************************************************************************
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.eclipse.jifa.tda.parser;

import java.nio.file.Path;

public class ParserFactory {

    private static final Parser DEFAULT = new SerDesParser(new JStackParser());

    //ToDo: hook
    private static final Parser BIS_PARSER = new SerDesParser(new BisParser());

    public static Parser buildParser(Path path) {

        //ToDo: hook
        if(BIS_PARSER.canParse(path))
            return BIS_PARSER;
        else
            return DEFAULT;
    }
}
