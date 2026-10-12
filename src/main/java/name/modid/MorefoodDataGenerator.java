package name.modid;

import name.modid.Datagen.ModModelProvider;
import name.modid.Datagen.ModRecipieProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MorefoodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipieProvider::new);
		pack.addProvider(ModModelProvider::new);

	}
}
