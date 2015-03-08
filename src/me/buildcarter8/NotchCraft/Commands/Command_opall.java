
public class Command_opall extends JavaPlugin;
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    if (cmd.getName().equalsIgnoreCase("opall")) {
    {
     
      if(NC_Util.isUserStaff(sender)) {

        boolean doSetGamemode = false;
        GameMode targetGamemode = GameMode.CREATIVE;
        if (args.length != 0)
        {
            if (args[0].equals("-c"))
            {
            
            if(NC_Util.isUserStaff(sender)) {
            
                doSetGamemode = true;
                targetGamemode = GameMode.CREATIVE;
            }
            else if (args[0].equals("-s"))
            {
            
             if(NC_Util.isUserStaff(sender)) {
             
                doSetGamemode = true;
                targetGamemode = GameMode.SURVIVAL;
            }
        }

        for (Player player : server.getOnlinePlayers())
        {
            player.setOp(true);
            player.sendMessage(ChatColor.YELLOW + "You have been opped (You now have perms to do op commands)");

            if (doSetGamemode)
            {
                player.setGameMode(targetGamemode);
            }
        }

        return true;
    }
}1
