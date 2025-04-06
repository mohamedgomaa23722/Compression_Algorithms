package com.mg.compresion;

import java.io.File;

public interface Compression {

    File compress(File input);

    File decompress(File output);
}
