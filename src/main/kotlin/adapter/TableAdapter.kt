package adapter

import abstractFactory.Armchair
import abstractFactory.Table

class TableAdapter(table: Table) : Armchair {
    var table: Table

    init {
        this.table = table
    }

    override fun hasLegs() {
        table.hasHighLegs()
    }

    override fun sitOn() {
        table.hasСountertop()
    }
}