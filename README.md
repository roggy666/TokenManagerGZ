# TokenManager (GlitchZone Fork)

Fork of [TokenManager](https://github.com/Realizedd/TokenManager) with fixes for modern Minecraft server versions (26.x+).

Based on [shafiahaz2478/TokenManager](https://github.com/shafiahaz2478/TokenManager) (1.20.6 branch).

## Changes from upstream

- **Fix version parsing for 26.x+** — original plugin failed to parse server versions with major version 26 and above
- **Remove shaded SLF4J** — Paper already provides SLF4J; shading and relocating `slf4j-nop` broke `ServiceLoader` discovery, causing `"No SLF4J providers were found"` warnings on every startup

## Building

```bash
./gradlew clean build
```

Output jar: `out/TokenManager-3.2.8-all.jar`

## Original README

A simple economy plugin for Spigot. [Spigot Project Page](https://www.spigotmc.org/resources/tokenmanager.8610/)

* **[Wiki](https://github.com/Realizedd/TokenManager/wiki)**
* **[Commands](https://github.com/Realizedd/TokenManager/wiki/commands)**
* **[Permissions](https://github.com/Realizedd/TokenManager/wiki/permissions)**
* **[config.yml](https://github.com/Realizedd/TokenManager/blob/master/src/main/resources/config.yml)**
* **[lang.yml](https://github.com/Realizedd/TokenManager/blob/master/src/main/resources/lang.yml)**
* **[shops.yml](https://github.com/Realizedd/TokenManager/blob/master/src/main/resources/shops.yml)**
* **[Support Discord](https://discord.gg/RNy45sg)**

### Getting the API instance

```java
@Override
public void onEnable() {
    TokenManager api = (TokenManager) Bukkit.getServer().getPluginManager().getPlugin("TokenManager");
}
```
