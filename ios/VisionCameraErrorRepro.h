
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNVisionCameraErrorReproSpec.h"

@interface VisionCameraErrorRepro : NSObject <NativeVisionCameraErrorReproSpec>
#else
#import <React/RCTBridgeModule.h>

@interface VisionCameraErrorRepro : NSObject <RCTBridgeModule>
#endif

@end
