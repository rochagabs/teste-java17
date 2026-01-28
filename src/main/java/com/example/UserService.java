package com.example;

import java.util.List;

public class UserService {

    public static void main(String[] args) {
        List<Object> inputs = List.of(
                "Gabriela",
                42,
                3.14,
                null
        );

        for (Object input : inputs) {
            System.out.println(describe(input));
        }
    }

    static String describe(Object obj) {
        if (obj == null) {
            return "Objeto nulo";
        }

        if (obj instanceof String) {
            String s = (String) obj;
            return "String com tamanho " + s.length();
        }

        if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            return "Inteiro com valor " + i;
        }

        return "Tipo desconhecido: " + obj.getClass().getSimpleName();
    }
}
