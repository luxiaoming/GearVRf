/* Copyright 2015 Samsung Electronics Co., LTD
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

package org.gearvrf.keyboard.interpolator;

import org.gearvrf.animation.GVRInterpolator;

public class InterpolatorCubicEasyOut implements GVRInterpolator {

    private static InterpolatorCubicEasyOut sInstance = null;

    public InterpolatorCubicEasyOut() {
    }

    /** Get the (lazy-created) singleton */
    public static synchronized InterpolatorCubicEasyOut getInstance() {
        if (sInstance == null) {
            sInstance = new InterpolatorCubicEasyOut();
        }
        return sInstance;
    }

    @Override
    public float mapRatio(float ratio) {
        float t = ratio;
        float b = 0;
        float c = 1;
        float d = 1;

        return c * ((t = t / d - 1) * t * t + 1) + b;
    }
}
