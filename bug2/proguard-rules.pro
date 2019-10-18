-keep class io.flutter.** {*;}

-flattenpackagehierarchy flutterwrap
-allowaccessmodification

-keep class com.vdian.flutter.vd_video_player.VdVideoPlayerPlugin {*;}
-keep class io.flutter.plugins.GeneratedPluginRegistrant {*;}
-keep class io.flutter.embedding.engine.FlutterEngine {*;}
-keep class io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry {*;}
-keep class io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry.ShimRegistrarAggregate {*;}

-applymapping mapping.txt