package matgm50.wanderer.util;

import matgm50.wanderer.util.helper.ScrollHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandWanderer extends CommandBase {

    @Override
    public String getName() {return "wanderer";}

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/wanderer <command>";
    }

    @Override
    public void execute(ICommandSender sender, String[] args) throws CommandException {

        if(args.length < 1) {return;}
        if(!(sender instanceof EntityPlayer)) {return;}

        if(args[0].equals("give")) {

            if(ScrollHelper.entries.containsKey(args[1])) {

                ((EntityPlayer)sender).inventory.addItemStackToInventory(ScrollHelper.createScroll(args[1]));

            }

        }

    }

}
