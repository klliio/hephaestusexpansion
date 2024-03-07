package io.zackmyers.hephaestusexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;
public class HephExBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public HephExBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        // No tags to add yet
    }

    @Override
    public String getName() {
        return "HephaestusPlus Block Tags";
    }
}
