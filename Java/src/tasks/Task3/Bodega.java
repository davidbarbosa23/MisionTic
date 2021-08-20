package tasks.Task3;

import java.util.ArrayList;
import java.util.Arrays;
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

    /* 
     * This method is just for test examples with main program
     */
    public Bodega () {
        System.out.println("\n");

        List<String> stockItems = Arrays.asList("tornillos", "pisos", "tuercas", "tornillos", "pisos", "pisos");
        System.out.println("tipos_almacenados: " + tipos_almacenados(stockItems));

        List<Integer> codes = Arrays.asList(0, 1, 2, 3);
        List<String> items = Arrays.asList("tornillos", "pisos", "tuercas", "tornillos", "pisos", "pisos");
        System.out.println("filtrar_por_tipo: " + filtrar_por_tipo(codes, items, "tornillos"));

        List<String> stockOne = Arrays.asList("12", "35", "54", "18", "25", "12", "23");
        List<String> stockTwo = Arrays.asList("45", "12", "25","18","35");
        System.out.println("comparar_inventarios: " + comparar_inventarios(stockOne, stockTwo));

        List<String> cellarOne = Arrays.asList("2", "3", "5", "8", "15", "23");
        List<String> cellarTwo = Arrays.asList("2", "5", "7", "9", "23", "40", "53");
        System.out.println("reubicables: " + reubicables(cellarOne, cellarTwo));

        System.out.println("\n");
    }
}
