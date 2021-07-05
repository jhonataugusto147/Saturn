package br.com.main.events;

import br.com.main.commands.manager.AccountManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChargeAccounts implements Listener {

    AccountManager accountManager = new AccountManager();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void playerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if(!accountManager.hasAccount(player)){
            accountManager.createAccount(player);
        }

    }
}
