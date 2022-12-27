package de.xyonox.xapi.builders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class InventoryBuilder {

    private InventoryHolder player;
    private String title;
    private int size;
    private final Inventory inventory;

    public InventoryBuilder(InventoryHolder player, String title, int size) {
        this.player = player;
        this.title = title;
        this.size = size;
        this.inventory = Bukkit.createInventory(player, size, title);
    }

    public void fillInventory(ItemStack itemStack) {
        for(int i = 0; i < this.inventory.getSize(); ++i) {
            if (this.inventory.getItem(i) == null) {
                this.inventory.setItem(i, itemStack);
            }
        }

    }

    public void setItem(int slot, ItemStack itemStack) {
        this.inventory.setItem(slot, itemStack);
    }

    public void addItem(ItemStack itemStack) {
        this.inventory.addItem(itemStack);
    }

    public void addItem(ItemStack... itemStack) {
        Arrays.asList(itemStack).forEach(this::addItem);
    }

    public void removeItem(ItemStack itemStack) {
        this.inventory.removeItem(itemStack);
    }

    public void removeMaterial(Material material) {
        this.inventory.remove(material);
    }

    public Inventory toInventory() {
        return this.inventory;
    }

    public static class PreparedInventory {
        public PreparedInventory() {
        }

        public InventoryBuilder inv_9x6(InventoryHolder inventoryHolder, String title) {
            InventoryBuilder inventoryBuilder = new InventoryBuilder(inventoryHolder, title, 54);
            int[] button = new int[]{0, 8, 45, 53};
            int[] colored = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 17, 18, 26, 27, 35, 36, 44, 46, 48, 50, 52};
            int[] placeholder = new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 37, 39, 39, 40, 41, 42, 43, 47, 49, 51};
            int[] var7 = button;
            int var8 = button.length;

            int var9;
            int i;
            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = colored;
            var8 = colored.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = placeholder;
            var8 = placeholder.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            return inventoryBuilder;
        }

        public InventoryBuilder inv_9x5(InventoryHolder inventoryHolder, String title) {
            InventoryBuilder inventoryBuilder = new InventoryBuilder(inventoryHolder, title, 45);
            int[] button = new int[]{0, 8, 36, 44};
            int[] colored = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 17, 18, 26, 27, 35, 37, 39, 41, 43};
            int[] placeholder = new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 38, 40, 42};
            int[] var7 = button;
            int var8 = button.length;

            int var9;
            int i;
            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = colored;
            var8 = colored.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = placeholder;
            var8 = placeholder.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            return inventoryBuilder;
        }

        public InventoryBuilder inv_9x4(InventoryHolder inventoryHolder, String title) {
            InventoryBuilder inventoryBuilder = new InventoryBuilder(inventoryHolder, title, 36);
            int[] button = new int[]{0, 8, 27, 35};
            int[] colored = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 17, 18, 26, 28, 30, 32, 34};
            int[] placeholder = new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 29, 31, 33};
            int[] var7 = button;
            int var8 = button.length;

            int var9;
            int i;
            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = colored;
            var8 = colored.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = placeholder;
            var8 = placeholder.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            return inventoryBuilder;
        }

        public InventoryBuilder inv_9x3(InventoryHolder inventoryHolder, String title) {
            InventoryBuilder inventoryBuilder = new InventoryBuilder(inventoryHolder, title, 27);
            int[] button = new int[]{0, 8, 18, 26};
            int[] colored = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 17, 19, 21, 23, 25};
            int[] placeholder = new int[]{10, 11, 12, 13, 14, 15, 16, 20, 22, 24};
            int[] var7 = button;
            int var8 = button.length;

            int var9;
            int i;
            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = colored;
            var8 = colored.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            var7 = placeholder;
            var8 = placeholder.length;

            for(var9 = 0; var9 < var8; ++var9) {
                i = var7[var9];
                inventoryBuilder.setItem(i, (new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE)).setDisplayName("§8&quot").build());
            }

            return inventoryBuilder;
        }
    }


}
