package io.github.potassiummc.resetchunks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.ResetChunksCommand;

public class ResetChunks implements ModInitializer {

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			ResetChunksCommand.register(dispatcher);
		});
	}

}
