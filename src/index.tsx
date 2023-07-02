/* globals __xyz */
import { NativeModules, Platform } from 'react-native';
import type { Frame } from 'react-native-vision-camera';

/**
 * Returns an array of matching `ImageLabel`s for the given frame. *
 */
export function xyz(frame: Frame): [] {
  'worklet';
  // @ts-expect-error Frame Processors are not typed.
  return __xyz(frame);
}

const LINKING_ERROR =
  `The package 'react-native-vision-camera-error-repro' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' });

NativeModules.VisionCameraErrorRepro
  ? NativeModules.VisionCameraErrorRepro
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );
