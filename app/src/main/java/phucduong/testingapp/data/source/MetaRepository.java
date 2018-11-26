/*
 * Copyright 2016, The Android Open Source Project
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

package phucduong.testingapp.data.source;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import phucduong.testingapp.data.MetaData;

import static com.google.common.base.Preconditions.checkNotNull;

@Singleton
public class MetaRepository implements MetaDataSource {
    private final MetaDataSource mTasksRemoteDataSource;

    private final MetaDataSource mTasksLocalDataSource;

    /**
     * This variable has package local visibility so it can be accessed from tests.
     */
    Map<String, MetaData> mCachedTasks;

    /**
     * Marks the cache as invalid, to force an update the next time data is requested. This variable
     * has package local visibility so it can be accessed from tests.
     */
    boolean mCacheIsDirty = false;

    @Inject
    public MetaRepository(@Remote MetaDataSource mTasksRemoteDataSource, @Local MetaDataSource mTasksLocalDataSource) {
        this.mTasksRemoteDataSource = mTasksRemoteDataSource;
        this.mTasksLocalDataSource = mTasksLocalDataSource;
    }
}
