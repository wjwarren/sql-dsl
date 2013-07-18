package com.thoughtworks.sql;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static com.thoughtworks.sql.Field.field;
import static com.thoughtworks.sql.Table.table;

public class TableTest {

    @Test
    public void should_get_field_from_table_directly(){
        assertThat(table("table").field("id"), equalTo(field("table.id")));
    }
}
