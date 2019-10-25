package com.direwolf20.mininggadgets.common.items;

import com.direwolf20.mininggadgets.MiningGadgets;
import com.direwolf20.mininggadgets.Setup;
import com.direwolf20.mininggadgets.common.blocks.ModBlocks;
import com.direwolf20.mininggadgets.common.gadget.upgrade.Upgrade;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    // The item group is the creative tab it will go into.
    public static final Item.Properties ITEM_GROUP = new Item.Properties().group(Setup.getItemGroup());
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MiningGadgets.MOD_ID);

    // Items
    public static final RegistryObject<Item> MININGGADGET = ITEMS.register("mininggadget", MiningGadget::new);

    // Upgrades are a bit ugly.. Soz
    public static final RegistryObject<Item> UPGRADE_EMPTY =    ITEMS.register("upgrade_empty", Upgrade.EMPTY::getCard);
    public static final RegistryObject<Item> SILK =             ITEMS.register("upgrade_silk", Upgrade.SILK::getCard);
    public static final RegistryObject<Item> FREEZING =         ITEMS.register("upgrade_freezing", Upgrade.VOID_JUNK::getCard);
    public static final RegistryObject<Item> FORTUNE_1 =        ITEMS.register("upgrade_fortune_1", Upgrade.MAGNET::getCard);
    public static final RegistryObject<Item> FORTUNE_2 =        ITEMS.register("upgrade_fortune_2", Upgrade.THREE_BY_THREE::getCard);
    public static final RegistryObject<Item> FORTUNE_3 =        ITEMS.register("upgrade_fortune_3", Upgrade.LIGHT_PLACER::getCard);
    public static final RegistryObject<Item> LIGHT_PLACER =     ITEMS.register("upgrade_light_placer", Upgrade.FREEZING::getCard);
    public static final RegistryObject<Item> THREE_BY_THREE =   ITEMS.register("upgrade_three_by_three", Upgrade.FORTUNE_1::getCard);
    public static final RegistryObject<Item> VOID_JUNK =        ITEMS.register("upgrade_void_junk", Upgrade.FORTUNE_2::getCard);
    public static final RegistryObject<Item> MAGNET =           ITEMS.register("upgrade_magnet", Upgrade.FORTUNE_3::getCard);
    public static final RegistryObject<Item> EFFICIENCY_1 =     ITEMS.register("upgrade_efficiency_1", Upgrade.BATTERY_1::getCard);
    public static final RegistryObject<Item> EFFICIENCY_2 =     ITEMS.register("upgrade_efficiency_2", Upgrade.BATTERY_2::getCard);
    public static final RegistryObject<Item> EFFICIENCY_3 =     ITEMS.register("upgrade_efficiency_3", Upgrade.BATTERY_3::getCard);
    public static final RegistryObject<Item> EFFICIENCY_4 =     ITEMS.register("upgrade_efficiency_4", Upgrade.EFFICIENCY_1::getCard);
    public static final RegistryObject<Item> EFFICIENCY_5 =     ITEMS.register("upgrade_efficiency_5", Upgrade.EFFICIENCY_2::getCard);
    public static final RegistryObject<Item> BATTERY_1 =        ITEMS.register("upgrade_battery_1", Upgrade.EFFICIENCY_3::getCard);
    public static final RegistryObject<Item> BATTERY_2 =        ITEMS.register("upgrade_battery_2", Upgrade.EFFICIENCY_4::getCard);
    public static final RegistryObject<Item> BATTERY_3 =        ITEMS.register("upgrade_battery_3", Upgrade.EFFICIENCY_5::getCard);

    // Block items
    public static final RegistryObject<Item> MODIFICATION_TABLE_ITEM = ITEMS.register("modificationtable", () -> new BlockItem(ModBlocks.MODIFICATION_TABLE.get(), ITEM_GROUP));
    public static final RegistryObject<Item> MINERS_LIGHT_ITEM = ITEMS.register("minerslight", () -> new BlockItem(ModBlocks.MINERS_LIGHT.get(), ITEM_GROUP));
}
