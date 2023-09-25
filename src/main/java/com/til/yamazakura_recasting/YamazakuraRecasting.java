package com.til.yamazakura_recasting;

import com.til.glowing_fire_glow.GlowingFireGlow;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author til
 */
@Mod(YamazakuraRecasting.MOD_ID)
@GlowingFireGlow.Manage
public class YamazakuraRecasting {
    public static final String MOD_ID = "yamazakura_recasting";
    public static final String MOD_MANE = "YamazakuraRecasting";

    public static final Logger LOGGER = LogManager.getLogger();
    public final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public YamazakuraRecasting() {
        modEventBus.register(this);
    }

}
