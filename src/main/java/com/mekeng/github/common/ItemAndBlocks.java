package com.mekeng.github.common;

import appeng.api.AEApi;
import com.mekeng.github.MekEng;
import com.mekeng.github.common.block.BlockGasInterface;
import com.mekeng.github.common.item.ItemDummyGas;
import com.mekeng.github.common.item.ItemGasCell;
import com.mekeng.github.common.item.ItemMkEPart;
import com.mekeng.github.common.item.ItemNormal;
import com.mekeng.github.common.item.ItemPortableGasCell;
import com.mekeng.github.common.item.ItemWirelessGasTerminal;
import com.mekeng.github.common.part.PartGasExportBus;
import com.mekeng.github.common.part.PartGasImportBus;
import com.mekeng.github.common.part.PartGasInterface;
import com.mekeng.github.common.part.PartGasInterfaceConfigurationTerminal;
import com.mekeng.github.common.part.PartGasLevelEmitter;
import com.mekeng.github.common.part.PartGasStorageBus;
import com.mekeng.github.common.part.PartGasTerminal;
import com.mekeng.github.common.part.p2p.PartP2PGases;
import com.mekeng.github.common.part.reporting.PartGasConversionMonitor;
import com.mekeng.github.common.part.reporting.PartGasStorageMonitor;
import com.mekeng.github.common.tile.TileGasInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemAndBlocks {

    public static final CreativeTabs TAB = new CreativeTabs(MekEng.MODID) {
        @Nonnull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(GAS_INTERFACE);
        }
    };

    public static ItemDummyGas DUMMY_GAS;
    public static ItemNormal GAS_CELL_CORE_1k;
    public static ItemNormal GAS_CELL_CORE_4k;
    public static ItemNormal GAS_CELL_CORE_16k;
    public static ItemNormal GAS_CELL_CORE_64k;
    public static ItemNormal GAS_CELL_CORE_256k;
    public static ItemNormal GAS_CELL_CORE_1m;
    public static ItemNormal GAS_CELL_CORE_4m;
    public static ItemNormal GAS_CELL_CORE_16m;
    public static ItemNormal GAS_CELL_CORE_64m;
    public static ItemNormal GAS_CELL_CORE_256m;
    public static ItemNormal GAS_CELL_CORE_1g;
    public static ItemNormal GAS_CELL_CORE_2g;
    public static ItemGasCell GAS_CELL_1k;
    public static ItemGasCell GAS_CELL_4k;
    public static ItemGasCell GAS_CELL_16k;
    public static ItemGasCell GAS_CELL_64k;
    public static ItemGasCell GAS_CELL_256k;
    public static ItemGasCell GAS_CELL_1m;
    public static ItemGasCell GAS_CELL_4m;
    public static ItemGasCell GAS_CELL_16m;
    public static ItemGasCell GAS_CELL_64m;
    public static ItemGasCell GAS_CELL_256m;
    public static ItemGasCell GAS_CELL_1g;
    public static ItemGasCell GAS_CELL_2g;
    public static ItemPortableGasCell PORTABLE_GAS_CELL;
    public static ItemMkEPart<PartGasTerminal> GAS_TERMINAL;
    public static ItemMkEPart<PartGasImportBus> GAS_IMPORT_BUS;
    public static ItemMkEPart<PartGasExportBus> GAS_EXPORT_BUS;
    public static BlockGasInterface GAS_INTERFACE;
    public static ItemMkEPart<PartGasInterface> GAS_INTERFACE_PART;
    public static ItemMkEPart<PartGasStorageBus> GAS_STORAGE_BUS;
    public static ItemMkEPart<PartGasLevelEmitter> GAS_LEVEL_EMITTER;
    public static ItemMkEPart<PartGasInterfaceConfigurationTerminal> GAS_INTERFACE_TERMINAL;
    public static ItemWirelessGasTerminal WIRELESS_GAS_TERMINAL;
    public static ItemMkEPart<PartP2PGases> GAS_P2P;
    public static ItemMkEPart<PartGasStorageMonitor> GAS_STORAGE_MONITOR;
    public static ItemMkEPart<PartGasConversionMonitor> GAS_CONVERSION_MONITOR;

    public static void init(RegistryHandler regHandler) {
        ItemStack casing = AEApi.instance().definitions().materials().emptyStorageCell().maybeStack(1).orElse(null);
        regHandler.item("dummy_gas", DUMMY_GAS = new ItemDummyGas());
        regHandler.item("gas_core_1k", GAS_CELL_CORE_1k = new ItemNormal());
        regHandler.item("gas_core_4k", GAS_CELL_CORE_4k = new ItemNormal());
        regHandler.item("gas_core_16k", GAS_CELL_CORE_16k = new ItemNormal());
        regHandler.item("gas_core_64k", GAS_CELL_CORE_64k = new ItemNormal());
    regHandler.item("gas_core_256k", GAS_CELL_CORE_256k = new ItemNormal());
    regHandler.item("gas_core_1m", GAS_CELL_CORE_1m = new ItemNormal());
    regHandler.item("gas_core_4m", GAS_CELL_CORE_4m = new ItemNormal());
    regHandler.item("gas_core_16m", GAS_CELL_CORE_16m = new ItemNormal());
    regHandler.item("gas_core_64m", GAS_CELL_CORE_64m = new ItemNormal());
    regHandler.item("gas_core_256m", GAS_CELL_CORE_256m = new ItemNormal());
    regHandler.item("gas_core_1g", GAS_CELL_CORE_1g = new ItemNormal());
    regHandler.item("gas_core_2g", GAS_CELL_CORE_2g = new ItemNormal());
        regHandler.item("gas_cell_1k", GAS_CELL_1k = new ItemGasCell(GAS_CELL_CORE_1k, casing, 1, 0.5, 8));
        regHandler.item("gas_cell_4k", GAS_CELL_4k = new ItemGasCell(GAS_CELL_CORE_4k, casing, 4, 1.0, 32));
        regHandler.item("gas_cell_16k", GAS_CELL_16k = new ItemGasCell(GAS_CELL_CORE_16k, casing, 16, 1.5, 128));
        regHandler.item("gas_cell_64k", GAS_CELL_64k = new ItemGasCell(GAS_CELL_CORE_64k, casing, 64, 2.0, 512));
    // Extended tiers
    regHandler.item("gas_cell_256k", GAS_CELL_256k = new ItemGasCell(GAS_CELL_CORE_256k, casing, 256, 2.5, 2048));
    regHandler.item("gas_cell_1m", GAS_CELL_1m = new ItemGasCell(GAS_CELL_CORE_1m, casing, 1024, 3.0, 8192));
    regHandler.item("gas_cell_4m", GAS_CELL_4m = new ItemGasCell(GAS_CELL_CORE_4m, casing, 4096, 3.5, 32768));
    regHandler.item("gas_cell_16m", GAS_CELL_16m = new ItemGasCell(GAS_CELL_CORE_16m, casing, 16384, 4.0, 131072));
    regHandler.item("gas_cell_64m", GAS_CELL_64m = new ItemGasCell(GAS_CELL_CORE_64m, casing, 65536, 4.5, 524288));
    regHandler.item("gas_cell_256m", GAS_CELL_256m = new ItemGasCell(GAS_CELL_CORE_256m, casing, 262144, 5.0, 2097152));
    regHandler.item("gas_cell_1g", GAS_CELL_1g = new ItemGasCell(GAS_CELL_CORE_1g, casing, 1048576, 5.5, 8388608));
    // 2g exact would overflow int bytes; cap to max-safe kilobytes (2,097,151 kB)
    regHandler.item("gas_cell_2g", GAS_CELL_2g = new ItemGasCell(GAS_CELL_CORE_2g, casing, 2097151, 6.0, 16777216));
        regHandler.item("portable_gas_cell", PORTABLE_GAS_CELL = new ItemPortableGasCell());
        regHandler.item("gas_terminal", GAS_TERMINAL = new ItemMkEPart<>(PartGasTerminal::new));
        regHandler.item("gas_import_bus", GAS_IMPORT_BUS = new ItemMkEPart<>(PartGasImportBus::new));
        regHandler.item("gas_export_bus", GAS_EXPORT_BUS = new ItemMkEPart<>(PartGasExportBus::new));
        regHandler.item("gas_interface_part", GAS_INTERFACE_PART = new ItemMkEPart<>(PartGasInterface::new));
        regHandler.item("gas_storage_bus", GAS_STORAGE_BUS = new ItemMkEPart<>(PartGasStorageBus::new));
        regHandler.item("gas_level_emitter", GAS_LEVEL_EMITTER = new ItemMkEPart<>(PartGasLevelEmitter::new));
        regHandler.item("gas_interface_terminal", GAS_INTERFACE_TERMINAL = new ItemMkEPart<>(PartGasInterfaceConfigurationTerminal::new));
        regHandler.item("wireless_gas_terminal", WIRELESS_GAS_TERMINAL = new ItemWirelessGasTerminal());
        regHandler.item("gas_p2p", GAS_P2P = new ItemMkEPart<>(PartP2PGases::new));
        regHandler.item("gas_storage_monitor", GAS_STORAGE_MONITOR = new ItemMkEPart<>(PartGasStorageMonitor::new));
        regHandler.item("gas_conversion_monitor", GAS_CONVERSION_MONITOR = new ItemMkEPart<>(PartGasConversionMonitor::new));
        regHandler.block("gas_interface", GAS_INTERFACE = new BlockGasInterface(), TileGasInterface.class);
    }

}
