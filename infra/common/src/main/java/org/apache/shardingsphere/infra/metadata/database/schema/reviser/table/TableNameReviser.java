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

package org.apache.shardingsphere.infra.metadata.database.schema.reviser.table;

import org.apache.shardingsphere.infra.rule.ShardingSphereRule;

/**
 * Table name reviser.
 * 
 * @param <T> type of rule
 */
public interface TableNameReviser<T extends ShardingSphereRule> {
    
    /**
     * Revise table meta data.
     *
     * @param originalName original table name
     * @param dataSourceName data source name
     * @param rule rule
     * @return revised table name
     */
    String revise(String originalName, String dataSourceName, T rule);
}
