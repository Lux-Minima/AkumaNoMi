package xyz.prismflower.akumanomi

import org.bukkit.plugin.java.JavaPlugin

class AkumaNoMi : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Akuma no Mi has been enabled!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Akuma no Mi has been disabled!")
    }
}