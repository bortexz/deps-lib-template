# Deps lib template

Small lib template for [deps-new](https://github.com/seancorfield/deps-new).

## Usage

See [deps-new](https://github.com/seancorfield/deps-new) to get started with deps-new.

To use this template, add an alias with a dependency to this repo, using git coordinats
```
{:lib-template {:extra-deps {io.github.bortexz/deps-lib-template {:git/sha "..."}}}}
```

Then run:
```
clojure -A:lib-template -Tnew create :template bortexz/deps-lib-template :name group.id/artifact.id
```

## License

Copyright © 2022 Alberto Fernandez

Distributed under the Eclipse Public License version 1.0.
