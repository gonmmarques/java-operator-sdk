package io.javaoperatorsdk.operator.baseapi.primaryindexer;

public class PrimaryIndexerTestCustomResourceSpec {

  private String configMapName;

  public String getConfigMapName() {
    return configMapName;
  }

  public PrimaryIndexerTestCustomResourceSpec setConfigMapName(String configMapName) {
    this.configMapName = configMapName;
    return this;
  }
}
