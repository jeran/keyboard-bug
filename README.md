Updating `androidx.compose.material:material:1.2.0-beta01` to `androidx.compose.material:material:1.2.0-beta02` causes `ModalBottomSheet` content to jump when the keyboard animates open. It is only incorrect for a single frame, so you may want to download the gif and inspect each frame to verify. Also note that the newest versions (not just beta02) exhibit the same behavior.

| 1.2.0-beta01 | 1.2.0-beta02 |
| - | - |
| ![good](https://user-images.githubusercontent.com/1852733/187568559-4da09858-bec0-4947-bf0c-f2b29835d2d2.gif) | ![bad](https://user-images.githubusercontent.com/1852733/187568564-e7120360-bd9d-40d2-be0b-9dd89405417e.gif) |
