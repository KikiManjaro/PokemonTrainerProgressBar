# PokemonTrainerProgressBar
The Pokemon Trainer progress bar for IntelliJ IDEA and other JetBrains IDEs.

[![Version](https://img.shields.io/jetbrains/plugin/v/14609-pokemon-trainer-progress-bar)](https://plugins.jetbrains.com/plugin/14609-pokemon-trainer-progress-bar/versions)
[![Rating](https://img.shields.io/jetbrains/plugin/r/rating/14609-pokemon-trainer-progress-bar)](https://plugins.jetbrains.com/plugin/14609-pokemon-trainer-progress-bar/reviews)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/14609-pokemon-trainer-progress-bar)](https://plugins.jetbrains.com/plugin/14609-pokemon-trainer-progress-bar)
[![CI](https://github.com/KikiManjaro/PokemonTrainerProgressBar/actions/workflows/ci.yml/badge.svg)](https://github.com/KikiManjaro/PokemonTrainerProgressBar/actions/workflows/ci.yml)

![PokemonDeterminateBar](https://i.imgur.com/0edfTTS.gif)

![PokemonIndeterminateBar](https://i.imgur.com/L2klhc0.gif)

This is the [Pokemon Trainer Progress Bar](https://plugins.jetbrains.com/plugin/14609-pokemon-trainer-progress-bar/versions) for [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/) based on the Nyan Progress Bar by Dmitry Batkovitch. It displays Red and Pikachu for the determinate bar and the bike animation for the indeterminate one.

## Installation

### From JetBrains Marketplace (recommended)

1. Open your JetBrains IDE (IntelliJ IDEA, PyCharm, WebStorm, etc.)
2. Go to `Settings/Preferences` → `Plugins` → `Marketplace`
3. Search for **"Pokemon Trainer Progress Bar"**
4. Click `Install` and restart the IDE

Or install directly from the [Marketplace page](https://plugins.jetbrains.com/plugin/14609-pokemon-trainer-progress-bar).

### Manual Installation

1. Download the latest release from [Releases](https://github.com/KikiManjaro/PokemonTrainerProgressBar/releases) or the Marketplace
2. In your IDE go to `Settings` → `Plugins` → `⚙️` → `Install Plugin from Disk...`
3. Select the downloaded ZIP and restart

No configuration needed — the progress bar is replaced automatically after installation.

## Compatibility

| Plugin Version | IDE Build | Notes |
|---|---|---|
| 1.7 | 193+ (2019.3+) | Support for IntelliJ 2023.3 and later, uses `JBUIScale` |
| 1.6 | 193+ | `JBUIScale` migration |
| 1.4 | 193+ | New JetBrains API |
| 1.0 – 1.3 | 193+ | Initial releases, icon fixes |

Requires any IntelliJ-platform IDE with platform module `com.intellij.modules.platform`.

## How it Works

- **Determinate**: Shows Trainer Red running with Pikachu following — progress fills as the task completes.
- **Indeterminate**: Shows Trainer riding a bicycle — loops until the task finishes.

Assets are in `resources/` (`Trainer.gif`, `Pikachu.gif`, `WalkingTrainer.gif` and `@2x` HiDPI variants).

## Development

### Prerequisites

- IntelliJ IDEA Community Edition with Plugin DevKit
- JDK 11 (`project-jdk-name="IntelliJ IDEA Community Edition IC-212.5284.40"`)

### Run in Sandbox

1. Clone: `git clone https://github.com/KikiManjaro/PokemonTrainerProgressBar.git`
2. Open the project in IntelliJ as a **Plugin** module
3. Run via `Run` → `Run Plugin` — a sandbox IDE launches with the bar active

### Project Structure

```
resources/META-INF/plugin.xml  # Plugin descriptor (id, version, change-notes)
resources/*.gif                # Sprites (1x and @2x)
src/ProgressBarUi.java         # Core UI delegate
src/ProgressBarLafManagerListener.java
src/Icons.java
```

### Changelog

See [CHANGELOG.md](CHANGELOG.md) for version history.

## Contributing

Contributions are very welcome! Please see our [contributing guidelines](CONTRIBUTING.md) and [code of conduct](CODE_OF_CONDUCT.md) to get started.

## Acknowledgements

### Sprites
* All sprites belong to Nintendo. Find them on [Spriters-Resource](https://www.spriters-resource.com/)

### Code
* The code for the progress bar was adapted from [Nyan Progress Bar](https://github.com/batya239/NyanProgressBar).
* This plugin is heavily dependent on JetBrains' IntelliJ SDK

### Misc
* Gif editing done with [Gimp](https://www.gimp.org/)
* This readme is inspired by the [Kagof intellij-pokemon-progress](https://github.com/kagof/intellij-pokemon-progress/blob/master/README.md)
* The Pokémon Company, for creating Pokémon

[![Buy Me a Coffee](https://img.buymeacoffee.com/api/?url=aHR0cHM6Ly9pbWcuYnV5bWVhY29mZmVlLmNvbS9hcGkvP3VybD1hSFIwY0hNNkx5OWpaRzR1WW5WNWJXVmhZMjltWm1WbExtTnZiUzkxY0d4dllXUnpMM0J5YjJacGJHVmZjR2xqZEhWeVpYTXZNakF5TVM4d015ODBZekkwT0RnNE1XWmxOVE5pWmprM1lUa3pOV1EyTWk1d2JtYz0mc2l6ZT0zMDAmbmFtZT1raWtpbWFuamFybw==&creator=kikimanjaro&is_creating=creating%20mobile%20apps%20and%20plugins&design_code=1&design_color=%23ff813f&slug=kikimanjaro)](https://www.buymeacoffee.com/kikimanjaro)
