package nl.chimpgamer.sendtoconsole

import org.bukkit.plugin.java.JavaPlugin

class SendToConsole : JavaPlugin() {

    override fun onEnable() {
        getCommand("sendtoconsole")?.setExecutor { _, _, _, args ->
            if (args.isNotEmpty()) {
                logger.info(args.joinToString(" "))
                return@setExecutor true
            }
            return@setExecutor false
        }
    }
}