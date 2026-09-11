package ru.berdinskiybear.armorhud.config;

import net.minecraft.client.gui.screens.Screen;
import net.uku3lig.ukulib.api.UkulibAPI;

import java.util.function.UnaryOperator;

/**
 * FixLib currently preserves the legacy ukuLib API and entrypoint contract,
 * so this integration intentionally implements UkulibAPI for compatibility.
 */
public class UkulibIntegration implements UkulibAPI {
    @Override
    public UnaryOperator<Screen> supplyConfigScreen() {
        return ArmorHudConfigScreen::new;
    }
}
