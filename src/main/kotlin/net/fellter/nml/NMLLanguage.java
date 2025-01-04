package net.fellter.nml;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NMLLanguage extends Language {
    public static final NMLLanguage INSTANCE = new NMLLanguage();

    protected NMLLanguage() {
        super("NML");
    }
}
