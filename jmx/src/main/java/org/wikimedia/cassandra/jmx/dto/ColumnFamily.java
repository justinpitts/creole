package org.wikimedia.cassandra.jmx.dto;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ColumnFamily {

    private String keyspaceName;
    private String name;
    private String compactionStrategyClass;
    private boolean autoCompactionDisabled;
    private Map<String, String> compressionParameters;
    private double droppableTombstoneRatio;
    private int minimumCompactionThreshold;
    private int maximumCompactionThreshold;
    private List<String> builtIndexes;
    private Map<String, String> compactionParameters;
    private int unleveledSSTables;
    private Integer[] sstableCountPerLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyspace() {
        return keyspaceName;
    }

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    public String getCompactionStrategyClass() {
        return compactionStrategyClass;
    }

    public void setCompactionStrategyClass(String compactionStrategyClass) {
        this.compactionStrategyClass = compactionStrategyClass;
    }

    public boolean isAutoCompactionDisabled() {
        return autoCompactionDisabled;
    }

    public void setAutoCompactionDisabled(boolean autoCompactionDisabled) {
        this.autoCompactionDisabled = autoCompactionDisabled;
    }

    public Map<String, String> getCompressionParameters() {
        return compressionParameters;
    }

    public void setCompressionParameters(Map<String, String> compressionParameters) {
        this.compressionParameters = compressionParameters;
    }

    public double getDroppableTombstoneRatio() {
        return droppableTombstoneRatio;
    }

    public void setDroppableTombstoneRatio(double droppableTombstoneRatio) {
        this.droppableTombstoneRatio = droppableTombstoneRatio;
    }

    public int getMinimumCompactionThreshold() {
        return minimumCompactionThreshold;
    }

    public void setMinimumCompactionThreshold(int minimumCompactionThreshold) {
        this.minimumCompactionThreshold = minimumCompactionThreshold;
    }

    public int getMaximumCompactionThreshold() {
        return maximumCompactionThreshold;
    }

    public void setMaximumCompactionThreshold(int maximumCompactionThreshold) {
        this.maximumCompactionThreshold = maximumCompactionThreshold;
    }

    public List<String> getBuiltIndexes() {
        return builtIndexes;
    }

    public void setBuiltIndexes(List<String> builtIndexes) {
        this.builtIndexes = builtIndexes;
    }

    public Map<String, String> getCompactionParameters() {
        return compactionParameters;
    }

    public void setCompactionParameters(Map<String, String> compactionParameters) {
        this.compactionParameters = compactionParameters;
    }

    public int getUnleveledSSTables() {
        return unleveledSSTables;
    }

    public void setUnleveledSSTables(int unleveledSSTables) {
        this.unleveledSSTables = unleveledSSTables;
    }

    public Integer[] getSSTableCountPerLevel() {
        return sstableCountPerLevel;
    }

    public void setSSTableCountPerLevel(Integer[] sstableCountPerLevel) {
        this.sstableCountPerLevel = sstableCountPerLevel;
    }

    public static ColumnFamily create(org.wikimedia.cassandra.jmx.ColumnFamily cf) throws IOException {
        ColumnFamily obj = new ColumnFamily();
        obj.setKeyspaceName(cf.getKeyspace());
        obj.setName(cf.getName());
        obj.setCompactionStrategyClass(cf.getCompactionStrategyClass());
        obj.setAutoCompactionDisabled(cf.getAutoCompactionDisabled());
        obj.setCompressionParameters(cf.getCompressionParameters());
        obj.setDroppableTombstoneRatio(cf.getDroppableTombstoneRatio());
        obj.setMinimumCompactionThreshold(cf.getMinimumCompactionThreshold());
        obj.setMaximumCompactionThreshold(cf.getMaximumCompactionThreshold());
        obj.setBuiltIndexes(cf.getBuiltIndexes());
        obj.setCompactionParameters(cf.getCompactionParameters());
        obj.setUnleveledSSTables(cf.getUnleveledSSTables());
        obj.setSSTableCountPerLevel(cf.getSSTableCountPerLevel());
        return obj;
    }

}
