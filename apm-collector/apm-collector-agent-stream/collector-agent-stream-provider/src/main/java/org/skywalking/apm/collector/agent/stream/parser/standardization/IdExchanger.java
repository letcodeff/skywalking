/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
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
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.agent.stream.parser.standardization;

/**
 * 编号兑换器
 *
 * @author peng-yongsheng
 */
public interface IdExchanger<T extends StandardBuilder> {

    /**
     * 兑换 standardBuilder 里的属性，并返回是否兑换成功
     *
     * @param standardBuilder standardBuilder
     * @param applicationId 应用编号
     * @return 兑换是否成功
     */
    boolean exchange(T standardBuilder, int applicationId);

}