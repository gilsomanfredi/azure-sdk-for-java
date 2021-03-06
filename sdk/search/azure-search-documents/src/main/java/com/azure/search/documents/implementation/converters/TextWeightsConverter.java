// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.TextWeights;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.TextWeights} and {@link TextWeights}.
 */
public final class TextWeightsConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.TextWeights} to {@link TextWeights}.
     */
    public static TextWeights map(com.azure.search.documents.indexes.implementation.models.TextWeights obj) {
        if (obj == null) {
            return null;
        }

        Map<String, Double> weights = obj.getWeights() == null ? null
            : obj.getWeights().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        TextWeights textWeights = new TextWeights(weights);

        return textWeights;
    }

    /**
     * Maps from {@link TextWeights} to {@link com.azure.search.documents.indexes.implementation.models.TextWeights}.
     */
    public static com.azure.search.documents.indexes.implementation.models.TextWeights map(TextWeights obj) {
        if (obj == null) {
            return null;
        }

        Map<String, Double> weights = obj.getWeights() == null ? null
            : obj.getWeights().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        com.azure.search.documents.indexes.implementation.models.TextWeights textWeights =
            new com.azure.search.documents.indexes.implementation.models.TextWeights(weights);

        textWeights.validate();
        return textWeights;
    }

    private TextWeightsConverter() {
    }
}
