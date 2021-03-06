/*
 * Copyright 2017, Fabernovel Technologies
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

package com.fabernovel.d3library.helper;

import android.graphics.Paint;
import android.graphics.Rect;

public final class TextHelper {
    private final static Rect bounds = new Rect();
    private TextHelper() {}

    public static float getTextHeight(String text, Paint textPaint) {
        textPaint.getTextBounds(text, 0, text.length(), bounds);
        return (float) bounds.height();
    }
}
