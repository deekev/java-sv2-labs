package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s: billItems) {
            String[] temp = s.split(";");
            int price = Integer.parseInt(temp[1]) * Integer.parseInt(temp[2]);
            sb.append(temp[0]).append(", ").append(temp[2]).append(" * ").append(temp[1])
                    .append(" = ").append(price).append(" Ft\n");
        }
        return sb.toString();
    }
}