package tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Bodega {
    public List<String> tipos_almacenados(List<String> items) {
        List<String> uniqueItems = new ArrayList<>();

        for (String item : items)
            if (!uniqueItems.contains(item)) uniqueItems.add(item);

        return uniqueItems;
    }

    public List<Integer> filtrar_por_tipo(List<Integer> codes, List<String> items, String type) {
        List<Integer> missingItems = new ArrayList<>();

        for (int code : codes)
            if (items.get(code) == type) missingItems.add(code);

        return missingItems;
    }

    public List<String> comparar_inventarios(List<String> stock, List<String> stockTwo) {
        List<String> items = new ArrayList<>();

        for (String item : stock)
            if (!stockTwo.contains(item)) items.add(item);

        return items;
    }

    public String reubicables(List<String> cellarOne, List<String> cellarTwo) {
        List<String> first = comparar_inventarios(cellarOne, cellarTwo);
        int firstLength = first.size();

        List<String> second = comparar_inventarios(cellarTwo, cellarOne);
        int secondLength = second.size();

        if (firstLength < secondLength) return String.valueOf(firstLength);
        return String.valueOf(secondLength);
    }
}
