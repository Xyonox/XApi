package de.xyonox.xapi.builders;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class ItemBuilder {

    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder(Material material, int amount) {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder(Material material, short subId) {
        this.itemStack = new ItemStack(material, 1, subId);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder(Material material, int amount, short subId) {
        this.itemStack = new ItemStack(material, amount, subId);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder setDisplayName(String displayName) {
        this.itemMeta.setDisplayName(displayName);
        return this;
    }

    public ItemBuilder setLore(String... lore) {
        this.itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder addAllItemFlags() {
        ItemFlag[] var1 = ItemFlag.values();

        for (ItemFlag itemFlag : var1) {
            this.itemMeta.addItemFlags(itemFlag);
        }

        this.itemStack.setItemMeta(this.itemMeta);
        return this;
    }

    public ItemBuilder addItemFlags(ItemFlag... itemFlags) {
        this.itemMeta.addItemFlags(itemFlags);
        return this;
    }

    public ItemBuilder setUnbreakable() {
        this.itemMeta.setUnbreakable(true);
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int enchantmentLevel) {
        this.itemMeta.addEnchant(enchantment, enchantmentLevel, true);
        return this;
    }

    public ItemBuilder setLocalizedName(String name) {
        this.itemMeta.setLocalizedName(name);
        return this;
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }
}