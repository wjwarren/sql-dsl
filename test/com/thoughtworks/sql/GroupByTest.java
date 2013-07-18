package com.thoughtworks.sql;

import static com.thoughtworks.sql.Field.field;
import org.junit.Test;

public class GroupByTest {
    @Test
    public void should_generate_groupby_clause() {
        GroupBy groupBy = GroupBy.groupBy(field("field"));
    }
}