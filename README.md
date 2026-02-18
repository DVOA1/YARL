# Yet Another Resource Loader

Yet Another Resource Loader (YARL) is a lightweight utility mod
that allows modpack creators to ship default resource packs while
preserving full in-game configurability.

YARL automatically detects and enables resource packs placed in `config/YARL/packs`

Packs in this folder are selected by default when the game launches, but players remain free to disable them at any time through the standard Resource Packs menu.

This mod is not intended to replace mods such as OpenLoader, which remain ideal for essential startup packs. 
Instead, YARL provides a flexible way to distribute non-essential resource packs that are enabled by default but fully optional for the user.

## IMPORTANT NOTICE

Modpack creators should not distribute the generated `yarl.toml` configuration file.  
The file is meant to be created automatically for each user on first launch and should not be pre-packaged with a modpack.