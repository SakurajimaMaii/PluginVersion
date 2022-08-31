import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-gradle-plugin")
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

// 详情见 https://stackoverflow.com/questions/55456176/unresolved-reference-compilekotlin-in-build-gradle-kts
tasks.withType<KotlinCompile>{
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}

gradlePlugin {
    plugins {
        create("version") {
            //添加插件
            id = "com.gcode.plugin.version"
            //在根目录创建类 VersionPlugin 继承 Plugin<Project>
            implementationClass = "com.gcode.plugin.version.VersionPlugin"
        }
    }
}

sourceSets["main"].java.srcDir("src/main/kotlin")