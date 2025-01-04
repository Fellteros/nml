package net.fellter.nml;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class NMLFileType extends LanguageFileType {

    public static final NMLFileType INSTANCE = new NMLFileType();

    protected NMLFileType() {
        super(NMLLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "NML";
    }

    @Override
    public @NotNull String getDescription() {
        return "Asads";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "nml";
    }

    @Override
    public Icon getIcon() {
        return NMLIcons.FILE;
    }
}
