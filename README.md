# react-native-vision-camera-error-repro

To check if the error behaviour is reproducible

## Installation

```sh
npm install react-native-vision-camera-error-repro
```

3. Add the plugin to your `babel.config.js`:

```js
module.exports = {
  plugins: [
    [
      'react-native-reanimated/plugin',
      {
        globals: ['__xyz'],
      },
    ],

    // ...
```

> Note: You have to restart metro-bundler for changes in the `babel.config.js` file to take effect.

## Usage

```js
import { xyz } from "react-native-vision-camera-error-repro";

// ...

const frameProcessor = useFrameProcessor((frame) => {
  'worklet';
  const labels = xyz(frame);
}, []);
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
