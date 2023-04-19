/*
 * Copyright 2022 VMware, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rabbitmq.client.impl;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationConvention;

/**
 * {@link ObservationConvention} for RabbitMQ client instrumentation.
 *
 * @since 6.0.0
 * @see DefaultMicrometerPublishObservationConvention
 */
public interface MicrometerConsumeObservationConvention extends ObservationConvention<MicrometerConsumeContext> {

    @Override
    default boolean supportsContext(Observation.Context context) {
        return context instanceof MicrometerConsumeContext;
    }

}
