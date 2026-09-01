# Contributing Guidelines

Thank you for your interest in contributing to PokemonTrainerProgressBar!

Please read, understand, and agree to the following before making your contribution. Please also ensure you have read and agreed to the [Code of Conduct](CODE_OF_CONDUCT.md).

If you have any issues or questions, please do not hesitate to contact [the maintainer](https://github.com/KikiManjaro).

## Workflow

```none
open issue and have it assigned to you
            │
            v
    fork repository
            │
            v
create feature/{issueNumber} or
{fix/issueNumber} branch based off
   of the master branch
            |
            v
    commit to fix issue
            │
            v
open pull request to master branch
            │
            v
       code review<────────┐
            │   │          │
            │   └─> address feedback
            v
approved, merged, issue closed
            |
            v
release created from master
    by project maintainer
```

## Bug Reports

Please make sure all bug reports have not already been reported or fixed, and come with a clear description of the situation, effect, expected experience, and, if at all possible, steps to reproduce the bug. Include IDE version, OS, and plugin version.

## Feature Requests

Please make sure all feature requests are clear, concise, feasible, useful, and not already implemented or requested.

## Pull Requests

Pull requests for bugs or features are encouraged, but please open an issue first and ensure it has been discussed & approved. Your code will be reviewed as soon as possible.

- This plugin is written using Java and the IntelliJ SDK.
- Please follow the existing code style. You may be asked to refactor if it does not match.
- Test your changes in a sandbox IDE instance before submitting.
- Preferably use [signed commits](https://docs.github.com/en/authentication/managing-commit-verification/signing-commits).

## Development Setup

1. Clone the repository
2. Open in IntelliJ IDEA (Community or Ultimate) with Plugin DevKit
3. Ensure JDK 11 is configured
4. Run the plugin via **Run > Run Plugin**
