#import <VisionCamera/FrameProcessorPlugin.h>
#import <VisionCamera/Frame.h>

@interface VisionCameraErrorReproPlugin : NSObject
@end

@implementation VisionCameraErrorReproPlugin

static inline id xyz(Frame* frame, NSArray* args) {
  // Log args
  NSLog(@"args: %@", args);

  // If args length is 0, throw an error
  if (args.count == 0) {
    [NSException raise:@"Test error" format:@"Test error"];
    return @[];
  }

  return @[];
}

VISION_EXPORT_FRAME_PROCESSOR(xyz)

@end
