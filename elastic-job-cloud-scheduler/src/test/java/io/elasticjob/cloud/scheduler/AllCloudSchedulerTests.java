/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.elasticjob.cloud.scheduler;

import io.elasticjob.cloud.scheduler.env.AllEnvTests;
import io.elasticjob.cloud.scheduler.producer.AllProducerTests;
import io.elasticjob.cloud.scheduler.restful.AllRestfulTests;
import io.elasticjob.cloud.scheduler.config.AllConfigTests;
import io.elasticjob.cloud.scheduler.context.AllContextTests;
import io.elasticjob.cloud.scheduler.ha.AllHATests;
import io.elasticjob.cloud.scheduler.mesos.AllMesosTests;
import io.elasticjob.cloud.scheduler.state.AllStateTests;
import io.elasticjob.cloud.scheduler.statistics.AllStatisticTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllEnvTests.class, 
        AllContextTests.class, 
        AllConfigTests.class, 
        AllStateTests.class, 
        AllProducerTests.class, 
        AllRestfulTests.class, 
        AllMesosTests.class,
        AllStatisticTests.class,
        AllHATests.class
    })
public final class AllCloudSchedulerTests {
}
