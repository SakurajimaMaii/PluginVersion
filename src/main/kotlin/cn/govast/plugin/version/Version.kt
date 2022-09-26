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

package cn.govast.plugin.version

// Author: Vast Gui
// Email: guihy2019@gmail.com
// Date: 2022/8/29 17:04
// Description: 
// Documentation:

object Version {
    const val compile_sdk_version = 33
    const val min_sdk_version = 23
    const val target_sdk_version = 33
    const val version_code = 1
    const val version_name = "1.0"
    const val build_tools_version = "33.0.0"

    const val gradle_version = "7.3.0-rc01"
    const val kotlin_version = "1.7.10"

    const val gradle = "com.android.tools.build:gradle:${cn.govast.plugin.version.Version.gradle_version}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${cn.govast.plugin.version.Version.kotlin_version}"
}