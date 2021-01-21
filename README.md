# Java Discord Bot Template
<p align="center">
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template/releases"><img src="https://img.shields.io/github/v/release/kkrypt0nn/Java-Discord-Bot-Template"></a>
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template/commits/main"><img src="https://img.shields.io/github/last-commit/kkrypt0nn/Java-Discord-Bot-Template"></a>
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template/releases"><img src="https://img.shields.io/github/downloads/kkrypt0nn/Java-Discord-Bot-Template/total"></a>
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template/blob/main/LICENSE.md"><img src="https://img.shields.io/github/license/kkrypt0nn/Java-Discord-Bot-Template"></a>
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template"><img src="https://img.shields.io/github/languages/code-size/kkrypt0nn/Java-Discord-Bot-Template"></a>
  <a href="//github.com/kkrypt0nn/Java-Discord-Bot-Template/issues"><img src="https://img.shields.io/github/issues-raw/kkrypt0nn/Java-Discord-Bot-Template"></a>
  <a href="//java.com"><img src="https://img.shields.io/badge/java-14-orange"></a>
</p>

This repository is a template that everyone can use for the start of their discord bot.

When I first started creating my discord bot it took me a while to get everything setup and working with cogs and more. I would've been happy if there were any template existing. But there wasn't any existing template. That's why I decided to create my own template to let <b>you</b> guys create your discord bot in an easy way.

Please note that this template is not supposed to be the best template, but a good template to start learning how TwitchIO works and to make your own bot in a simple way.

If you plan to use this template to make your own template or bot, please give me credits, it would be greatly appreciated.

## Authors
* **[Krypton (@kkrypt0nn)](https://github.com/kkrypt0nn)** - The only and one developer

## Support

If you need some help for something, do not hesitate to join my discord server [here](https://discord.gg/HzJ3Gfr).

All the updates of the template are available [here](UPDATES.md).

## How to download it

This repository is now a template, on the top left you can simple click on "**Use this template**" to create a GitHub repository based on this template.

Alternatively you can do the following:
* Clone/Download the repository
    * To clone it and get the updates you can definitely use the command
    `git clone`

## How to setup

There are only a few things to setup if you want to use this template. Everything is showed in the [Constants.java](src/main/java/studio/spacelab/krypton/utils/Constants.java) file.

Here is an explanation of what everything is:

| Variable                      | What it is                                                                                                                                                            |
| ------------------            | --------------------------|
| YOUR_BOT_PREFIX               | The prefix of your bot    |
| YOUR_BOT_TOKEN                | The token of your bot     |


## How to start

<b>Make sure you have installed Maven and Java first.</b>

To start the bot you simply need to launch, either your terminal (Linux, Mac & Windows) or your Command Prompt (Windows) and type the following commands.

First we need package the project using maven and this command
```
mvn package
```

Then we just need to run the jar file in the target folder
```
cd target
java -jar Java-Discord-Bot-Template-1.0.jar
```

## Dependencies
All the dependencies are listed in the [pom.xml](pom.xml) file. But there is no specific things to do as this should install automatically when launching, for example, IntelliJ IDEA.

## Built With

* [Java 14](https://java.com)

## Issues or Questions

If you have any issues or questions of how to code a specific command, you can:

* Join my discord server [here](https://discord.gg/HzJ3Gfr)
* Post them [here](https://github.com/kkrypt0nn/Java-Discord-Bot-Template/issues)

Me or other people will take their time to answer and help you.

## Versioning

We use [SemVer](http://semver.org) for versioning. For the versions available, see the [tags on this repository](https://github.com/kkrypt0nn/Java-Discord-Bot-Template/tags).

## Bots who used this template

*DM Krypton#7331 to get yourself in this list*

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE.md](LICENSE.md) file for details
