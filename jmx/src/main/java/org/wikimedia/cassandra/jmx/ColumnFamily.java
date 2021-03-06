package org.wikimedia.cassandra.jmx;

import static org.wikimedia.cassandra.jmx.Util.newObjectName;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ColumnFamily extends MBean {

    private final String keyspaceName;
    private final String name;

    public ColumnFamily(Connection client, String keyspace, String columnfamily) {
        super(
                client,
                newObjectName(
                        "org.apache.cassandra.db:type=ColumnFamilies,keyspace=%s,columnfamily=%s",
                        keyspace,
                        columnfamily));
        this.keyspaceName = keyspace;
        this.name = columnfamily;
    }

    public String getKeyspace() {
        return this.keyspaceName;
    }

    public String getName() {
        return this.name;
    }

    public double getDroppableTombstoneRatio() throws IOException {
        return (double) getAttribute("DroppableTombstoneRatio");
    }

    public String getCompactionStrategyClass() throws IOException {
        return (String) getAttribute("CompactionStrategyClass");
    }

    @SuppressWarnings("unchecked")
    public Map<String, String> getCompressionParameters() throws IOException {
        return (Map<String, String>) getAttribute("CompressionParameters");
    }

    public boolean getAutoCompactionDisabled() throws IOException {
        return (boolean) getAttribute("AutoCompactionDisabled");
    }

    public int getMinimumCompactionThreshold() throws IOException {
        return (int) getAttribute("MinimumCompactionThreshold");
    }

    public int getMaximumCompactionThreshold() throws IOException {
        return (int) getAttribute("MaximumCompactionThreshold");
    }

    @SuppressWarnings("unchecked")
    public List<String> getBuiltIndexes() throws IOException {
        return (List<String>) getAttribute("BuiltIndexes");
    }

    @SuppressWarnings("unchecked")
    public Map<String, String> getCompactionParameters() throws IOException {
        return (Map<String, String>) getAttribute("CompactionParameters");
    }

    public int getUnleveledSSTables() throws IOException {
        return (int) getAttribute("UnleveledSSTables");
    }

    public Integer[] getSSTableCountPerLevel() throws IOException {
        Integer[] counts = (Integer[]) getAttribute("SSTableCountPerLevel");
        return counts == null ? new Integer[] {} : counts;
    }

}
