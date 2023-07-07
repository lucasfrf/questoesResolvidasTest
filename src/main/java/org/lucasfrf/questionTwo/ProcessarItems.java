package org.lucasfrf.questionTwo;

import java.util.ArrayList;
import java.util.List;

public class ProcessarItems {
    /*
    * Considere o seguinte cenário: o usuário do sistema está reclamando que quando um item
    * gera erro no processamento, os demais que estão na lista e sem erro não são processados.
    * Sendo assim, ajuste o método processarItens para processar todos itens mesmo quando
    * existirem itens com erro na lista e gerar algum tipo de aviso técnico simples alertando para
    * os itens com erro.
    *
    * private void processarItens(List<Item> itens) {
    *   try {
    *       for (Item i : itens) {
    *           processar(i);
    *       }
    *   } catch (ItemException e) {
    *   }
    * }
    *
    * private void processar(Item i) throws ItemException {
    *   //implementalçao do processamento omitido
    *   ...
    * }
    */
    public void setProcess(List<Integer> items) {
        processItems(items);
    }

    public void setProcess2(List<Integer> items) {
        var listUnprocessed = processItems2(items);
        if (!listUnprocessed.isEmpty()){
            var msgUnprocessed = "Itens não processados (valores negativos): ";
            for (Integer item : listUnprocessed){
                msgUnprocessed = msgUnprocessed + "(" + item + ") ";
            }
            System.out.println(msgUnprocessed);
        }
    }
    private void processItems(List<Integer> items) {
        for (Integer i : items) {
            try {
                process(i);
            } catch (Exception e) {
            System.out.println(e.toString());
            }
        }
    }

    private void process(Integer i) throws Exception {
        if (i < 0) {
            throw new Exception(String.format("Erro no processamento do item : %d. -> Valor negativo", i));
        }
        System.out.println(String.format("Número %d processado com sucesso! ", i));
    }

    private List<Integer> processItems2(List<Integer> items) {
        List<Integer> listUnprocessed = new ArrayList<>();
        for (Integer i : items) {
            try {
                process2(i);
            } catch (Exception e) {
                listUnprocessed.add(i);
            }
        }
        return listUnprocessed;
    }

    private void process2(Integer i) throws Exception {
        if (i < 0) {
            throw new Exception(String.format("Erro no processamento do item : %d. -> Valor negativo", i));
        }
    }
}
