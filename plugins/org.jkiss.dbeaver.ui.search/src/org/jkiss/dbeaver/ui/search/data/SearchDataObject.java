/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.search.data;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.dbeaver.model.data.DBDDataFilter;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.navigator.DBNNode;

/**
 * Search parameters
 */
public class SearchDataObject implements DBPNamedObject {

    private final DBNNode node;
    private final int foundRows;
    private final DBDDataFilter filter;

    public SearchDataObject(DBNNode node, int foundRows, DBDDataFilter filter) {
        this.node = node;
        this.foundRows = foundRows;
        this.filter = filter;
    }

    @NotNull
    @Property
    @Override
    public String getName() {
        return node.getName();
    }

    @Property(viewable = true)
    public int getFoundRows() {
        return foundRows;
    }

    public DBNNode getNode() {
        return node;
    }

    public DBDDataFilter getFilter() {
        return filter;
    }
}
