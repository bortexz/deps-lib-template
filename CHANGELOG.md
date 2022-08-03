# Change Log

## 0.0.6 - 2022-08-03
### Fixed
- build/lib missing slash between group-id and artifact-id

## 0.0.5 - 2022-08-03
### Changed
- pom-template.xml instead of template/pom.xml
- Release process changed from pushing a new tag, to triggering a new release.yml job.

## 0.0.4 - 2022-07-23

### Changed
- Initial version from 0.1.0 -> 0.0.1

## 0.0.3 - 2022-07-23

### Changed
- Github release test workflow won't run on new tags.

## 0.0.2 - 2022-07-22

### Added 
- tag-version build fn to tag current version, triggering a release on github
- Github workflow to deploy when a new tag is created
- Github workflow to test on every push and pull-request
- release.edn for version, group-id and artifact-id info
- .gitignore now includes .portal

## 0.0.1 - 2022-07-15
### Added 
- Initial template
