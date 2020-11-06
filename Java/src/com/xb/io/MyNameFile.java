package com.xb.io;

import java.io.File;
import java.io.FilenameFilter;

public class MyNameFile implements FilenameFilter {
  @Override
  public boolean accept(File dir, String name) {
    return name.endsWith(".txt")||name.endsWith(".html");
  }
}
