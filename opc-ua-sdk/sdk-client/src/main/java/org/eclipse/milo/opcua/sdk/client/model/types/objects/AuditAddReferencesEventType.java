/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.model.types.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.model.types.variables.PropertyType;
import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.structured.AddReferencesItem;


public interface AuditAddReferencesEventType extends AuditNodeManagementEventType {

    Property<AddReferencesItem[]> REFERENCES_TO_ADD = new BasicProperty<>(
        QualifiedName.parse("0:ReferencesToAdd"),
        NodeId.parse("ns=0;i=379"),
        1,
        AddReferencesItem[].class
    );


    CompletableFuture<? extends PropertyType> referencesToAdd();

    CompletableFuture<AddReferencesItem[]> getReferencesToAdd();

    CompletableFuture<StatusCode> setReferencesToAdd(AddReferencesItem[] value);


}