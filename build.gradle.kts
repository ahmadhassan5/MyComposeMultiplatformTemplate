plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(deps.plugins.android.application) apply false
    alias(deps.plugins.android.library) apply false
    kotlin("android").version("1.8.10").apply(false)
    kotlin("multiplatform").version("1.8.10").apply(false)
    alias(deps.plugins.jetBrains.compose) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
