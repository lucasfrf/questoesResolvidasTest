package org.lucasfrf;

import org.lucasfrf.questionOne.Process;
import org.lucasfrf.questionTwo.ProcessarItems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1");
        var interrupter = new Process(true);
        System.out.println(Process.situationOnOff(interrupter));
        interrupter.turnOff(interrupter);
        System.out.println(Process.situationOnOff(interrupter));
        interrupter.turnOn(interrupter);
        System.out.println(Process.situationOnOff(interrupter));

        System.out.println("Questão 2");
        System.out.println("Versão 1");
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(-3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(-1);
        listInteger.add(-4);
        var processarItems = new ProcessarItems();
        processarItems.setProcess(listInteger);
        System.out.println("Questão 2");
        System.out.println("Versão 2");
        processarItems.setProcess2(listInteger);
    }
}