package toughasnails.handler;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import toughasnails.core.ToughAsNails;
import toughasnails.network.message.MessageTemperatureDebug;
import toughasnails.network.message.MessageToggleUI;
import toughasnails.network.message.MessageUpdateTemperature;

public class PacketHandler
{
    public static final SimpleNetworkWrapper instance = NetworkRegistry.INSTANCE.newSimpleChannel(ToughAsNails.MOD_ID);

    public static void init()
    {
        instance.registerMessage(MessageUpdateTemperature.class, MessageUpdateTemperature.class, 0, Side.CLIENT);
        instance.registerMessage(MessageTemperatureDebug.class, MessageTemperatureDebug.class, 1, Side.CLIENT);
        instance.registerMessage(MessageToggleUI.class, MessageToggleUI.class, 2, Side.CLIENT);
    }
}
