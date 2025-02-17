// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.archos.mediacenter.video.browser.loader;

import android.content.Context;

import com.archos.mediaprovider.video.VideoStore;

/**
 * Created by vapillon on 10/04/15.
 */
public class AllVideosLoader extends VideoLoader {

    private static final String DEFAULT_SORT = "name COLLATE LOCALIZED ASC,"
            + VideoStore.Video.VideoColumns.SCRAPER_E_SEASON + " ASC ,"
            + VideoStore.Video.VideoColumns.SCRAPER_E_EPISODE + " ASC";

    private String mSortOrder = DEFAULT_SORT;

    public AllVideosLoader(Context context) {
        super(context);
        if (VideoLoader.THROTTLE) setUpdateThrottle(VideoLoader.THROTTLE_DELAY);
        init();
    }

    public AllVideosLoader(Context context, String sortOrder) {
        super(context);
        mSortOrder = sortOrder;
        if (VideoLoader.THROTTLE) setUpdateThrottle(VideoLoader.THROTTLE_DELAY);
        init();
    }

    @Override
    public String getSortOrder() {
        return mSortOrder;
    }
}
