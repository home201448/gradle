/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.model.internal.core;

import org.gradle.api.Nullable;
import org.gradle.model.internal.core.rule.describe.ModelRuleDescriptor;
import org.gradle.model.internal.type.ModelType;

import java.util.Collections;

public class EmptyModelProjection implements ModelProjection {
    @Nullable
    @Override
    public <T> ModelView<? extends T> asReadOnly(ModelType<T> type, MutableModelNode node, @Nullable ModelRuleDescriptor ruleDescriptor) {
        return null;
    }

    @Nullable
    @Override
    public <T> ModelView<? extends T> asWritable(ModelType<T> type, MutableModelNode node, ModelRuleDescriptor ruleDescriptor, @Nullable Inputs inputs) {
        return null;
    }

    @Override
    public <T> boolean canBeViewedAsWritable(ModelType<T> type) {
        return false;
    }

    @Override
    public <T> boolean canBeViewedAsReadOnly(ModelType<T> type) {
        return false;
    }

    @Override
    public Iterable<String> getWritableTypeDescriptions() {
        return Collections.emptyList();
    }

    @Override
    public Iterable<String> getReadableTypeDescriptions() {
        return Collections.emptyList();
    }
}
