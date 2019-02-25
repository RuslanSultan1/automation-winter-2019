package base.jdi.pages;

import base.jdi.entities.UserInfo;
import base.jdi.sections.UserRow;
import com.epam.jdi.light.elements.complex.table.DataTable;
import com.epam.jdi.light.elements.complex.table.Table;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JTable;

public class PerformancePageJdi extends WebPage {
    @JTable(
            root = "#users-table",
            row = "//tr[%s]/td",
            column = "//tr/td[%s]",
            cell = "//tr[{1}]/td[{0}]",
            allCells = "td",
            headers = "th",
            header = {"Name", "Phone", "Email", "City"},
            rowHeader = "Name",
            size = 4
    )
    public static DataTable<UserRow, UserInfo> usersSetup;
}
