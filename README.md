# IntegrationForegoing

[![Downloads](http://cf.way2muchnoise.eu/full_integration-foregoing_downloads.svg)](https://minecraft.curseforge.com/projects/integration-foregoing) [![MCVersion](http://cf.way2muchnoise.eu/versions/integration-foregoing.svg)](https://minecraft.curseforge.com/projects/integration-foregoing/files)

[![GitHub issues](https://img.shields.io/github/issues/JackyyTV/IntegrationForegoing.svg)](https://github.com/JackyyTV/IntegrationForegoing/issues) [![GitHub pull requests](https://img.shields.io/github/issues-pr/JackyyTV/IntegrationForegoing.svg)](https://github.com/JackyyTV/IntegrationForegoing/pulls) [![license](https://img.shields.io/github/license/Jacky1356400/IntegrationForegoing.svg)](../dev-1.12.x/LICENSE)

An addon mod for Industrial Foregoing!

---

## About

This is the GitHub repo for the Integration Foregoing Minecraft mod, where the source code and issue tracker are in here.

Submit any bug reports / suggestions via [issue tracker](https://github.com/JackyyTV/IntegrationForegoing/issues).

[Pull requests](https://github.com/JackyyTV/IntegrationForegoing/pulls) are welcome if you would like to add features / help with bug fixes or translations.

---

## Contact Me

- Twitter DM - [@JackyyTV](https://twitter.com/JackyyTV)
- Discord DM - Jacky#3044
- Twitch PM - [Jackyy](https://www.twitch.tv/jackyy)
- Reddit DM - [Jacky1356400](https://www.reddit.com/message/compose/?to=Jacky1356400)

---

## Setting up workspace / compile the mod yourself

If you would like to set up the workspace yourself to submit PRs of features additions or bug fixes, or compile the mod, here's how you do it.

1. Clone the mod.
    - HTTPS: `git clone https://github.com/JackyyTV/IntegrationForegoing.git`
    - SSH: `git clone git@github.com:JackyyTV/IntegrationForegoing.git`
    - Or, use the GitHub desktop app to clone the repo via GUI interface.

2. Setting up the workspace, depending on what you need.
    - Decompiled source: `gradlew setupDecompWorkspace`
    - Obfuscated source: `gradlew setupDevWorkspace`
    - CI server: `gradlew setupCIWorkspace`
    
3. Either use `gradlew build` to build the jar file (Output is in `build/libs`), or setup the IDE if you are going to modify any codes. Both IntelliJ IDEA and Eclipse are included below since they're more popular IDEs.
    - IntelliJ IDEA: Do `gradlew idea`, open the `.ipr` file and import the gradle file, then execute the `genIntellijRuns` task in the "Gradle" tab.
    - Eclipse: Do `gradlew eclipse` and open the directory as project.
