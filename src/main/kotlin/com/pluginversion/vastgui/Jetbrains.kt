/*
 * Copyright 2022 VastGui guihy2019@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pluginversion.vastgui


// Author: Vast Gui
// Email: guihy2019@gmail.com
// Date: 2022/9/3 12:18
// Description: 
// Documentation:

object Jetbrains {
    private const val kotlin_coroutines_version = "1.6.4"
    private const val kotlin_reflect_version = "1.7.20"
    private const val kotlin_stdlib_version = "1.8.20"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_stdlib_version"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlin_reflect_version"
    const val kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlin_coroutines_version"
    const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlin_coroutines_version"
    const val kotlinx_coroutines_rx3 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx3:$kotlin_coroutines_version"
}