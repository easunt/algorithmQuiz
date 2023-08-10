package bm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BmSolution3 {
    public String[] printDailyStatistics(String[] productInfo, String[] dailyProductSales) {
        String[] result = new String[productInfo.length];

        Map<String, String[]> productInfoMap = new HashMap<>();
        Arrays.stream(productInfo)
                .forEach(product -> {
                    String[] split = product.split(",");
                    productInfoMap.put(split[0], split);
                });

        LinkedHashMap<String, String[]> dailyProductSalesMap = new LinkedHashMap<>();
        Arrays.stream(dailyProductSales)
                .forEach(sales -> {
                    String[] split = sales.split(",");
                    dailyProductSalesMap.put(split[1], split);
                });

        AtomicInteger index = new AtomicInteger();
        dailyProductSalesMap.forEach((productId, dailyInfos) -> {
            result[index.getAndIncrement()] = dailyInfos[0] + "," + productId + "," + productInfoMap.get(productId)[1] + "," + Integer.parseInt(dailyInfos[2]) * Integer.parseInt(productInfoMap.get(productId)[2]);
        });

        return result;
    }
}
