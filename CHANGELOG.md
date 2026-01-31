# Changelog

## 0.2.0 (2026-01-31)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/srujana-egov/pgr-service-java/compare/v0.1.0...v0.2.0)

### Features

* **client:** add `HttpRequest#url()` method ([efc8b0d](https://github.com/srujana-egov/pgr-service-java/commit/efc8b0d2b112ff0d09bf85c00470e68ca831a880))
* **client:** allow configuring dispatcher executor service ([2121fef](https://github.com/srujana-egov/pgr-service-java/commit/2121fef680e94929f0d33c7379ba7e8aefe17b76))
* **client:** send `X-Stainless-Kotlin-Version` header ([f1e6b33](https://github.com/srujana-egov/pgr-service-java/commit/f1e6b33391149fd94e2d14ea5d3bba7beb3d90b7))


### Bug Fixes

* **client:** disallow coercion from float to int ([459ab65](https://github.com/srujana-egov/pgr-service-java/commit/459ab65e31fd3948839ddf815f0b5e45788cf10e))
* **client:** fully respect max retries ([a5693ab](https://github.com/srujana-egov/pgr-service-java/commit/a5693abb997ea3ada5acaccf80fb9c9f64ebf450))
* **client:** preserve time zone in lenient date-time parsing ([9579848](https://github.com/srujana-egov/pgr-service-java/commit/95798488090751375653c401271fdf27f0a0fbdb))
* **client:** send retry count header for max retries 0 ([a5693ab](https://github.com/srujana-egov/pgr-service-java/commit/a5693abb997ea3ada5acaccf80fb9c9f64ebf450))
* date time deserialization leniency ([1113ae3](https://github.com/srujana-egov/pgr-service-java/commit/1113ae3d42251f653e003f0a51f90add95d5adb2))
* **tests:** add missing query/header params ([f3ab171](https://github.com/srujana-egov/pgr-service-java/commit/f3ab17169997d8eeb5fc99058dcf47d392bcf731))


### Chores

* **ci:** upgrade `actions/github-script` ([3ce8602](https://github.com/srujana-egov/pgr-service-java/commit/3ce860299d29967cc038c5517e65b6d6c1792737))
* **ci:** upgrade `actions/setup-java` ([75f22f2](https://github.com/srujana-egov/pgr-service-java/commit/75f22f274ae7dd940592e4e31a89e2a76bded335))
* **internal:** allow passing args to `./scripts/test` ([14a00f2](https://github.com/srujana-egov/pgr-service-java/commit/14a00f283d58603f37b8a4e4d6847a3c5dd0265d))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([454b298](https://github.com/srujana-egov/pgr-service-java/commit/454b2987c73011b08632b03719ce4ce87fb3a3b1))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([1c7faf9](https://github.com/srujana-egov/pgr-service-java/commit/1c7faf99db938a8eb0820d21f06a0a801bf46ddc))
* **internal:** depend on packages directly in example ([a5693ab](https://github.com/srujana-egov/pgr-service-java/commit/a5693abb997ea3ada5acaccf80fb9c9f64ebf450))
* **internal:** improve maven repo docs ([a626d7f](https://github.com/srujana-egov/pgr-service-java/commit/a626d7f04686638e929554652d8a953fc672b897))
* **internal:** support uploading Maven repo artifacts to stainless package server ([56b4b21](https://github.com/srujana-egov/pgr-service-java/commit/56b4b21f77c6cd8ef929bc594646104f9084bf84))
* **internal:** update `actions/checkout` version ([b0d4ff1](https://github.com/srujana-egov/pgr-service-java/commit/b0d4ff16e07f91131e7e5b657e2d76e7df26c3bd))
* **internal:** update maven repo doc to include authentication ([5e10b26](https://github.com/srujana-egov/pgr-service-java/commit/5e10b263f9b8c459822d8e7265369f384a7cba06))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/srujana-egov/pgr-service-java/issues/3240) in tests ([1113ae3](https://github.com/srujana-egov/pgr-service-java/commit/1113ae3d42251f653e003f0a51f90add95d5adb2))


### Documentation

* add comment for arbitrary value fields ([f856983](https://github.com/srujana-egov/pgr-service-java/commit/f856983e228326b8eac4d659be38207ff8eb67dd))

## 0.1.0 (2025-12-03)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/srujana-egov/pgr-service-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([2d958f1](https://github.com/srujana-egov/pgr-service-java/commit/2d958f11a6f5e612debd1b0988f6075ae65fd724))
* **api:** manual updates ([cb30afb](https://github.com/srujana-egov/pgr-service-java/commit/cb30afbe82f26a6b3d58b2a8c30ffd513320365f))


### Chores

* update SDK settings ([32aecbc](https://github.com/srujana-egov/pgr-service-java/commit/32aecbcb5c742f66f0e89e1d553718bd127bcde9))
