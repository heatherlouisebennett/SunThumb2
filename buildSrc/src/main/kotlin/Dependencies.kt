
/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    // Jetpack Compose
    val jetpackComposeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val jetpackComposeAnimation by lazy { "androidx.compose.animation:animation:${Versions.compose}" }
    val jetpackComposeCompiler by lazy { "androidx.compose.compiler:compiler:${Versions.compose}" }
    val jetpackComposeFoundation by lazy { "androidx.compose.foundation:foundation:${Versions.compose}" }
    val jetpackComposeRuntime by lazy { "androidx.compose.runtime:runtime:${Versions.compose}" }
    val jetpackComposeDebugTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val jetpackComposeTestSemantics by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
}
